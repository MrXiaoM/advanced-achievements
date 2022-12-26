package com.hm.achievement.utils;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
public final class FancyMessageSender_Factory implements Factory {
      private final Provider serverVersionProvider;

      public FancyMessageSender_Factory(Provider var1) {
            this.serverVersionProvider = var1;
      }

      public FancyMessageSender get() {
            return newInstance((Integer)this.serverVersionProvider.get());
      }

      public static FancyMessageSender_Factory create(Provider var0) {
            return new FancyMessageSender_Factory(var0);
      }

      public static FancyMessageSender newInstance(int var0) {
            return new FancyMessageSender(var0);
      }
}
