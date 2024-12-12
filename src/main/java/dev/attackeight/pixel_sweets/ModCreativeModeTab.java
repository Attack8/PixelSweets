package dev.attackeight.pixel_sweets;

import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Collection;

public class ModCreativeModeTab extends CreativeModeTab {

    public ModCreativeModeTab() {
        super(PixelSweets.ID + ".base");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.SWEET_00.get());
    }

    protected Collection<RegistryEntry<Item>> registeredItems() {
        return PixelSweets.REGISTRATE.get().getAll(ForgeRegistries.ITEMS.getRegistryKey());
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        for (RegistryEntry<Item> entry : registeredItems()) {
            Item item = entry.get();
            if (item instanceof BlockItem)
                continue;
            item.fillItemCategory(this, items);
        }
        for (RegistryEntry<Item> entry : registeredItems())
            if (entry.get() instanceof BlockItem blockItem)
                blockItem.fillItemCategory(this, items);
    }
}
