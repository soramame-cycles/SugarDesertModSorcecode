package com.sugar.sugardesertmod.tools;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class BismuthPickaxe extends ItemPickaxe {

	protected BismuthPickaxe(ToolMaterial material) {
		super(material);

	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == SugarDesertMod.bismuth_crystal;
	}

}
