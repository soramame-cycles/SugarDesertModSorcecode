package com.sugar.sugardesertmod;

import java.util.logging.Logger;

import com.sugar.sugardesertmod.gen.biome.ModBiome;
import com.sugar.sugardesertmod.gen.block.BismuthOreGen;
import com.sugar.sugardesertmod.gen.block.EndDiaGen;
import com.sugar.sugardesertmod.gen.block.NetherDiaGen;
import com.sugar.sugardesertmod.gen.block.SugarBlockGen;
import com.sugar.sugardesertmod.gen.block.SugarDiaOreGen;
import com.sugar.sugardesertmod.handlers.OreDictionaryHandler;
import com.sugar.sugardesertmod.init.block.SugarDBlock;
import com.sugar.sugardesertmod.init.item.SDItem;
import com.sugar.sugardesertmod.init.tool.SugarDTools;
import com.sugar.sugardesertmod.recipes.SmeltingSugarD;
import com.sugar.sugardesertmod.tab.CreativeTabsSugarD;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = SugarDesertMod.MOD_ID,name = SugarDesertMod.MOD_NAME,version = SugarDesertMod.MOD_VERSION,
	updateJSON = "https://raw.githubusercontent.com/soramame-cycles/sugar_desertmod/master/sugarD_updateChecker.json")
public class SugarDesertMod {
	public static final String MOD_ID = "sugard";
	public static final String MOD_NAME = "SugerDesertmod";
	public static final String MOD_VERSION = "1.6.2";
	public static CreativeTabsSugarD Tab_sugard = new CreativeTabsSugarD();

	public static Logger logger;

	@Instance(MOD_ID)
	public static SugarDesertMod instance;

	@Mod.EventHandler
	//最初に処理をしたいものをここにいれる
	public void preinit(FMLPreInitializationEvent event) {

	}

	@Mod.EventHandler
	//このjava自体をイベントとして扱うコード
	public void construct(FMLConstructionEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Mod.EventHandler
	//preInitの次に読み込ませたいもの
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new BismuthOreGen(), 0);
		GameRegistry.registerWorldGenerator(new SugarBlockGen(), 0);
		GameRegistry.registerWorldGenerator(new SugarDiaOreGen(),0);
		GameRegistry.registerWorldGenerator(new NetherDiaGen(), 0);
		GameRegistry.registerWorldGenerator(new EndDiaGen(), 0);
		ModBiome.registerBiomeTypes();
		SmeltingSugarD.register();
		OreDictionaryHandler.registerOreDictionary();
	}

	@SubscribeEvent
	//アイテム登録のイベント
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
		SugarDBlock.Sugar_fence(event);
		SugarDBlock.Sugar_diamond_ore(event);
		SugarDBlock.Sugar_diamond_block(event);
		SugarDBlock.Rotten_flesh_block(event);
		SugarDBlock.Sugar_cobblestone(event);
		SugarDBlock.Sugar_stone_stairs(event);
		SugarDBlock.Sugar_planks_stairs(event);
		SugarDBlock.Sugarrack(event);
		SugarDBlock.End_sugar_stone(event);
		SugarDBlock.Sugar_leaves(event);
		SugarDBlock.Sugar_sapling(event);
		SugarDBlock.Sugar_stone_wall(event);
		SugarDBlock.Sugar_trapdoor(event);
		SugarDBlock.Sugar_bricks(event);
		SugarDBlock.Sugar_pane(event);
		SugarDBlock.Caramel_sauce(event);
		SugarDBlock.Pudding_block(event);
		SugarDBlock.Sugar_bricks_slab(event);
		SugarDBlock.Sugar_bricks_stairs(event);
		SugarDBlock.Sugar_cob_slab(event);
		SugarDBlock.Sugar_cob_stairs(event);
		SugarDBlock.Sugar_planks_button(event);
		SugarDBlock.Sugar_stone_button(event);
		SugarDBlock.Cookie_block(event);
		SugarDBlock.Raw_sugar_block(event);
		SugarDBlock.Moist_sugar_block(event);
		SugarDTools.Bismuth_pickaxe(event);
		SugarDTools.Sugar_diamond_axe(event);
		SugarDTools.Sugar_diamond_hoe(event);
		SugarDTools.Sugar_diamond_pickaxe(event);
		SugarDTools.Sugar_diamond_shovel(event);
		SugarDTools.Sugar_diamond_sword(event);
		SDItem.Pudding(event);
		SDItem.Azuki_been(event);
		SDItem.Azuki_paste(event);
		SDItem.Azuki_been_bun(event);
		SDItem.Poppy_seed(event);
		SDItem.bismuth_crystal(event);
		SDItem.bismuth_liquid(event);
		SDItem.Sugar_diamond(event);
		SDItem.Sugar_diamond_nugget(event);
		SDItem.Crushed_Sugar_Cane(event);
		SDItem.Raw_Sugar(event);


	}

	@SubscribeEvent
	//blockの登録イベント
	public void registerBlocks(RegistryEvent.Register<Block> event) {

	}

	@SubscribeEvent
	//モデル登録のイベント
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
		SugarDBlock.Sugar_fenceModel(event);
		SugarDBlock.Sugar_diamond_oreModel(event);
		SugarDBlock.Sugar_diamond_blockModel(event);
		SugarDBlock.Rotten_flesh_blockModel(event);
		SugarDBlock.Sugar_cobblestoneModel(event);
		SugarDBlock.Sugar_stone_stairsModel(event);
		SugarDBlock.Sugar_planks_stairsModel(event);
		SugarDBlock.SugarrackModel(event);
		SugarDBlock.End_sugar_stoneModel(event);
		SugarDBlock.Sugar_leavesModel(event);
		SugarDBlock.Sugar_saplingModel(event);
		SugarDBlock.Sugar_stone_wallModel(event);
		SugarDBlock.Sugar_trapdoorModel(event);
		SugarDBlock.Sugar_bricksModel(event);
		SugarDBlock.Sugar_paneModel(event);
		SugarDBlock.Caramel_sauceModel(event);
		SugarDBlock.Pudding_blockModel(event);
		SugarDBlock.Sugar_bricks_slabModel(event);
		SugarDBlock.Sugar_bricks_stairsModel(event);
		SugarDBlock.Sugar_cob_slabModel(event);
		SugarDBlock.Sugar_cob_stairsModel(event);
		SugarDBlock.Sugar_planks_buttonModel(event);
		SugarDBlock.Sugar_stone_buttonModel(event);
		SugarDBlock.Cookie_blockModel(event);
		SugarDBlock.Raw_sugar_blockModel(event);
		SugarDBlock.Moist_sugaar_blockModel(event);
		SugarDTools.Bismuth_pickaxeModel(event);
		SugarDTools.Sugar_diamond_axeModel(event);
		SugarDTools.Sugar_diamond_hoeModel(event);
		SugarDTools.Sugar_diamond_pickaxeModel(event);
		SugarDTools.Sugar_diamond_shovelModel(event);
		SugarDTools.Sugar_diamond_swordModel(event);
		SDItem.PuddingModel(event);
		SDItem.Azuki_beenModel(event);
		SDItem.Azuki_pasteModel(event);
		SDItem.Azuki_been_bunModel(event);
		SDItem.Poppy_seedModel(event);
		SDItem.bismuth_crystalModel(event);
		SDItem.bismuth_liquidModel(event);
		SDItem.Sugar_diamondModel(event);
		SDItem.Sugar_diamond_nuggetModel(event);
		SDItem.Crushed_Sugar_CaneModel(event);
		SDItem.Raw_SugarModel(event);
	}

	@SubscribeEvent
	//バイオーム
    public void registerBiomes(RegistryEvent.Register<Biome> event) {
		IForgeRegistry<Biome> registry = event.getRegistry();
		ModBiome.registerBiomes(registry);
	}

	@Mod.EventHandler
	//一番最後に処理したいもの
	public void postInit(FMLPostInitializationEvent event) {

	}
}
