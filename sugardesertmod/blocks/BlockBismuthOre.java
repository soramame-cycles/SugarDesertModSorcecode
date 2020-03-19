package com.sugar.sugardesertmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBismuthOre extends Block {

	public BlockBismuthOre() {
		super(Material.ROCK);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setRegistryName("bismuth_ore");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setUnlocalizedName("bismuth_ore");
	}

	public BlockBismuthOre(Material materialIn) {
		super(materialIn);

	}

}
