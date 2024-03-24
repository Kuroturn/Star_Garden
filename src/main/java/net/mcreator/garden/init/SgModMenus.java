
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.garden.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.garden.world.inventory.ClassXamaMenu;
import net.mcreator.garden.world.inventory.ClassSacerdoteMenu;
import net.mcreator.garden.world.inventory.ClassRangerMenu;
import net.mcreator.garden.world.inventory.ClassPaladinoMenu;
import net.mcreator.garden.world.inventory.ClassNinjaMenu;
import net.mcreator.garden.world.inventory.ClassNecromanteMenu;
import net.mcreator.garden.world.inventory.ClassMongeMenu;
import net.mcreator.garden.world.inventory.ClassMagoMenu;
import net.mcreator.garden.world.inventory.ClassLutadorMenu;
import net.mcreator.garden.world.inventory.ClassLadraoMenu;
import net.mcreator.garden.world.inventory.ClassLadinoMenu;
import net.mcreator.garden.world.inventory.ClassInvocadorMenu;
import net.mcreator.garden.world.inventory.ClassGuerreiroMenu;
import net.mcreator.garden.world.inventory.ClassFeiticeiroMenu;
import net.mcreator.garden.world.inventory.ClassExorcistaMenu;
import net.mcreator.garden.world.inventory.ClassElementalistaMenu;
import net.mcreator.garden.world.inventory.ClassDruidaMenu;
import net.mcreator.garden.world.inventory.ClassDancarinoMenu;
import net.mcreator.garden.world.inventory.ClassCurandeiroMenu;
import net.mcreator.garden.world.inventory.ClassClerigoMenu;
import net.mcreator.garden.world.inventory.ClassCavaleiroMenu;
import net.mcreator.garden.world.inventory.ClassCacadorMenu;
import net.mcreator.garden.world.inventory.ClassBruxoMenu;
import net.mcreator.garden.world.inventory.ClassBardoMenu;
import net.mcreator.garden.world.inventory.ClassBarbaroMenu;
import net.mcreator.garden.world.inventory.ClassAssasinoMenu;
import net.mcreator.garden.world.inventory.ClassArqueiroMenu;
import net.mcreator.garden.SgMod;

public class SgModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SgMod.MODID);
	public static final RegistryObject<MenuType<ClassGuerreiroMenu>> CLASS_GUERREIRO = REGISTRY.register("class_guerreiro", () -> IForgeMenuType.create(ClassGuerreiroMenu::new));
	public static final RegistryObject<MenuType<ClassCavaleiroMenu>> CLASS_CAVALEIRO = REGISTRY.register("class_cavaleiro", () -> IForgeMenuType.create(ClassCavaleiroMenu::new));
	public static final RegistryObject<MenuType<ClassPaladinoMenu>> CLASS_PALADINO = REGISTRY.register("class_paladino", () -> IForgeMenuType.create(ClassPaladinoMenu::new));
	public static final RegistryObject<MenuType<ClassArqueiroMenu>> CLASS_ARQUEIRO = REGISTRY.register("class_arqueiro", () -> IForgeMenuType.create(ClassArqueiroMenu::new));
	public static final RegistryObject<MenuType<ClassCacadorMenu>> CLASS_CACADOR = REGISTRY.register("class_cacador", () -> IForgeMenuType.create(ClassCacadorMenu::new));
	public static final RegistryObject<MenuType<ClassRangerMenu>> CLASS_RANGER = REGISTRY.register("class_ranger", () -> IForgeMenuType.create(ClassRangerMenu::new));
	public static final RegistryObject<MenuType<ClassMagoMenu>> CLASS_MAGO = REGISTRY.register("class_mago", () -> IForgeMenuType.create(ClassMagoMenu::new));
	public static final RegistryObject<MenuType<ClassBruxoMenu>> CLASS_BRUXO = REGISTRY.register("class_bruxo", () -> IForgeMenuType.create(ClassBruxoMenu::new));
	public static final RegistryObject<MenuType<ClassElementalistaMenu>> CLASS_ELEMENTALISTA = REGISTRY.register("class_elementalista", () -> IForgeMenuType.create(ClassElementalistaMenu::new));
	public static final RegistryObject<MenuType<ClassAssasinoMenu>> CLASS_ASSASINO = REGISTRY.register("class_assasino", () -> IForgeMenuType.create(ClassAssasinoMenu::new));
	public static final RegistryObject<MenuType<ClassLadinoMenu>> CLASS_LADINO = REGISTRY.register("class_ladino", () -> IForgeMenuType.create(ClassLadinoMenu::new));
	public static final RegistryObject<MenuType<ClassNinjaMenu>> CLASS_NINJA = REGISTRY.register("class_ninja", () -> IForgeMenuType.create(ClassNinjaMenu::new));
	public static final RegistryObject<MenuType<ClassClerigoMenu>> CLASS_CLERIGO = REGISTRY.register("class_clerigo", () -> IForgeMenuType.create(ClassClerigoMenu::new));
	public static final RegistryObject<MenuType<ClassSacerdoteMenu>> CLASS_SACERDOTE = REGISTRY.register("class_sacerdote", () -> IForgeMenuType.create(ClassSacerdoteMenu::new));
	public static final RegistryObject<MenuType<ClassCurandeiroMenu>> CLASS_CURANDEIRO = REGISTRY.register("class_curandeiro", () -> IForgeMenuType.create(ClassCurandeiroMenu::new));
	public static final RegistryObject<MenuType<ClassFeiticeiroMenu>> CLASS_FEITICEIRO = REGISTRY.register("class_feiticeiro", () -> IForgeMenuType.create(ClassFeiticeiroMenu::new));
	public static final RegistryObject<MenuType<ClassInvocadorMenu>> CLASS_INVOCADOR = REGISTRY.register("class_invocador", () -> IForgeMenuType.create(ClassInvocadorMenu::new));
	public static final RegistryObject<MenuType<ClassNecromanteMenu>> CLASS_NECROMANTE = REGISTRY.register("class_necromante", () -> IForgeMenuType.create(ClassNecromanteMenu::new));
	public static final RegistryObject<MenuType<ClassDruidaMenu>> CLASS_DRUIDA = REGISTRY.register("class_druida", () -> IForgeMenuType.create(ClassDruidaMenu::new));
	public static final RegistryObject<MenuType<ClassXamaMenu>> CLASS_XAMA = REGISTRY.register("class_xama", () -> IForgeMenuType.create(ClassXamaMenu::new));
	public static final RegistryObject<MenuType<ClassExorcistaMenu>> CLASS_EXORCISTA = REGISTRY.register("class_exorcista", () -> IForgeMenuType.create(ClassExorcistaMenu::new));
	public static final RegistryObject<MenuType<ClassMongeMenu>> CLASS_MONGE = REGISTRY.register("class_monge", () -> IForgeMenuType.create(ClassMongeMenu::new));
	public static final RegistryObject<MenuType<ClassLutadorMenu>> CLASS_LUTADOR = REGISTRY.register("class_lutador", () -> IForgeMenuType.create(ClassLutadorMenu::new));
	public static final RegistryObject<MenuType<ClassBarbaroMenu>> CLASS_BARBARO = REGISTRY.register("class_barbaro", () -> IForgeMenuType.create(ClassBarbaroMenu::new));
	public static final RegistryObject<MenuType<ClassBardoMenu>> CLASS_BARDO = REGISTRY.register("class_bardo", () -> IForgeMenuType.create(ClassBardoMenu::new));
	public static final RegistryObject<MenuType<ClassDancarinoMenu>> CLASS_DANCARINO = REGISTRY.register("class_dancarino", () -> IForgeMenuType.create(ClassDancarinoMenu::new));
	public static final RegistryObject<MenuType<ClassLadraoMenu>> CLASS_LADRAO = REGISTRY.register("class_ladrao", () -> IForgeMenuType.create(ClassLadraoMenu::new));
}
