package com.hm.achievement.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutorService;

@DaggerGenerated
public final class DatabaseModule_ProvideWriteExecutorFactory implements Factory {
      private final DatabaseModule module;

      public DatabaseModule_ProvideWriteExecutorFactory(DatabaseModule var1) {
            this.module = var1;
      }

      public ExecutorService get() {
            return provideWriteExecutor(this.module);
      }

      public static DatabaseModule_ProvideWriteExecutorFactory create(DatabaseModule var0) {
            return new DatabaseModule_ProvideWriteExecutorFactory(var0);
      }

      public static ExecutorService provideWriteExecutor(DatabaseModule var0) {
            return (ExecutorService)Preconditions.checkNotNullFromProvides(var0.provideWriteExecutor());
      }
}
