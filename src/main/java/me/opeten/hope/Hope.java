package me.opeten.hope;

import me.opeten.hope.commands.HopeCommands;
import me.opeten.hope.events.HopeEvents;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public final class Hope extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        HopeCommands commands = new HopeCommands();
        getServer().getPluginManager().registerEvents(new HopeEvents(),this);
        getCommand("heal").setExecutor(commands);
        getCommand("feed").setExecutor(commands);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Hope]: Plugin is enabled!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Hope]: Plugin is disabled!");
    }
}
