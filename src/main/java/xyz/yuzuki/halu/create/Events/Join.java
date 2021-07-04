package xyz.yuzuki.halu.create.Events;

import jdk.tools.jlink.plugin.Plugin;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.yuzuki.halu.create.Main;

public class Join implements Listener {

    private Main plugin;
    public Join(Main plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = (Player)e.getPlayer();
        if (e.getPlayer().isOp()){
            player.sendMessage(ChatColor.RED + "§lあなたは管理者権限を持っているため、" + ChatColor.GREEN + "§lゲームモードが" + ChatColor.WHITE + "§l§n【クリエイティブモード】" + ChatColor.GREEN + "§lに設定されました");
            player.setGameMode(GameMode.CREATIVE);
        } else {
        player.sendMessage(ChatColor.GREEN + "§lあなたのゲームモードが" + ChatColor.RED + "§l§n【アドベンチャーモード】" + ChatColor.GREEN + "§lに設定されました");
        player.setGameMode(GameMode.ADVENTURE);
        }
    }
}
