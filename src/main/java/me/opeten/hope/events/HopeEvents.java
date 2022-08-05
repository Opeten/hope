package me.opeten.hope.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.attribute.Attribute;


public class HopeEvents implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome To The Server");
    }

    /*@EventHandler
    public void onPlayerDead (PlayerDeathEvent deathEvent) {
        Player player = deathEvent.getPlayer();
        public double getMaxHealth(Player instanceof ) {
            return player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getBaseValue();
        }
        if (deathEvent.getEntity() instanceof Player) {

            }
        }
        if (deathEvent.getEntity().getKiller instanceof Player) {
            //some code here
        }
    }*/

    /*@EventHandler
    public static  void onPlayerWalk(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();

        Material block = player.getWorld().getBlockAt(x, y-1, z).getType();
        if(block == Material.STONE){
            player.sendMessage(ChatColor.GREEN + "You are standing on stone!");
        }
    }*/
}
