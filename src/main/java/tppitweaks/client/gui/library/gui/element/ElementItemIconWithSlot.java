package tppitweaks.client.gui.library.gui.element;

import net.minecraft.item.ItemStack;

import org.lwjgl.opengl.GL11;

import tppitweaks.client.gui.library.gui.IGuiBase;
import tppitweaks.client.gui.library.gui.utils.GuiUtils;

public class ElementItemIconWithSlot extends ElementItemIcon
{
    public ElementItemIconWithSlot(IGuiBase parent, int x, int y, ItemStack stack)
    {
        super(parent, x, y, stack);
        sizeX = sizeY = 18;
    }

    public ElementItemIconWithSlot(IGuiBase parent, int x, int y, ItemStack stack, boolean big)
    {
        super(parent, x, y, stack);
        sizeX = sizeY = big ? 26 : 18;
    }

    @Override
    public void draw()
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        gui.getTextureManager().bindTexture(texture);
        drawTexturedModalRect(posX, posY, sizeX == 18 ? 0 : 18, 0, sizeX, sizeY);

        int buffer = sizeX == 18 ? 1 : 5;
        GuiUtils.drawItemStack(gui, item, posX + buffer, posY + buffer);
    }
}
