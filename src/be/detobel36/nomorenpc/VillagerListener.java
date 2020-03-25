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

import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;


/**
 *
 * @author Detobel36
 */
public class VillagerListener implements Listener {
    
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if(event.getEntityType().equals(EntityType.VILLAGER) && 
            (event.getSpawnReason().equals(SpawnReason.BREEDING) ||
            event.getSpawnReason().equals(SpawnReason.CURED))) {
            event.setCancelled(false);
        }
    }
    
}
