package com.hm.achievement.gui;

import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.AbstractDatabaseManager;
import com.hm.achievement.db.CacheManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class CategoryGUI_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider cacheManagerProvider;
      private final Provider databaseManagerProvider;
      private final Provider guiItemsProvider;
      private final Provider achievementMapProvider;

      public CategoryGUI_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.cacheManagerProvider = var3;
            this.databaseManagerProvider = var4;
            this.guiItemsProvider = var5;
            this.achievementMapProvider = var6;
      }

      public CategoryGUI get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (AbstractDatabaseManager)this.databaseManagerProvider.get(), (GUIItems)this.guiItemsProvider.get(), (AchievementMap)this.achievementMapProvider.get());
      }

      public static CategoryGUI_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            return new CategoryGUI_Factory(var0, var1, var2, var3, var4, var5);
      }

      public static CategoryGUI newInstance(YamlConfiguration var0, YamlConfiguration var1, CacheManager var2, AbstractDatabaseManager var3, GUIItems var4, AchievementMap var5) {
            return new CategoryGUI(var0, var1, var2, var3, var4, var5);
      }
}
