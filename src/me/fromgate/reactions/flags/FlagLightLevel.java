package me.fromgate.reactions.flags;

import org.bukkit.entity.Player;

public class FlagLightLevel extends Flag{

    @Override
    public boolean checkFlag(Player p, String param) {
        if (!u().isInteger(param)) return false;
        return p.getEyeLocation().getBlock().getLightLevel()>=Integer.parseInt(param);
    }
}
