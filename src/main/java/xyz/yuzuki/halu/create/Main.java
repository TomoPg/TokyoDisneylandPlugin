package xyz.yuzuki.halu.create;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.yuzuki.halu.create.Commands.HelloMessage;
import xyz.yuzuki.halu.create.Config.MessageConfig;
import xyz.yuzuki.halu.create.Events.Fencegate;
import xyz.yuzuki.halu.create.Events.Join;
import xyz.yuzuki.halu.create.Scoreboard.Scoreboards;

public class Main extends JavaPlugin {
    public static Plugin getPlugin() {

        return null;
    }

    // シングルクォーテーション ➔ ''
    //改行　➔\n

    //メインクラス

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        MessageConfig.setup();
        MessageConfig.get().addDefault("Message", "§d§lこんにちは！");
        MessageConfig.get().options().copyDefaults(true);
        MessageConfig.save();

        //コマンドクラス継承
        getCommand("Hello").setExecutor(new HelloMessage());

        //クラス継承
        getServer().getPluginManager().registerEvents(new Scoreboards(this),this);
        getServer().getPluginManager().registerEvents(new Join(this),this);
        getServer().getPluginManager().registerEvents(new Fencegate(this),this);

    }

    @Override
    public void onDisable() {

    }
}
