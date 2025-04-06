package Plugin_Template.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class example implements CommandExecutor {
    //the src of the command
    @Override
    public boolean onCommand(CommandSender Sender,  Command command,  String label,  String[] args) {
        //verify if is a player!
        Player p = Bukkit.getServer().getPlayer(args[0]);

        //the command (it send a messagge!)
        p.sendMessage("Hello World!" + ChatColor.GREEN);


        return true;
    }
}
