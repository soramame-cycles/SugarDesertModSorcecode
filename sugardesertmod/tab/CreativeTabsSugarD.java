package com.sugar.sugardesertmod.tab;

import com.sugar.sugardesertmod.blocks.SugarDBlock;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabsSugarD extends CreativeTabs{

	public CreativeTabsSugarD() {
		super("SugarD_tabs");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(SugarDBlock.Sugar_block));
	}

}
