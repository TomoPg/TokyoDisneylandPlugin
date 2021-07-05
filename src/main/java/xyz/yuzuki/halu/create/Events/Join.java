package xyz.yuzuki.halu.create.Events;

import jdk.tools.jlink.plugin.Plugin;
import org.bukkit.Bukkit;
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
            player.sendMessage(ChatColor.BLUE + "--------------------------------------------------\n" + ChatColor.RED + "§lあなたは管理者権限を持っているため、" + ChatColor.GREEN + "§lゲームモード" + ChatColor.RED + "§lが" + ChatColor.WHITE + "§l【クリエイティブモード】" + ChatColor.RED + "§lに設定されました" + ChatColor.GREEN + "\n \n§l現在" + ChatColor.AQUA + String.valueOf(Bukkit.getOnlinePlayers().size()) + ChatColor.GREEN +"§l 人のプレイヤーがオンラインです" + ChatColor.BLUE + "--------------------------------------------------");
            player.setGameMode(GameMode.CREATIVE);
        } else {
        player.sendMessage(ChatColor.BLUE + "--------------------------------------------------\n" + ChatColor.GREEN + "§lあなたのゲームモードが" + ChatColor.RED + "§l【アドベンチャーモード】" + ChatColor.GREEN + "§lに設定されました" + ChatColor.GREEN + "\n \n§l現在" + ChatColor.AQUA + String.valueOf(Bukkit.getOnlinePlayers().size()) + ChatColor.GREEN +"§l 人のプレイヤーがオンラインです" + ChatColor.BLUE + "\n--------------------------------------------------");
        player.setGameMode(GameMode.ADVENTURE);
        }
    }
}