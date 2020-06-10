package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Sugarbricks extends Block {

	public Sugarbricks() {
		super(Material.ROCK);
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setRegistryName("sugar_bricks");
		this.setUnlocalizedName("sugar_bricks");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);

	}

	public Sugarbricks(Material materialIn) {
		super(materialIn);

	}

}
