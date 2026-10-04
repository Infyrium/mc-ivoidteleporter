package net.infyrium.ivoidteleporter;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.infyrium.ivoidteleporter.listeners.PlayerMoveListener;
import net.infyrium.ivoidteleporter.utils.ConfigUpdater;

public class iVoidTeleporterMain extends JavaPlugin {

    @Override
    public void onEnable() {
        ConfigUpdater.backupIfOutdated(this, "config.yml");
        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new PlayerMoveListener(this), this);

        getLogger().info("Plugin has been enabled!");
        getLogger().info("Plugin developed by: " + String.join(", ", getPluginMeta().getAuthors()));
        getLogger().info("Website: " + getPluginMeta().getWebsite());
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin has been disabled!");
    }
}
