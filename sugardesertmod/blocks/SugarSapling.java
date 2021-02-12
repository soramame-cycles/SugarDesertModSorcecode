package com.sugar.sugardesertmod.blocks;

import java.util.Random;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.gen.feature.WorldGenSugarTree;
import com.sugar.sugardesertmod.init.block.SugarDBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SugarSapling extends BlockBush implements IGrowable {

	protected static final AxisAlignedBB SAPLING_AABB =
			new AxisAlignedBB(0.099D, 0.0D, 0.099D, 0.89D, 0.8D, 0.89D);

	public SugarSapling() {
		super();
		this.setSoundType(SoundType.PLANT);
		this.setRegistryName("sugar_sapling");
		this.setUnlocalizedName("sugar_sapling");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand){
		if (!worldIn.isRemote){
			super.updateTick(worldIn, pos, state, rand);

			if (!worldIn.isAreaLoaded(pos, 1)) return;
			if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0){
				this.grow(worldIn, rand, pos, state);
				}
		}
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
	public boolean canSustainBush(IBlockState state) {

		Block block = state.getBlock();
		return block == Blocks.GRASS || block == Blocks.DIRT || block == SugarDBlock.Raw_sugar_block;
	}

	@Override
	public boolean canBlockStay(World world, BlockPos pos, IBlockState state) {
		BlockPos down = pos.down();

		IBlockState soil = world.getBlockState(down);

		return soil.getBlock().canSustainPlant(soil, world, down, EnumFacing.UP, this);
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Plains;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return SAPLING_AABB;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		return BlockFaceShape.UNDEFINED;
	}

}
