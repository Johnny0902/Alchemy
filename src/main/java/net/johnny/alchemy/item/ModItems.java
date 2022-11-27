package net.johnny.alchemy.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.johnny.alchemy.Alchemy;
import net.johnny.alchemy.item.custom.EightBallItem;
import net.johnny.alchemy.item.custom.InfinityPearlItem;
import net.johnny.alchemy.item.custom.SuperSnowBallItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALMISC)));
    public static final Item Raw_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings().group(ModItemGroup.ALMISC)));
    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.ALMISC).maxCount(1)));
    public static final Item INFINITY_PEARL = registerItem("infinity_pearl",
            new InfinityPearlItem(new FabricItemSettings().group(ModItemGroup.ALMISC).maxCount(1)));
    public static final Item SUPER_SNOW_BALL = registerItem("super_snow_ball",
            new SuperSnowBallItem(new FabricItemSettings().group(ModItemGroup.ALMISC).maxCount(1)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Alchemy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Alchemy.LOGGER.debug("Registering Mod Items for " + Alchemy.MOD_ID);
    }
}
