package dev.cafeteria.fakeplayerapi.server;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.c2s.play.*;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public class FakeServerPlayNetworkHandler extends ServerPlayNetworkHandler {

    public FakeServerPlayNetworkHandler(MinecraftServer server, ClientConnection connection, ServerPlayerEntity player) {
        super(server, connection, player);
    }

    @Override
    public void onPlayerInput(PlayerInputC2SPacket packet) {
    }

    @Override
    public void onVehicleMove(VehicleMoveC2SPacket packet) {
    }

    @Override
    public void onTeleportConfirm(TeleportConfirmC2SPacket packet) {
    }

    @Override
    public void onRecipeBookData(RecipeBookDataC2SPacket packet) {
    }

    @Override
    public void onRecipeCategoryOptions(RecipeCategoryOptionsC2SPacket packet) {
    }

    @Override
    public void onAdvancementTab(AdvancementTabC2SPacket packet) {
    }

    @Override
    public void onRequestCommandCompletions(RequestCommandCompletionsC2SPacket packet) {
    }

    @Override
    public void onUpdateCommandBlock(UpdateCommandBlockC2SPacket packet) {
    }

    @Override
    public void onUpdateCommandBlockMinecart(UpdateCommandBlockMinecartC2SPacket packet) {
    }

    @Override
    public void onPickFromInventory(PickFromInventoryC2SPacket packet) {
    }

    @Override
    public void onRenameItem(RenameItemC2SPacket packet) {
    }

    @Override
    public void onUpdateBeacon(UpdateBeaconC2SPacket packet) {
    }

    @Override
    public void onUpdateStructureBlock(UpdateStructureBlockC2SPacket packet) {
    }

    @Override
    public void onUpdateJigsaw(UpdateJigsawC2SPacket packet) {
    }

    @Override
    public void onJigsawGenerating(JigsawGeneratingC2SPacket packet) {
    }

    @Override
    public void onSelectMerchantTrade(SelectMerchantTradeC2SPacket packet) {
    }

    @Override
    public void onBookUpdate(BookUpdateC2SPacket packet) {
    }

    @Override
    public void onQueryEntityNbt(QueryEntityNbtC2SPacket packet) {
    }

    @Override
    public void onQueryBlockNbt(QueryBlockNbtC2SPacket packet) {
    }

    @Override
    public void onPlayerMove(PlayerMoveC2SPacket packet) {
    }

    @Override
    public void requestTeleportAndDismount(double x, double y, double z, float yaw, float pitch) {
    }

    @Override
    public void requestTeleport(double x, double y, double z, float yaw, float pitch) {
    }

    @Override
    public void requestTeleport(double x, double y, double z, float yaw, float pitch, Set<PlayerPositionLookS2CPacket.Flag> flags) {
    }

    @Override
    public void requestTeleport(double x, double y, double z, float yaw, float pitch, Set<PlayerPositionLookS2CPacket.Flag> flags, boolean shouldDismount) {
    }

    @Override
    public void onPlayerAction(PlayerActionC2SPacket packet) {
    }

    @Override
    public void onPlayerInteractBlock(PlayerInteractBlockC2SPacket packet) {
    }

    @Override
    public void onPlayerInteractItem(PlayerInteractItemC2SPacket packet) {
    }

    @Override
    public void onSpectatorTeleport(SpectatorTeleportC2SPacket packet) {
    }

    @Override
    public void onResourcePackStatus(ResourcePackStatusC2SPacket packet) {
    }

    @Override
    public void onBoatPaddleState(BoatPaddleStateC2SPacket packet) {
    }

    @Override
    public void onPong(PlayPongC2SPacket packet) {
    }

    @Override
    public void onDisconnected(Text reason) {
    }

    @Override
    public void sendPacket(Packet<?> packet) {
    }

    @Override
    public void sendPacket(Packet<?> packet, @Nullable GenericFutureListener<? extends Future<? super Void>> listener) {
    }

    @Override
    public void onUpdateSelectedSlot(UpdateSelectedSlotC2SPacket packet) {
    }

    @Override
    public void onChatMessage(ChatMessageC2SPacket packet) {
    }

    @Override
    public void onHandSwing(HandSwingC2SPacket packet) {
    }

    @Override
    public void onClientCommand(ClientCommandC2SPacket packet) {
    }

    @Override
    public void onPlayerInteractEntity(PlayerInteractEntityC2SPacket packet) {
    }

    @Override
    public void onClientStatus(ClientStatusC2SPacket packet) {
    }

    @Override
    public void onCloseHandledScreen(CloseHandledScreenC2SPacket packet) {
    }

    @Override
    public void onClickSlot(ClickSlotC2SPacket packet) {
    }

    @Override
    public void onCraftRequest(CraftRequestC2SPacket packet) {
    }

    @Override
    public void onButtonClick(ButtonClickC2SPacket packet) {
    }

    @Override
    public void onCreativeInventoryAction(CreativeInventoryActionC2SPacket packet) {
    }

    @Override
    public void onUpdateSign(UpdateSignC2SPacket packet) {
    }

    @Override
    public void onKeepAlive(KeepAliveC2SPacket packet) {
    }

    @Override
    public void onUpdatePlayerAbilities(UpdatePlayerAbilitiesC2SPacket packet) {
    }

    @Override
    public void onClientSettings(ClientSettingsC2SPacket packet) {
    }

    @Override
    public void onCustomPayload(CustomPayloadC2SPacket packet) {
    }

    @Override
    public void onUpdateDifficulty(UpdateDifficultyC2SPacket packet) {
    }

    @Override
    public void onUpdateDifficultyLock(UpdateDifficultyLockC2SPacket packet) {
    }

    @Override
    public void tick() {
    }

    @Override
    public void disconnect(Text reason) {
    }
}