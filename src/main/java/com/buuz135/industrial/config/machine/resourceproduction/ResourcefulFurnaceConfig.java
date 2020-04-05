package com.buuz135.industrial.config.machine.resourceproduction;

import com.buuz135.industrial.config.MachineCoreConfig;
import com.buuz135.industrial.config.MachineResourceProductionConfig;
import com.hrznstudio.titanium.annotation.config.ConfigFile;
import com.hrznstudio.titanium.annotation.config.ConfigVal;

@ConfigFile.Child(MachineResourceProductionConfig.class)
public class ResourcefulFurnaceConfig {

    @ConfigVal(comment = "Amount of Power Consumed per Tick - Default: [400FE]")
    public static int getPowerPerTick = 40;

    @ConfigVal(comment = "Max Stored Power [FE] - Default: [10000 FE]")
    public static int getMaxStoredPower = 10000;

    @ConfigVal(comment = "Max Amount of Stored Fluid [Essence] - Default: [8000mB]")
    public static int getMaxEssenceTankSize = 16000;

}