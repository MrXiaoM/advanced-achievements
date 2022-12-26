package com.hm.achievement.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

@DaggerGenerated
public final class ConfigModule_ProvideDisabledCategoriesFactory implements Factory {
      private final ConfigModule module;

      public ConfigModule_ProvideDisabledCategoriesFactory(ConfigModule var1) {
            this.module = var1;
      }

      public Set get() {
            return provideDisabledCategories(this.module);
      }

      public static ConfigModule_ProvideDisabledCategoriesFactory create(ConfigModule var0) {
            return new ConfigModule_ProvideDisabledCategoriesFactory(var0);
      }

      public static Set provideDisabledCategories(ConfigModule var0) {
            return (Set)Preconditions.checkNotNullFromProvides(var0.provideDisabledCategories());
      }
}
