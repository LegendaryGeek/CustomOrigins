package com.github.legendarygeek.customorigins.data.generator;

import com.github.legendarygeek.customorigins.CustomOrigins;
import io.github.apace100.apoli.util.modifier.ModifierUtil;
import io.github.edwinmindcraft.apoli.api.IDynamicFeatureConfiguration;
import io.github.edwinmindcraft.apoli.api.configuration.ListConfiguration;
import io.github.edwinmindcraft.apoli.api.generator.PowerGenerator;
import io.github.edwinmindcraft.apoli.api.power.PowerData;
import io.github.edwinmindcraft.apoli.api.power.configuration.ConfiguredEntityCondition;
import io.github.edwinmindcraft.apoli.api.power.factory.EntityCondition;
import io.github.edwinmindcraft.apoli.common.power.configuration.ValueModifyingPowerConfiguration;
import io.github.edwinmindcraft.apoli.common.registry.ApoliPowers;
import io.github.edwinmindcraft.apoli.common.registry.condition.ApoliEntityConditions;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.UUID;

public class PowerProvider extends PowerGenerator {


    protected PowerProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, CustomOrigins.MODID, existingFileHelper);
    }

    private void makeInchlingPowers() {
        PowerData hidden = PowerData.builder().hidden().build();
        hidden.conditions().add(
                ApoliPowers.MODIFY_EXHAUSTION.get().configure(
                        new ValueModifyingPowerConfiguration(ListConfiguration.of(ModifierUtil.fromAttributeModifier(
                                new AttributeModifier(UUID.randomUUID(), "Origin modifier", -0.75, AttributeModifier.Operation.MULTIPLY_BASE)
                        ))), PowerData.builder().build()));
        //this.add("small_sized", ApoliPowers.MODIFY_EXHAUSTION.get().configure());
    }

    @Override
    protected void populate() {

    }
}
