
package com.mangocoder.yummytreats.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.mangocoder.yummytreats.YummyTreatsModElements;

@YummyTreatsModElements.ModElement.Tag
public class ChocolatePickaxeItem extends YummyTreatsModElements.ModElement {
	@ObjectHolder("yummy_treats:chocolate_pickaxe")
	public static final Item block = null;
	public ChocolatePickaxeItem(YummyTreatsModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}.setRegistryName("chocolate_pickaxe"));
	}
}
