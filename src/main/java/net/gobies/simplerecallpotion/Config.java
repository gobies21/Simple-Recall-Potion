package net.gobies.simplerecallpotion;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = SimpleRecallPotion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    public static ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<Integer> RECALL_POTION_USE_TIME;
    public static int recall_potion_use_time;
    public static ForgeConfigSpec.ConfigValue<Integer> RECALL_POTION_COOLDOWN;
    public static int recall_potion_cooldown;
    public static ForgeConfigSpec.ConfigValue<Boolean> RECALL_POTION_INTERDIMENSIONAL;
    public static boolean recall_potion_interdimensional;
    public static ForgeConfigSpec.ConfigValue<Boolean> RECALL_POTION_GLOW;
    public static boolean recall_potion_glow;
    public static ForgeConfigSpec.ConfigValue<String> RECALL_POTION_INGREDIENT;
    public static String recall_potion_ingredient;

    public Config() {
    }

    @SubscribeEvent
    static void onLoad(ModConfigEvent.Loading configEvent) {
        recall_potion_use_time = RECALL_POTION_USE_TIME.get();
        recall_potion_cooldown = RECALL_POTION_COOLDOWN.get();
        recall_potion_interdimensional = RECALL_POTION_INTERDIMENSIONAL.get();
        recall_potion_glow = RECALL_POTION_GLOW.get();
        recall_potion_ingredient = RECALL_POTION_INGREDIENT.get();
    }

    static {
        BUILDER.push("Recall Potion");
        RECALL_POTION_USE_TIME = BUILDER.comment("Recall potion use time in ticks").define("Use Time", 32);
        RECALL_POTION_COOLDOWN = BUILDER.comment("Recall potion cooldown in seconds").define("Cooldown", 0);
        RECALL_POTION_INTERDIMENSIONAL = BUILDER.comment("Whether or not you can recall to spawn from other dimensions").define("Interdimensional", false);
        RECALL_POTION_GLOW = BUILDER.comment("Does recall potion have enchantment glow").define("Glow", false);
        RECALL_POTION_INGREDIENT = BUILDER.comment("Main ingredient used to brew recall potions").define("Ingredient", "minecraft:ender_eye");
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}


