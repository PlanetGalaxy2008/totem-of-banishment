/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totemofbanishment.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.totemofbanishment.item.TotemOfBanishmentItem;
import net.mcreator.totemofbanishment.TotemofbanishmentMod;

public class TotemofbanishmentModItems {
	public static Item TOTEM_OF_BANISHMENT;

	public static void load() {
		TOTEM_OF_BANISHMENT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TotemofbanishmentMod.MODID, "totem_of_banishment"), new TotemOfBanishmentItem());
	}

	public static void clientLoad() {
	}
}
