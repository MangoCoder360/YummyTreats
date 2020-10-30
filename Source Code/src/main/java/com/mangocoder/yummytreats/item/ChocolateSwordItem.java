
package com.mangocoder.yummytreats.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.mangocoder.yummytreats.YummyTreatsModElements;

@YummyTreatsModElements.ModElement.Tag
public class ChocolateSwordItem extends YummyTreatsModElements.ModElement {
	@ObjectHolder("yummy_treats:chocolate_sword")
	public static final Item block = null;
	public ChocolateSwordItem(YummyTreatsModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("chocolate_sword"));
	}
}
