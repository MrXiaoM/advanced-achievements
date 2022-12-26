package com.hm.achievement.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class ConfigModule_ProvidesGuiConfigFactory implements Factory {
      private final ConfigModule module;

      public ConfigModule_ProvidesGuiConfigFactory(ConfigModule var1) {
            this.module = var1;
      }

      public YamlConfiguration get() {
            return providesGuiConfig(this.module);
      }

      public static ConfigModule_ProvidesGuiConfigFactory create(ConfigModule var0) {
            return new ConfigModule_ProvidesGuiConfigFactory(var0);
      }

      public static YamlConfiguration providesGuiConfig(ConfigModule var0) {
            return (YamlConfiguration)Preconditions.checkNotNullFromProvides(var0.providesGuiConfig());
      }
}
