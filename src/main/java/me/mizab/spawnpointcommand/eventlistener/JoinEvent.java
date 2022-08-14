package me.mizab.spawnpointcommand.eventlistener;

import me.mizab.spawnpointcommand.SpawnPointCommand;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    private final SpawnPointCommand plugin;
    public JoinEvent (SpawnPointCommand plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        if (!player.hasPlayedBefore()){
            Location loc = plugin.getConfig().getLocation("spawn");

            if (loc != null){
                player.teleport(loc);
            }
        }
    }
}
