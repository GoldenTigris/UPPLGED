package fr.goldentigris;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Loca extends JavaPlugin implements Listener {
	public Logger log = Logger.getLogger("Minecraft");
	
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		log.info("[Loca] has been enabled !"); }

	@Override
	public void onDisable() {
		log.info("[Loca] has been disabled !");	}

	
	
	
	@EventHandler
	private void onPlayerDisconnect(PlayerQuitEvent e){ Player p = e.getPlayer(); Location disco = p.getLocation();
	 System.out.println ("le joueur " + p + "s'est déconnecté depuis la position: "+ disco);	 }
	
	
	
	@EventHandler
	public void onPlayerConnect(PlayerJoinEvent e){ Player p = e.getPlayer(); Location disco = p.getLocation();
	 System.out.println ("le joueur " + p + "s'est Connecté depuis la position: "+ disco);	 }
		
		 
		
}
