package com.hm.achievement.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
public final class ConfigModule_ProvidePluginHeaderFactory implements Factory {
      private final ConfigModule module;

      public ConfigModule_ProvidePluginHeaderFactory(ConfigModule var1) {
            this.module = var1;
      }

      public StringBuilder get() {
            return providePluginHeader(this.module);
      }

      public static ConfigModule_ProvidePluginHeaderFactory create(ConfigModule var0) {
            return new ConfigModule_ProvidePluginHeaderFactory(var0);
      }

      public static StringBuilder providePluginHeader(ConfigModule var0) {
            return (StringBuilder)Preconditions.checkNotNullFromProvides(var0.providePluginHeader());
      }
}
