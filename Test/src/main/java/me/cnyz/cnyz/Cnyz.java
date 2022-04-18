package me.cnyz.cnyz;

import me.cnyz.cnyz.events.LeaveBed;
import org.bukkit.plugin.java.JavaPlugin;

public final class Cnyz extends JavaPlugin {
//用了mc插件（IDEA的
    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("测试插件：加载中");
        getServer().getPluginManager().registerEvents(new LeaveBed(), this);

//emmmm
//测试*1，secess！
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("测试插件：关闭中...");
    }
}
