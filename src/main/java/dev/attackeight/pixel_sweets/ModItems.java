package dev.attackeight.pixel_sweets;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static dev.attackeight.pixel_sweets.PixelSweets.REGISTRATE;

@SuppressWarnings("unused")
public class ModItems {

    static {
        REGISTRATE.get().creativeModeTab(() -> PixelSweets.CREATIVE_TAB);
    }

    public static final ItemEntry<Item>

        SWEET_00 = REGISTRATE.get().item("sweet_00", Item::new).lang("Strawberry Shortcake").register(),
        SWEET_01 = REGISTRATE.get().item("sweet_01", Item::new).lang("Sweet Strawberry Mochi").register(),
        SWEET_02 = REGISTRATE.get().item("sweet_02", Item::new).lang("Sweet Red Bean Mochi").register(),
        SWEET_03 = REGISTRATE.get().item("sweet_03", Item::new).lang("Cherry Cupcake").register(),
        SWEET_04 = REGISTRATE.get().item("sweet_04", Item::new).lang("Bubble Gum Cupcake").register(),
        SWEET_05 = REGISTRATE.get().item("sweet_05", Item::new).lang("Strawberry Cupcake").register(),
        SWEET_06 = REGISTRATE.get().item("sweet_06", Item::new).lang("Mochi").register(),
        SWEET_07 = REGISTRATE.get().item("sweet_07", Item::new).lang("Strawberry Doughnut With Sprinkles").register(),
        SWEET_08 = REGISTRATE.get().item("sweet_08", Item::new).lang("Cherry Doughnut With Sprinkles").register(),
        SWEET_09 = REGISTRATE.get().item("sweet_09", Item::new).lang("Chocolate Doughnut With Sprinkles").register(),
        SWEET_10 = REGISTRATE.get().item("sweet_10", Item::new).lang("Bubble Gum Doughnut").register(),
        SWEET_11 = REGISTRATE.get().item("sweet_11", Item::new).lang("Cherry Doughnut").register(),
        SWEET_12 = REGISTRATE.get().item("sweet_12", Item::new).lang("Strawberry Doughnut").register(),
        SWEET_13 = REGISTRATE.get().item("sweet_13", Item::new).lang("Very Cherry Taffy").register(),
        SWEET_14 = REGISTRATE.get().item("sweet_14", Item::new).lang("Cinnamon Taffy").register(),
        SWEET_15 = REGISTRATE.get().item("sweet_15", Item::new).lang("Bubble Gum").register(),
        SWEET_16 = REGISTRATE.get().item("sweet_16", Item::new).lang("Fresh Strawberry Taffy").register(),
        SWEET_17 = REGISTRATE.get().item("sweet_17", Item::new).lang("Strawberry Birthday Cake Macaron").register(),
        SWEET_18 = REGISTRATE.get().item("sweet_18", Item::new).lang("Passion Fruit Macaron").register(),
        SWEET_19 = REGISTRATE.get().item("sweet_19", Item::new).lang("Lavender Honey Macaron").register(),
        SWEET_20 = REGISTRATE.get().item("sweet_20", Item::new).lang("Perfect Raspberry Macaron").register(),
        SWEET_21 = REGISTRATE.get().item("sweet_21", Item::new).lang("Sweet Strawberry Hard Candy").register(),
        SWEET_22 = REGISTRATE.get().item("sweet_22", Item::new).lang("Grape Hard Candy").register(),
        SWEET_23 = REGISTRATE.get().item("sweet_23", Item::new).lang("Bubble Gum Hard Candy").register(),
        SWEET_24 = REGISTRATE.get().item("sweet_24", Item::new).lang("Very Cherry Hard Candy").register(),
        SWEET_25 = REGISTRATE.get().item("sweet_25", Item::new).lang("Cowboy Cookies").register(),
        SWEET_26 = REGISTRATE.get().item("sweet_26", Item::new).lang("Candy Apple").register(),
        SWEET_27 = REGISTRATE.get().item("sweet_27", Item::new).lang("Candied Sweet Berry").register(),
        SWEET_28 = REGISTRATE.get().item("sweet_28", Item::new).lang("Sweet Berry").register()
    ;


    public static void register() {}
}
