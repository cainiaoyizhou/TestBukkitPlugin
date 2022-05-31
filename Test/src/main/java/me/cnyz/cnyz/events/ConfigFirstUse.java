package me.cnyz.cnyz.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigFirstUse extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("???");
    }
}
