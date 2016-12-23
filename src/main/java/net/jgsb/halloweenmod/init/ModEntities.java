package net.jgsb.halloweenmod.init;

import net.jgsb.halloweenmod.HalloweenMod;
import net.jgsb.halloweenmod.entities.EntityFrankenstein;
import net.jgsb.halloweenmod.entities.EntityGhost;
import net.jgsb.halloweenmod.entities.EntityGrimReaper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * Created by Jacob on 10/12/2016.
 */
public class ModEntities {

    public static void registerEntities() {
        registerEntity(EntityGhost.class, "ghost", 64, 1, true, 0xffffff, 0x000000);
        registerEntity(EntityGrimReaper.class, "grimreaper", 64, 1, true, 0x000000, 0xffffff);
        registerEntity(EntityFrankenstein.class, "frankenstein", 64, 1, true, 0x000000, 0x00cc00);
    }

    public static void setEntityToSpawn() {
        EntityRegistry.addSpawn(EntityGhost.class, 80, 1, 4, EnumCreatureType.MONSTER, Biomes.FOREST, Biomes.FOREST_HILLS, Biomes.HELL,
                Biomes.ROOFED_FOREST, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS,
                Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS);
        EntityRegistry.addSpawn(EntityGrimReaper.class, 15, 1, 1, EnumCreatureType.MONSTER, Biomes.FOREST, Biomes.FOREST_HILLS, Biomes.HELL,
                Biomes.ROOFED_FOREST, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS,
                Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS);
        EntityRegistry.addSpawn(EntityFrankenstein.class, 6, 1, 1, EnumCreatureType.MONSTER, Biomes.ROOFED_FOREST);
    }

    private static int entityID = 0;

    private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int eggColor, int spotColor) {
        EntityRegistry.registerModEntity(entityClass, entityName, entityID++, HalloweenMod.instance, trackingRange, updateFrequency, sendsVelocityUpdates, eggColor, spotColor);
    }

}
