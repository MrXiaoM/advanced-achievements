package com.hm.achievement.command.executable;

import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.CacheManager;
import com.hm.achievement.utils.SoundPlayer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class StatsCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider cacheManagerProvider;
      private final Provider achievementMapProvider;
      private final Provider soundPlayerProvider;

      public StatsCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.cacheManagerProvider = var4;
            this.achievementMapProvider = var5;
            this.soundPlayerProvider = var6;
      }

      public StatsCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (AchievementMap)this.achievementMapProvider.get(), (SoundPlayer)this.soundPlayerProvider.get());
      }

      public static StatsCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            return new StatsCommand_Factory(var0, var1, var2, var3, var4, var5);
      }

      public static StatsCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, CacheManager var3, AchievementMap var4, SoundPlayer var5) {
            return new StatsCommand(var0, var1, var2, var3, var4, var5);
      }
}
