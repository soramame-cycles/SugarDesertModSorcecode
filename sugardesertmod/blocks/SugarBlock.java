package com.sugar.sugardesertmod.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SugarBlock extends BlockFalling {

	public SugarBlock() {
		super(Material.SAND);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("shovel", 0);
		this.setRegistryName("sugar_block");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setUnlocalizedName("sugar_block");
		this.setSoundType(SoundType.SAND);
	}

	public SugarBlock(Material materialIn) {
		super(materialIn);
	}

}
