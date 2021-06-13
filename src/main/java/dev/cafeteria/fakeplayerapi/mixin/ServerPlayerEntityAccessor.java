package dev.cafeteria.fakeplayerapi.mixin;

import net.minecraft.advancement.PlayerAdvancementTracker;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.ServerStatHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ServerPlayerEntity.class)
public interface ServerPlayerEntityAccessor {
    @Accessor
    void setAdvancementTracker(PlayerAdvancementTracker tracker);

    @Accessor
    void setStatHandler(ServerStatHandler statHandler);
}
