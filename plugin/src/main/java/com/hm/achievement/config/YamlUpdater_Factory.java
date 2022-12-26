package com.hm.achievement.config;

import com.hm.achievement.AdvancedAchievements;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
public final class YamlUpdater_Factory implements Factory {
      private final Provider pluginProvider;

      public YamlUpdater_Factory(Provider var1) {
            this.pluginProvider = var1;
      }

      public YamlUpdater get() {
            return newInstance((AdvancedAchievements)this.pluginProvider.get());
      }

      public static YamlUpdater_Factory create(Provider var0) {
            return new YamlUpdater_Factory(var0);
      }

      public static YamlUpdater newInstance(AdvancedAchievements var0) {
            return new YamlUpdater(var0);
      }
}
