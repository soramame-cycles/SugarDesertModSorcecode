package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;

public class SugarTrapDoor extends BlockTrapDoor {

	public SugarTrapDoor() {
		super(Material.WOOD);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("axe", 0);
		this.setRegistryName("sugar_trapdoor");
		this.setUnlocalizedName("sugar_trapdoor");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);

	}

	public SugarTrapDoor(Material materialIn) {
		super(materialIn);

	}

}
