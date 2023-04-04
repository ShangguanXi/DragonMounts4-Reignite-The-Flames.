package net.dragonmounts.group;

import net.dragonmounts.DragonMounts3Main;
import net.dragonmounts.items.DragonScalesItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DragonMountsGroup {
    public static final ItemGroup ItemsGroup = FabricItemGroupBuilder.create(
                    new Identifier("dragonmounts", "items"))
            .icon(() -> new ItemStack(DragonScalesItems.aether_dragonscales)).build();
}
