package net.lepko.easycrafting.block;

import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;

public class SlotEasyCraftingOutput extends Slot {

    public SlotEasyCraftingOutput(IInventory par1iInventory, int par2, int par3, int par4) {
        super(par1iInventory, par2, par3, par4);
    }

    @Override
    public boolean isItemValid(ItemStack par1ItemStack) {
        return false;
    }

    @Override
    public void putStack(ItemStack par1ItemStack) {
        return;
    }

    @Override
    public ItemStack decrStackSize(int par1) {
        return super.decrStackSize(0);
    }
}
