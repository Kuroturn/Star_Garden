package net.mcreator.garden.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.garden.world.inventory.ClassDruidaMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ClassDruidaScreen extends AbstractContainerScreen<ClassDruidaMenu> {
	private final static HashMap<String, Object> guistate = ClassDruidaMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_aaaaaaaaaaaaa;

	public ClassDruidaScreen(ClassDruidaMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 168;
		this.imageHeight = 204;
	}

	private static final ResourceLocation texture = new ResourceLocation("sg:textures/screens/class_druida.png");

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
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("sg:textures/screens/class_selector1.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 168, 204, 168, 204);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.sg.class_druida.label_class"), 41, 13, -3355444, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.sg.class_druida.label_guerreiro"), 69, 22, -3355444, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_aaaaaaaaaaaaa = Button.builder(Component.translatable("gui.sg.class_druida.button_aaaaaaaaaaaaa"), e -> {
		}).bounds(this.leftPos + 39, this.topPos + 170, 93, 20).build();
		guistate.put("button:button_aaaaaaaaaaaaa", button_aaaaaaaaaaaaa);
		this.addRenderableWidget(button_aaaaaaaaaaaaa);
	}
}
