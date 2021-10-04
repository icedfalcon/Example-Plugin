package com.icefalcon.example;

import com.icefalcon.example.commands.ExampleCommand;
import com.icefalcon.example.events.OnPlayerJoin;
import com.icefalcon.example.items.ItemManager;
import com.icefalcon.example.utils.Cooldown;
import org.bukkit.plugin.java.JavaPlugin;

public final class Example extends JavaPlugin {

    @Override
    public void onEnable() {

        // Sets up the cooldown system
        Cooldown.setupCooldown();
        // Registers all custom items
        ItemManager.registerItems();

        // Registers all the commands
        getCommand("example").setExecutor(new ExampleCommand());

        // Registers all the events
        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);

    }

}
