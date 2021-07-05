package xyz.yuzuki.halu.create.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import xyz.yuzuki.halu.create.Main;

public class Fencegate implements Listener {

    private Main plugin;
    public Fencegate(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent e){
        Player p = (Player) e.getPlayer();

        Location loc = p.getLocation();

        if (e.getClickedBlock().getType() == Material.BIRCH_FENCE_GATE) {
            if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (p.getItemInHand().getType() != Material.PAPER) {

                    p.sendMessage(ChatColor.RED + "§l※チケットを持って下さい※\n \nまた、チケットを持っていない場合は、運営またはSTAFFに/tellでメッセージを送って下さい。\n \n運営orSTAFFはTabで確認できます。");
                    e.setCancelled(true);
                    p.playSound(p.getLocation(),Sound.BLOCK_NOTE_BASS,25,1);
                } else {

                p.sendMessage(ChatColor.WHITE + "§l入場しました\n" + ChatColor.AQUA + "§l東京ディズニーランド" + ChatColor.WHITE + "§lへ" + ChatColor.LIGHT_PURPLE + "§lようこそ！");
                p.getInventory().remove(Material.PAPER);
                p.playSound(p.getLocation(),Sound.ENTITY_PLAYER_LEVELUP,5,5);
                p.getInventory().addItem(new ItemStack(Material.ENCHANTED_BOOK,1));
                e.setCancelled(true);
                loc.setX(loc.getX() + 3);
                p.teleport(loc);
                }
            }
        }

    }

}
