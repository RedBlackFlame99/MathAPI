package devv.rbfz.mathAPI;

import devv.rbfz.mathAPI.types.MathAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class MathPlugin extends JavaPlugin {

    private MathAPI api;

    @Override
    public void onEnable() {
        this.api = new MathAPI(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public MathAPI getMathAPI() {
        return this.api;
    }
}
