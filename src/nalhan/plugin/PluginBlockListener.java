package nalhan.plugin;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.block.BlockRightClickEvent;
import org.bukkit.block.BlockState;
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
    
    public void onBlockRightClick(BlockRightClickEvent event) {
    	Block block = event.getBlock();
    	Player player = event.getPlayer();
    	if (block.getType().equals(Material.WALL_SIGN) || block.getType().equals(Material.SIGN_POST));
    	{
    		Sign sign =	(Sign)block.getState();
    		if (sign.getLine(0).equalsIgnoreCase("[fire]"))
    		{
    			player.setFireTicks(100);
    			sign.setLine(1, "lol");
    			sign.notify();
    	}
    		else return;
    	}
    }
}
