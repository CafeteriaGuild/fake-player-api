package dev.cafeteria.fakeplayerapi.server;

import com.mojang.authlib.GameProfile;
import net.minecraft.network.encryption.PlayerPublicKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import org.jetbrains.annotations.Nullable;

public interface FakeServerPlayerFactory {

    FakeServerPlayerFactory DEFAULT = FakeServerPlayer::new;

    FakeServerPlayer create(FakePlayerBuilder builder, MinecraftServer server, ServerWorld world, GameProfile profile, @Nullable PlayerPublicKey publicKey);
}
