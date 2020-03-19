package com.sugar.sugardesertmod.tools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SugarDTools {

	public static Item Bismuth_pickaxe;


	public static void Bismuth_pickaxe(RegistryEvent.Register<Item> event) {

		Bismuth_pickaxe = new BismuthPickaxe(EnumHelper.addToolMaterial("bismuth_pickaxe", 4, 1500, 5.0F, 5.0F, 3))
				.setRegistryName("bismuth_pickaxe")
				.setUnlocalizedName("bismuth_pickaxe");

		event.getRegistry().register(Bismuth_pickaxe);
		ForgeRegistries.ITEMS.register(Bismuth_pickaxe);
	}


	public static void Bismuth_pickaxeModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Bismuth_pickaxe, 0,
				new ModelResourceLocation("sugard:bismuth_pickaxe"));
	}

}
