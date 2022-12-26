package com.hm.achievement.utils;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.logging.Logger;
import javax.inject.Provider;

@DaggerGenerated
public final class SoundPlayer_Factory implements Factory {
      private final Provider loggerProvider;

      public SoundPlayer_Factory(Provider var1) {
            this.loggerProvider = var1;
      }

      public SoundPlayer get() {
            return newInstance((Logger)this.loggerProvider.get());
      }

      public static SoundPlayer_Factory create(Provider var0) {
            return new SoundPlayer_Factory(var0);
      }

      public static SoundPlayer newInstance(Logger var0) {
            return new SoundPlayer(var0);
      }
}
