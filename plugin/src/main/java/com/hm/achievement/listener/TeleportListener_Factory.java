package com.hm.achievement.listener;

import com.hm.achievement.runnable.AchieveDistanceRunnable;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
public final class TeleportListener_Factory implements Factory {
      private final Provider distanceRunnableProvider;

      public TeleportListener_Factory(Provider var1) {
            this.distanceRunnableProvider = var1;
      }

      public TeleportListener get() {
            return newInstance((AchieveDistanceRunnable)this.distanceRunnableProvider.get());
      }

      public static TeleportListener_Factory create(Provider var0) {
            return new TeleportListener_Factory(var0);
      }

      public static TeleportListener newInstance(AchieveDistanceRunnable var0) {
            return new TeleportListener(var0);
      }
}
