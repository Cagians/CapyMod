package net.cagian.capy;

import net.cagian.capy.entity.ModEntities;
import net.cagian.capy.entity.client.CapyRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderer;

public class CapyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        EntityRendererRegistry.register(ModEntities.capy, CapyRenderer::new);
    }
}