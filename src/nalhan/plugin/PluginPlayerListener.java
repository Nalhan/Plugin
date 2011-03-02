package nalhan.plugin;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

/**
 * Handle events for all Player related events
 * @author nalhan
 */
public class PluginPlayerListener extends PlayerListener {
    private final Plugin plugin;

    public PluginPlayerListener(Plugin instance) {
        plugin = instance;
    }
    
    public void onPlayerRespawn(PlayerRespawnEvent event) {
    	Player player = event.getPlayer();
    	player.sendMessage("You have respawned!");
    }
}
