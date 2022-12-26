package com.hm.achievement.gui;

import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.CacheManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class MainGUI_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider cacheManagerProvider;
      private final Provider disabledCategoriesProvider;
      private final Provider guiItemsProvider;
      private final Provider achievementMapProvider;

      public MainGUI_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.cacheManagerProvider = var3;
            this.disabledCategoriesProvider = var4;
            this.guiItemsProvider = var5;
            this.achievementMapProvider = var6;
      }

      public MainGUI get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (Set)this.disabledCategoriesProvider.get(), (GUIItems)this.guiItemsProvider.get(), (AchievementMap)this.achievementMapProvider.get());
      }

      public static MainGUI_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            return new MainGUI_Factory(var0, var1, var2, var3, var4, var5);
      }

      public static MainGUI newInstance(YamlConfiguration var0, YamlConfiguration var1, CacheManager var2, Set var3, GUIItems var4, AchievementMap var5) {
            return new MainGUI(var0, var1, var2, var3, var4, var5);
      }
}
