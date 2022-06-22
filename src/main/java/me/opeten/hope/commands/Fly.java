package me.opeten.hope.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }

        Player player = (Player) sender;

        if(player.getAllowFlight()) {
            player.setAllowFlight(false);
            player.sendMessage("§e§l(!) §eFlying disabled");
        } else {
            player.setAllowFlight(true);
            player.sendMessage("§e§l(!) §eFlying enabled");
        }
        return true;
    }
}
