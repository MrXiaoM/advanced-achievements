package com.hm.achievement.command.executable;

import com.hm.achievement.db.CacheManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class CheckCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider cacheManagerProvider;

      public CheckCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.cacheManagerProvider = var4;
      }

      public CheckCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (CacheManager)this.cacheManagerProvider.get());
      }

      public static CheckCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3) {
            return new CheckCommand_Factory(var0, var1, var2, var3);
      }

      public static CheckCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, CacheManager var3) {
            return new CheckCommand(var0, var1, var2, var3);
      }
}
