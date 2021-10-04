package com.icefalcon.example.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager
{

    // Item Instance
    public static ItemStack exampleItem;

    // Registers all custom items
    public static void registerItems()
    {

        registerExampleItem();

    }

    // Registers the example item
    private static void registerExampleItem()
    {

        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("Lore Line 1");
        lore.add("");
        lore.add("Lore Line 3");
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lExample Item"));
        meta.addEnchant(Enchantment.DURABILITY, 100, false);
        item.setItemMeta(meta);
        exampleItem = item;

    }

}
