package com.sugar.sugardesertmod.blocks;

import java.util.Random;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.gen.feature.WorldGenSugarTree;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.EnumPlantType;

public class SugarSapling extends BlockBush implements IGrowable {

	protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);

	public SugarSapling() {
		super();
		this.setSoundType(SoundType.PLANT);
		this.setRegistryName("sugar_sapling");
		this.setUnlocalizedName("sugar_sapling");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
	}

	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {

		return true;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {

		return rand.nextFloat() < 0.5;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {

		WorldGenerator treeGenerator = new WorldGenSugarTree(true);

        worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 4);
        if (!treeGenerator.generate(worldIn, rand, pos))
            worldIn.setBlockState(pos, state, 4);
	}

	@Override
    protected boolean canSustainBush(IBlockState state) {

        Block block = state.getBlock();
        return block == Blocks.GRASS || block == Blocks.DIRT || block == SugarDBlock.Sugar_block;
    }

    @Override
    public boolean canBlockStay(World world, BlockPos pos, IBlockState state) {
        BlockPos down = pos.down();

        IBlockState soil = world.getBlockState(down);

        return soil.getBlock().canSustainPlant(soil, world, down, EnumFacing.UP, this);
    }

    @Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Plains;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SAPLING_AABB;
    }
}
