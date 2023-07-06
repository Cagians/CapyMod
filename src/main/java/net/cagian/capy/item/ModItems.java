package net.cagian.capy.item;

import net.cagian.capy.Capy;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems{

    public  static final Item peach = registerItem("peach",new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,80),0.35f).build())));
    public  static final Item orange = registerItem("orange",new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,80),0.25f).build())));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Capy.MOD_ID, name),item);
    }

    public static void registerModItems(){
        Capy.LOGGER.debug("registering item for " + Capy.MOD_ID);
    }
}
