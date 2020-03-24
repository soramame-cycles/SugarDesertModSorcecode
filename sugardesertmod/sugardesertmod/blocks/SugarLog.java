package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.util.EnumFacing;

public class SugarLog extends BlockRotatedPillar {

	public static final PropertyEnum<EnumFacing.Axis> AXIS = PropertyEnum.<EnumFacing.Axis>create("axis", EnumFacing.Axis.class);
	public SugarLog() {
		super(Material.WOOD);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("axe", 0);
		this.setRegistryName("sugar_log");
		this.setUnlocalizedName("sugar_log");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.WOOD);
	}
	public SugarLog(Material materialIn) {
	super(materialIn);
	}
}
