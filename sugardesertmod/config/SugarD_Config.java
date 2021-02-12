package com.sugar.sugardesertmod.config;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = SugarDesertMod.MOD_ID)
@Mod.EventBusSubscriber(modid = SugarDesertMod.MOD_ID)
public class SugarD_Config {

	/**Ignoreをつけるとその項目は生成されなくなる*/
	@Config.Ignore
	private static final String config = SugarDesertMod.MOD_ID + ".config.";

	@Config.LangKey(config + "generate_ore")
	@Config.Comment("Generation of sugard ores")
	public static Generate generate = new Generate();

	@Config.LangKey(config + "add_recipe")
	@Config.Comment("Add recipes")
	public static Recipe recipe = new Recipe();

	/**クラス内クラスの中身は"public static ～"ではなく"public ～"で記述する*/
	public static class Generate{
		/**Sugar_Diamond*/
		@Config.LangKey(config + "sugar_diamond_gen")
		@Config.RequiresMcRestart
		@Config.Comment("Generate Sugar_Diamond")
		public boolean genSugardiamond = true;

		/**Sugarrack*/
		@Config.LangKey(config + "sugarrack_gen")
		@Config.RequiresMcRestart
		@Config.Comment("Generate Sugarrack")
		public boolean genSugarrack = true;

		/**End_Sugar_stone*/
		@Config.LangKey(config + "end_sugar_stone_gen")
		@Config.RequiresMcRestart
		@Config.Comment("Generate End_Sugar_Stone")
		public boolean genEndsugarstone = true;

		/**Bismuth*/
		@Config.LangKey(config + "bismuth_gen")
		@Config.RequiresMcRestart
		@Config.Comment("Generate Bismuth")
		public boolean genBismuth = true;

		/**Sugar_block*/
		@Config.LangKey(config + "sugar_block_gen")
		@Config.RequiresMcRestart
		@Config.Comment("Generate Sugar_block")
		public boolean genSugarblock = true;
	}

	public static class Recipe{
		@Config.LangKey(config + "bismuth_smelting")
		@Config.Comment("Add Bismuth smeltingrecipe")
		@Config.RequiresMcRestart
		public boolean smeltbismuth = false;
	}

	/**configが変更されたときに呼ばれるメソッド*/
	@SubscribeEvent
	public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		if(event.getModID().equals(SugarDesertMod.MOD_ID)) {
			ConfigManager.sync(SugarDesertMod.MOD_ID, Config.Type.INSTANCE);
		}
	}
}
