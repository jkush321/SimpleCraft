package com.jk.simplecraft;

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onDisable() {
		this.logger.info("[Ragequit] is now disabled.");
	}
	
	public void onEnable()
	{
		logger.info("[RageQuit] has been enabled!");
		
		ShapedRecipe grass = new ShapedRecipe(new ItemStack(Material.GRASS));
		grass.shape("S", "D");
		grass.setIngredient('S', Material.SEEDS);
		grass.setIngredient('D', Material.DIRT);
		Bukkit.addRecipe(grass);
		
		ShapedRecipe irondoor = new ShapedRecipe(new ItemStack(Material.IRON_DOOR));
		irondoor.shape(" I ", "IDI", " I ");
		irondoor.setIngredient('I', Material.IRON_INGOT);
		irondoor.setIngredient('D', Material.WOOD_DOOR);
		Bukkit.addRecipe(irondoor);
		
		ShapedRecipe mycelium = new ShapedRecipe(new ItemStack(Material.MYCEL, 2));
		mycelium.shape("B","R","G");
		mycelium.setIngredient('B', Material.BROWN_MUSHROOM);
		mycelium.setIngredient('R', Material.RED_MUSHROOM);
		mycelium.setIngredient('G', Material.GRASS);
		Bukkit.addRecipe(mycelium);
		
		ShapedRecipe plank = new ShapedRecipe(new ItemStack(Material.WOOD, 2));
		plank.shape("SS","SS");
		plank.setIngredient('S', Material.STICK);
		Bukkit.addRecipe(plank);
		
		ShapedRecipe juke = new ShapedRecipe(new ItemStack(Material.JUKEBOX));
		juke.shape("NNN","N N","NNN");
		juke.setIngredient('N', Material.NOTE_BLOCK);
		Bukkit.addRecipe(juke);
		
		FurnaceRecipe bread = new FurnaceRecipe(new ItemStack(Material.BREAD), Material.WHEAT);
		Bukkit.addRecipe(bread);
		
		ShapedRecipe detrail = new ShapedRecipe(new ItemStack(Material.DETECTOR_RAIL));
		detrail.shape("P","D","R");
		detrail.setIngredient('D', Material.REDSTONE);
		detrail.setIngredient('R', Material.RAILS);
		detrail.setIngredient('P', Material.STONE_PLATE);
		Bukkit.addRecipe(detrail);
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
