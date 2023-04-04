package dev.cafeteria.fakeplayerapi.server;

import net.minecraft.network.ClientConnection;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.text.Text;

public record FakePacketListener(ClientConnection connection) implements PacketListener {

    public static final FakePacketListener INSTANCE = new FakePacketListener(FakeClientConnection.SERVER_FAKE_CONNECTION);

    @Override
    public void onDisconnected(Text reason) {
    }

    @Override
    public boolean isConnectionOpen() {
        return true;
    }

    @Override
    public boolean shouldCrashOnException() {
        return PacketListener.super.shouldCrashOnException();
    }


}
