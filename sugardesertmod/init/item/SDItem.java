package com.sugar.sugardesertmod.init.item;

import com.sugar.sugardesertmod.items.AZUKI_BEEN;
import com.sugar.sugardesertmod.items.AZUKI_BEEN_BUN;
import com.sugar.sugardesertmod.items.AZUKI_PASTE;
import com.sugar.sugardesertmod.items.BISMUTH_CRYSTAL;
import com.sugar.sugardesertmod.items.BISMUTH_LIQUID;
import com.sugar.sugardesertmod.items.CRUSH_SUGAR_CANE;
import com.sugar.sugardesertmod.items.POPPY_SEED;
import com.sugar.sugardesertmod.items.PUDDING;
import com.sugar.sugardesertmod.items.RAW_SUGAR;
import com.sugar.sugardesertmod.items.SUGAR_DIAMOND;
import com.sugar.sugardesertmod.items.SUGAR_DIAMOND_NUGGET;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SDItem {

	//Food
	public static Item Pudding;
	public static Item Azuki_been;
	public static Item Azuki_paste;
	public static Item Azuki_been_bun;
	public static Item Poppy_seed;
	public static Item Crushed_Sugar_Cane;
	public static Item Raw_Sugar;
	//Gem
	public static Item bismuth_crystal;
	public static Item bismuth_liquid;
	public static Item Sugar_diamond;
	public static Item Sugar_diamond_nugget;


	public static void Pudding(RegistryEvent.Register<Item> event) {
		Pudding = new PUDDING();

		event.getRegistry().register(Pudding);
		ForgeRegistries.ITEMS.register(Pudding);
	}

	public static void PuddingModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Pudding, 0,
				new ModelResourceLocation("sugard:pudding"));
	}

	//Azuki
	public static void Azuki_been(RegistryEvent.Register<Item> event) {
		Azuki_been = new AZUKI_BEEN();

		event.getRegistry().register(Azuki_been);
		ForgeRegistries.ITEMS.register(Azuki_been);
	}

	public static void Azuki_beenModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Azuki_been, 0,
				new ModelResourceLocation("sugard:azuki_been"));
	}

	//Azuki_paste
	public static void Azuki_paste(RegistryEvent.Register<Item> event) {
		Azuki_paste = new AZUKI_PASTE();

		event.getRegistry().register(Azuki_paste);
		ForgeRegistries.ITEMS.register(Azuki_paste);
	}

	public static void Azuki_pasteModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Azuki_paste, 0,
				new ModelResourceLocation("sugard:azuki_paste"));
	}
	//Azuki_pan
	public static void Azuki_been_bun(RegistryEvent.Register<Item> event) {
		Azuki_been_bun = new AZUKI_BEEN_BUN();

		event.getRegistry().register(Azuki_been_bun);
		ForgeRegistries.ITEMS.register(Azuki_been_bun);
	}

	public static void Azuki_been_bunModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Azuki_been_bun, 0,
				new ModelResourceLocation("sugard:azuki_been_bun"));
	}
	//Poppy_seed
	public static void Poppy_seed(RegistryEvent.Register<Item> event) {
		Poppy_seed = new POPPY_SEED();

		event.getRegistry().register(Poppy_seed);
		ForgeRegistries.ITEMS.register(Poppy_seed);
	}

	public static void Poppy_seedModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Poppy_seed, 0,
				new ModelResourceLocation("sugard:poppy_seed"));
	}
	//bismuth_crystal
	public static void bismuth_crystal(RegistryEvent.Register<Item> event) {
		bismuth_crystal = new BISMUTH_CRYSTAL();

		event.getRegistry().register(bismuth_crystal);
		ForgeRegistries.ITEMS.register(bismuth_crystal);
	}
	public static void bismuth_crystalModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(bismuth_crystal, 0,
				new ModelResourceLocation("sugard:bismuth_crystal"));
	}
	//bismuth_liquid
	public static void bismuth_liquid(RegistryEvent.Register<Item> event) {
		bismuth_liquid = new BISMUTH_LIQUID();

		event.getRegistry().register(bismuth_liquid);
		ForgeRegistries.ITEMS.register(bismuth_liquid);
	}
	public static void bismuth_liquidModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(bismuth_liquid, 0,
				new ModelResourceLocation("sugard:bismuth_liquid"));
	}
	//Sugar_diamond
	public static void Sugar_diamond(RegistryEvent.Register<Item> event) {
		Sugar_diamond = new SUGAR_DIAMOND();

		event.getRegistry().register(Sugar_diamond);
		ForgeRegistries.ITEMS.register(Sugar_diamond);
	}
	public static void Sugar_diamondModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Sugar_diamond, 0,
				new ModelResourceLocation("sugard:sugar_diamond"));
	}
	//Sugar_diamond_nugget
	public static void Sugar_diamond_nugget(RegistryEvent.Register<Item> event) {
		Sugar_diamond_nugget = new SUGAR_DIAMOND_NUGGET();

		event.getRegistry().register(Sugar_diamond_nugget);
		ForgeRegistries.ITEMS.register(Sugar_diamond_nugget);
	}
	public static void Sugar_diamond_nuggetModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Sugar_diamond_nugget, 0,
				new ModelResourceLocation("sugard:sugar_diamond_nugget"));
	}
	/**1.7_start*/
	//Crushed_Sugar_Cane
	public static void Crushed_Sugar_Cane(RegistryEvent.Register<Item> event) {
		Crushed_Sugar_Cane = new CRUSH_SUGAR_CANE();

		event.getRegistry().register(Crushed_Sugar_Cane);
		ForgeRegistries.ITEMS.register(Crushed_Sugar_Cane);
	}
	public static void Crushed_Sugar_CaneModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Crushed_Sugar_Cane, 0,
				new ModelResourceLocation("sugard:crushed_sugar_cane"));
	}
	//Raw_Sugar
	public static void Raw_Sugar(RegistryEvent.Register<Item> event) {
		Raw_Sugar = new RAW_SUGAR();

		event.getRegistry().register(Raw_Sugar);
		ForgeRegistries.ITEMS.register(Raw_Sugar);
	}
	public static void Raw_SugarModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Raw_Sugar, 0,
				new ModelResourceLocation("sugard:raw_sugar"));
	}
}
