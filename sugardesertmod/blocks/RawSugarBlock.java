package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RawSugarBlock extends BlockFalling {

	public RawSugarBlock() {
		super(Material.GROUND);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("shovel", 0);
		this.setRegistryName("raw_sugar_block");
		this.setUnlocalizedName("raw_sugar_block");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.SAND);
	}
}
