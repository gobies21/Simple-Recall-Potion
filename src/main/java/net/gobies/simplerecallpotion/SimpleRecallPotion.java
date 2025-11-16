package net.gobies.simplerecallpotion;

import com.mojang.logging.LogUtils;
import net.gobies.simplerecallpotion.item.PotionRegister;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(SimpleRecallPotion.MOD_ID)
public class SimpleRecallPotion {

    public static final String MOD_ID = "simplerecall";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SimpleRecallPotion(IEventBus modBus, ModContainer container) {

        PotionRegister.register(modBus);

        container.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

}


