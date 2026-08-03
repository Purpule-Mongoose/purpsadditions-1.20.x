package net.purpule.purpsadditions.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.purpule.purpsadditions.PurpsAdditions;
import net.purpule.purpsadditions.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister <Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PurpsAdditions.MOD_ID);

    public static final RegistryObject<Item> DISCPROLOGUE = ITEMS.register("disc_prologue",
            () -> new RecordItem(1, ModSounds.DISC_CELESTE_PROLOGUE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
