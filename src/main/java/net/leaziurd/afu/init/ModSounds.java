package net.leaziurd.afu.init;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds
{
    public static final Identifier FART = new Identifier("afu:fart");
    public static SoundEvent FART_EVENT = new SoundEvent(FART);

    public static final Identifier UI_UI = new Identifier("afu:ui_ui");
    public static SoundEvent UI_UI_EVENT = new SoundEvent(UI_UI);

    public static void registerAll()
    {
        Registry.register(Registry.SOUND_EVENT, FART, FART_EVENT);
        Registry.register(Registry.SOUND_EVENT, UI_UI, UI_UI_EVENT);
    }
}
