package me.cnyz.cnyz.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Shielding implements Listener {
    @EventHandler
    public void text(AsyncPlayerChatEvent event){
        if (event.getMessage().contains("sb")){
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.sendMessage(ChatColor.RED + "请注意文明");

        }
    }
}
