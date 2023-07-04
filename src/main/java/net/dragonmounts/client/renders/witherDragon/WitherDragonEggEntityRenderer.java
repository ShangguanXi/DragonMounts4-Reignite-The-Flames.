package net.dragonmounts.client.renders.witherDragon;

import net.dragonmounts.client.models.DragonEggEntityModel;
import net.dragonmounts.entities.dragonEggs.AetherDragonEggEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class WitherDragonEggEntityRenderer extends MobEntityRenderer<AetherDragonEggEntity, DragonEggEntityModel<AetherDragonEggEntity>> {

    private static final Identifier TEXTURE = new Identifier("textures/entity/eggs/aether_egg.png");

    public WitherDragonEggEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new DragonEggEntityModel<>(), 0.5f);
    }

    @Override
    public Identifier getTexture(AetherDragonEggEntity entity) {
        return TEXTURE;
    }
}
