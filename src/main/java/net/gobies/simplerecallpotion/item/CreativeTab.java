package net.gobies.simplerecallpotion.item;


import net.gobies.simplerecallpotion.SimpleRecallPotion;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SimpleRecallPotion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTab {

    @SubscribeEvent
    public static void BuildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.RecallPotion.get());
        }
    }
}
