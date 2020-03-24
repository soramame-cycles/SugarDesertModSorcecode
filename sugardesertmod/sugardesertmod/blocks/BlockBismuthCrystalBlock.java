package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBismuthCrystalBlock extends Block {

	public BlockBismuthCrystalBlock() {
		super(Material.ROCK);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setRegistryName("bismuth_crystal_block");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setUnlocalizedName("bismuth_crystal_block");
		this.setLightLevel(1.0F);
	}
	public BlockBismuthCrystalBlock(Material materialIn) {
		super(materialIn);
	}
@Override
	public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon)
    {
        return true;}
}
