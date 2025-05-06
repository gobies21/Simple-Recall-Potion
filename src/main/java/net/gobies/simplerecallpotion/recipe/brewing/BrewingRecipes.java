package net.gobies.simplerecallpotion.recipe.brewing;

import net.gobies.simplerecallpotion.Config;
import net.gobies.simplerecallpotion.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class BrewingRecipes {
    public BrewingRecipes() {
    }

    public static void register(IEventBus eventBus) {
        eventBus.addListener(BrewingRecipes::registerBrewingRecipes);
    }

    private static void registerBrewingRecipes(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            BrewingRecipeRegistry.addRecipe(
                    Ingredient.of(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.AWKWARD)),
                    Ingredient.of(Objects.requireNonNull(ForgeRegistries.ITEMS.getValue(new ResourceLocation(Config.RECALL_POTION_INGREDIENT.get())))),
                    (ModItems.RecallPotion.get()).getDefaultInstance());
        });
    }
}