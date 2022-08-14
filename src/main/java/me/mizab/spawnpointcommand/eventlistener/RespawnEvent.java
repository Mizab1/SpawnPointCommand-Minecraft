package me.mizab.spawnpointcommand.eventlistener;

import me.mizab.spawnpointcommand.SpawnPointCommand;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class RespawnEvent implements Listener {
    private final SpawnPointCommand plugin;
    public RespawnEvent (SpawnPointCommand plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event){
        Location loc = plugin.getConfig().getLocation("spawn");
        if (loc != null){
            event.setRespawnLocation(loc);
        }
    }
}
