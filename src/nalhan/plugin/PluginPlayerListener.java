package nalhan.plugin;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;


/**
 * Handle events for all Player related events
 * @author nalhan
 */
public class PluginPlayerListener extends PlayerListener {
    private final Plugin plugin;

    public PluginPlayerListener(Plugin instance) {
        plugin = instance;
    }
    
    public void onPlayerKick(PlayerKickEvent event) {
    	Server server = plugin.getServer();
    	Player player = event.getPlayer();
    	System.out.println("Some idiot named" + player + " just got kicked!");
    }
    
	public void onPlayerRespawn(PlayerRespawnEvent event) {
    	Player player = event.getPlayer();
    	player.sendMessage("You have respawned!");
    }
}
