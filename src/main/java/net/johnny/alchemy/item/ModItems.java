package net.johnny.alchemy.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.johnny.alchemy.Alchemy;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALMISC)));
    public static final Item Raw_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings().group(ModItemGroup.ALMISC)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Alchemy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Alchemy.LOGGER.debug("Registering Mod Items for " + Alchemy.MOD_ID);
    }
}
