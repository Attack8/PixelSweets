package dev.attackeight.pixel_sweets;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static dev.attackeight.pixel_sweets.PixelSweets.REGISTRATE;

public class ModItems {

    static {
        REGISTRATE.get().creativeModeTab(() -> PixelSweets.CREATIVE_TAB);
    }

    public static final ItemEntry<Item>

        SWEET_00 = REGISTRATE.get().item("sweet_00", Item::new).lang("Sweet 0").register(),
        SWEET_01 = REGISTRATE.get().item("sweet_01", Item::new).lang("Sweet 1").register(),
        SWEET_02 = REGISTRATE.get().item("sweet_02", Item::new).lang("Sweet 2").register(),
        SWEET_03 = REGISTRATE.get().item("sweet_03", Item::new).lang("Sweet 3").register(),
        SWEET_04 = REGISTRATE.get().item("sweet_04", Item::new).lang("Sweet 4").register(),
        SWEET_05 = REGISTRATE.get().item("sweet_05", Item::new).lang("Sweet 5").register(),
        SWEET_06 = REGISTRATE.get().item("sweet_06", Item::new).lang("Sweet 6").register(),
        SWEET_07 = REGISTRATE.get().item("sweet_07", Item::new).lang("Sweet 7").register(),
        SWEET_08 = REGISTRATE.get().item("sweet_08", Item::new).lang("Sweet 8").register(),
        SWEET_09 = REGISTRATE.get().item("sweet_09", Item::new).lang("Sweet 9").register(),
        SWEET_10 = REGISTRATE.get().item("sweet_10", Item::new).lang("Sweet 10").register(),
        SWEET_11 = REGISTRATE.get().item("sweet_11", Item::new).lang("Sweet 11").register(),
        SWEET_12 = REGISTRATE.get().item("sweet_12", Item::new).lang("Sweet 12").register(),
        SWEET_13 = REGISTRATE.get().item("sweet_13", Item::new).lang("Sweet 13").register(),
        SWEET_14 = REGISTRATE.get().item("sweet_14", Item::new).lang("Sweet 14").register(),
        SWEET_15 = REGISTRATE.get().item("sweet_15", Item::new).lang("Sweet 15").register(),
        SWEET_16 = REGISTRATE.get().item("sweet_16", Item::new).lang("Sweet 16").register(),
        SWEET_17 = REGISTRATE.get().item("sweet_17", Item::new).lang("Sweet 17").register(),
        SWEET_18 = REGISTRATE.get().item("sweet_18", Item::new).lang("Sweet 18").register(),
        SWEET_19 = REGISTRATE.get().item("sweet_19", Item::new).lang("Sweet 19").register(),
        SWEET_20 = REGISTRATE.get().item("sweet_20", Item::new).lang("Sweet 20").register(),
        SWEET_21 = REGISTRATE.get().item("sweet_21", Item::new).lang("Sweet 21").register(),
        SWEET_22 = REGISTRATE.get().item("sweet_22", Item::new).lang("Sweet 22").register(),
        SWEET_23 = REGISTRATE.get().item("sweet_23", Item::new).lang("Sweet 23").register(),
        SWEET_24 = REGISTRATE.get().item("sweet_24", Item::new).lang("Sweet 24").register(),
        SWEET_25 = REGISTRATE.get().item("sweet_25", Item::new).lang("Sweet 25").register(),
        SWEET_26 = REGISTRATE.get().item("sweet_26", Item::new).lang("Sweet 26").register(),
        SWEET_27 = REGISTRATE.get().item("sweet_27", Item::new).lang("Sweet 27").register(),
        SWEET_28 = REGISTRATE.get().item("sweet_28", Item::new).lang("Sweet 28").register()
    ;


    public static void register() {}
}
