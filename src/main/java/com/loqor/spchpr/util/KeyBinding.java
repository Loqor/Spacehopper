package com.loqor.spchpr.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_SPACEHOPPER = "key.category.loqor.spchpr";
    public static final String KEY_OPEN_VORTEX_GUI = "key.loqor.open_vortex_manipulator";

    public static final KeyMapping OPEN_GUI = new KeyMapping(KEY_OPEN_VORTEX_GUI,
            KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_B, KEY_CATEGORY_SPACEHOPPER);



}
