/*package me.opeten.hope.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Rename implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }
        Player player = (Player) sender;


        if (cmd.getName().equalsIgnoreCase("rename")) {
            if (args.length >= 1) {
                try {
                    double text = args[0];
                    ItemStack items = player.getActiveItem();
                    ItemMeta itemsMeta = items.getItemMeta();
                    itemsMeta.displayName().replaceText(text);
                } catch (IllegalArgumentException e) {
                    player.sendMessage("§e§l(!) §cThat is not an item!");
                }
            } else {
                player.sendMessage("§e§l(!) §c/rename <name>");
            }
        }


        return true;
    }
}*/
