package com.hm.achievement.command.executable;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.AbstractDatabaseManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class InspectCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider advancedAchievementsProvider;
      private final Provider databaseManagerProvider;
      private final Provider achievementMapProvider;

      public InspectCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.advancedAchievementsProvider = var4;
            this.databaseManagerProvider = var5;
            this.achievementMapProvider = var6;
      }

      public InspectCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (AdvancedAchievements)this.advancedAchievementsProvider.get(), (AbstractDatabaseManager)this.databaseManagerProvider.get(), (AchievementMap)this.achievementMapProvider.get());
      }

      public static InspectCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            return new InspectCommand_Factory(var0, var1, var2, var3, var4, var5);
      }

      public static InspectCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, AdvancedAchievements var3, AbstractDatabaseManager var4, AchievementMap var5) {
            return new InspectCommand(var0, var1, var2, var3, var4, var5);
      }
}
