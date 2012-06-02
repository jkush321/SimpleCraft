package com.jk.simplecraft;

import java.util.Random;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.material.MaterialData;
import org.bukkit.material.SpawnEgg;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onDisable() {
		this.logger.info("[Ragequit] is now disabled.");
	}
	
	public void onEnable()
	{
		FileConfiguration config = getConfig();
	 
	    config.addDefault("recipe-enabled.grass", "true");
	    config.addDefault("recipe-enabled.irondoor", "true");
	    config.addDefault("recipe-enabled.mycelium", "true");
	    config.addDefault("recipe-enabled.plank", "true");
	    config.addDefault("recipe-enabled.jukebox", "true");
	    config.addDefault("recipe-enabled.bread", "true");
	    config.addDefault("recipe-enabled.detector-rail", "true");
	    config.addDefault("recipe-enabled.spawnegg.creeper", "true");
	    config.addDefault("recipe-enabled.spawnegg.skeleton", "true");
	    config.addDefault("recipe-enabled.spawnegg.spider", "true");
	    config.addDefault("recipe-enabled.spawnegg.zombie", "true");
	    config.addDefault("recipe-enabled.spawnegg.slime", "true");
	    config.addDefault("recipe-enabled.spawnegg.ghast", "true");
	    config.addDefault("recipe-enabled.spawnegg.pigman", "true");
	    config.addDefault("recipe-enabled.spawnegg.enderman", "true");
	    config.addDefault("recipe-enabled.spawnegg.cavespider", "true");
	    config.addDefault("recipe-enabled.spawnegg.silverfish", "true");
	    config.addDefault("recipe-enabled.spawnegg.blaze", "true");
	    config.addDefault("recipe-enabled.spawnegg.magmacube", "true");
	    config.addDefault("recipe-enabled.spawnegg.pig", "true");
	    config.addDefault("recipe-enabled.spawnegg.sheep", "true");
	    config.addDefault("recipe-enabled.spawnegg.cow", "true");
	    config.addDefault("recipe-enabled.spawnegg.chicken", "true");
	    config.addDefault("recipe-enabled.spawnegg.squid", "true");
	    config.addDefault("recipe-enabled.spawnegg.wolf", "true");
	    config.addDefault("recipe-enabled.spawnegg.mooshroom", "true");
	    config.addDefault("recipe-enabled.spawnegg.cat", "true");
	    config.addDefault("recipe-enabled.spawnegg.villager", "true");
	
	    config.options().copyDefaults(true);
	    saveConfig();
		
	    if (isEnabled("recipe-enabled.grass"))
	    {
			ShapedRecipe grass = new ShapedRecipe(new ItemStack(Material.GRASS));
			grass.shape("S", "D");
			grass.setIngredient('S', Material.SEEDS);
			grass.setIngredient('D', Material.DIRT);
			Bukkit.addRecipe(grass);
	    }
	    if (isEnabled("recipe-enabled.irondoor"))
	    {
			ShapedRecipe irondoor = new ShapedRecipe(new ItemStack(Material.IRON_DOOR));
			irondoor.shape(" I ", "IDI", " I ");
			irondoor.setIngredient('I', Material.IRON_INGOT);
			irondoor.setIngredient('D', Material.WOOD_DOOR);
			Bukkit.addRecipe(irondoor);
	    }
	    if (isEnabled("recipe-enabled.mycelium"))
	    {
			ShapedRecipe mycelium = new ShapedRecipe(new ItemStack(Material.MYCEL, 2));
			mycelium.shape("B","R","G");
			mycelium.setIngredient('B', Material.BROWN_MUSHROOM);
			mycelium.setIngredient('R', Material.RED_MUSHROOM);
			mycelium.setIngredient('G', Material.GRASS);
			Bukkit.addRecipe(mycelium);
	    }
	    if (isEnabled("recipe-enabled.plank"))
	    {
			ShapedRecipe plank = new ShapedRecipe(new ItemStack(Material.WOOD, 2));
			plank.shape("SS","SS");
			plank.setIngredient('S', Material.STICK);
			Bukkit.addRecipe(plank);
	    }
	    if (isEnabled("recipe-enabled.jukebox"))
	    {
			ShapedRecipe juke = new ShapedRecipe(new ItemStack(Material.JUKEBOX));
			juke.shape("NNN","N N","NNN");
			juke.setIngredient('N', Material.NOTE_BLOCK);
			Bukkit.addRecipe(juke);
	    }
	    if (isEnabled("recipe-enabled.bread"))
	    {
			FurnaceRecipe bread = new FurnaceRecipe(new ItemStack(Material.BREAD), Material.WHEAT);
			Bukkit.addRecipe(bread);
	    }
	    if (isEnabled("recipe-enabled.detector-rail"))
	    {
			ShapedRecipe detrail = new ShapedRecipe(new ItemStack(Material.DETECTOR_RAIL));
			detrail.shape("P","D","R");
			detrail.setIngredient('D', Material.REDSTONE);
			detrail.setIngredient('R', Material.RAILS);
			detrail.setIngredient('P', Material.STONE_PLATE);
			Bukkit.addRecipe(detrail);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.creeper"))
	    {
			ShapedRecipe creeperegg = new ShapedRecipe((new SpawnEgg(EntityType.CREEPER)).toItemStack(1));
			creeperegg.shape(" I ", "IEI", " I ");
			creeperegg.setIngredient('I', Material.SULPHUR);
			creeperegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(creeperegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.skeleton"))
	    {
			ShapedRecipe skeleegg = new ShapedRecipe((new SpawnEgg(EntityType.SKELETON)).toItemStack(1));
			skeleegg.shape(" I ", "IEI", " I ");
			skeleegg.setIngredient('I', Material.BONE);
			skeleegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(skeleegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.spider"))
	    {
			ShapedRecipe spideregg = new ShapedRecipe((new SpawnEgg(EntityType.SPIDER)).toItemStack(1));
			spideregg.shape(" I ", "IEI", " I ");
			spideregg.setIngredient('I', Material.STRING);
			spideregg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(spideregg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.zombie"))
	    {
			ShapedRecipe zombieegg = new ShapedRecipe((new SpawnEgg(EntityType.ZOMBIE)).toItemStack(1));
			zombieegg.shape(" I ", "IEI", " I ");
			zombieegg.setIngredient('I', Material.ROTTEN_FLESH);
			zombieegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(zombieegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.slime"))
	    {
			ShapedRecipe slimeegg = new ShapedRecipe((new SpawnEgg(EntityType.SLIME)).toItemStack(1));
			slimeegg.shape(" I ", "IEI", " I ");
			slimeegg.setIngredient('I', Material.SLIME_BALL);
			slimeegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(slimeegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.ghast"))
	    {
			ShapedRecipe ghastegg = new ShapedRecipe((new SpawnEgg(EntityType.GHAST)).toItemStack(1));
			ghastegg.shape(" I ", "IEI", " I ");
			ghastegg.setIngredient('I', Material.GHAST_TEAR);
			ghastegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(ghastegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.pigman"))
	    {
			ShapedRecipe pigmanegg = new ShapedRecipe((new SpawnEgg(EntityType.PIG_ZOMBIE)).toItemStack(1));
			pigmanegg.shape(" I ", "IEI", " I ");
			pigmanegg.setIngredient('I', Material.getMaterial(320));//cooked pork
			pigmanegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(pigmanegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.enderman"))
	    {
			ShapedRecipe endermanegg = new ShapedRecipe((new SpawnEgg(EntityType.ENDERMAN)).toItemStack(1));
			endermanegg.shape(" I ", "IEI", " I ");
			endermanegg.setIngredient('I', Material.ENDER_PEARL);
			endermanegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(endermanegg);
	    }	
	    if (isEnabled("recipe-enabled.spawnegg.cavespider"))
	    {
	    	ShapedRecipe cavespideregg = new ShapedRecipe((new SpawnEgg(EntityType.CAVE_SPIDER)).toItemStack(1));
			cavespideregg.shape(" I ", "IEI", " I ");
			cavespideregg.setIngredient('I', Material.SPIDER_EYE);
			cavespideregg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(cavespideregg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.silverfish"))
	    {
			ShapedRecipe silverfishegg = new ShapedRecipe((new SpawnEgg(EntityType.SILVERFISH)).toItemStack(1));
			silverfishegg.shape(" I ", "IEI", " I ");
			silverfishegg.setIngredient('I', Material.SMOOTH_BRICK);
			silverfishegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(silverfishegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.blaze"))
	    {
			ShapedRecipe blazeegg = new ShapedRecipe((new SpawnEgg(EntityType.BLAZE)).toItemStack(1));
			blazeegg.shape(" I ", "IEI", " I ");
			blazeegg.setIngredient('I', Material.BLAZE_ROD);
			blazeegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(blazeegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.magmacube"))
	    {
			ShapedRecipe magmacubeegg = new ShapedRecipe((new SpawnEgg(EntityType.MAGMA_CUBE)).toItemStack(1));
			magmacubeegg.shape(" I ", "IEI", " I ");
			magmacubeegg.setIngredient('I', Material.MAGMA_CREAM);
			magmacubeegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(magmacubeegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.pig"))
	    {
			ShapedRecipe pigegg = new ShapedRecipe((new SpawnEgg(EntityType.PIG)).toItemStack(1));
			pigegg.shape(" I ", "IEI", " I ");
			pigegg.setIngredient('I', Material.getMaterial(319));//raw pork
			pigegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(pigegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.sheep"))
	    {
			ShapedRecipe sheepegg = new ShapedRecipe((new SpawnEgg(EntityType.SHEEP)).toItemStack(1));
			sheepegg.shape(" I ", "IEI", " I ");
			sheepegg.setIngredient('I', Material.WOOL);
			sheepegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(sheepegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.cow"))
	    {
			ShapedRecipe cowegg = new ShapedRecipe((new SpawnEgg(EntityType.COW)).toItemStack(1));
			cowegg.shape(" I ", "IEI", " I ");
			cowegg.setIngredient('I', Material.RAW_BEEF);
			cowegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(cowegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.chicken"))
	    {
			ShapedRecipe chickenegg = new ShapedRecipe((new SpawnEgg(EntityType.CHICKEN)).toItemStack(1));
			chickenegg.shape(" I ", "IEI", " I ");
			chickenegg.setIngredient('I', Material.RAW_CHICKEN);
			chickenegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(chickenegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.squid"))
	    {
			ShapedRecipe squidegg = new ShapedRecipe((new SpawnEgg(EntityType.SQUID)).toItemStack(1));
			squidegg.shape(" I ", "IEI", " I ");
			squidegg.setIngredient('I', Material.INK_SACK);
			squidegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(squidegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.wolf"))
	    {
			ShapedRecipe wolfegg = new ShapedRecipe((new SpawnEgg(EntityType.WOLF)).toItemStack(1));
			wolfegg.shape(" I ", "BEB", " I ");
			wolfegg.setIngredient('I', Material.BONE);
			wolfegg.setIngredient('B', Material.COOKED_BEEF);
			wolfegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(wolfegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.mooshroom"))
	    {
			ShapedRecipe mcowegg = new ShapedRecipe((new SpawnEgg(EntityType.MUSHROOM_COW)).toItemStack(1));
			mcowegg.shape(" I ", "BEB", " I ");
			mcowegg.setIngredient('I', Material.RED_MUSHROOM);
			mcowegg.setIngredient('B', Material.RAW_BEEF);
			mcowegg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(mcowegg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.cat"))
	    {
			ShapedRecipe categg = new ShapedRecipe((new SpawnEgg(EntityType.OCELOT)).toItemStack(1));
			categg.shape(" I ", "IEI", " I ");
			categg.setIngredient('I', Material.RAW_FISH);
			categg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(categg);
	    }
	    if (isEnabled("recipe-enabled.spawnegg.villager"))
	    {
			ShapedRecipe villageregg = new ShapedRecipe((new SpawnEgg(EntityType.VILLAGER)).toItemStack(1));
			villageregg.shape(" B ", "LEL", " L ");
			villageregg.setIngredient('B', Material.BREAD);
			villageregg.setIngredient('L', Material.LEATHER);
			villageregg.setIngredient('E', Material.EGG);
			Bukkit.addRecipe(villageregg);
	    }
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("simplecraft"))
		{
			if (sender instanceof Player)
			{
				Player p = (Player) sender;
				p.sendMessage("§bJkush321's SimpleCraft is in version beta 0.2");
				p.sendMessage("§bGo to goo.gl/WnSjn for recipees.");
				p.sendMessage("§bNote: some recipees may be disabled.");
			}
			else
			{
				logger.info("Jkush321's Simplecraft is in version beta 0.2");
				logger.info("Go to goo.gl/WnSjn for recipees.");
				logger.info("Note: You can enable/disable recipees in the configuration");
			}
		}
		return true;
	}
	
	private boolean isEnabled(String path)//little thing to make my life easier
	{
		if (getConfig().getString(path).equalsIgnoreCase("true")) return true;
		return false;
	}
	//To do
	/*
	 * Right click seeds on top of dirt to grow grass
	 * make sponge work
	 * 
	 *
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *   
	 *   
	 */
}
