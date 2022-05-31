package me.cnyz.cnyz.commands.HunterGame;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import me.cnyz.cnyz.commands.HunterGame.GameTime;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StartGame implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (args.length != 0) {//判断是否输入了空格后面的东西
            sender.sendMessage(ChatColor.RED + "要什么参数吗？我怎么不知道那？？？");
        } else {
            List RunPlayerList = GameRunPlayer.list3;//获取逃跑列表
            List HunterList = GameHunter.list4;//获取玩家列表
            if (RunPlayerList.size() == 1) {//判断逃跑列表是否为空//如果为空则提示玩家//如果不为空则开始游戏//这段连我都没想到，copilot帮我想的
                sender.sendMessage(ChatColor.RED + "没有玩家逃跑，请先去邀请玩家逃跑！");
            } else {
                if (HunterList.size() == 1) {//判断猎人列表是否为空//如果为空则提示玩家//如果不为空则开始游戏
                    sender.sendMessage(ChatColor.RED + "没有猎人参与游戏，请先去邀请玩家参与游戏！");
                }else{
                    new GameTime().run(); //开始游戏

                    }
                }
            }
        return false;
    }

}
