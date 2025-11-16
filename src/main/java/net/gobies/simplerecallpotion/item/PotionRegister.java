package net.gobies.simplerecallpotion.item;

import net.gobies.simplerecallpotion.SimpleRecallPotion;
import net.gobies.simplerecallpotion.item.potion.RecallPotionItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PotionRegister {
    public static final DeferredRegister<Item> ITEM;
    public static final DeferredHolder<Item, RecallPotionItem> RecallPotion;

    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }

    static {
        ITEM = DeferredRegister.create(Registries.ITEM, SimpleRecallPotion.MOD_ID);
        RecallPotion = ITEM.register("recall_potion", () -> new RecallPotionItem(new Item.Properties()));
    }
}