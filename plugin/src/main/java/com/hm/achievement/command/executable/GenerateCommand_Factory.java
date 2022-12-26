package com.hm.achievement.command.executable;

import com.hm.achievement.advancement.AdvancementManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class GenerateCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider advancementManagerProvider;

      public GenerateCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.advancementManagerProvider = var4;
      }

      public GenerateCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (AdvancementManager)this.advancementManagerProvider.get());
      }

      public static GenerateCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3) {
            return new GenerateCommand_Factory(var0, var1, var2, var3);
      }

      public static GenerateCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, AdvancementManager var3) {
            return new GenerateCommand(var0, var1, var2, var3);
      }
}
