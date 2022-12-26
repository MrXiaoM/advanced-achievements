package com.hm.achievement.command.executable;

import com.hm.achievement.db.AbstractDatabaseManager;
import com.hm.achievement.utils.SoundPlayer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.logging.Logger;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class WeekCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider loggerProvider;
      private final Provider databaseManagerProvider;
      private final Provider soundPlayerProvider;

      public WeekCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.loggerProvider = var4;
            this.databaseManagerProvider = var5;
            this.soundPlayerProvider = var6;
      }

      public WeekCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (Logger)this.loggerProvider.get(), (AbstractDatabaseManager)this.databaseManagerProvider.get(), (SoundPlayer)this.soundPlayerProvider.get());
      }

      public static WeekCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            return new WeekCommand_Factory(var0, var1, var2, var3, var4, var5);
      }

      public static WeekCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, Logger var3, AbstractDatabaseManager var4, SoundPlayer var5) {
            return new WeekCommand(var0, var1, var2, var3, var4, var5);
      }
}
