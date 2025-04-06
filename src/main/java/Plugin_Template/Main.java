package Plugin_Template;

import Plugin_Template.command.example;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {

    //when the plugin enable
    @Override
    public void onEnable() {
        getLogger().info("Plugin Enabled!");
        registerCommands();
    }

    //when the plugin disable
    @Override
    public void onDisable() {
        getLogger().info("Plugin Disabled!");
    }

    //how to register commands!
    public void registerCommands() {
        if (getConfig().getBoolean("commands.enable_kick")) {
            // be sure that the command is registered in Config.yml.
            getCommand("kick").setExecutor(new example());
        }
    }
}

