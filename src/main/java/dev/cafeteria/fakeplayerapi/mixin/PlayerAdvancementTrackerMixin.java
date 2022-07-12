package dev.cafeteria.fakeplayerapi.mixin;

import dev.cafeteria.fakeplayerapi.server.FakePlayerAdvancementTracker;
import net.minecraft.advancement.PlayerAdvancementTracker;
import net.minecraft.server.ServerAdvancementLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerAdvancementTracker.class)
public class PlayerAdvancementTrackerMixin {
    @Inject(method = "load", at = @At("INVOKE"), cancellable = true)
    private void fakeplayerapi_cancelLoad(ServerAdvancementLoader advancementLoader, CallbackInfo ci) {
        if ((Object) this instanceof FakePlayerAdvancementTracker) ci.cancel();
    }
}