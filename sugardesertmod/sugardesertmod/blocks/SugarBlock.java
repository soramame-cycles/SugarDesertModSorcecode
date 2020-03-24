package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SugarBlock extends BlockFalling {

	public SugarBlock() {
		super(Material.SAND);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("shovel", 0);
		this.setRegistryName("sugar_block");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setUnlocalizedName("sugar_block");
		this.setSoundType(SoundType.SAND);
	}

	public SugarBlock(Material materialIn) {
		super(materialIn);
	}

}
