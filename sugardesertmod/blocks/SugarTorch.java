package com.sugar.sugardesertmod.blocks;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;
import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SugarTorch extends BlockTorch {

	public static final PropertyDirection FACING = PropertyDirection.create("facing", new Predicate<EnumFacing>() {
		public boolean apply(@Nullable EnumFacing p_apply_1_) {
			return p_apply_1_ != EnumFacing.DOWN;
		}
	});

	public SugarTorch(){
		super();
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("axe", 0);
		this.setRegistryName("sugar_torch");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setUnlocalizedName("sugar_torch");
		this.setLightLevel(1.0F);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
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
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return Block.NULL_AABB;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}


}
