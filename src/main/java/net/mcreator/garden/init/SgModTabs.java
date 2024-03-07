
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.garden.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SgModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SgModBlocks.ASH_LOG.get().asItem());
			tabData.accept(SgModBlocks.ASH_WOOD.get().asItem());
			tabData.accept(SgModBlocks.ASH_PLANKS.get().asItem());
			tabData.accept(SgModBlocks.STARLIT_WOOD.get().asItem());
			tabData.accept(SgModBlocks.STARLIT_LOG.get().asItem());
			tabData.accept(SgModBlocks.STARLIT_PLANKS.get().asItem());
			tabData.accept(SgModBlocks.SACRED_WOOD.get().asItem());
			tabData.accept(SgModBlocks.SACRED_LOG.get().asItem());
			tabData.accept(SgModBlocks.SACRED_PLANKS.get().asItem());
			tabData.accept(SgModBlocks.ROSEWOOD_WOOD.get().asItem());
			tabData.accept(SgModBlocks.ROSEWOOD_LOG.get().asItem());
			tabData.accept(SgModBlocks.ROSEWOOD_PLANKS.get().asItem());
			tabData.accept(SgModBlocks.BLIGHTED_BALSA_WOOD.get().asItem());
			tabData.accept(SgModBlocks.BLIGHTED_BALSA_LOG.get().asItem());
			tabData.accept(SgModBlocks.BLIGHTED_BALSA_PLANKS.get().asItem());
			tabData.accept(SgModBlocks.LEAD_BLOCK.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(SgModBlocks.ASH_FENCE_GATE.get().asItem());
			tabData.accept(SgModBlocks.ASH_PRESSURE_PLATE.get().asItem());
			tabData.accept(SgModBlocks.STARLIT_FENCE_GATE.get().asItem());
			tabData.accept(SgModBlocks.STARLIT_PRESSURE_PLATE.get().asItem());
			tabData.accept(SgModBlocks.SACRED_FENCE_GATE.get().asItem());
			tabData.accept(SgModBlocks.SACRED_PRESSURE_PLATE.get().asItem());
			tabData.accept(SgModBlocks.ROSEWOOD_FENCE_GATE.get().asItem());
			tabData.accept(SgModBlocks.ROSEWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(SgModBlocks.BLIGHTED_BALSA_FENCE_GATE.get().asItem());
			tabData.accept(SgModBlocks.BLIGHTED_BALSA_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SgModItems.LEAD_INGOT.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(SgModBlocks.ASH_LEAVES.get().asItem());
			tabData.accept(SgModBlocks.ASH_FENCE.get().asItem());
			tabData.accept(SgModBlocks.STARLIT_LEAVES.get().asItem());
			tabData.accept(SgModBlocks.STARLIT_FENCE.get().asItem());
			tabData.accept(SgModBlocks.SACRED_LEAVES.get().asItem());
			tabData.accept(SgModBlocks.SACRED_FENCE.get().asItem());
			tabData.accept(SgModBlocks.ROSEWOOD_LEAVES.get().asItem());
			tabData.accept(SgModBlocks.ROSEWOOD_FENCE.get().asItem());
			tabData.accept(SgModBlocks.BLIGHTED_BALSA_LEAVES.get().asItem());
			tabData.accept(SgModBlocks.BLIGHTED_BALSA_FENCE.get().asItem());
			tabData.accept(SgModBlocks.LEAD_ORE.get().asItem());
		}
	}
}
