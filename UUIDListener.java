@EventHandler 
public void onPlayerConnect(PlayerLoginEvent event){

    Player player = event.getPlayer();
    UUID uuid = Bukkit.getOfflinePlayer("Xharos").getUniqueId();
    
	  mc.sendJoinDc(player,event.getKickMessage());
	  mc.sendUUID(uuid);
  }
