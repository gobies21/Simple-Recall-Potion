package net.gobies.simplerecallpotion.item;

import net.gobies.simplerecallpotion.SimpleRecallPotion;
import net.gobies.simplerecallpotion.item.potion.RecallPotionItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEM;
    public static final RegistryObject<Item> RecallPotion;

    public ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }

    static {
        ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleRecallPotion.MOD_ID);
        RecallPotion = ITEM.register("recall_potion", () -> new RecallPotionItem(new Item.Properties()));
    }
}