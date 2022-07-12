package dev.cafeteria.fakeplayerapi.mixin;

import net.minecraft.advancement.PlayerAdvancementTracker;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.ServerStatHandler;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ServerPlayerEntity.class)
public class ServerPlayerEntityMixin {

    @Shadow @Final @Mutable
    private ServerStatHandler statHandler;

    @Shadow @Final @Mutable
    private PlayerAdvancementTracker advancementTracker;
}