package me.cnyz.cnyz.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class sendMessage implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player){//检测是否为玩家执行
            Player player = (Player) sender;
            if (args.length == 1){
                String message = args[0];
                player.sendMessage(ChatColor.BLUE + message);
            }else {
                player.sendMessage(ChatColor.RED + "语法错误");
                player.sendMessage(ChatColor.RED + "用法：/sendmessage <文本>");
            }
        }else {
            System.out.println("该指令只能由玩家执行");
        }
        return false;
    }
}
