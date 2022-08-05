package me.opeten.hope.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ArrowSpawn implements @Nullable CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }

        sender.sendMessage("fo.java.lang");

        Player player = (Player) sender;

        int arrCnt =  1000000;

        player.setArrowsInBody(arrCnt);
        //arrCnt *= 10;

        return true;
    }
}
