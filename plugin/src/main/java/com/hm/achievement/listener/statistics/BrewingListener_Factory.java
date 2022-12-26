package com.hm.achievement.listener.statistics;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.CacheManager;
import com.hm.achievement.utils.MaterialHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class BrewingListener_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider achievementMapProvider;
      private final Provider cacheManagerProvider;
      private final Provider advancedAchievementsProvider;
      private final Provider langConfigProvider;
      private final Provider materialHelperProvider;

      public BrewingListener_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            this.mainConfigProvider = var1;
            this.achievementMapProvider = var2;
            this.cacheManagerProvider = var3;
            this.advancedAchievementsProvider = var4;
            this.langConfigProvider = var5;
            this.materialHelperProvider = var6;
      }

      public BrewingListener get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (AchievementMap)this.achievementMapProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (AdvancedAchievements)this.advancedAchievementsProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (MaterialHelper)this.materialHelperProvider.get());
      }

      public static BrewingListener_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            return new BrewingListener_Factory(var0, var1, var2, var3, var4, var5);
      }

      public static BrewingListener newInstance(YamlConfiguration var0, AchievementMap var1, CacheManager var2, AdvancedAchievements var3, YamlConfiguration var4, MaterialHelper var5) {
            return new BrewingListener(var0, var1, var2, var3, var4, var5);
      }
}
