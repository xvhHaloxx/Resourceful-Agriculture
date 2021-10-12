package haloxx.resourceful.agriculture.init;

import haloxx.resourceful.agriculture.CreativeTabs.CustomTabs;
import haloxx.resourceful.agriculture.Items.Gold.ItemCropGold;
import haloxx.resourceful.agriculture.Items.Iron.ItemCropIron;
import haloxx.resourceful.agriculture.Items.Gold.ItemSeedGold;
import haloxx.resourceful.agriculture.Items.Iron.ItemSeedIron;
import haloxx.resourceful.agriculture.ResAgri;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {

    public static final ItemSeedIron IRON_SEEDS = Registry.register(Registry.ITEM,
            new Identifier(ResAgri.MOD_ID, "iron_seeds"), new ItemSeedIron(BlockInit.IRON_PLANT,(new Item.Settings().group(CustomTabs.RESTAB))));

    public static final ItemCropIron IRON_ESSENCE = Registry.register(Registry.ITEM,
            new Identifier(ResAgri.MOD_ID, "iron_essence"), new ItemCropIron(new Item.Settings().group(CustomTabs.RESTAB)));

    public static final ItemSeedGold GOLD_SEEDS = Registry.register(Registry.ITEM,
            new Identifier(ResAgri.MOD_ID, "gold_seeds"), new ItemSeedGold(BlockInit.GOLD_PLANT,(new Item.Settings().group(CustomTabs.RESTAB))));

    public static final ItemCropGold GOLD_ESSENCE = Registry.register(Registry.ITEM,
            new Identifier(ResAgri.MOD_ID, "gold_essence"), new ItemCropGold(new Item.Settings().group(CustomTabs.RESTAB)));

    public static void init() {

    }
}
