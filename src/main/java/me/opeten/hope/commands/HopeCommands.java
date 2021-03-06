package me.opeten.hope.commands;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class HopeCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }
        Player player = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("heal")) {
            double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
            player.setHealth(maxHealth);
            player.sendMessage("§e§l(!) §eYou have been healed!");
        }

        if(cmd.getName().equalsIgnoreCase("feed")) {
            player.setFoodLevel(20);
            player.sendMessage("§e§l(!) §eYou have been fed!");
        }

        else if(cmd.getName().equalsIgnoreCase("t")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "time set day");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kill @e[type=!player]");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "weather clear");
            player.sendMessage("§e§l(!) §eReady");
        }

        else if(cmd.getName().equalsIgnoreCase("farmtime")) {
            if(args.length >= 2){
                try {
                    EntityType entity = EntityType.valueOf(args[0].toUpperCase());
                    int amount = Integer.parseInt(args[1]);
                    for (int i = 0; i < amount; i++){
                        player.getWorld().spawnEntity(player.getLocation(), entity);
                    }
                } catch (IllegalArgumentException e) {
                    player.sendMessage("§e§l(!) §cThat is not a valid entity!");
                }
            } else {
                player.sendMessage("§e§l(!) §c/farmtime <mob> <amount>");
            }
        }


        return true;
    }
}
