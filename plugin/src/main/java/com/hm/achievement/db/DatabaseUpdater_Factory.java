package com.hm.achievement.db;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.logging.Logger;
import javax.inject.Provider;

@DaggerGenerated
public final class DatabaseUpdater_Factory implements Factory {
      private final Provider loggerProvider;

      public DatabaseUpdater_Factory(Provider var1) {
            this.loggerProvider = var1;
      }

      public DatabaseUpdater get() {
            return newInstance((Logger)this.loggerProvider.get());
      }

      public static DatabaseUpdater_Factory create(Provider var0) {
            return new DatabaseUpdater_Factory(var0);
      }

      public static DatabaseUpdater newInstance(Logger var0) {
            return new DatabaseUpdater(var0);
      }
}
