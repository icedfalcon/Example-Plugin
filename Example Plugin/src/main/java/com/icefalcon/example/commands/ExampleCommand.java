package com.icefalcon.example.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExampleCommand implements CommandExecutor
{

    // Example command just sends a chat message back
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {

        if(sender instanceof Player)
        {

            Player p = (Player) sender;

            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lHello! Thank you for using this example"));

        }

        return true;
    }
}
