package me.duper51.BattlefieldPlugin;

import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class BFPlayerListener extends PlayerListener {
	public void onPlayerLogin(PlayerLoginEvent event) {
	Player player = event.getPlayer();
	Server server = player.getServer();
	String playername = player.getName();
	server.broadcastMessage(playername + " has joined the battle.");
	}
	public void onPlayerQuit(PlayerQuitEvent event) {
	Player player = event.getPlayer();
	Server server = player.getServer();
	String playername = player.getName();
	server.broadcastMessage(playername + " has left the battle.");
	}
}
