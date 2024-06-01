package net.mcreator.garden.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.garden.world.inventory.StatusMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StatusScreen extends AbstractContainerScreen<StatusMenu> {
	private final static HashMap<String, Object> guistate = StatusMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public StatusScreen(StatusMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 433;
		this.imageHeight = 300;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("sg:textures/screens/2.png"), this.leftPos + 110, this.topPos + 29, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("sg:textures/screens/1.png"), this.leftPos + 108, this.topPos + 29, 0, 0, 208, 224, 208, 224);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.sg.status.label_strength"), 142, 137, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.sg.status.label_dexterity"), 142, 155, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.sg.status.label_intelligence"), 184, 155, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.sg.status.label_defense"), 142, 173, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.sg.status.label_health"), 184, 137, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.sg.status.label_ana"), 184, 173, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.sg.status.label_level"), 142, 119, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
