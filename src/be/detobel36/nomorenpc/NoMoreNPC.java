/*
 *         ----------------------
 *         | PHOENIX REBIRTH FR |
 *         ----------------------
 * Copyright 2020 PhoenixRebirthFr.
 *
 * Ce projet est réservé au serveur PhoenixRebirth
 * Vous ne pouvez pas utiliser ces fichiers sans autorisation préalable
 * d'un administrateur du serveur PhoenixRebirth France.
 * 
 *  http://phoenix-rebirth.fr - contact@phoenix-rebirth.fr
 */
package be.detobel36.nomorenpc;

import org.bukkit.plugin.java.JavaPlugin;
import be.detobel36.nomorenpc.VillagerListener;

/**
 *
 * @author Detobel36
 */
public class NoMoreNPC extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("Load plugin NoMoreNPC made by detobel36");
        
        getServer().getPluginManager().registerEvents(new VillagerListener(), this);
    }
    
    @Override
    public void onDisable() {
        getLogger().info("Disable plugin NoMoreNPC");
    }
    
}
