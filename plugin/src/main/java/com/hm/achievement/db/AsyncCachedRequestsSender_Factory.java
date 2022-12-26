package com.hm.achievement.db;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.logging.Logger;
import javax.inject.Provider;

@DaggerGenerated
public final class AsyncCachedRequestsSender_Factory implements Factory {
      private final Provider loggerProvider;
      private final Provider cacheManagerProvider;
      private final Provider databaseManagerProvider;

      public AsyncCachedRequestsSender_Factory(Provider var1, Provider var2, Provider var3) {
            this.loggerProvider = var1;
            this.cacheManagerProvider = var2;
            this.databaseManagerProvider = var3;
      }

      public AsyncCachedRequestsSender get() {
            return newInstance((Logger)this.loggerProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (AbstractDatabaseManager)this.databaseManagerProvider.get());
      }

      public static AsyncCachedRequestsSender_Factory create(Provider var0, Provider var1, Provider var2) {
            return new AsyncCachedRequestsSender_Factory(var0, var1, var2);
      }

      public static AsyncCachedRequestsSender newInstance(Logger var0, CacheManager var1, AbstractDatabaseManager var2) {
            return new AsyncCachedRequestsSender(var0, var1, var2);
      }
}
