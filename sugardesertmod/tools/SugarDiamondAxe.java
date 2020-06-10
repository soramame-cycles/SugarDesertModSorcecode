package com.sugar.sugardesertmod.tools;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class SugarDiamondAxe extends ItemAxe {

	protected SugarDiamondAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == SugarDesertMod.Sugar_diamond;
	}

}
