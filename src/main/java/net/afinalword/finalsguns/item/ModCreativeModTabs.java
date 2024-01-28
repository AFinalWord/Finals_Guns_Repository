package net.afinalword.finalsguns.item;

import net.afinalword.finalsguns.FinalsGuns;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FinalsGuns.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("gun_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(GunItem.REVOLVER.get()))
                    .title(Component.translatable("creativetab.gun_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(GunItem.REVOLVER.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}