package com.hm.achievement.config;

import com.hm.achievement.AdvancedAchievements;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
import java.util.logging.Logger;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class ConfigurationParser_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider guiConfigProvider;
      private final Provider achievementMapProvider;
      private final Provider disabledCategoriesProvider;
      private final Provider pluginHeaderProvider;
      private final Provider loggerProvider;
      private final Provider serverVersionProvider;
      private final Provider yamlUpdaterProvider;
      private final Provider pluginProvider;
      private final Provider rewardParserProvider;

      public ConfigurationParser_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6, Provider var7, Provider var8, Provider var9, Provider var10, Provider var11) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.guiConfigProvider = var3;
            this.achievementMapProvider = var4;
            this.disabledCategoriesProvider = var5;
            this.pluginHeaderProvider = var6;
            this.loggerProvider = var7;
            this.serverVersionProvider = var8;
            this.yamlUpdaterProvider = var9;
            this.pluginProvider = var10;
            this.rewardParserProvider = var11;
      }

      public ConfigurationParser get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (YamlConfiguration)this.guiConfigProvider.get(), (AchievementMap)this.achievementMapProvider.get(), (Set)this.disabledCategoriesProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (Logger)this.loggerProvider.get(), (Integer)this.serverVersionProvider.get(), (YamlUpdater)this.yamlUpdaterProvider.get(), (AdvancedAchievements)this.pluginProvider.get(), (RewardParser)this.rewardParserProvider.get());
      }

      public static ConfigurationParser_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6, Provider var7, Provider var8, Provider var9, Provider var10) {
            return new ConfigurationParser_Factory(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }

      public static ConfigurationParser newInstance(YamlConfiguration var0, YamlConfiguration var1, YamlConfiguration var2, AchievementMap var3, Set var4, StringBuilder var5, Logger var6, int var7, YamlUpdater var8, AdvancedAchievements var9, RewardParser var10) {
            return new ConfigurationParser(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }
}
