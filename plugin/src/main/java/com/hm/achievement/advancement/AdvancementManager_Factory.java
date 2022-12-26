package com.hm.achievement.advancement;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.gui.GUIItems;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
import java.util.logging.Logger;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class AdvancementManager_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider guiItemsProvider;
      private final Provider achievementMapProvider;
      private final Provider advancedAchievementsProvider;
      private final Provider loggerProvider;
      private final Provider disabledCategoriesProvider;

      public AdvancementManager_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            this.mainConfigProvider = var1;
            this.guiItemsProvider = var2;
            this.achievementMapProvider = var3;
            this.advancedAchievementsProvider = var4;
            this.loggerProvider = var5;
            this.disabledCategoriesProvider = var6;
      }

      public AdvancementManager get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (GUIItems)this.guiItemsProvider.get(), (AchievementMap)this.achievementMapProvider.get(), (AdvancedAchievements)this.advancedAchievementsProvider.get(), (Logger)this.loggerProvider.get(), (Set)this.disabledCategoriesProvider.get());
      }

      public static AdvancementManager_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            return new AdvancementManager_Factory(var0, var1, var2, var3, var4, var5);
      }

      public static AdvancementManager newInstance(YamlConfiguration var0, GUIItems var1, AchievementMap var2, AdvancedAchievements var3, Logger var4, Set var5) {
            return new AdvancementManager(var0, var1, var2, var3, var4, var5);
      }
}
