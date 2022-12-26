package com.hm.achievement.listener;

import com.hm.achievement.gui.CategoryGUI;
import com.hm.achievement.gui.GUIItems;
import com.hm.achievement.gui.MainGUI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class ListGUIListener_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider disabledCategoriesProvider;
      private final Provider mainGUIProvider;
      private final Provider categoryGUIProvider;
      private final Provider guiItemsProvider;

      public ListGUIListener_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            this.mainConfigProvider = var1;
            this.disabledCategoriesProvider = var2;
            this.mainGUIProvider = var3;
            this.categoryGUIProvider = var4;
            this.guiItemsProvider = var5;
      }

      public ListGUIListener get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (Set)this.disabledCategoriesProvider.get(), (MainGUI)this.mainGUIProvider.get(), (CategoryGUI)this.categoryGUIProvider.get(), (GUIItems)this.guiItemsProvider.get());
      }

      public static ListGUIListener_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4) {
            return new ListGUIListener_Factory(var0, var1, var2, var3, var4);
      }

      public static ListGUIListener newInstance(YamlConfiguration var0, Set var1, MainGUI var2, CategoryGUI var3, GUIItems var4) {
            return new ListGUIListener(var0, var1, var2, var3, var4);
      }
}
