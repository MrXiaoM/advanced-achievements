package com.hm.achievement.listener.statistics;

import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.CacheManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class FireworksListener_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider serverVersionProvider;
      private final Provider achievementMapProvider;
      private final Provider cacheManagerProvider;

      public FireworksListener_Factory(Provider var1, Provider var2, Provider var3, Provider var4) {
            this.mainConfigProvider = var1;
            this.serverVersionProvider = var2;
            this.achievementMapProvider = var3;
            this.cacheManagerProvider = var4;
      }

      public FireworksListener get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (Integer)this.serverVersionProvider.get(), (AchievementMap)this.achievementMapProvider.get(), (CacheManager)this.cacheManagerProvider.get());
      }

      public static FireworksListener_Factory create(Provider var0, Provider var1, Provider var2, Provider var3) {
            return new FireworksListener_Factory(var0, var1, var2, var3);
      }

      public static FireworksListener newInstance(YamlConfiguration var0, int var1, AchievementMap var2, CacheManager var3) {
            return new FireworksListener(var0, var1, var2, var3);
      }
}
