package com.sugar.sugardesertmod.items;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.item.ItemFood;

public class PUDDING extends ItemFood {

	public PUDDING() {
		super(6, false);
		this.setRegistryName("pudding");
		this.setUnlocalizedName("pudding");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);

	}

	public PUDDING(int amount, boolean isWolfFood) {
		super(amount, isWolfFood);

	}
}
