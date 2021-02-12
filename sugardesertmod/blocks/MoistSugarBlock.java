package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MoistSugarBlock extends Block {

	public MoistSugarBlock() {
		super(Material.ROCK);
		this.setHardness(2.0F);
		this.setResistance(100.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setRegistryName("moist_sugar_block");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setUnlocalizedName("moist_sugar_block");
	}

	public MoistSugarBlock(Material materialIn) {
		super(materialIn);
	}

}
