package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SugarCandy extends Block {

	public SugarCandy() {
		super(Material.GLASS);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("pickaxe", 0);
		this.setRegistryName("sugar_candy");
		this.setUnlocalizedName("sugar_candy");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.GLASS);

	}

	public SugarCandy(Material materialIn) {
		super(materialIn);
	}

	@SideOnly(Side.CLIENT)
	@Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
    public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean canEntitySpawn(IBlockState state, Entity entityIn) {
		return false;
	}

	@SuppressWarnings("deprecation")
	@SideOnly(Side.CLIENT)
	@Override
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {

		IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();
		if (blockState != iblockstate) {
			return true;
		}
		if (block == this) {
			return false;
		}
		return side == EnumFacing.UP ? true : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
	}
}
