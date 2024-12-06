package net.pdgh;

//import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class maconha extends JavaPlugin {
	
	//public void run() {
        // What you want to schedule goes here
		//getServer().broadcastMessage("Plugin by: mchiappinam");
		//getServer().broadcastMessage("Acesse: http://pdgh.net/");
    //}
	
    //@Override
    public void onEnable(){
        
    }
    
    //@Override
    public void onDisable() {
        
    }
    //@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("maconha")){
			//if(player.hasPermission("pdghmaconha.use.maconha")) {
			if (!player.hasPermission("pdghmaconha.use.maconha")) {
				player.sendMessage(ChatColor.DARK_RED + "[PDGH] Sem permissoes");
                return true;
            }
	     //player.sendMessage(ChatColor.GOLD + "pdgh.net");
	     Bukkit.broadcastMessage("§9[/maconha] §c" + player.getDisplayName() + " §aesta fumando uma maconha.");
         //player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 500, 1));
         player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 500, 10));
         player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 500, 0));
         //player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 500, 0));
         player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 500, 1));
         player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 500, 0));

			try {
				wait(30000);
				player.sendMessage("§cSua maconha acabou. §2Compre mais com §8/maconha");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
         }
         //player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 500, 1));}
		
		//Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("crack")){
				if (!player.hasPermission("pdghmaconha.use.crack")) {
					player.sendMessage(ChatColor.DARK_RED + "[PDGH] Sem permissoes");
	                return true;
	            }
					 //player.sendMessage(ChatColor.GOLD + "pdgh.net");
				     Bukkit.broadcastMessage("§9[/crack] §c" + player.getDisplayName() + " §aesta fumando um crack.");
			         //player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 500, 1));
			         player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 500, 10));
			         player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 500, 0));
			         //player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 500, 0));
			         player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 500, 1));
			         //player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 500, 1));
			         player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 500, 1));
				     
						 
				    	 
				    	 
				    	 player.playSound(player.getLocation(), Sound.BLAZE_HIT, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.ANVIL_BREAK, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.BLAZE_HIT, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.ANVIL_BREAK, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.BLAZE_HIT, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.ANVIL_USE, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.GHAST_SCREAM, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.GHAST_SCREAM2, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.GHAST_MOAN, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.IRONGOLEM_HIT, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.PIG_DEATH, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.WITHER_DEATH, 1.0F, (byte) 30);
					     player.playSound(player.getLocation(), Sound.WITHER_SPAWN, 1.0F, (byte) 30);
				    	 player.playSound(player.getLocation(), Sound.ENDERDRAGON_DEATH, 1.0F, (byte) 30);
						 player.playSound(player.getLocation(), Sound.DOOR_OPEN, 1.0F, (byte) 30);
						 player.playSound(player.getLocation(), Sound.DOOR_CLOSE, 1.0F, (byte) 30);
						 
						 
						 try {  
						 player.playSound(player.getLocation(), Sound.BLAZE_HIT, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.ANVIL_BREAK, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.BLAZE_HIT, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.ANVIL_BREAK, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.BLAZE_HIT, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.ANVIL_USE, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.GHAST_SCREAM, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.GHAST_SCREAM2, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.GHAST_MOAN, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.IRONGOLEM_HIT, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.PIG_DEATH, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.WITHER_DEATH, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
					     player.playSound(player.getLocation(), Sound.WITHER_SPAWN, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
				    	 player.playSound(player.getLocation(), Sound.ENDERDRAGON_DEATH, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(2000); 
						 player.playSound(player.getLocation(), Sound.DOOR_OPEN, 1.0F, (byte) 30);
						 player.playSound(player.getLocation(), Sound.DOOR_CLOSE, 1.0F, (byte) 30);
						 TimeUnit.MILLISECONDS.sleep(1000); 
						 player.sendMessage("§cSeu crack acabou. §2Compre mais com §8/crack");
				    	} catch (InterruptedException ignored) {  
				    	}
				    }
		return false;
    }
    
}