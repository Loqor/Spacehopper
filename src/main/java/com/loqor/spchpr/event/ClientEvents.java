package com.loqor.spchpr.event;

import com.loqor.spchpr.Spacehopper;
import com.loqor.spchpr.screens.VortexManipulatorScreen;
import com.loqor.spchpr.util.KeyBinding;
import com.mojang.blaze3d.platform.ScreenManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.GenericDirtMessageScreen;
import net.minecraft.client.gui.screens.inventory.CraftingScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundOpenScreenPacket;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = Spacehopper.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(KeyBinding.OPEN_GUI.consumeClick()) {
                //Minecraft.getInstance().setScreen(new VortexManipulatorScreen(Component.literal("Vortex Screen")));
            }
        }
    }

    @Mod.EventBusSubscriber(modid = Spacehopper.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.OPEN_GUI);
        }
    }
}
