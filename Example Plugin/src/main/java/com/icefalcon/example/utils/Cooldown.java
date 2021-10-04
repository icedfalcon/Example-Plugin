package com.icefalcon.example.utils;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class Cooldown
{

    // Cooldown variable so we can link players to it
    public static HashMap<UUID, Double> cooldowns;

    // Inits the cooldowns variable
    public static void setupCooldown()
    {

        cooldowns = new HashMap<>();

    }

    // Sets a cooldown for a player in the cooldowns variable
    public static void setCooldown(Player p, int seconds)
    {

        double delay = System.currentTimeMillis() + (seconds * 1000);
        cooldowns.put(p.getUniqueId(), delay);

    }

    // Checks if a player is in the cooldowns variable. If it isn't returns true else returns false
    public static boolean checkCooldown(Player p)
    {

        if (!cooldowns.containsKey(p.getUniqueId()) || cooldowns.get(p.getUniqueId()) <= System.currentTimeMillis())
        {
            return true;
        }
        return false;

    }

}
