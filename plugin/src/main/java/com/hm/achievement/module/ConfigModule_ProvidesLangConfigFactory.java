package com.hm.achievement.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class ConfigModule_ProvidesLangConfigFactory implements Factory {
      private final ConfigModule module;

      public ConfigModule_ProvidesLangConfigFactory(ConfigModule var1) {
            this.module = var1;
      }

      public YamlConfiguration get() {
            return providesLangConfig(this.module);
      }

      public static ConfigModule_ProvidesLangConfigFactory create(ConfigModule var0) {
            return new ConfigModule_ProvidesLangConfigFactory(var0);
      }

      public static YamlConfiguration providesLangConfig(ConfigModule var0) {
            return (YamlConfiguration)Preconditions.checkNotNullFromProvides(var0.providesLangConfig());
      }
}
