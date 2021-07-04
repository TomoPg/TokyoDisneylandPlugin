package xyz.yuzuki.halu.create.Utils;

import org.bukkit.Material;

public enum Items {
    TICKET("Ticket", Material.PAPER),
    UTILITY("Utility", Material.TNT);

    public String name;
    public Material material;

    Items(String name, Material material) {
        this.name = name;
        this.material = material;
    }
}
