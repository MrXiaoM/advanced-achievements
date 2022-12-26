package com.hm.achievement.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
public final class AchievementMap_Factory implements Factory {
      public AchievementMap get() {
            return newInstance();
      }

      public static AchievementMap_Factory create() {
            return InstanceHolder.INSTANCE;
      }

      public static AchievementMap newInstance() {
            return new AchievementMap();
      }

      private static final class InstanceHolder {
            private static final AchievementMap_Factory INSTANCE = new AchievementMap_Factory();
      }
}
