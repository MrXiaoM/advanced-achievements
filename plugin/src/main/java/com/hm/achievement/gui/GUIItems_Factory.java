package com.hm.achievement.gui;

import com.hm.achievement.utils.MaterialHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class GUIItems_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider guiConfigProvider;
      private final Provider materialHelperProvider;

      public GUIItems_Factory(Provider var1, Provider var2, Provider var3, Provider var4) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.guiConfigProvider = var3;
            this.materialHelperProvider = var4;
      }

      public GUIItems get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (YamlConfiguration)this.guiConfigProvider.get(), (MaterialHelper)this.materialHelperProvider.get());
      }

      public static GUIItems_Factory create(Provider var0, Provider var1, Provider var2, Provider var3) {
            return new GUIItems_Factory(var0, var1, var2, var3);
      }

      public static GUIItems newInstance(YamlConfiguration var0, YamlConfiguration var1, YamlConfiguration var2, MaterialHelper var3) {
            return new GUIItems(var0, var1, var2, var3);
      }
}
