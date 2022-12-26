package com.hm.achievement.listener.statistics;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.CacheManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class MilksListener_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider achievementMapProvider;
      private final Provider cacheManagerProvider;
      private final Provider advancedAchievementsProvider;
      private final Provider langConfigProvider;

      public MilksListener_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            this.mainConfigProvider = var1;
            this.achievementMapProvider = var2;
            this.cacheManagerProvider = var3;
            this.advancedAchievementsProvider = var4;
            this.langConfigProvider = var5;
      }

      public MilksListener get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (AchievementMap)this.achievementMapProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (AdvancedAchievements)this.advancedAchievementsProvider.get(), (YamlConfiguration)this.langConfigProvider.get());
      }

      public static MilksListener_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4) {
            return new MilksListener_Factory(var0, var1, var2, var3, var4);
      }

      public static MilksListener newInstance(YamlConfiguration var0, AchievementMap var1, CacheManager var2, AdvancedAchievements var3, YamlConfiguration var4) {
            return new MilksListener(var0, var1, var2, var3, var4);
      }
}
