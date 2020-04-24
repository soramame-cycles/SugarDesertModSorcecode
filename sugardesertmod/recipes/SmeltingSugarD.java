package com.sugar.sugardesertmod.recipes;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.blocks.SugarDBlock;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingSugarD {

	public SmeltingSugarD() {
		register();
	}

	public static void register() {

		GameRegistry.addSmelting(SugarDBlock.Sugar_stone, new ItemStack(SugarDBlock.Sugar_cobblestone, 1), 0.1F);
		GameRegistry.addSmelting(SugarDBlock.Rotten_flesh_block, new ItemStack(Items.LEATHER,8), 0);
		GameRegistry.addSmelting(SugarDBlock.Sugar_candy, new ItemStack(SugarDesertMod.Sugar_diamond_nugget,1), 0.1F);
		GameRegistry.addSmelting(SugarDBlock.Sugar_leaves, new ItemStack(SugarDesertMod.Azuki_been,1), 0.1F);
		GameRegistry.addSmelting(new ItemStack(Blocks.RED_FLOWER,1,0),new ItemStack(SugarDesertMod.Poppy_seed), 0.1F);

	}
}
