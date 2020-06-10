package com.sugar.sugardesertmod.tools;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class SugarDiamondHoe extends ItemHoe{

	public SugarDiamondHoe(ToolMaterial material) {
		super(material);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == SugarDesertMod.Sugar_diamond;
	}

}
