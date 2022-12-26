package com.hm.achievement.command.executable;

import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.AbstractDatabaseManager;
import com.hm.achievement.utils.SoundPlayer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.logging.Logger;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class BookCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider loggerProvider;
      private final Provider serverVersionProvider;
      private final Provider databaseManagerProvider;
      private final Provider soundPlayerProvider;
      private final Provider achievementMapProvider;

      public BookCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6, Provider var7, Provider var8) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.loggerProvider = var4;
            this.serverVersionProvider = var5;
            this.databaseManagerProvider = var6;
            this.soundPlayerProvider = var7;
            this.achievementMapProvider = var8;
      }

      public BookCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (Logger)this.loggerProvider.get(), (Integer)this.serverVersionProvider.get(), (AbstractDatabaseManager)this.databaseManagerProvider.get(), (SoundPlayer)this.soundPlayerProvider.get(), (AchievementMap)this.achievementMapProvider.get());
      }

      public static BookCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6, Provider var7) {
            return new BookCommand_Factory(var0, var1, var2, var3, var4, var5, var6, var7);
      }

      public static BookCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, Logger var3, int var4, AbstractDatabaseManager var5, SoundPlayer var6, AchievementMap var7) {
            return new BookCommand(var0, var1, var2, var3, var4, var5, var6, var7);
      }
}
