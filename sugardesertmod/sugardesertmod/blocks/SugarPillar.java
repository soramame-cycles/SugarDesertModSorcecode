package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.util.EnumFacing;

public class SugarPillar extends BlockRotatedPillar {

	public static final PropertyEnum<EnumFacing.Axis> AXIS = PropertyEnum.<EnumFacing.Axis>create("axis", EnumFacing.Axis.class);

	public SugarPillar() {
		super(Material.ROCK);
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setRegistryName("sugar_pillar");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setUnlocalizedName("sugar_pillar");
	}

	public SugarPillar(Material materialIn) {
	super(materialIn);
	}
}
