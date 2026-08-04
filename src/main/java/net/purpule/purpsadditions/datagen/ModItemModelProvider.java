package net.purpule.purpsadditions.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.purpule.purpsadditions.PurpsAdditions;
import net.purpule.purpsadditions.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PurpsAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.DISC_CELESTE_PROLOGUE);
        simpleItem(ModItems.DISC_CELESTE_PROLOGUE);
        simpleItem(ModItems.DISC_CELESTE_PROLOGUE);
        simpleItem(ModItems.DISC_CELESTE_PROLOGUE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PurpsAdditions.MOD_ID, "item/" + item.getId().getPath()));
    }
}
