package com.loqor.spchpr.common.items;

import com.loqor.spchpr.Spacehopper;
import com.loqor.spchpr.screens.VortexManipulatorScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.CraftingScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class VortexManipulatorItem extends Item {

    public VortexManipulatorItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level p_41432_, Player p_41433_, InteractionHand p_41434_) {
        //ItemStack itemstack = p_41433_.getItemInHand(p_41434_);
        //this.openItemGui(itemstack, p_41434_);
        //p_41433_.sendSystemMessage(Component.translatable("Press B to input coordinates."));
        return super.use(p_41432_, p_41433_, p_41434_);
    }

    /*public void openItemGui(ItemStack itemstack, InteractionHand hand) {
        if (itemstack.is(Spacehopper.VORTEX_MANIPULATOR.get())) {
            Minecraft.getInstance().setScreen(new VortexManipulatorScreen(Component.translatable("Vortex Manipulator")));
        }
    }*/
}
