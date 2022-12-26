package com.hm.achievement.listener.statistics;

import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.CacheManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class PetMasterGiveListener_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider achievementMapProvider;
      private final Provider cacheManagerProvider;

      public PetMasterGiveListener_Factory(Provider var1, Provider var2, Provider var3) {
            this.mainConfigProvider = var1;
            this.achievementMapProvider = var2;
            this.cacheManagerProvider = var3;
      }

      public PetMasterGiveListener get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (AchievementMap)this.achievementMapProvider.get(), (CacheManager)this.cacheManagerProvider.get());
      }

      public static PetMasterGiveListener_Factory create(Provider var0, Provider var1, Provider var2) {
            return new PetMasterGiveListener_Factory(var0, var1, var2);
      }

      public static PetMasterGiveListener newInstance(YamlConfiguration var0, AchievementMap var1, CacheManager var2) {
            return new PetMasterGiveListener(var0, var1, var2);
      }
}
