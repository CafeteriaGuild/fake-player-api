package dev.cafeteria.fakeplayerapi.mixin;

import dev.cafeteria.fakeplayerapi.server.FakeServerPlayer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TargetPredicate.class)
public class TargetPredicateMixin {
    @Inject(method = "test", at = @At("INVOKE"), cancellable = true)
    private void fakeplayerapi_canTrack(LivingEntity baseEntity, LivingEntity targetEntity, CallbackInfoReturnable<Boolean> cir) {
        if ((Object) this instanceof FakeServerPlayer fakePlayer) {
            if (!fakePlayer.canBeTarget(baseEntity)) cir.setReturnValue(false);
        }
    }
}
