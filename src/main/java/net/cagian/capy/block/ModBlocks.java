package net.cagian.capy.block;

import net.cagian.capy.Capy;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block orange_wood_log = registerBlock("orange_wood_log",new PillarBlock(FabricBlockSettings.create().burnable().sounds(BlockSoundGroup.WOOD).hardness(Blocks.OAK_LOG.getHardness())));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(Capy.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name,Block block){
        return Registry.register(Registries.ITEM,new Identifier(Capy.MOD_ID,name),
        new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        Capy.LOGGER.debug("Registering modblocks");
    }
}
