package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SugarPlanks extends Block {

	public SugarPlanks() {
		super(Material.WOOD);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("axe", 0);
		this.setRegistryName("sugar_planks");
		this.setUnlocalizedName("sugar_planks");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.WOOD);
	}

	public SugarPlanks(Material materialIn) {
		super(materialIn);
	}

}
