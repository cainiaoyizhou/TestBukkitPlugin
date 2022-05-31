package me.cnyz.cnyz.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class new_sword implements CommandExecutor{
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label,
                             @NotNull String[] args) {
        Player player = (Player) sender;
        ItemStack new_sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta new_sword_meta = new_sword.getItemMeta();
        new_sword_meta.setDisplayName(ChatColor.AQUA+"钻石？剑");
        ArrayList<String> new_sword_lore = new ArrayList<>();
        new_sword_lore.add("腐竹之剑");
        new_sword_meta.setLore(new_sword_lore);
        //可以无限叠add（一个一行
        //名字下面的东东
        player.getInventory().addItem(new_sword);
        return false;
    }
}
