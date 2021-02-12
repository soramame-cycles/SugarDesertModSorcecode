package com.sugar.sugardesertmod.plugin.sweetmagic;

import com.sugar.sugardesertmod.init.block.SugarDBlock;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import sweetmagic.api.magiaflux.IMagiaFluxItemListPlugin;
import sweetmagic.api.magiaflux.MagiaFluxInfo;
import sweetmagic.api.magiaflux.SMMagiaFluxItemListPlugin;

	@SMMagiaFluxItemListPlugin(priority = EventPriority.NORMAL)
	public class MFItemList implements IMagiaFluxItemListPlugin{

		@Override
		public void setMF(MagiaFluxInfo info) {
			info.setMF(new MagiaFluxInfo(new ItemStack(SugarDBlock.Sugar_block),80));
			info.setMF(new MagiaFluxInfo(new ItemStack(SugarDBlock.Sugar_stone),320));
			info.setMF(new MagiaFluxInfo(new ItemStack(SugarDBlock.Sugar_candy),1280));
		}
	}

