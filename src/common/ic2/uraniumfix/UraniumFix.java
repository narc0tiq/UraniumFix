package ic2.uraniumfix;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import ic2.api.Ic2Recipes;
import ic2.common.Ic2Items;

@Mod (
    modid = "IC2.UraniumFix",
    version = "%conf:VERSION%",
    useMetadata = true,
    dependencies = "required-after:IC2"
)
@NetworkMod (
    clientSideRequired = false
)
public class UraniumFix {
    @Mod.Init
    public void init(FMLInitializationEvent event) {
        Ic2Recipes.addCompressorRecipe(Ic2Items.uraniumDrop, Ic2Items.uraniumIngot);
    }
}
