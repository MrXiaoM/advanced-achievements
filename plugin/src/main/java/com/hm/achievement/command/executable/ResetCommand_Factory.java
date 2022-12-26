package com.hm.achievement.command.executable;

import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.CacheManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class ResetCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider cacheManagerProvider;
      private final Provider achievementMapProvider;

      public ResetCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.cacheManagerProvider = var4;
            this.achievementMapProvider = var5;
      }

      public ResetCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (AchievementMap)this.achievementMapProvider.get());
      }

      public static ResetCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4) {
            return new ResetCommand_Factory(var0, var1, var2, var3, var4);
      }

      public static ResetCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, CacheManager var3, AchievementMap var4) {
            return new ResetCommand(var0, var1, var2, var3, var4);
      }
}
