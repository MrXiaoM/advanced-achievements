package com.hm.achievement.config;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.utils.MaterialHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class RewardParser_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider advancedAchievementsProvider;
      private final Provider materialHelperProvider;

      public RewardParser_Factory(Provider var1, Provider var2, Provider var3, Provider var4) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.advancedAchievementsProvider = var3;
            this.materialHelperProvider = var4;
      }

      public RewardParser get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (AdvancedAchievements)this.advancedAchievementsProvider.get(), (MaterialHelper)this.materialHelperProvider.get());
      }

      public static RewardParser_Factory create(Provider var0, Provider var1, Provider var2, Provider var3) {
            return new RewardParser_Factory(var0, var1, var2, var3);
      }

      public static RewardParser newInstance(YamlConfiguration var0, YamlConfiguration var1, AdvancedAchievements var2, MaterialHelper var3) {
            return new RewardParser(var0, var1, var2, var3);
      }
}
