package be.detobel36.nomorenpc;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;


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
            event.setCancelled(true);
            warnOpPlayer(event.getEntity().getLocation());
        }
    }
    
    private void warnOpPlayer(final Location canceledSpawnLocation) {
        for(final Player player : Bukkit.getOnlinePlayers()) {
            if(player.hasPermission("nomorenpc.debug")) {
                player.sendMessage(ChatColor.GRAY + "[DEBUG] Le spawn d'un "
                        + "villageois a été annulé en " + 
                        canceledSpawnLocation.getX() + ", "+
                        canceledSpawnLocation.getY() + ", "+
                        canceledSpawnLocation.getZ());
            }
        }
    }
    
}
