package de.lmcraft.devaufgabe;

import de.lmcraft.devaufgabe.commands.clearchat;
import org.bukkit.plugin.java.JavaPlugin;

public final class DevAufgabe extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("clearchat").setExecutor(new clearchat());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
