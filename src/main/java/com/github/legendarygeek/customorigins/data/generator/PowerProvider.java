package com.github.legendarygeek.customorigins.data.generator;

import com.github.legendarygeek.customorigins.CustomOrigins;
import io.github.apace100.apoli.command.PowerOperation;
import io.github.apace100.apoli.util.modifier.Modifier;
import io.github.apace100.apoli.util.modifier.ModifierUtil;
import io.github.edwinmindcraft.apoli.api.IDynamicFeatureConfiguration;
import io.github.edwinmindcraft.apoli.api.configuration.ListConfiguration;
import io.github.edwinmindcraft.apoli.api.generator.PowerGenerator;
import io.github.edwinmindcraft.apoli.api.power.ModifierData;
import io.github.edwinmindcraft.apoli.api.power.PowerData;
import io.github.edwinmindcraft.apoli.api.power.configuration.ConfiguredEntityCondition;
import io.github.edwinmindcraft.apoli.api.power.configuration.ConfiguredModifier;
import io.github.edwinmindcraft.apoli.api.power.factory.EntityCondition;
import io.github.edwinmindcraft.apoli.api.power.factory.ModifierOperation;
import io.github.edwinmindcraft.apoli.common.power.configuration.ModifyDamageDealtConfiguration;
import io.github.edwinmindcraft.apoli.common.power.configuration.ValueModifyingPowerConfiguration;
import io.github.edwinmindcraft.apoli.common.registry.ApoliPowers;
import io.github.edwinmindcraft.apoli.common.registry.condition.ApoliEntityConditions;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.UUID;

public class PowerProvider extends PowerGenerator {


    public PowerProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CustomOrigins.MODID, existingFileHelper);
    }

    private void makeInchlingPowers() {
        PowerData hidden = PowerData.builder().hidden().build();
        this.add("small_appetite", ApoliPowers.MODIFY_EXHAUSTION.get().configure(
                new ValueModifyingPowerConfiguration(ListConfiguration.of(
                        ModifierUtil.fromAttributeModifier(new AttributeModifier("Small size, less food exaustion", -0.75, AttributeModifier.Operation.MULTIPLY_BASE))
                )), PowerData.DEFAULT));
    }

    @Override
    protected void populate() {
    this.makeInchlingPowers();
    }
}
