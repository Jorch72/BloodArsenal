package com.arc.bloodarsenal.rituals;

import WayofTime.alchemicalWizardry.api.rituals.Rituals;
import WayofTime.alchemicalWizardry.common.renderer.AlchemyCircleRenderer;
import net.minecraft.util.ResourceLocation;

public class RitualRegistry
{
    public static void initRituals()
    {
        Rituals.registerRitual("ARC001Wither", 1, 75000, new RitualEffectWithering(), "Ritual of Withering", new AlchemyCircleRenderer(new ResourceLocation("alchemicalwizardry:textures/models/SimpleTransCircle.png"), 0, 0, 0, 255, 0, 0.501, 0.501, 0, 1.5, false));
        Rituals.registerRitual("ARC002Midas", 1, 5000, new RitualEffectMidas(), "Midas Touch", new AlchemyCircleRenderer(new ResourceLocation("alchemicalwizardry:textures/models/SimpleTransCircle.png"), 0, 0, 0, 255, 0, 0.501, 0.501, 0, 2.5, false));
    }
}