package net.lc.combatlog;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import net.lc.evento.EventoCombatLog;

public class Main extends JavaPlugin {
	
	   @Override
	    public void onEnable() {
	        carregarConfig();
	        registrarEventos();
	        Bukkit.getConsoleSender().sendMessage("§5=================================== ");
	        Bukkit.getConsoleSender().sendMessage("§5=  StartCombatLog  iniciado =");
	        Bukkit.getConsoleSender().sendMessage("§5=================================== ");

	    }

	    public void carregarConfig() {
	        getConfig().options().copyDefaults(false);
	        saveDefaultConfig();
	    }

	    public void registrarEventos() {
	        Bukkit.getPluginManager().registerEvents((Listener) new EventoCombatLog(), this);
	    }

	    public void registrarComandos() {
	    }
	}