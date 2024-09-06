package net.dragonmounts.init;


import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;

import static net.dragonmounts.DragonMounts.makeId;

public class DMSounds {
    public static final SoundEvent DRAGON_STEP = create("mob.dragon.step");
    public static final SoundEvent DRAGON_BREATHE = create("mob.dragon.breathe");
    public static final SoundEvent DRAGON_DEATH = create("mob.dragon.death");
    public static final SoundEvent DRAGON_GROWL = create("mob.dragon.growl");
    public static final SoundEvent DRAGON_HATCHLING_GROWL = create("mob.dragon.hatchlinggrowl");
    public static final SoundEvent NETHER_DRAGON_GROWL = create("mob.dragon.nethergrowl");
    public static final SoundEvent SKELETON_DRAGON_GROWL = create("mob.dragon.skeletongrowl");
    public static final SoundEvent ZOMBIE_DRAGON_DEATH = create("mob.dragon.zombiedeath");
    public static final SoundEvent ZOMBIE_DRAGON_GROWL = create("mob.dragon.zombiegrowl");
    public static final SoundEvent DRAGON_SNEEZE = create("mob.dragon.sneeze");
    public static final SoundEvent DRAGON_HATCHED = create("mob.dragon.hatched");
    public static final SoundEvent DRAGON_HATCHING = create("mob.dragon.hatching");
    public static final SoundEvent DRAGON_WHISTLE = create("item.whistle");
    public static final SoundEvent DRAGON_ROAR = create("mob.dragon.roar");
    public static final SoundEvent HATCHLING_DRAGON_ROAR = create("mob.dragon.hatchlingroar");
    public static final SoundEvent VARIANT_SWITCHER = create("item.variant_switcher");

    static SoundEvent create(final String name) {
        var identifier = makeId(name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, identifier, SoundEvent.createVariableRangeEvent(identifier));
    }

    public static void init() {}
}