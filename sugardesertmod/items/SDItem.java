package com.sugar.sugardesertmod.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SDItem {

	public static Item Pudding;


	public static void Pudding(RegistryEvent.Register<Item> event) {

		Pudding = new PUDDING();

		event.getRegistry().register(Pudding);
		ForgeRegistries.ITEMS.register(Pudding);
	}

	public static void PuddingModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Pudding, 0,
				new ModelResourceLocation("sugard:pudding"));
	}
}
