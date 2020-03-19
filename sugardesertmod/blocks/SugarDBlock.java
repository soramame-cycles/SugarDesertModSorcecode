package com.sugar.sugardesertmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SugarDBlock {

	public static Block Bismuth_Ore;
	public static Block Bismuth_crystal_block;
	public static Block Sugar_block;
	public static Block Sugar_stone;
	public static Block Sugar_pillar;

	public static void Bismuth_Ore(RegistryEvent.Register<Item> event) {

		Bismuth_Ore = new BlockBismuthOre();

		event.getRegistry().register(new ItemBlock(Bismuth_Ore).setRegistryName("bismuth_ore"));
		ForgeRegistries.BLOCKS.register(Bismuth_Ore);
	}

	public static void Bismuth_OreModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Bismuth_Ore),0,
				new ModelResourceLocation("sugard:bismuth_ore"));
	}
	//区切り
	public static void Bismuth_crystal_block(RegistryEvent.Register<Item> event) {

		Bismuth_crystal_block = new BlockBismuthCrystalBlock();

		event.getRegistry().register(new ItemBlock(Bismuth_crystal_block).setRegistryName("bismuth_crystal_block"));
		ForgeRegistries.BLOCKS.register(Bismuth_crystal_block);
	}

	public static void Bismuth_crystal_blockModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Bismuth_crystal_block),0,
				new ModelResourceLocation("sugard:bismuth_crystal_block"));
	}
	//区切り
	public static void Suger_block(RegistryEvent.Register<Item> event) {

		Sugar_block = new SugarBlock();

		event.getRegistry().register(new ItemBlock(Sugar_block).setRegistryName("sugar_block"));
		ForgeRegistries.BLOCKS.register(Sugar_block);

	}

	public static void Sugar_blockModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_block), 0,
				new ModelResourceLocation("sugard:sugar_block"));

	}
	//区切り
	public static void Sugar_stone(RegistryEvent.Register<Item> event) {
		Sugar_stone = new SugarStone();

		event.getRegistry().register(new ItemBlock(Sugar_stone).setRegistryName("sugar_stone"));
		ForgeRegistries.BLOCKS.register(Sugar_stone);
	}

	public static void Sugar_stoneModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_stone), 0,
				new ModelResourceLocation("sugard:sugar_stone"));
	}
	//区切り
	public static void Sugar_pillar(RegistryEvent.Register<Item> event) {

		Sugar_pillar = new SugarPillar();

		event.getRegistry().register(new ItemBlock(Sugar_pillar).setRegistryName("sugar_pillar"));
		ForgeRegistries.BLOCKS.register(Sugar_pillar);
	}

	public static void Sugar_pillarModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_pillar), 0,
				new ModelResourceLocation("sugard:sugar_pillar"));
	}

}
