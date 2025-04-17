package me.aaddev.firstPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("first plugin enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("first plugin disabled");
    }
}
