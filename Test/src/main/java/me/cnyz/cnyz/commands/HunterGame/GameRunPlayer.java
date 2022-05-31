package me.cnyz.cnyz.commands.HunterGame;

import com.google.common.collect.Lists;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameRunPlayer implements CommandExecutor {
    static List list3 = Lists.newArrayList("1");
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (sender instanceof Player) {//判断是玩家还是终端输的指令
            if (args.length != 0) {//判断是否输入了空格后面的东西
                sender.sendMessage(ChatColor.RED + "要什么参数吗？我怎么不知道那？？？");
            } else {
                Player player = (Player) sender;
                if (player.hasPermission("cnyz.huntergame.run")) {
                    list3.add(player);
                }
            }
        }
        return true;
    }
}



