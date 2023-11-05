
package net.mcreator.totemofbanishment.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.totemofbanishment.procedures.TotemOfBanishmentRightclickedProcedure;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class TotemOfBanishmentItem extends Item {
	public TotemOfBanishmentItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 15;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TotemOfBanishmentRightclickedProcedure.execute(entity, itemstack);
		return ar;
	}
}
