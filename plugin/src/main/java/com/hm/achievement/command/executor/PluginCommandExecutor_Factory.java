package com.hm.achievement.command.executor;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class PluginCommandExecutor_Factory implements Factory {
      private final Provider langConfigProvider;
      private final Provider commandsProvider;
      private final Provider pluginHeaderProvider;

      public PluginCommandExecutor_Factory(Provider var1, Provider var2, Provider var3) {
            this.langConfigProvider = var1;
            this.commandsProvider = var2;
            this.pluginHeaderProvider = var3;
      }

      public PluginCommandExecutor get() {
            return newInstance((YamlConfiguration)this.langConfigProvider.get(), (Set)this.commandsProvider.get(), (StringBuilder)this.pluginHeaderProvider.get());
      }

      public static PluginCommandExecutor_Factory create(Provider var0, Provider var1, Provider var2) {
            return new PluginCommandExecutor_Factory(var0, var1, var2);
      }

      public static PluginCommandExecutor newInstance(YamlConfiguration var0, Set var1, StringBuilder var2) {
            return new PluginCommandExecutor(var0, var1, var2);
      }
}
