package net.gobies.simplerecallpotion;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = SimpleRecallPotion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    public static ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<Integer> RECALL_POTION_COOLDOWN;
    public static int recall_potion_cooldown;
    public static ForgeConfigSpec.ConfigValue<Boolean> RECALL_POTION_INTERDIMENSIONAL;
    public static boolean recall_potion_interdimensional;
    public static ForgeConfigSpec.ConfigValue<Boolean> RECALL_POTION_GLOW;
    public static boolean recall_potion_glow;

    public Config() {
    }

    @SubscribeEvent
    static void onLoad(ModConfigEvent.Loading configEvent) {
        recall_potion_cooldown = RECALL_POTION_COOLDOWN.get();
        recall_potion_interdimensional = (Boolean)RECALL_POTION_INTERDIMENSIONAL.get();
        recall_potion_glow = (Boolean)RECALL_POTION_GLOW.get();
    }

    static {
        BUILDER.push("Recall Potion");
        RECALL_POTION_COOLDOWN = BUILDER.comment("Recall potion cooldown in seconds").define("Cooldown", 5);
        RECALL_POTION_INTERDIMENSIONAL = BUILDER.comment("Whether or not you can recall to spawn from other dimensions").define("Interdimensional", false);
        RECALL_POTION_GLOW = BUILDER.comment("Does recall potion have enchantment glow").define("Glow", false);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}

