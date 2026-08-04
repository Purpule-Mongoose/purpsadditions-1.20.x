package net.purpule.purpsadditions.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.purpule.purpsadditions.PurpsAdditions;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PurpsAdditions.MOD_ID);

    public static final RegistryObject<SoundEvent> DISC_CELESTE_PROLOGUE = registerSoundEvents("disc_celeste_prologue");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_FIRST_STEPS = registerSoundEvents("disc_celeste_first_steps");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_RESURRECTIONS = registerSoundEvents("disc_celeste_resurrections");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_AWAKE = registerSoundEvents("disc_celeste_awake");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_POSTCARD = registerSoundEvents("disc_celeste_postcard");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_CHECKING_IN = registerSoundEvents("disc_celeste_checking_in");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_HOSPITALITY = registerSoundEvents("disc_celeste_hospitality");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_SCATTERED_LOST = registerSoundEvents("disc_celeste_scattered_lost");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_GOLDEN = registerSoundEvents("disc_celeste_golden");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_ANXIETY = registerSoundEvents("disc_celeste_anxiety");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_QUIET_FALLING = registerSoundEvents("disc_celeste_quiet_falling");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_MIRROR = registerSoundEvents("disc_celeste_mirror");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_MADELINE_THEO = registerSoundEvents("disc_celeste_madeline_theo");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_STARJUMP = registerSoundEvents("disc_celeste_starjump");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_REFLECTION = registerSoundEvents("disc_celeste_reflection");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_CONFRONTING_MYSELF = registerSoundEvents("disc_celeste_confronting_myself");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_LITTLE_GOTH = registerSoundEvents("disc_celeste_little_goth");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_REACH_FOR_SUMMIT = registerSoundEvents("disc_celeste_reach_for_summit");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_EXHALE = registerSoundEvents("disc_celeste_exhale");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_MOUNTAIN_HEART = registerSoundEvents("disc_celeste_mountain_heart");
 public static final RegistryObject<SoundEvent> DISC_CELESTE_DEAREST_FRIENDS = registerSoundEvents("disc_celeste_dearest_friends");



    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(PurpsAdditions.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
