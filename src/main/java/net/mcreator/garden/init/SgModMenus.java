
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.garden.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.garden.world.inventory.StatusMenu;
import net.mcreator.garden.SgMod;

public class SgModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SgMod.MODID);
	public static final RegistryObject<MenuType<StatusMenu>> STATUS = REGISTRY.register("status", () -> IForgeMenuType.create(StatusMenu::new));
}
