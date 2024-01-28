package net.afinalword.finalsguns.item;

import net.afinalword.finalsguns.FinalsGuns;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GunItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FinalsGuns.MOD_ID);

    public static final RegistryObject<Item> REVOLVER = ITEMS.register("revolver",
            () -> new Item(new Item.Properties().stacksTo(1).durability(500)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}