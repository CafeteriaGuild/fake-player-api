package dev.cafeteria.fakeplayerapi.server;

import dev.cafeteria.fakeplayerapi.mixin.ClientConnectionAccessor;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.embedded.EmbeddedChannel;
import net.minecraft.class_7648;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.NetworkSide;
import net.minecraft.network.NetworkState;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

import javax.crypto.Cipher;

public class FakeClientConnection extends ClientConnection {

    public static final FakeClientConnection SERVER_FAKE_CONNECTION = new FakeClientConnection(NetworkSide.SERVERBOUND);

    public FakeClientConnection(NetworkSide side) {
        super(side);
        ((ClientConnectionAccessor) this).setChannel(new EmbeddedChannel());
    }

    @Override
    public void channelActive(ChannelHandlerContext context) throws Exception {
    }

    @Override
    public void setState(NetworkState state) {
    }

    @Override
    public void channelInactive(ChannelHandlerContext context) {
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext context, Throwable ex) {
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Packet<?> packet) {
    }

    @Override
    public void setPacketListener(PacketListener listener) {
    }

    @Override
    public void send(Packet<?> packet) {
    }

    @Override
    public void send(Packet<?> packet, @Nullable class_7648 arg) {
    }

    @Override
    public void tick() {
    }

    @Override
    protected void updateStats() {
    }

    @Override
    public void disconnect(Text disconnectReason) {
    }

    @Override
    public void setupEncryption(Cipher decryptionCipher, Cipher encryptionCipher) {
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public boolean hasChannel() {
        return false;
    }

    @Override
    public PacketListener getPacketListener() {
        return FakePacketListener.INSTANCE;
    }

    @Override
    public void disableAutoRead() {
    }

    @Override
    public void setCompressionThreshold(int compressionThreshold, boolean rejectsBadPackets) {
    }

    @Override
    public void handleDisconnection() {
    }

    @Override
    public boolean acceptInboundMessage(Object msg) throws Exception {
        return false;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
    }

    @Override
    public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
    }
}