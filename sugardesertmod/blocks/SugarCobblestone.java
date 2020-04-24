package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SugarCobblestone extends Block {

	public SugarCobblestone() {
		super(Material.ROCK);
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setRegistryName("sugar_cobblestone");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setUnlocalizedName("sugar_cobblestone");
	}

	public SugarCobblestone(Material materialIn) {
		super(materialIn);
	}

}
