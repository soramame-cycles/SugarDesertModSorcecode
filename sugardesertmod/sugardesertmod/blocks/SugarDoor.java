package com.sugar.sugardesertmod.blocks;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SugarDoor extends BlockDoor {

	public SugarDoor() {
		super(Material.WOOD);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("axe", 0);
		this.setRegistryName("sugar_door");
		this.setUnlocalizedName("sugar_door");
		this.setCreativeTab(CreativeTabs.REDSTONE);
		this.setSoundType(SoundType.WOOD);
	}

	public SugarDoor(Material materialIn) {
		super(materialIn);
	}

}
