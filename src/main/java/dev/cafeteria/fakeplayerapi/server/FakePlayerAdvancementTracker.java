package dev.cafeteria.fakeplayerapi.server;

import com.mojang.datafixers.DataFixer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementProgress;
import net.minecraft.advancement.PlayerAdvancementTracker;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.ServerAdvancementLoader;
import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.Nullable;

import java.io.File;

public class FakePlayerAdvancementTracker extends PlayerAdvancementTracker {

    public FakePlayerAdvancementTracker(ServerPlayerEntity owner) {
        super(null, null, null, FabricLoader.getInstance().getConfigDir().toFile(), owner);
    }

    @Override
    public void clearCriteria() {
    }

    @Override
    public void reload(ServerAdvancementLoader advancementLoader) {
    }

    @Override
    public void save() {
    }

    @Override
    public boolean grantCriterion(Advancement advancement, String criterionName) {
        return false;
    }

    @Override
    public boolean revokeCriterion(Advancement advancement, String criterionName) {
        return true;
    }

    @Override
    public void sendUpdate(ServerPlayerEntity player) {
    }

    @Override
    public void setDisplayTab(@Nullable Advancement advancement) {
    }

    @Override
    public AdvancementProgress getProgress(Advancement advancement) {
        return new AdvancementProgress();
    }
}