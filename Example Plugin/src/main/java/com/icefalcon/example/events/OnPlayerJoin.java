package com.icefalcon.example.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener
{

    // Sends a message once the player joins
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e)
    {

        Player p = e.getPlayer();

        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWelcome " + p.getDisplayName()));

    }

}
