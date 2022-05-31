package me.cnyz.cnyz.commands.HunterGame;

import me.cnyz.cnyz.Cnyz;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class GameTime extends BukkitRunnable {

    public void run(){
        //你需要在运行的时候执行的内容放这里
        if (GameRunPlayer.list3.size() != 0) {
            if (GameHunter.list4.size() != 0) {
                for (int i = 0; i < GameRunPlayer.list3.size(); i++) {
                    Player player = Bukkit.getPlayer((String) GameRunPlayer.list3.get(i));
                    player.sendMessage(ChatColor.GREEN + "时间到！你们赢了！");
                    player.sendMessage(ChatColor.GREEN + "你们的猎人是：" + GameHunter.list4.get(i));
                for (int j = 0; j < GameHunter.list4.size()+1; j++) {
                    Player player1 = Bukkit.getPlayer((String) GameHunter.list4.get(j));
                    player1.sendMessage(ChatColor.RED + "你没能抓住他们！不要灰心，再来一次！");
                }
                }
            }
        }

        runTaskTimer(Cnyz.plugin, 0, 24000);
}

}
