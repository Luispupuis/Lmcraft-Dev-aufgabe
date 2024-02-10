package de.lmcraft.devaufgabe.Logic;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Logic {




    /**
     * Clear The chat with This method
     * With {@link Player} Post the player in the chat
     */
    public static void clearchat(Player p) {
        // logic
    }

    /**
     * Inventory Test
     * With {@link Player} Open the {@link Inventory} to the Player
     * Create a {@link org.bukkit.command.CommandExecutor}
     */
    public static void openyesornoGUI(Player p){
        Inventory inv = Bukkit.createInventory(null, 27, "§a§lYesorno");
    }

    /**
     * Clear The chat with This method
     * Call it from {@link de.lmcraft.devaufgabe.Listener.InventoryListener}
     */
    public static void send(boolean yesorno, Player p){
        if(yesorno){
            p.sendMessage("§aJa");
        }else p.sendMessage("§cNein");
    }
}
