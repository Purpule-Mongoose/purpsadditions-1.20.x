package net.purpule.purpsadditions.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.purpule.purpsadditions.PurpsAdditions;
import net.purpule.purpsadditions.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, PurpsAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.DISC_CELESTE_PROLOGUE.get(),
                        ModItems.DISC_CELESTE_FIRST_STEPS.get(),
                        ModItems.DISC_CELESTE_RESURRECTIONS.get(),
                        ModItems.DISC_CELESTE_AWAKE.get(),
                        ModItems.DISC_CELESTE_POSTCARD.get(),
                        ModItems.DISC_CELESTE_CHECKING_IN.get(),
                        ModItems.DISC_CELESTE_HOSPITALITY.get(),
                        ModItems.DISC_CELESTE_SCATTERED_LOST.get(),
                        ModItems.DISC_CELESTE_GOLDEN.get(),
                        ModItems.DISC_CELESTE_ANXIETY.get(),
                        ModItems.DISC_CELESTE_QUIET_FALLING.get(),
                        ModItems.DISC_CELESTE_MIRROR.get(),
                        ModItems.DISC_CELESTE_MADELINE_THEO.get(),
                        ModItems.DISC_CELESTE_STARJUMP.get(),
                        ModItems.DISC_CELESTE_REFLECTION.get(),
                        ModItems.DISC_CELESTE_CONFRONTING_MYSELF.get(),
                        ModItems.DISC_CELESTE_LITTLE_GOTH.get(),
                        ModItems.DISC_CELESTE_REACH_FOR_SUMMIT.get(),
                        ModItems.DISC_CELESTE_EXHALE.get(),
                        ModItems.DISC_CELESTE_MOUNTAIN_HEART.get(),
                        ModItems.DISC_CELESTE_DEAREST_FRIENDS.get());





    }
}
