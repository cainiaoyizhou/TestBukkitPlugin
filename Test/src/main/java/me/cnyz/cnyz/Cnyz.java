package me.cnyz.cnyz;

import me.cnyz.cnyz.commands.Helloword;
import me.cnyz.cnyz.commands.HunterGame.GameHunter;
import me.cnyz.cnyz.commands.HunterGame.GameRunPlayer;
import me.cnyz.cnyz.commands.HunterGame.StartGame;
import me.cnyz.cnyz.commands.HunterGame.events_RunPlayerWin;
import me.cnyz.cnyz.commands.new_sword;
import me.cnyz.cnyz.commands.sendMessage;
import me.cnyz.cnyz.events.LeaveBed;
import me.cnyz.cnyz.events.Shielding;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.Objects;

public final class Cnyz extends JavaPlugin {
//用了mc插件（IDEA的

    private static String a;
    public static Cnyz plugin;


    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        //不推荐的方法：现场加载现场用(应为每用一次这变量就会从配置文件里读取一次，使用变量次数多的话就是核弹级卡顿)
        this.saveDefaultConfig();//但这个还要，用它把配置文件复制出去
//        String A = this.getConfig().getString("A");
//        Bukkit.getConsoleSender().sendMessage(A);
        //so：
        onLoadConfig();
        //要像上面那样干！！！注：采用一个变量来存取，避免反复读取配置文件造成性能浪费
        System.out.println("测试插件：加载中1...");
        sendMessage();
//        getServer().getPluginManager().
//                registerEvents(new LeaveBed(), this);
//        getServer().getPluginManager().
//                registerEvents(new Shielding(), this);
        getServer().getPluginManager().registerEvents(new events_RunPlayerWin(), this);
        System.out.println("测试插件：加载中2");

        Objects.requireNonNull(getCommand("BeHunter")).setExecutor(new GameHunter());
        System.out.println("测试插件：加载中4");
        Objects.requireNonNull(getCommand("BeRunPlayer")).setExecutor(new GameRunPlayer());
        System.out.println("测试插件：加载中5");
        Objects.requireNonNull(getCommand("StartHunterGame")).setExecutor(new StartGame());
        System.out.println("测试插件：加载中3");
//        Objects.requireNonNull(getCommand("HelloSolitary-Beborn")).setExecutor(new Helloword());
//        //HelloSolitary-Reborn游戏内输入的指令
//        Objects.requireNonNull(getCommand("s")).setExecutor(new sendMessage());
//        Objects.requireNonNull(getCommand("FuZhuHolySword")).setExecutor(new new_sword());
        System.out.println("测试插件：加载中");
    }
    public static String onLoadConfig() {
        //so：
        a = plugin.getConfig().getString("A");
        int b = plugin.getConfig().getInt("B.C");
        String WorldName = plugin.getConfig().getString("WorldName");
        List<String> f = plugin.getConfig().getStringList("D.E.F");
        f.forEach(item -> Bukkit.getConsoleSender().sendMessage(item));
        //f.forEach(item -> {
        //
        //                }); = for (String k : f) {
        //
        //}
        //要像上面那样干！！！注：采用一个变量来存取，避免反复读取配置文件造成性能浪费
        return WorldName;
    }

    public void sendMessage(){
        Bukkit.getConsoleSender().sendMessage(a);
    }
//em
//测试*5，OK





    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("测试插件：关闭中...");
    }}
