package com.hm.achievement.command.executable;

import com.hm.achievement.AdvancedAchievements;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.logging.Logger;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class ReloadCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider advancedAchievementsProvider;
      private final Provider loggerProvider;
      private final Provider pluginLoaderProvider;
      private final Provider reloadablesProvider;

      public ReloadCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6, Provider var7) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.advancedAchievementsProvider = var4;
            this.loggerProvider = var5;
            this.pluginLoaderProvider = var6;
            this.reloadablesProvider = var7;
      }

      public ReloadCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (AdvancedAchievements)this.advancedAchievementsProvider.get(), (Logger)this.loggerProvider.get(), DoubleCheck.lazy(this.pluginLoaderProvider), DoubleCheck.lazy(this.reloadablesProvider));
      }

      public static ReloadCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            return new ReloadCommand_Factory(var0, var1, var2, var3, var4, var5, var6);
      }

      public static ReloadCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, AdvancedAchievements var3, Logger var4, Lazy var5, Lazy var6) {
            return new ReloadCommand(var0, var1, var2, var3, var4, var5, var6);
      }
}
