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

    public static final RegistryObject<Item> DISC_CELESTE_PROLOGUE = ITEMS.register("disc_prologue",
            () -> new RecordItem(1, ModSounds.DISC_CELESTE_PROLOGUE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_FIRST_STEPS = ITEMS.register("disc_first_steps",
            () -> new RecordItem(2, ModSounds.DISC_CELESTE_FIRST_STEPS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_RESURRECTIONS = ITEMS.register("disc_resurrections",
            () -> new RecordItem(3, ModSounds.DISC_CELESTE_RESURRECTIONS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_AWAKE = ITEMS.register("disc_awake",
            () -> new RecordItem(4, ModSounds.DISC_CELESTE_AWAKE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_POSTCARD = ITEMS.register("disc_postcard",
            () -> new RecordItem(5, ModSounds.DISC_CELESTE_POSTCARD, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_CHECKING_IN = ITEMS.register("disc_checking_in",
            () -> new RecordItem(6, ModSounds.DISC_CELESTE_CHECKING_IN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_HOSPITALITY = ITEMS.register("disc_hospitality",
            () -> new RecordItem(7, ModSounds.DISC_CELESTE_HOSPITALITY, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_SCATTERED_LOST = ITEMS.register("disc_scattered_lost",
            () -> new RecordItem(8, ModSounds.DISC_CELESTE_SCATTERED_LOST, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_GOLDEN = ITEMS.register("disc_golden",
            () -> new RecordItem(9, ModSounds.DISC_CELESTE_GOLDEN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_ANXIETY = ITEMS.register("disc_anxiety",
            () -> new RecordItem(10, ModSounds.DISC_CELESTE_ANXIETY, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_QUIET_FALLING = ITEMS.register("disc_quiet_falling",
            () -> new RecordItem(11, ModSounds.DISC_CELESTE_QUIET_FALLING, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_MIRROR = ITEMS.register("disc_mirror",
            () -> new RecordItem(12, ModSounds.DISC_CELESTE_MIRROR, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_MADELINE_THEO = ITEMS.register("disc_madeline_theo",
            () -> new RecordItem(13, ModSounds.DISC_CELESTE_MADELINE_THEO, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_STARJUMP = ITEMS.register("disc_starjump",
            () -> new RecordItem(14, ModSounds.DISC_CELESTE_STARJUMP, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_REFLECTION = ITEMS.register("disc_reflection",
            () -> new RecordItem(15, ModSounds.DISC_CELESTE_REFLECTION, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_CONFRONTING_MYSELF = ITEMS.register("disc_confronting_myself",
            () -> new RecordItem(15, ModSounds.DISC_CELESTE_CONFRONTING_MYSELF, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_LITTLE_GOTH = ITEMS.register("disc_little_goth",
            () -> new RecordItem(15, ModSounds.DISC_CELESTE_LITTLE_GOTH, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_REACH_FOR_SUMMIT = ITEMS.register("disc_reach_for_summit",
            () -> new RecordItem(15, ModSounds.DISC_CELESTE_REACH_FOR_SUMMIT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_EXHALE = ITEMS.register("disc_exhale",
            () -> new RecordItem(15, ModSounds.DISC_CELESTE_EXHALE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_MOUNTAIN_HEART = ITEMS.register("disc_mountain_heart",
            () -> new RecordItem(15, ModSounds.DISC_CELESTE_MOUNTAIN_HEART, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));
public static final RegistryObject<Item> DISC_CELESTE_DEAREST_FRIENDS = ITEMS.register("disc_dearest_friends",
            () -> new RecordItem(15, ModSounds.DISC_CELESTE_DEAREST_FRIENDS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1340));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
