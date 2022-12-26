package com.hm.achievement.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class ConfigModule_ProvidesMainConfigFactory implements Factory {
      private final ConfigModule module;

      public ConfigModule_ProvidesMainConfigFactory(ConfigModule var1) {
            this.module = var1;
      }

      public YamlConfiguration get() {
            return providesMainConfig(this.module);
      }

      public static ConfigModule_ProvidesMainConfigFactory create(ConfigModule var0) {
            return new ConfigModule_ProvidesMainConfigFactory(var0);
      }

      public static YamlConfiguration providesMainConfig(ConfigModule var0) {
            return (YamlConfiguration)Preconditions.checkNotNullFromProvides(var0.providesMainConfig());
      }
}
