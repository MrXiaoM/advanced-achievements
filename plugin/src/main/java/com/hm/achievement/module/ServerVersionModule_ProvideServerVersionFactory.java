package com.hm.achievement.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
public final class ServerVersionModule_ProvideServerVersionFactory implements Factory {
      private final ServerVersionModule module;

      public ServerVersionModule_ProvideServerVersionFactory(ServerVersionModule var1) {
            this.module = var1;
      }

      public Integer get() {
            return provideServerVersion(this.module);
      }

      public static ServerVersionModule_ProvideServerVersionFactory create(ServerVersionModule var0) {
            return new ServerVersionModule_ProvideServerVersionFactory(var0);
      }

      public static int provideServerVersion(ServerVersionModule var0) {
            return var0.provideServerVersion();
      }
}
