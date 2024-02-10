package de.lmcraft.devaufgabe.commands;

import de.lmcraft.devaufgabe.Logic.Logic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class clearchat implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        if(p.hasPermission("cc")){
            Logic.clearchat(p);
        }
        return false;
    }




}
