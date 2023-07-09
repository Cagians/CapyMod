package net.cagian.capy;

import net.cagian.capy.block.ModBlocks;
import net.cagian.capy.entity.ModEntities;
import net.cagian.capy.entity.custom.CapybaraEntity;
import net.cagian.capy.item.ModItemGroup;
import net.cagian.capy.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Capy implements ModInitializer {
    public static final String MOD_ID = "capy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroup.InitializeTabs();
        ModBlocks.registerModBlocks();
        GeckoLib.initialize();
        FabricDefaultAttributeRegistry.register(ModEntities.capy, CapybaraEntity.setAttributes());
    }
}