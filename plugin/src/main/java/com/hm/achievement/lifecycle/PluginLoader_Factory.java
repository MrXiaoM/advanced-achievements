package com.hm.achievement.lifecycle;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.command.completer.CommandTabCompleter;
import com.hm.achievement.command.executable.ReloadCommand;
import com.hm.achievement.command.executor.PluginCommandExecutor;
import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.config.ConfigurationParser;
import com.hm.achievement.db.AbstractDatabaseManager;
import com.hm.achievement.db.AsyncCachedRequestsSender;
import com.hm.achievement.listener.JoinListener;
import com.hm.achievement.listener.ListGUIListener;
import com.hm.achievement.listener.PlayerAdvancedAchievementListener;
import com.hm.achievement.listener.TeleportListener;
import com.hm.achievement.runnable.AchieveDistanceRunnable;
import com.hm.achievement.runnable.AchievePlayTimeRunnable;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Set;
import java.util.logging.Logger;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class PluginLoader_Factory implements Factory {
      private final Provider advancedAchievementsProvider;
      private final Provider loggerProvider;
      private final Provider reloadablesProvider;
      private final Provider joinListenerProvider;
      private final Provider listGUIListenerProvider;
      private final Provider teleportListenerProvider;
      private final Provider playerAdvancedAchievementListenerProvider;
      private final Provider cleanerProvider;
      private final Provider achievementPlaceholderHookProvider;
      private final Provider databaseManagerProvider;
      private final Provider asyncCachedRequestsSenderProvider;
      private final Provider pluginCommandExecutorProvider;
      private final Provider commandTabCompleterProvider;
      private final Provider disabledCategoriesProvider;
      private final Provider mainConfigProvider;
      private final Provider configurationParserProvider;
      private final Provider distanceRunnableProvider;
      private final Provider playTimeRunnableProvider;
      private final Provider reloadCommandProvider;
      private final Provider achievementMapProvider;

      public PluginLoader_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6, Provider var7, Provider var8, Provider var9, Provider var10, Provider var11, Provider var12, Provider var13, Provider var14, Provider var15, Provider var16, Provider var17, Provider var18, Provider var19, Provider var20) {
            this.advancedAchievementsProvider = var1;
            this.loggerProvider = var2;
            this.reloadablesProvider = var3;
            this.joinListenerProvider = var4;
            this.listGUIListenerProvider = var5;
            this.teleportListenerProvider = var6;
            this.playerAdvancedAchievementListenerProvider = var7;
            this.cleanerProvider = var8;
            this.achievementPlaceholderHookProvider = var9;
            this.databaseManagerProvider = var10;
            this.asyncCachedRequestsSenderProvider = var11;
            this.pluginCommandExecutorProvider = var12;
            this.commandTabCompleterProvider = var13;
            this.disabledCategoriesProvider = var14;
            this.mainConfigProvider = var15;
            this.configurationParserProvider = var16;
            this.distanceRunnableProvider = var17;
            this.playTimeRunnableProvider = var18;
            this.reloadCommandProvider = var19;
            this.achievementMapProvider = var20;
      }

      public PluginLoader get() {
            return newInstance((AdvancedAchievements)this.advancedAchievementsProvider.get(), (Logger)this.loggerProvider.get(), (Set)this.reloadablesProvider.get(), (JoinListener)this.joinListenerProvider.get(), (ListGUIListener)this.listGUIListenerProvider.get(), (TeleportListener)this.teleportListenerProvider.get(), (PlayerAdvancedAchievementListener)this.playerAdvancedAchievementListenerProvider.get(), (Cleaner)this.cleanerProvider.get(), DoubleCheck.lazy(this.achievementPlaceholderHookProvider), (AbstractDatabaseManager)this.databaseManagerProvider.get(), (AsyncCachedRequestsSender)this.asyncCachedRequestsSenderProvider.get(), (PluginCommandExecutor)this.pluginCommandExecutorProvider.get(), (CommandTabCompleter)this.commandTabCompleterProvider.get(), (Set)this.disabledCategoriesProvider.get(), (YamlConfiguration)this.mainConfigProvider.get(), (ConfigurationParser)this.configurationParserProvider.get(), (AchieveDistanceRunnable)this.distanceRunnableProvider.get(), (AchievePlayTimeRunnable)this.playTimeRunnableProvider.get(), (ReloadCommand)this.reloadCommandProvider.get(), (AchievementMap)this.achievementMapProvider.get());
      }

      public static PluginLoader_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6, Provider var7, Provider var8, Provider var9, Provider var10, Provider var11, Provider var12, Provider var13, Provider var14, Provider var15, Provider var16, Provider var17, Provider var18, Provider var19) {
            return new PluginLoader_Factory(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);
      }

      public static PluginLoader newInstance(AdvancedAchievements var0, Logger var1, Set var2, JoinListener var3, ListGUIListener var4, TeleportListener var5, PlayerAdvancedAchievementListener var6, Cleaner var7, Lazy var8, AbstractDatabaseManager var9, AsyncCachedRequestsSender var10, PluginCommandExecutor var11, CommandTabCompleter var12, Set var13, YamlConfiguration var14, ConfigurationParser var15, AchieveDistanceRunnable var16, AchievePlayTimeRunnable var17, ReloadCommand var18, AchievementMap var19) {
            return new PluginLoader(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);
      }
}
