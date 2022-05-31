package me.cnyz.cnyz.commands.HunterGame;

import com.google.common.collect.Lists;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class GameHunter implements CommandExecutor {
    static List<@Nullable Object> list4 = Lists.newArrayList("1");
    int b = 0;
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (sender instanceof Player) {//判断是玩家还是终端输的指令
            if (args.length != 0) {//判断是否输入了空格后面的东西
                sender.sendMessage(ChatColor.RED + "要什么参数吗？我怎么不知道那？？？");
            } else {
                Player player = (Player) sender;
                if (player.hasPermission("cnyz.huntergame.run")) {
                    for(Object ignored : list4){
                        b++;}
                    if (b <= 1) {
                        list4.add(player);
                    } else {
                        sender.sendMessage(ChatColor.RED + "已经有猎人了，请等待下一轮（猎人只能有一个，且插件当前仅支持一场游戏）");
                    }
                }
            }
        }
        return true;
    }
}
