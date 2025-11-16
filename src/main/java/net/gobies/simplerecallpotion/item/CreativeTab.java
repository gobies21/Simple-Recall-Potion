package net.gobies.simplerecallpotion.item;


import net.gobies.simplerecallpotion.SimpleRecallPotion;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@EventBusSubscriber(modid = SimpleRecallPotion.MOD_ID)
public class CreativeTab {

    @SubscribeEvent
    public static void BuildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(PotionRegister.RecallPotion.get());
        }
    }
}
