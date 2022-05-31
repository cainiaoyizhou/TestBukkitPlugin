package me.cnyz.cnyz.commands;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Helloword implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args) {
        if (sender instanceof Player) {//判断是玩家还是终端输的指令
            if (args.length == 0) {//判断是否输入了空格后面的东西，没输直接发给那人
                sender.sendMessage(ChatColor.BLUE + "Solitary - beborn欢迎您的到来，" +
                        "这里有些许您可能不知道的事。" +
                        "您知道吗，服务器有一个废弃的世界，他叫start_world," +
                        "虽然他不再使用，但我们并没有删除它");
            }else {
                Player player = (Player) sender;
                Player target = Bukkit.getPlayerExact(args[0]);
                player.sendMessage(ChatColor.BLUE + "Solitary - beborn欢迎您的到来，" +
                        "这里有些许您可能不知道的事。" +
                        "您知道吗，服务器有一个废弃的世界，他叫start_world," +
                        "虽然他不再使用，但我们并没有删除它");
            }
        } else {
            System.out.println("该指令只能由玩家执行");
        }
        return true;
    }
}
