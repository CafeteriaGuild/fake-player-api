package dev.cafeteria.fakeplayerapi.server;

import com.mojang.authlib.GameProfile;
import dev.cafeteria.fakeplayerapi.mixin.ServerPlayerEntityAccessor;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.encryption.PlayerPublicKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.jetbrains.annotations.Nullable;

public class FakeServerPlayer extends ServerPlayerEntity {

    private final FakePlayerBuilder builder;

    protected FakeServerPlayer(FakePlayerBuilder builder, MinecraftServer server, ServerWorld world, GameProfile profile, @Nullable PlayerPublicKey publicKey) {
        super(server, world, profile, publicKey);
        this.builder = builder;

        this.networkHandler = new FakeServerPlayNetworkHandler(server, FakeClientConnection.SERVER_FAKE_CONNECTION, this);

        ((ServerPlayerEntityAccessor) this).setAdvancementTracker(new FakePlayerAdvancementTracker(this));
        ((ServerPlayerEntityAccessor) this).setStatHandler(new FakeServerStatHandler(server));
    }

    public FakePlayerBuilder getBuilder() {
        return builder;
    }

    @Override
    public void tick() {
    }

    public boolean canBeTarget(LivingEntity otherEntity) {
        return false;
    }
}
