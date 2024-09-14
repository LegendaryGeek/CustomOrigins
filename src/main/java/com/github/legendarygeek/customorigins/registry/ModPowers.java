package com.github.legendarygeek.customorigins.registry;

import com.github.legendarygeek.customorigins.CustomOrigins;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.edwinmindcraft.apoli.api.registry.ApoliRegistries;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPowers {
    public static final DeferredRegister<PowerFactory<?>> POWERS = DeferredRegister.create(ApoliRegistries.POWER_FACTORY_KEY.registry(), CustomOrigins.MODID);
}
