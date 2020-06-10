package com.sugar.sugardesertmod.tools;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class SugarDiamondSword extends ItemSword {

	public SugarDiamondSword(ToolMaterial material) {
		super(material);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == SugarDesertMod.Sugar_diamond;
	}

}
