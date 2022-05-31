package me.cnyz.cnyz.commands.HunterGame;

import org.bukkit.command.CommandExecutor;

public class PlayerGameOver implements CommandExecutor {
    @Override
    public boolean onCommand(org.bukkit.command.CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {
        for (int i = 0; i < GameHunter.list4.size()+1; i++) GameHunter.list4.remove(i);
        for (int i = 0; i < GameRunPlayer.list3.size()+1; i++) GameRunPlayer.list3.remove(i);
        return false;
    }
}
