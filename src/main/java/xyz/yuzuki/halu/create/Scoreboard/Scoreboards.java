package xyz.yuzuki.halu.create.Scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.*;
import xyz.yuzuki.halu.create.Main;

public class Scoreboards implements Listener {

    private Main plugin;
    public Scoreboards(Main plugin) {
        this.plugin = plugin;
    }

    public static void setupScoreboard(Player p) {
        new BukkitRunnable() {
            String pname = p.getName();
            @Override
            public void run() {
                if (Bukkit.getOfflinePlayer(pname).isOnline()) {

                } else {
                    cancel();
                }
            }
        }.runTaskTimer(Main.getPlugin(),0L,50L);
    }

    public void createboard(Player p){
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        Objective obj = board.registerNewObjective("TokyoDisneyland","dummy");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName(ChatColor.BLUE + "§lTokyoDisneyland");

        Score score = obj.getScore(ChatColor.GREEN + "§l=-=-=-=-=-=-=-=-=-=");
        score.setScore(1);
        Score score2 = obj.getScore(ChatColor.GREEN + "§l=-=-=-=-=-=-=-=-=-=");
        score2.setScore(0);
    }
}
