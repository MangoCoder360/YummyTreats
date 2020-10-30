
package net.mcreator.yummytreats.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.yummytreats.item.RealWaffleItem;
import net.mcreator.yummytreats.YummyTreatsModElements;

@YummyTreatsModElements.ModElement.Tag
public class YummyTreatsItemGroup extends YummyTreatsModElements.ModElement {
	public YummyTreatsItemGroup(YummyTreatsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabyummy_treats") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RealWaffleItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
