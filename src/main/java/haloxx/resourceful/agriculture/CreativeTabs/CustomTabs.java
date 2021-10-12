package haloxx.resourceful.agriculture.CreativeTabs;

import haloxx.resourceful.agriculture.ResAgri;
import haloxx.resourceful.agriculture.init.ItemInit;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CustomTabs {

    public static ItemGroup RESTAB = FabricItemGroupBuilder.build(new Identifier(ResAgri.MOD_ID, "restab"), () -> new ItemStack(ItemInit.IRON_ESSENCE));

}
