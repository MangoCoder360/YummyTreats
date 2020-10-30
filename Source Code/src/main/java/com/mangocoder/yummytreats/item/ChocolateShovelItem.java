
package com.mangocoder.yummytreats.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.mangocoder.yummytreats.YummyTreatsModElements;

@YummyTreatsModElements.ModElement.Tag
public class ChocolateShovelItem extends YummyTreatsModElements.ModElement {
	@ObjectHolder("yummy_treats:chocolate_shovel")
	public static final Item block = null;
	public ChocolateShovelItem(YummyTreatsModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("chocolate_shovel"));
	}
}
