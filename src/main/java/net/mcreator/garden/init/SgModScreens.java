
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.garden.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.garden.client.gui.ClassXamaScreen;
import net.mcreator.garden.client.gui.ClassSacerdoteScreen;
import net.mcreator.garden.client.gui.ClassRangerScreen;
import net.mcreator.garden.client.gui.ClassPaladinoScreen;
import net.mcreator.garden.client.gui.ClassNinjaScreen;
import net.mcreator.garden.client.gui.ClassNecromanteScreen;
import net.mcreator.garden.client.gui.ClassMongeScreen;
import net.mcreator.garden.client.gui.ClassMagoScreen;
import net.mcreator.garden.client.gui.ClassLutadorScreen;
import net.mcreator.garden.client.gui.ClassLadraoScreen;
import net.mcreator.garden.client.gui.ClassLadinoScreen;
import net.mcreator.garden.client.gui.ClassInvocadorScreen;
import net.mcreator.garden.client.gui.ClassGuerreiroScreen;
import net.mcreator.garden.client.gui.ClassFeiticeiroScreen;
import net.mcreator.garden.client.gui.ClassExorcistaScreen;
import net.mcreator.garden.client.gui.ClassElementalistaScreen;
import net.mcreator.garden.client.gui.ClassDruidaScreen;
import net.mcreator.garden.client.gui.ClassDancarinoScreen;
import net.mcreator.garden.client.gui.ClassCurandeiroScreen;
import net.mcreator.garden.client.gui.ClassClerigoScreen;
import net.mcreator.garden.client.gui.ClassCavaleiroScreen;
import net.mcreator.garden.client.gui.ClassCacadorScreen;
import net.mcreator.garden.client.gui.ClassBruxoScreen;
import net.mcreator.garden.client.gui.ClassBardoScreen;
import net.mcreator.garden.client.gui.ClassBarbaroScreen;
import net.mcreator.garden.client.gui.ClassAssasinoScreen;
import net.mcreator.garden.client.gui.ClassArqueiroScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SgModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SgModMenus.CLASS_GUERREIRO.get(), ClassGuerreiroScreen::new);
			MenuScreens.register(SgModMenus.CLASS_CAVALEIRO.get(), ClassCavaleiroScreen::new);
			MenuScreens.register(SgModMenus.CLASS_PALADINO.get(), ClassPaladinoScreen::new);
			MenuScreens.register(SgModMenus.CLASS_ARQUEIRO.get(), ClassArqueiroScreen::new);
			MenuScreens.register(SgModMenus.CLASS_CACADOR.get(), ClassCacadorScreen::new);
			MenuScreens.register(SgModMenus.CLASS_RANGER.get(), ClassRangerScreen::new);
			MenuScreens.register(SgModMenus.CLASS_MAGO.get(), ClassMagoScreen::new);
			MenuScreens.register(SgModMenus.CLASS_BRUXO.get(), ClassBruxoScreen::new);
			MenuScreens.register(SgModMenus.CLASS_ELEMENTALISTA.get(), ClassElementalistaScreen::new);
			MenuScreens.register(SgModMenus.CLASS_ASSASINO.get(), ClassAssasinoScreen::new);
			MenuScreens.register(SgModMenus.CLASS_LADINO.get(), ClassLadinoScreen::new);
			MenuScreens.register(SgModMenus.CLASS_NINJA.get(), ClassNinjaScreen::new);
			MenuScreens.register(SgModMenus.CLASS_CLERIGO.get(), ClassClerigoScreen::new);
			MenuScreens.register(SgModMenus.CLASS_SACERDOTE.get(), ClassSacerdoteScreen::new);
			MenuScreens.register(SgModMenus.CLASS_CURANDEIRO.get(), ClassCurandeiroScreen::new);
			MenuScreens.register(SgModMenus.CLASS_FEITICEIRO.get(), ClassFeiticeiroScreen::new);
			MenuScreens.register(SgModMenus.CLASS_INVOCADOR.get(), ClassInvocadorScreen::new);
			MenuScreens.register(SgModMenus.CLASS_NECROMANTE.get(), ClassNecromanteScreen::new);
			MenuScreens.register(SgModMenus.CLASS_DRUIDA.get(), ClassDruidaScreen::new);
			MenuScreens.register(SgModMenus.CLASS_XAMA.get(), ClassXamaScreen::new);
			MenuScreens.register(SgModMenus.CLASS_EXORCISTA.get(), ClassExorcistaScreen::new);
			MenuScreens.register(SgModMenus.CLASS_MONGE.get(), ClassMongeScreen::new);
			MenuScreens.register(SgModMenus.CLASS_LUTADOR.get(), ClassLutadorScreen::new);
			MenuScreens.register(SgModMenus.CLASS_BARBARO.get(), ClassBarbaroScreen::new);
			MenuScreens.register(SgModMenus.CLASS_BARDO.get(), ClassBardoScreen::new);
			MenuScreens.register(SgModMenus.CLASS_DANCARINO.get(), ClassDancarinoScreen::new);
			MenuScreens.register(SgModMenus.CLASS_LADRAO.get(), ClassLadraoScreen::new);
		});
	}
}
