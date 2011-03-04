package nalhan.plugin;

import org.bukkit.block.Block;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockRightClickEvent;
import org.bukkit.block.Sign;


/**
 * Sample block listener
 * @author nalhan
 */
public class PluginBlockListener extends BlockListener {
    private final Plugin plugin;

    public PluginBlockListener(final Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void onBlockRightClick(BlockRightClickEvent event) {
    	Block block = event.getBlock();
    	Player player = event.getPlayer();
    	String name = player.getName().toLowerCase();
    		player.sendMessage(name);
    }
}


