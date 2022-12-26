package com.hm.achievement.command.executable;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.config.RewardParser;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class InfoCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider advancedAchievementsProvider;
      private final Provider rewardParserProvider;

      public InfoCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.advancedAchievementsProvider = var4;
            this.rewardParserProvider = var5;
      }

      public InfoCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (AdvancedAchievements)this.advancedAchievementsProvider.get(), (RewardParser)this.rewardParserProvider.get());
      }

      public static InfoCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4) {
            return new InfoCommand_Factory(var0, var1, var2, var3, var4);
      }

      public static InfoCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, AdvancedAchievements var3, RewardParser var4) {
            return new InfoCommand(var0, var1, var2, var3, var4);
      }
}
