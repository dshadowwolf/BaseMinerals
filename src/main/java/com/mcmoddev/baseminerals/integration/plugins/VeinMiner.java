package com.mcmoddev.baseminerals.integration.plugins;

import com.mcmoddev.baseminerals.BaseMinerals;
import com.mcmoddev.lib.integration.MMDPlugin;
import com.mcmoddev.lib.util.ConfigBase.Options;
import com.mcmoddev.lib.integration.IIntegration;

/**
 * VeinMiner Integration Plugin
 *
 * @author Jasmine Iwanek
 *
 */
@MMDPlugin(addonId = BaseMinerals.MODID, pluginId = VeinMiner.PLUGIN_MODID)
public class VeinMiner extends com.mcmoddev.lib.integration.plugins.VeinMinerBase implements IIntegration {

	@Override
	public void init() {
		if (!Options.isModEnabled(PLUGIN_MODID)) {
			return;
		}
	}
}
