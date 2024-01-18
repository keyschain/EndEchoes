package site.keyschain.end_echoes.config;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

import static site.keyschain.end_echoes.Constants.MOD_ID;

@Modmenu(modId = MOD_ID)
@Config(name = "end_echoes_config", wrapperName = "EndEchoesConfig", defaultHook = false, saveOnModification = true)
public class ConfigModel {
    // variables that can be changed by the player
    public boolean doDebugLogs = false;
}