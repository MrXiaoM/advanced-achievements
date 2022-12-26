package com.hm.achievement.module;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.db.AbstractDatabaseManager;
import com.hm.achievement.db.DatabaseUpdater;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class DatabaseModule_ProvideSQLDatabaseManagerFactory implements Factory {
      private final DatabaseModule module;
      private final Provider mainConfigProvider;
      private final Provider loggerProvider;
      private final Provider databaseUpdaterProvider;
      private final Provider advancedAchievementsProvider;
      private final Provider writeExecutorProvider;

      public DatabaseModule_ProvideSQLDatabaseManagerFactory(DatabaseModule var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            this.module = var1;
            this.mainConfigProvider = var2;
            this.loggerProvider = var3;
            this.databaseUpdaterProvider = var4;
            this.advancedAchievementsProvider = var5;
            this.writeExecutorProvider = var6;
      }

      public AbstractDatabaseManager get() {
            return provideSQLDatabaseManager(this.module, (YamlConfiguration)this.mainConfigProvider.get(), (Logger)this.loggerProvider.get(), (DatabaseUpdater)this.databaseUpdaterProvider.get(), (AdvancedAchievements)this.advancedAchievementsProvider.get(), (ExecutorService)this.writeExecutorProvider.get());
      }

      public static DatabaseModule_ProvideSQLDatabaseManagerFactory create(DatabaseModule var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            return new DatabaseModule_ProvideSQLDatabaseManagerFactory(var0, var1, var2, var3, var4, var5);
      }

      public static AbstractDatabaseManager provideSQLDatabaseManager(DatabaseModule var0, YamlConfiguration var1, Logger var2, DatabaseUpdater var3, AdvancedAchievements var4, ExecutorService var5) {
            return (AbstractDatabaseManager)Preconditions.checkNotNullFromProvides(var0.provideSQLDatabaseManager(var1, var2, var3, var4, var5));
      }
}
