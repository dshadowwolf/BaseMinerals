package com.mcmoddev.baseminerals.init;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nonnull;

import com.mcmoddev.baseminerals.data.MaterialNames;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.data.SharedStrings;
import com.mcmoddev.lib.material.MMDMaterial;

import net.minecraft.block.Block;

/**
 * This class initializes all blocks in Base Minerals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Blocks extends com.mcmoddev.lib.init.Blocks {

	protected Blocks() {
		throw new IllegalAccessError(SharedStrings.NOT_INSTANTIABLE);
	}

	/**
	 *
	 */
	public static void init() {
		final List<String> materials = Arrays.asList(MaterialNames.CHARCOAL, MaterialNames.LITHIUM, MaterialNames.NITER,
				MaterialNames.PHOSPHORUS, MaterialNames.POTASH, MaterialNames.SALT, MaterialNames.SALTPETER,
				MaterialNames.SILICON, MaterialNames.SULFUR);

		materials.stream().filter(Materials::hasMaterial)
				.filter(materialName -> !Materials.getMaterialByName(materialName).isEmpty())
				.forEach(materialName -> {
					final MMDMaterial material = Materials.getMaterialByName(materialName);

					create(Names.BLOCK, material);
					create(Names.ORE, material);
				});
	}

	private static Block create(@Nonnull final Names name, @Nonnull final MMDMaterial material) {
		return create(name, material, ItemGroups.myTabs.blocksTab);
	}
}
