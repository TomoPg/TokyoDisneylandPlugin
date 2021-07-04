package xyz.yuzuki.halu.create.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.yuzuki.halu.create.Config.MessageConfig;

public class HelloMessage implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(MessageConfig.get().getString("Message"));
        }else {
            Bukkit.getLogger().info("このコマンドはプレイヤーのみ実行出来ます");
        }

        return true;
    }
}
