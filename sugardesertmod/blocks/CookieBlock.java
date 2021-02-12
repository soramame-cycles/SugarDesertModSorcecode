package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CookieBlock extends Block {

	public CookieBlock() {
		super(Material.ROCK);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("pickaxe", 0);
		this.setRegistryName("cookie_block");
		this.setUnlocalizedName("cookie_block");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.SAND);
	}

	public CookieBlock(Material materialIn) {
		super(materialIn);
	}

}
