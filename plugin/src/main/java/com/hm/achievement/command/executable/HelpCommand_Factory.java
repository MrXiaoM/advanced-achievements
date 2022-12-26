package com.hm.achievement.command.executable;

import com.hm.achievement.utils.FancyMessageSender;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class HelpCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider fancyMessageSenderProvider;

      public HelpCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.fancyMessageSenderProvider = var4;
      }

      public HelpCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (FancyMessageSender)this.fancyMessageSenderProvider.get());
      }

      public static HelpCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3) {
            return new HelpCommand_Factory(var0, var1, var2, var3);
      }

      public static HelpCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, FancyMessageSender var3) {
            return new HelpCommand(var0, var1, var2, var3);
      }
}
