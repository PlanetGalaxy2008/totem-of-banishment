
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totemofbanishment.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class TotemofbanishmentModSounds {
	public static SoundEvent BANISH = SoundEvent.createVariableRangeEvent(new ResourceLocation("totemofbanishment", "banish"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("totemofbanishment", "banish"), BANISH);
	}
}
