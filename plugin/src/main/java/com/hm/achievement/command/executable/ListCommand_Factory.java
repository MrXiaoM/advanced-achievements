package com.hm.achievement.command.executable;

import com.hm.achievement.gui.CategoryGUI;
import com.hm.achievement.gui.GUIItems;
import com.hm.achievement.gui.MainGUI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class ListCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider mainGUIProvider;
      private final Provider categoryGUIProvider;
      private final Provider guiItemsProvider;

      public ListCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.mainGUIProvider = var4;
            this.categoryGUIProvider = var5;
            this.guiItemsProvider = var6;
      }

      public ListCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (MainGUI)this.mainGUIProvider.get(), (CategoryGUI)this.categoryGUIProvider.get(), (GUIItems)this.guiItemsProvider.get());
      }

      public static ListCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            return new ListCommand_Factory(var0, var1, var2, var3, var4, var5);
      }

      public static ListCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, MainGUI var3, CategoryGUI var4, GUIItems var5) {
            return new ListCommand(var0, var1, var2, var3, var4, var5);
      }
}
