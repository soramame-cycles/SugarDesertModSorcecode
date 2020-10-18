package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class SugarDiamondBlock extends Block {

	public SugarDiamondBlock() {
		super(Material.ROCK);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("pickaxe", 0);
		this.setRegistryName("sugar_diamond_block");
		this.setUnlocalizedName("sugar_diamond_block");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.GLASS);
	}

	public SugarDiamondBlock(Material materialIn) {
		super(materialIn);

	}
	@Override
	public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon){
		return true;
	}
}
