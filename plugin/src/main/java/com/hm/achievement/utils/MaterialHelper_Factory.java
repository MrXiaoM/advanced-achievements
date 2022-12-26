package com.hm.achievement.utils;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.logging.Logger;
import javax.inject.Provider;

@DaggerGenerated
public final class MaterialHelper_Factory implements Factory {
      private final Provider loggerProvider;

      public MaterialHelper_Factory(Provider var1) {
            this.loggerProvider = var1;
      }

      public MaterialHelper get() {
            return newInstance((Logger)this.loggerProvider.get());
      }

      public static MaterialHelper_Factory create(Provider var0) {
            return new MaterialHelper_Factory(var0);
      }

      public static MaterialHelper newInstance(Logger var0) {
            return new MaterialHelper(var0);
      }
}
