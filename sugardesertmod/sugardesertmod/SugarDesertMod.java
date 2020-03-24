package com.sugar.sugardesertmod;

import com.sugar.sugardesertmod.blocks.SugarDBlock;
import com.sugar.sugardesertmod.gen.biome.ModBiome;
import com.sugar.sugardesertmod.gen.block.BismuthOreGen;
import com.sugar.sugardesertmod.gen.block.SugarBlockGen;
import com.sugar.sugardesertmod.tab.CreativeTabsSugarD;
import com.sugar.sugardesertmod.tools.SugarDTools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = SugarDesertMod.MOD_ID,name = SugarDesertMod.MOD_NAME,version = SugarDesertMod.MOD_VERSION)
public class SugarDesertMod {
	public static final String MOD_ID = "sugard";
	public static final String MOD_NAME = "SugerDesertmod";
	public static final String MOD_VERSION = "1.2";
	public static CreativeTabsSugarD Tab_sugard = new CreativeTabsSugarD();

	public static Item bismuth_crystal;
	public static Item bismuth_liquid;

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {

		bismuth_crystal = new Item()
				.setCreativeTab(SugarDesertMod.Tab_sugard)
				.setUnlocalizedName("bismuth_crystal")
				.setRegistryName("bismuth_crystal")
				.setMaxStackSize(64);

		bismuth_liquid = new Item()
				.setCreativeTab(SugarDesertMod.Tab_sugard)
				.setUnlocalizedName("bismuth_liquid")
				.setRegistryName("bismuth_liquid")
				.setMaxStackSize(64);

		ForgeRegistries.ITEMS.register(bismuth_crystal);
		ForgeRegistries.ITEMS.register(bismuth_liquid);

		if(event.getSide().isClient()) {
			ModelLoader.setCustomModelResourceLocation(bismuth_crystal, 0, new ModelResourceLocation("sugard:bismuth_crystal"));
			ModelLoader.setCustomModelResourceLocation(bismuth_liquid, 0, new ModelResourceLocation("sugard:bismuth_liquid"));
		}
	}

	@Mod.EventHandler
	//多分外部化のコード
	public void construct(FMLConstructionEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Mod.EventHandler
	//鉱石生成だと思う
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new BismuthOreGen(), 0);
		GameRegistry.registerWorldGenerator(new SugarBlockGen(), 0);
		ModBiome.registerBiomeTypes();
	}

	@SubscribeEvent
	//多分アイテム登録のイベント
	public void registerItems(RegistryEvent.Register<Item> event) {
		SugarDBlock.Bismuth_Ore(event);
		SugarDBlock.Bismuth_crystal_block(event);
		SugarDBlock.Suger_block(event);
		SugarDBlock.Sugar_stone(event);
		SugarDBlock.Sugar_pillar(event);
		SugarDBlock.Sugar_log(event);
		SugarDBlock.Sugar_planks(event);
		SugarDBlock.Sugar_planks_slab(event);
		SugarDBlock.Sugar_slab(event);
		SugarDBlock.Sugar_torch(event);
		SugarDBlock.Sugar_candy(event);
		SugarDTools.Bismuth_pickaxe(event);

	}

	@SubscribeEvent
	//多分モデル登録のイベント
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		SugarDBlock.Bismuth_OreModel(event);
		SugarDBlock.Bismuth_crystal_blockModel(event);
		SugarDBlock.Sugar_blockModel(event);
		SugarDBlock.Sugar_stoneModel(event);
		SugarDBlock.Sugar_pillarModel(event);
		SugarDBlock.Sugar_logModel(event);
		SugarDBlock.Sugar_planksModel(event);
		SugarDBlock.Sugar_planks_slabModel(event);
		SugarDBlock.Sugar_slabModel(event);
		SugarDBlock.Sugar_torchModel(event);
		SugarDBlock.Sugar_candyModel(event);
		SugarDTools.Bismuth_pickaxeModel(event);
	}

	@SubscribeEvent
	//バイオーム
    public void registerBiomes(RegistryEvent.Register<Biome> event) {
		IForgeRegistry<Biome> registry = event.getRegistry();
		ModBiome.registerBiomes(registry);
	}
}
