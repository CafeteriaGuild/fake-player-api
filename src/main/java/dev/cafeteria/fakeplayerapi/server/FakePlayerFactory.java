package dev.cafeteria.fakeplayerapi.server;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;

import java.util.UUID;

/**
 * @param factoryId id of the factory, used to append data to crash report in case a fake player causes a crash
 */
public record FakePlayerFactory(Identifier factoryId) {

    public FakeServerPlayer create(MinecraftServer server, ServerWorld world, GameProfile profile) {
        return new FakeServerPlayer(this, server, world, profile);
    }

    public FakeServerPlayer create(MinecraftServer server, ServerWorld world, String name) {
        return new FakeServerPlayer(this, server, world, new GameProfile(UUID.randomUUID(), name));
    }
}
