package dev.cafeteria.fakeplayerapi.mixin;

import dev.cafeteria.fakeplayerapi.server.FakePlayerFactory;
import dev.cafeteria.fakeplayerapi.server.FakeServerPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.crash.CrashReportSection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public class MixinEntity {
    @Inject(method = "populateCrashReport", at = @At("TAIL"))
    private void fakeplayerapi_populate(CrashReportSection section, CallbackInfo ci) {
        if ((Object) this instanceof FakeServerPlayer fakePlayer) {
            section.add("Fake Player From", fakePlayer.getFactory().factoryId().toString());
        }
    }
}
