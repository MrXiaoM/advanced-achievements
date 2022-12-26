package com.hm.achievement.listener.statistics;

import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.CacheManager;
import com.hm.achievement.utils.MaterialHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class ConsumedPotionsListener_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider achievementMapProvider;
      private final Provider cacheManagerProvider;
      private final Provider materialHelperProvider;

      public ConsumedPotionsListener_Factory(Provider var1, Provider var2, Provider var3, Provider var4) {
            this.mainConfigProvider = var1;
            this.achievementMapProvider = var2;
            this.cacheManagerProvider = var3;
            this.materialHelperProvider = var4;
      }

      public ConsumedPotionsListener get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (AchievementMap)this.achievementMapProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (MaterialHelper)this.materialHelperProvider.get());
      }

      public static ConsumedPotionsListener_Factory create(Provider var0, Provider var1, Provider var2, Provider var3) {
            return new ConsumedPotionsListener_Factory(var0, var1, var2, var3);
      }

      public static ConsumedPotionsListener newInstance(YamlConfiguration var0, AchievementMap var1, CacheManager var2, MaterialHelper var3) {
            return new ConsumedPotionsListener(var0, var1, var2, var3);
      }
}
