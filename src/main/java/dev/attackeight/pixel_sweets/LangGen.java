package dev.attackeight.pixel_sweets;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.logging.LogUtils;
import com.tterrag.registrate.providers.ProviderType;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.function.BiConsumer;

import static dev.attackeight.pixel_sweets.PixelSweets.REGISTRATE;

public class LangGen {

    public static void gatherData(GatherDataEvent event) {
        REGISTRATE.get().addDataGenerator(ProviderType.LANG, provider -> {
            BiConsumer<String, String> langConsumer = provider::add;

            provideDefaultLang("interface", langConsumer);
        });
    }

    /**
     * 'Borrowed' from the Create mod (credit to PepperCode1)
     */
    private static void provideDefaultLang(String fileName, BiConsumer<String, String> consumer) {
        String path = "assets/pixel_sweets/lang/default/" + fileName + ".json";
        JsonElement jsonElement = loadJson(path);
        if (jsonElement == null) {
            throw new IllegalStateException(String.format("Could not find default lang file: %s", path));
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().getAsString();
            consumer.accept(key, value);
        }
    }

    /**
     * 'Borrowed' from the Create mod (credit to simibubi)
     */
    private static JsonElement loadJson(String filepath) {
        InputStream inputStream = ClassLoader.getSystemResourceAsStream(filepath);
        try {
            JsonReader reader = new JsonReader(new BufferedReader(new InputStreamReader(inputStream)));
            reader.setLenient(true);
            JsonElement element = Streams.parse(reader);
            reader.close();
            inputStream.close();
            return element;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
