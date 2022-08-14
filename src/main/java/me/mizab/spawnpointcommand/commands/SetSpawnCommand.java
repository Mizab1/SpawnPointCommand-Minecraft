package me.mizab.spawnpointcommand.commands;

import me.mizab.spawnpointcommand.SpawnPointCommand;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {
    private final SpawnPointCommand plugin;
    public SetSpawnCommand(SpawnPointCommand plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player){
            Location loc = player.getLocation();
            plugin.getConfig().set("spawn", loc);
            plugin.saveConfig();

            player.sendMessage("Saved your Location");
        }

        return true;
    }
}
