package me.cnyz.cnyz.commands.HunterGame;

import me.cnyz.cnyz.Cnyz;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEnterEvent;

public class events_RunPlayerWin implements Listener {

    public void RunPlayerWin(EntityPortalEnterEvent event) {
        String worldName = Cnyz.onLoadConfig();
        if (event.getLocation().getWorld().getName().equals(worldName)) {
            if (GameRunPlayer.list3.size() != 0) {
                if (GameHunter.list4.size() != 0) {
                    for (int i = 0; i < GameRunPlayer.list3.size()+1; i++) {
                        Player player = Bukkit.getPlayer((String) GameRunPlayer.list3.get(i));
                        player.sendMessage(ChatColor.GREEN + "恭喜你获得胜利！");
                        player.sendMessage(ChatColor.GREEN + "你们的猎人是：" + GameHunter.list4.get(i));
                    for (int j = 0; j < GameHunter.list4.size()+1; j++) {
                        Player player1 = Bukkit.getPlayer((String) GameHunter.list4.get(j));
                        player1.sendMessage(ChatColor.RED + "你没能抓住他们！不要灰心，再来一次！");
                    }
                    }
                    
                    new PlayerGameOver();
                }
            }

                }
            }
        }


