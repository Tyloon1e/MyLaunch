package me.Tyloon1e.MyLaunch;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments) {
		if (label.equalsIgnoreCase("mylaunch") || label.equalsIgnoreCase("launch")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Console?");
				return true;
			}

			Player player = (Player) sender;

			if (arguments.length == 0) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dZooooooooom!"));
				player.setVelocity(player.getLocation().getDirection().multiply(2).setY(2));
				return true;
			}

			if (isNumber(arguments[0])) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dZooooooooom!"));
				player.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(arguments[0])).setY(2));
				return true;
			} else {
				player.sendMessage(ChatColor.RED + "You can't use strings, only numbers!");
			}

		}

		return false;
	}

	public boolean isNumber(String number) {
		try {
			Integer.parseInt(number);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

}
