package net.cagian.capy.entity;

import net.cagian.capy.Capy;
import net.cagian.capy.entity.custom.CapybaraEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<CapybaraEntity> capy = Registry.register(Registries.ENTITY_TYPE,new Identifier(Capy.MOD_ID,"capybara"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,CapybaraEntity::new).dimensions(EntityDimensions.fixed(1.3f,1f)).build());
}
