package user.meistertisch.daniscopsandcrims;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main plugin;
    private static PluginManager pluginManager;

    @Override
    public void onEnable() {
        //Fist things first
        plugin = this;
        pluginManager = Bukkit.getPluginManager();

        //Configs


        //Schedulers


        //Listeners


        //Commands


        //Sonstiges


    }

    @Override
    public void onDisable() {
    }

    public static Main getPlugin() {
        return plugin;
    }
}
