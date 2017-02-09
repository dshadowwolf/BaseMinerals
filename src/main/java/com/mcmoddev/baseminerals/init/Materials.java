package com.mcmoddev.baseminerals.init;

import com.mcmoddev.baseminerals.util.Config.Options;

import com.mcmoddev.lib.material.MetalMaterial;

/**
 * This class initializes all of the materials in Base Minerals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Materials extends com.mcmoddev.lib.init.Materials {

	/** Lithium */
	public static MetalMaterial lithium;
	/** Niter */
	public static MetalMaterial niter;
	/** Phosphorus */
	public static MetalMaterial phosphorus;
	/** Potash */
	public static MetalMaterial potash;
	/** Salt */
	public static MetalMaterial salt;
	/** Saltpeter */
	public static MetalMaterial saltpeter;
	/** Silicon */
	public static MetalMaterial silicon;
	/** Sulfur */
	public static MetalMaterial sulfur;

	/** Charcoal */
	public static MetalMaterial vanilla_charcoal;

	private static boolean initDone = false;

	protected Materials() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		if (Options.enableCharcoal) {
			vanilla_charcoal = createMaterial("charcoal", 5, 2, 0, 0xFF000000);
			vanilla_charcoal.materialType = MetalMaterial.MaterialType.MINERAL;
		}

		if (Options.enableLithium) {
			lithium = createMaterial("lithium", 8, 8, 4.5, 0xFFC5C8C1);
			lithium.materialType = MetalMaterial.MaterialType.METAL;
		}

		if (Options.enableNiter) {
			niter = createMaterial("niter", 5, 2, 0, 0xFF000000);
			niter.materialType = MetalMaterial.MaterialType.MINERAL;
		}

		if (Options.enablePhosphorus) {
			phosphorus = createMaterial("phosphorus", 5, 2, 0, 0xFF000000);
			phosphorus.materialType = MetalMaterial.MaterialType.MINERAL;
		}

		if (Options.enablePotash) {
			potash = createMaterial("potash", 5, 2, 0, 0xFF000000);
			potash.materialType = MetalMaterial.MaterialType.MINERAL;
		}

		if (Options.enableSalt) {
			salt = createMaterial("salt", 5, 2, 0, 0xFF000000);
			salt.materialType = MetalMaterial.MaterialType.MINERAL;
		}

		if (Options.enableSaltpeter) {
			saltpeter = createMaterial("saltpeter", 5, 2, 0, 0xFF000000);
			saltpeter.materialType = MetalMaterial.MaterialType.MINERAL;
		}

		if (Options.enableSilicon) {
			silicon = createMaterial("silicon", 8, 8, 4.5, 0xFFC5C8C1);
			silicon.materialType = MetalMaterial.MaterialType.METAL;
		}

		if (Options.enableSulfur) {
			sulfur = createMaterial("sulfur", 5, 2, 0, 0xFF000000);
			sulfur.materialType = MetalMaterial.MaterialType.MINERAL;
		}

		initDone = true;
	}
}
