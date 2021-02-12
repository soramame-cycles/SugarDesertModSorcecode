package com.sugar.sugardesertmod.init.tool;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.tools.BismuthPickaxe;
import com.sugar.sugardesertmod.tools.SugarDiamondAxe;
import com.sugar.sugardesertmod.tools.SugarDiamondHoe;
import com.sugar.sugardesertmod.tools.SugarDiamondPickaxe;
import com.sugar.sugardesertmod.tools.SugarDiamondShovel;
import com.sugar.sugardesertmod.tools.SugarDiamondSword;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SugarDTools {

	public static Item Bismuth_pickaxe;
	public static Item Sugar_diamond_axe;
	public static Item Sugar_diamond_hoe;
	public static Item Sugar_diamond_pickaxe;
	public static Item Sugar_diamond_shovel;
	public static Item Sugar_diamond_sword;


	public static void Bismuth_pickaxe(RegistryEvent.Register<Item> event) {

		Bismuth_pickaxe = new BismuthPickaxe(EnumHelper.addToolMaterial("bismuth_pickaxe", 4, 1500, 5.0F, 5.0F, 3))
				.setRegistryName("bismuth_pickaxe")
				.setUnlocalizedName("bismuth_pickaxe")
				.setCreativeTab(SugarDesertMod.Tab_sugard);

		event.getRegistry().register(Bismuth_pickaxe);
		ForgeRegistries.ITEMS.register(Bismuth_pickaxe);
	}


	public static void Bismuth_pickaxeModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Bismuth_pickaxe, 0,
				new ModelResourceLocation("sugard:bismuth_pickaxe"));
	}

	public static void Sugar_diamond_axe(RegistryEvent.Register<Item> event) {

		Sugar_diamond_axe = new SugarDiamondAxe(EnumHelper.addToolMaterial("sugar_diamond_axe", 4, 500, 5.0F, 5.0F, 7), 10F, 1F)
				.setRegistryName("sugar_diamond_axe")
				.setUnlocalizedName("sugar_diamond_axe")
				.setCreativeTab(SugarDesertMod.Tab_sugard);

		event.getRegistry().register(Sugar_diamond_axe);
		ForgeRegistries.ITEMS.register(Sugar_diamond_axe);
	}

	public static void Sugar_diamond_axeModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Sugar_diamond_axe, 0,
				new ModelResourceLocation("sugard:sugar_diamond_axe"));
	}

	public static void Sugar_diamond_hoe(RegistryEvent.Register<Item> event) {

		Sugar_diamond_hoe = new SugarDiamondHoe(EnumHelper.addToolMaterial("sugar_diamond_hoe", 4, 500, 5F, 12F, 9))
				.setRegistryName("sugar_diamond_hoe")
				.setUnlocalizedName("sugar_diamond_hoe")
				.setCreativeTab(SugarDesertMod.Tab_sugard);

		event.getRegistry().register(Sugar_diamond_hoe);
		ForgeRegistries.ITEMS.register(Sugar_diamond_hoe);
	}

	public static void Sugar_diamond_hoeModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Sugar_diamond_hoe, 0,
				new ModelResourceLocation("sugard:sugar_diamond_hoe"));
	}

	public static void Sugar_diamond_pickaxe(RegistryEvent.Register<Item> event) {

		Sugar_diamond_pickaxe = new SugarDiamondPickaxe(EnumHelper.addToolMaterial("sugar_diamond_pickaxe", 4, 500, 5F, 9F, 9))
				.setRegistryName("sugar_diamond_pickaxe")
				.setUnlocalizedName("sugar_diamond_pickaxe")
				.setCreativeTab(SugarDesertMod.Tab_sugard);

		event.getRegistry().register(Sugar_diamond_pickaxe);
		ForgeRegistries.ITEMS.register(Sugar_diamond_pickaxe);
	}

	public static void Sugar_diamond_pickaxeModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Sugar_diamond_pickaxe, 0,
				new ModelResourceLocation("sugard:sugar_diamond_pickaxe"));
	}

	public static void Sugar_diamond_shovel(RegistryEvent.Register<Item> event) {

		Sugar_diamond_shovel = new SugarDiamondShovel(EnumHelper.addToolMaterial("sugar_diamond_shovel", 4, 500, 5.0F, 6.0F, 9))
				.setRegistryName("sugar_diamond_shovel")
				.setUnlocalizedName("sugar_diamond_shovel")
				.setCreativeTab(SugarDesertMod.Tab_sugard);

		event.getRegistry().register(Sugar_diamond_shovel);
		ForgeRegistries.ITEMS.register(Sugar_diamond_shovel);
	}

	public static void Sugar_diamond_shovelModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Sugar_diamond_shovel, 0,
				new ModelResourceLocation("sugard:sugar_diamond_shovel"));
	}

	public static void Sugar_diamond_sword(RegistryEvent.Register<Item> event) {

		Sugar_diamond_sword = new SugarDiamondSword(EnumHelper.addToolMaterial("sugar_diamond_sword", 4, 500, 5.0F, 11.0F, 9))
				.setRegistryName("sugar_diamond_sword")
				.setUnlocalizedName("sugar_diamond_sword")
				.setCreativeTab(SugarDesertMod.Tab_sugard);

		event.getRegistry().register(Sugar_diamond_sword);
		ForgeRegistries.ITEMS.register(Sugar_diamond_sword);
	}

	public static void Sugar_diamond_swordModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Sugar_diamond_sword, 0,
				new ModelResourceLocation("sugard:sugar_diamond_sword"));
	}

}
