package fr.goldentigris;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class EDGVote extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("EDGVote est chargé");
		getCommand("vote").setExecutor(new Commandvote(this));
		getConfig().options().copyDefaults(true);
		saveConfig();
		System.out.println("EDGVote fichier config chargé");

	}

	@Override
	public void onDisable() {
		System.out.println("EDGVote est arrété");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command com, String label, String[] args) {
		Player p = (Player) sender;

		if (com.getName().equalsIgnoreCase("vpl")) {

			p.sendMessage(
					" §6 Ce plugin appartiens a GoldenTigris et ne peut être copié ou transféré sur un autre serveur sans son accords. A son départ celui ci sera enlevé du serveur.");
			return false;}
		else{

			if (com.getName().equalsIgnoreCase("vhelp")) {
				p.sendMessage(" §6 Vous pouvez faire les commandes: /vote, /vpl, /vhelp");

			}
		}
		return false;
	}

}
