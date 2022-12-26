package com.hm.achievement.command.completer;

import com.hm.achievement.config.AchievementMap;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
public final class CommandTabCompleter_Factory implements Factory {
      private final Provider achievementMapProvider;
      private final Provider commandsProvider;

      public CommandTabCompleter_Factory(Provider var1, Provider var2) {
            this.achievementMapProvider = var1;
            this.commandsProvider = var2;
      }

      public CommandTabCompleter get() {
            return newInstance((AchievementMap)this.achievementMapProvider.get(), (Set)this.commandsProvider.get());
      }

      public static CommandTabCompleter_Factory create(Provider var0, Provider var1) {
            return new CommandTabCompleter_Factory(var0, var1);
      }

      public static CommandTabCompleter newInstance(AchievementMap var0, Set var1) {
            return new CommandTabCompleter(var0, var1);
      }
}
