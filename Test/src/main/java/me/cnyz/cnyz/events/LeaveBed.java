package me.cnyz.cnyz.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class LeaveBed implements Listener {
    @EventHandler
    public void LeaveBed(PlayerBedEnterEvent event){
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.RED + "你离开了床");
    }
}
