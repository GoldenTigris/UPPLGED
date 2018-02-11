package fr.goldentigris;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class Commandvote implements CommandExecutor {

	private FileConfiguration config;
	private EDGVote pl;

	public Commandvote(EDGVote EDGVote) {
		this.pl = EDGVote;
		this.config = pl.getConfig();

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

		if (sender instanceof Player) {
			Player p = (Player) sender;

			if (args.length == 0) {
				p.sendMessage("§6Merci de cliquer sur chacun des liens suivants");
        
				String rep0 = config.getString("Rep0");
				String rep1 = config.getString("Rep1");
				String rep2 = config.getString("Rep2");
				String rep3 = config.getString("Rep3");
				String rep4 = config.getString("Rep4");
				String rep5 = config.getString("Rep5");
				String rep6 = config.getString("Rep6");
        			String rep7 = config.getString("Rep7");
        			String rep8 = config.getString("Rep8");
       				String rep9 = config.getString("Rep9");
        			String rep10 = config.getString("Rep10");
        
				p.sendMessage(rep0);
				p.sendMessage(rep1);
				p.sendMessage(rep2);
				p.sendMessage(rep3);
				p.sendMessage(rep4);
				p.sendMessage(rep5);
				p.sendMessage(rep6);
        			p.sendMessage(rep7);
				p.sendMessage(rep8);
				p.sendMessage(rep9);
				p.sendMessage(rep10);
        
				p.sendMessage("§6Merci pour ta participation");
			}

		}

		return false;
	}

}
