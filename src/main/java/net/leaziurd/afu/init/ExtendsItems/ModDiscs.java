package net.leaziurd.afu.init.ExtendsItems;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class ModDiscs extends MusicDiscItem {
    public ModDiscs(int comparatorOutput, SoundEvent sound, Settings itemSettings) {
        super(comparatorOutput, sound, itemSettings);
    }
}