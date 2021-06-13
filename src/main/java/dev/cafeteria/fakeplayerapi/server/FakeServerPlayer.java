package dev.cafeteria.fakeplayerapi.server;

import com.mojang.authlib.GameProfile;
import dev.cafeteria.fakeplayerapi.mixin.ServerPlayerEntityAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;

public class FakeServerPlayer extends ServerPlayerEntity {

    private final FakePlayerFactory factory;

    protected FakeServerPlayer(FakePlayerFactory factory, MinecraftServer server, ServerWorld world, GameProfile profile) {
        super(server, world, profile);
        this.factory = factory;

        this.networkHandler = new FakeServerPlayNetworkHandler(server, FakeClientConnection.SERVER_FAKE_CONNECTION, this);

        ((ServerPlayerEntityAccessor) this).setAdvancementTracker(new FakePlayerAdvancementTracker(this));
        ((ServerPlayerEntityAccessor) this).setStatHandler(new FakeServerStatHandler(server));
    }

    public FakePlayerFactory getFactory() {
        return factory;
    }
}
