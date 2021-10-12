package haloxx.resourceful.agriculture;

import haloxx.resourceful.agriculture.init.BlockInit;
import haloxx.resourceful.agriculture.init.ItemInit;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResAgri implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger(ResAgri.MOD_ID);
	public static final String MOD_ID = "resagri";

	@Override
	public void onInitialize() {

		ItemInit.init();
		BlockInit.init();

	}
}
