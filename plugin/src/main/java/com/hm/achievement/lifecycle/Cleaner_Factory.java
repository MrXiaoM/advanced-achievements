package com.hm.achievement.lifecycle;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
public final class Cleaner_Factory implements Factory {
      private final Provider cleanablesProvider;

      public Cleaner_Factory(Provider var1) {
            this.cleanablesProvider = var1;
      }

      public Cleaner get() {
            return newInstance((Set)this.cleanablesProvider.get());
      }

      public static Cleaner_Factory create(Provider var0) {
            return new Cleaner_Factory(var0);
      }

      public static Cleaner newInstance(Set var0) {
            return new Cleaner(var0);
      }
}
