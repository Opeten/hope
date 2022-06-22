package me.opeten.hope.commands;

import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HopeCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {return true; }
        Player player = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("heal")) {
            double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
            player.setHealth(maxHealth); 
        }

        if(cmd.getName().equalsIgnoreCase("feed")) {
            player.setFoodLevel(20);
        }
        return true;
    }
}
