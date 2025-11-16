package net.gobies.simplerecallpotion.recipe.brewing;

import net.gobies.simplerecallpotion.Config;
import net.gobies.simplerecallpotion.SimpleRecallPotion;
import net.gobies.simplerecallpotion.item.PotionRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

@EventBusSubscriber(modid = SimpleRecallPotion.MOD_ID)
public class BrewingRecipes {

    @SubscribeEvent
    private static void registerBrewingRecipes(RegisterBrewingRecipesEvent event) {
        event.getBuilder().addRecipe(
                Ingredient.of(PotionContents.createItemStack(Items.POTION, Potions.AWKWARD)),
                Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.tryParse(Config.RECALL_POTION_INGREDIENT.get()))),
                PotionRegister.RecallPotion.get().getDefaultInstance()
        );
        event.getBuilder().build();
    }
}