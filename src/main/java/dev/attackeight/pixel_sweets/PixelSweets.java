package dev.attackeight.pixel_sweets;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import dev.attackeight.pixel_sweets.datagen.LangGen;
import dev.attackeight.pixel_sweets.datagen.ModRecipeProvider;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PixelSweets.ID)
public class PixelSweets {

    public static final String ID = "pixel_sweets";

    public static final NonNullSupplier<Registrate> REGISTRATE = NonNullSupplier.lazy(() -> Registrate.create(ID));

    public static final CreativeModeTab CREATIVE_TAB = new ModCreativeModeTab();

    public PixelSweets() {
        ModItems.register();

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(EventPriority.LOWEST, LangGen::gatherData);
        modEventBus.addListener(EventPriority.LOWEST, ModRecipeProvider::gatherData);

    }
}
