package me.mizab.spawnpointcommand;

import me.mizab.spawnpointcommand.commands.SetSpawnCommand;
import me.mizab.spawnpointcommand.commands.SpawnCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnPointCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("setspawn").setExecutor(new SetSpawnCommand(this));
        getCommand("spawn").setExecutor(new SpawnCommand(this));
    }

}
