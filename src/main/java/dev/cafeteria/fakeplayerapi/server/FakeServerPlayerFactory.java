package dev.cafeteria.fakeplayerapi.server;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;

public interface FakeServerPlayerFactory {

    FakeServerPlayerFactory DEFAULT = FakeServerPlayer::new;

    FakeServerPlayer create(FakePlayerBuilder builder, MinecraftServer server, ServerWorld world, GameProfile profile);
}
