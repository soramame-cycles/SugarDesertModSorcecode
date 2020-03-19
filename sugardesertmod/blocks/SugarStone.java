package com.sugar.sugardesertmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SugarStone extends Block {

	public SugarStone() {
		super(Material.ROCK);
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setRegistryName("sugar_stone");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setUnlocalizedName("sugar_stone");
}

	public SugarStone(Material materialIn) {
		super(materialIn);
	}

}
