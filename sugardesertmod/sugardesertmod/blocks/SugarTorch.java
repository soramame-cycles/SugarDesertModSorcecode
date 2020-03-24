package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SugarTorch extends Block {

    private static final AxisAlignedBB SUGAR_TORCH_AABB = new AxisAlignedBB(0.4000000059604645D, 0.0D, 0.4000000059604645D, 0.6000000238418579D, 0.6000000238418579D, 0.6000000238418579D);
	public SugarTorch(){
		super(Material.WOOD);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("axe", 0);
		this.setRegistryName("sugar_torch");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setUnlocalizedName("sugar_torch");
		this.setLightLevel(1.0F);
	}
	public SugarTorch(Material materialIn) {
		super(materialIn);
	}


@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
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
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return SUGAR_TORCH_AABB;
	}
}
