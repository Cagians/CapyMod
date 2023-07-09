package net.cagian.capy.entity.client;

import net.cagian.capy.Capy;
import net.cagian.capy.entity.custom.CapybaraEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;

public class CapyRenderer extends GeoEntityRenderer<CapybaraEntity> {

    public CapyRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new CapyModel());
    }
    @Override
    public Identifier getTextureLocation(CapybaraEntity animatable){
        return new Identifier(Capy.MOD_ID,"textures/entity/capybara.png");
    }
    @Override
    public void render(CapybaraEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
