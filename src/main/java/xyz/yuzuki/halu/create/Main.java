package xyz.yuzuki.halu.create;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    //メインクラス

    @Override
    public void onEnable() {

        getLogger().info("プラグインが起動しました");  //起動したらコンソールにメッセージを表示

        saveDefaultConfig(); //config.ymlが存在しない場合はファイルに出力

        FileConfiguration config = getConfig(); //config.ymlを読み込む
    }

    @Override
    public void onDisable() {

        getLogger().info("プラグインが終了しました");  //終了したらコンソールにメッセージを表示
    }
}
