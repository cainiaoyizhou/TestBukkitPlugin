package me.cnyz.cnyz.configs;

import me.cnyz.cnyz.Cnyz;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;



public class ConfigLoader {
    private static boolean isFriday;
    private static YamlConfiguration ConfigTwo;

    public static void loadConfigs() {
        File file = new File(Cnyz.plugin.getDataFolder(),"ConfigTwo.yml");
        if (!file.exists()){
            Cnyz.plugin.saveResource("src/Main/resourecs/ConfigTwo.yml", false);
        }
        ConfigTwo = YamlConfiguration.loadConfiguration(file);
    }
    public static void load() {
        isFriday = ConfigTwo.getBoolean("isFriday");
    //重载懒得写了
    }
}
