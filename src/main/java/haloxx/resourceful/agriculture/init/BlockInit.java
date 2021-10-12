package haloxx.resourceful.agriculture.init;


import haloxx.resourceful.agriculture.Blocks.GoldPlant;
import haloxx.resourceful.agriculture.Blocks.IronPlant;
import haloxx.resourceful.agriculture.ResAgri;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit extends BlockItem {

    public static final IronPlant IRON_PLANT = Registry.register(Registry.BLOCK, new Identifier
            (ResAgri.MOD_ID, "iron_plant"), new IronPlant(FabricBlockSettings.of
                (Material.PLANT).noCollision().ticksRandomly().strength(0.0F, 0.0F).sounds(BlockSoundGroup.CROP).nonOpaque()));

    public static final GoldPlant GOLD_PLANT = Registry.register(Registry.BLOCK, new Identifier
            (ResAgri.MOD_ID, "gold_plant"), new GoldPlant(FabricBlockSettings.of
            (Material.PLANT).noCollision().ticksRandomly().strength(0.0F, 0.0F).sounds(BlockSoundGroup.CROP).nonOpaque()));

    public BlockInit(Block block, Settings settings) {
        super(block, settings);
    }


    public static void init() {

    }
}
