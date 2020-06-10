package com.sugar.sugardesertmod.blocks;

public class OreDictionaryHandler {

	public static void registerOreDictionary() {

		net.minecraftforge.oredict.OreDictionary.registerOre("oreSugarDiamond", SugarDBlock.Sugar_diamond_ore);
		net.minecraftforge.oredict.OreDictionary.registerOre("oreBismuth", SugarDBlock.Bismuth_Ore);

	}
}
