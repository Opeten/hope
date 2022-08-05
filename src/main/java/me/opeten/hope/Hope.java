package me.opeten.hope;

import me.opeten.hope.commands.Fly;
import me.opeten.hope.commands.ArrowSpawn;
import me.opeten.hope.commands.HopeCommands;
import me.opeten.hope.events.HopeEvents;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public final class Hope extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        HopeCommands commands = new HopeCommands();
        getServer().getPluginManager().registerEvents(new HopeEvents(),this);
        getCommand("heal").setExecutor(commands);
        getCommand("feed").setExecutor(commands);
        getCommand("t").setExecutor(commands);
        getCommand("farmtime").setExecutor(commands);
        getCommand("fly").setExecutor(new Fly());
        getCommand("arrow").setExecutor(new ArrowSpawn());
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Hope]: Plugin is enabled!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Hope]: Plugin is disabled!");
    }}

    /*private boolean isLoopGoing;


    private void startLoop() {
        isLoopGoing = true;
    }

    private void StopLoop() {
        isLoopGoing = false;
    }


    private void ArrowLoop(final ArrowSpawn arrow) {

        new BukkitRunnable() {

            private int counter = 80;

            @Override
            public void run() {
                if(!isLoopGoing) {
                    cancel();
                    return;
                }

                if(counter < 3 || arrow.isOnGround()){
                    arrow.remove();
                    StopLoop();
                    return;
                }

                TNTPrimed tnt = (TNTPrimed)arrow.getWorld().spawnEntity(arrow.getLocation(), EntityType.PRIMED_TNT);

                tnt.setFuseTicks(counter);

                counter --;

            }
        };
    }

    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent e) {
        if (e.getEntity().getShooter() instanceof Player) {
            if(e.getEntityType() == EntityType.ARROW) {
                ArrowLoop((ArrowSpawn) e.getEntity());
                getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Hope]: LaunchEvent arrow");
            }

        }
    }
}*/
