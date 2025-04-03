package net.gobies.simplerecallpotion;

import com.mojang.logging.LogUtils;
import net.gobies.simplerecallpotion.item.ModItems;
import net.gobies.simplerecallpotion.recipe.brewing.BrewingRecipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static net.gobies.simplerecallpotion.SimpleRecallPotion.MOD_ID;

@Mod(MOD_ID)
public class SimpleRecallPotion {

    public static final String MOD_ID = "simplerecall";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SimpleRecallPotion() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modBus);

        BrewingRecipes.register(modBus);

        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}


