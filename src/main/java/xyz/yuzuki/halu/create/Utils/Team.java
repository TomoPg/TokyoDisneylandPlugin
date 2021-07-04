package xyz.yuzuki.halu.create.Utils;

import org.bukkit.ChatColor;

public enum Team {
    ADMIN(ChatColor.RED + "A" + ChatColor.WHITE + " Admin", ChatColor.RED),
    DEVELOPER(ChatColor.BLUE + "D" + ChatColor.WHITE + "Developer", ChatColor.BLUE),
    STAFF(ChatColor.AQUA + "S" + ChatColor.WHITE + "Staff", ChatColor.AQUA),
    NORMAL(ChatColor.GREEN + "N" + ChatColor.WHITE + " Normal", ChatColor.GREEN);

    private String teamName;
    public ChatColor color;

    Team(String teamName, ChatColor color){
        this.teamName = teamName;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.teamName;
    }
}
