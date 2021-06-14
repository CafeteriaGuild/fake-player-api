package dev.cafeteria.fakeplayerapi.server;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;

import java.util.UUID;

public class FakePlayerBuilder {

    private final Identifier builderId;

    private final FakeServerPlayerFactory factory;

    /**
     * @param builderId id of the factory, used to append data to crash report in case a fake player causes a crash
     */
    public FakePlayerBuilder(Identifier builderId, FakeServerPlayerFactory factory) {
        this.builderId = builderId;
        this.factory = factory;
    }

    public FakePlayerBuilder(Identifier builderId) {
        this.builderId = builderId;
        this.factory = FakeServerPlayerFactory.DEFAULT;
    }

    public Identifier getId() {
        return builderId;
    }

    public FakeServerPlayer create(MinecraftServer server, ServerWorld world, GameProfile profile) {
        return factory.create(this, server, world, profile);
    }

    public FakeServerPlayer create(MinecraftServer server, ServerWorld world, String name) {
        return factory.create(this, server, world, new GameProfile(UUID.randomUUID(), name));
    }
}
