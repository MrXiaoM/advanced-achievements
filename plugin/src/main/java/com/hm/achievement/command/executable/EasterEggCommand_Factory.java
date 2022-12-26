package com.hm.achievement.command.executable;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class EasterEggCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;

      public EasterEggCommand_Factory(Provider var1, Provider var2, Provider var3) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
      }

      public EasterEggCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get());
      }

      public static EasterEggCommand_Factory create(Provider var0, Provider var1, Provider var2) {
            return new EasterEggCommand_Factory(var0, var1, var2);
      }

      public static EasterEggCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2) {
            return new EasterEggCommand(var0, var1, var2);
      }
}
