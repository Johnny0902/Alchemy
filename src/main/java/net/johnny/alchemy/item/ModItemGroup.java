package net.johnny.alchemy.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.johnny.alchemy.Alchemy;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ALMISC = FabricItemGroupBuilder.build(
            new Identifier(Alchemy.MOD_ID, "almisc"), () -> new ItemStack(ModItems.SILVER_INGOT)
    );
}
