package haloxx.resourceful.agriculture;

import haloxx.resourceful.agriculture.Render.BlockRenders;
import net.fabricmc.api.ClientModInitializer;

public class RenderCrops implements ClientModInitializer {

    public void onInitializeClient() {
        BlockRenders.defineRenders();
    }

}
