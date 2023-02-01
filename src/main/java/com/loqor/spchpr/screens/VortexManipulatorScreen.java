package com.loqor.spchpr.screens;

import com.loqor.spchpr.Spacehopper;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.awt.*;
import java.lang.annotation.ElementType;

public class VortexManipulatorScreen extends Screen {

    private int imageHeight;
    private int imageWidth;
    public static final ResourceLocation VORTEX_MANIPULATOR_GUI = new ResourceLocation(Spacehopper.MODID, "textures/gui/screens/vortex_manipulator_gui.png");

    public VortexManipulatorScreen(Component label) {
        super(label);
        ++this.imageHeight;
        this.imageWidth = 231;
        this.imageHeight = 150;
    }

    @Override
    public void render(PoseStack matrixStack, int pMouseX, int pMouseY, float pPartialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, pMouseX, pMouseY, pPartialTicks);
    }

    @Override
    public void renderBackground(PoseStack pMatrixStack) {
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, VORTEX_MANIPULATOR_GUI);
        int i = (this.width - this.imageWidth) / 2;
        int j = (this.height - this.imageHeight) / 2;
        this.blit(pMatrixStack, i, j, 0, 0, this.imageWidth, this.imageHeight);
    }

    /*@Override protected void init() {
        int i = (this.width - this.imageWidth) / 2;
        int j = (this.height - this.imageHeight) / 2;
    }*/

    @Override
    protected void init() {
        int i = (this.width - this.imageWidth) / 2;
        int j = (this.height - this.imageHeight) / 2;
    }
}
