package me.duper51.BattlefieldPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BFCMDEXE implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		if(commandLabel.equalsIgnoreCase("bf"))
			sender.sendMessage("Welcome to Battlefield Plugin VERSION 0.2");
			sender.sendMessage("COMMANDS:");
			sender.sendMessage("/bf enable");
			sender.sendMessage("/bf disable");
			sender.sendMessage("MORE COMING SOON!");
		return false;
	}

}
