package com.sugar.sugardesertmod.recipes;

import com.sugar.sugardesertmod.config.SugarD_Config;
import com.sugar.sugardesertmod.init.block.SugarDBlock;
import com.sugar.sugardesertmod.init.item.SDItem;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingSugarD {

	public SmeltingSugarD() {
		register();
	}

	public static void register() {

		/**sugar_cobblestone*/
		GameRegistry.addSmelting(SugarDBlock.Sugar_stone, new ItemStack(SugarDBlock.Sugar_cobblestone, 1), 0.1F);
		/**lether*/
		GameRegistry.addSmelting(SugarDBlock.Rotten_flesh_block, new ItemStack(Items.LEATHER,8), 0);
		/**sugar_diamond_nugget*/
		GameRegistry.addSmelting(SugarDBlock.Sugar_candy, new ItemStack(SDItem.Sugar_diamond_nugget,1), 0.1F);
		/**azukibeen*/
		GameRegistry.addSmelting(SugarDBlock.Sugar_leaves, new ItemStack(SDItem.Azuki_been,1), 0.1F);
		/**poppy_seed*/
		GameRegistry.addSmelting(new ItemStack(Blocks.RED_FLOWER,1,0),new ItemStack(SDItem.Poppy_seed), 0.1F);
		/**raw_sugar*/
		GameRegistry.addSmelting(SDItem.Crushed_Sugar_Cane, new ItemStack(SDItem.Raw_Sugar), 0.1F);
		/**bismuth_cystal*/
		if(SugarD_Config.recipe.smeltbismuth == true) {
			GameRegistry.addSmelting(SugarDBlock.Bismuth_Ore, new ItemStack(SDItem.bismuth_crystal), 0.2F);
		}
		/**sugar_block*/
		GameRegistry.addSmelting(SugarDBlock.Moist_sugar_block, new ItemStack(SugarDBlock.Sugar_block), 0.2F);

	}
}
