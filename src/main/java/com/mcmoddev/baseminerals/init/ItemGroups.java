package com.mcmoddev.baseminerals.init;

/**
 * This class initializes all item groups in Base Minerals.
 *
 * @author Jasmine Iwanek
 *
 */
public class ItemGroups extends com.mcmoddev.lib.init.ItemGroups {
/*
	public static final java.util.function.BiFunction<ItemStack, ItemStack, Integer> sortingAlgorithm = (ItemStack a, ItemStack b) -> {
		final int delta = Items.getSortingValue(a) - Items.getSortingValue(b);
		if (delta == 0) {
			return a.getItem().getUnlocalizedName().compareToIgnoreCase(b.getItem().getUnlocalizedName());
		}
		return delta;
	};
*/
//	public static CreativeTabs tab_blocks;
//	public static CreativeTabs tab_items;
//	public static CreativeTabs tab_tools;

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

//		tab_blocks = addTab("blocks", true, Materials.vanilla_iron);
//		tab_items = addTab("items", true, Materials.vanilla_iron);
//		tab_tools = addTab("tools", true, Materials.vanilla_iron);

		initDone = true;
	}
}