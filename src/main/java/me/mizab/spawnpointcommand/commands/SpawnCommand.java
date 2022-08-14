package me.mizab.spawnpointcommand.commands;

import me.mizab.spawnpointcommand.SpawnPointCommand;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    private final SpawnPointCommand plugin;
    public SpawnCommand(SpawnPointCommand plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player){
            Location loc = plugin.getConfig().getLocation("spawn");

            if (loc != null){
                player.teleport(loc);
                player.sendMessage("You have been teleported to the spawn point");
            }else{
                player.sendMessage(ChatColor.RED + "Please first set the spawn-point. Use /setspawn");
            }
        }

        return true;
    }
}
