package com.hm.achievement;

import com.hm.achievement.advancement.AdvancementManager_Factory;
import com.hm.achievement.api.AdvancedAchievementsBukkitAPI;
import com.hm.achievement.api.AdvancedAchievementsBukkitAPI_Factory;
import com.hm.achievement.command.completer.CommandTabCompleter_Factory;
import com.hm.achievement.command.executable.*;
import com.hm.achievement.command.executor.PluginCommandExecutor_Factory;
import com.hm.achievement.config.AchievementMap_Factory;
import com.hm.achievement.config.ConfigurationParser_Factory;
import com.hm.achievement.config.RewardParser_Factory;
import com.hm.achievement.config.YamlUpdater_Factory;
import com.hm.achievement.db.AsyncCachedRequestsSender_Factory;
import com.hm.achievement.db.CacheManager_Factory;
import com.hm.achievement.db.DatabaseUpdater_Factory;
import com.hm.achievement.gui.CategoryGUI_Factory;
import com.hm.achievement.gui.GUIItems_Factory;
import com.hm.achievement.gui.MainGUI_Factory;
import com.hm.achievement.lifecycle.Cleaner_Factory;
import com.hm.achievement.lifecycle.PluginLoader;
import com.hm.achievement.lifecycle.PluginLoader_Factory;
import com.hm.achievement.lifecycle.Reloadable;
import com.hm.achievement.listener.JoinListener_Factory;
import com.hm.achievement.listener.ListGUIListener_Factory;
import com.hm.achievement.listener.PlayerAdvancedAchievementListener_Factory;
import com.hm.achievement.listener.TeleportListener_Factory;
import com.hm.achievement.listener.statistics.*;
import com.hm.achievement.module.ConfigModule;
import com.hm.achievement.module.ConfigModule_ProvideDisabledCategoriesFactory;
import com.hm.achievement.module.ConfigModule_ProvidePluginHeaderFactory;
import com.hm.achievement.module.ConfigModule_ProvidesGuiConfigFactory;
import com.hm.achievement.module.ConfigModule_ProvidesLangConfigFactory;
import com.hm.achievement.module.ConfigModule_ProvidesMainConfigFactory;
import com.hm.achievement.module.DatabaseModule;
import com.hm.achievement.module.DatabaseModule_ProvideSQLDatabaseManagerFactory;
import com.hm.achievement.module.DatabaseModule_ProvideWriteExecutorFactory;
import com.hm.achievement.module.ServerVersionModule;
import com.hm.achievement.module.ServerVersionModule_ProvideServerVersionFactory;
import com.hm.achievement.placeholder.AchievementPlaceholderHook_Factory;
import com.hm.achievement.runnable.AchieveDistanceRunnable_Factory;
import com.hm.achievement.runnable.AchievePlayTimeRunnable_Factory;
import com.hm.achievement.utils.FancyMessageSender_Factory;
import com.hm.achievement.utils.MaterialHelper_Factory;
import com.hm.achievement.utils.SoundPlayer_Factory;
import com.hm.achievement.utils.StatisticIncreaseHandler_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.SetFactory;
import java.util.logging.Logger;
import javax.inject.Provider;

@DaggerGenerated
final class DaggerAdvancedAchievementsComponent implements AdvancedAchievementsComponent {
      private final DaggerAdvancedAchievementsComponent advancedAchievementsComponent;
      private Provider<AdvancedAchievements> advancedAchievementsProvider;
      private Provider<Logger> loggerProvider;
      private Provider<ConfigModule_ProvidesMainConfigFactory> providesMainConfigProvider;
      private Provider providesLangConfigProvider;
      private Provider<ConfigModule_ProvidePluginHeaderFactory> providePluginHeaderProvider;
      private Provider<ServerVersionModule_ProvideServerVersionFactory> provideServerVersionProvider;
      private Provider<FancyMessageSender_Factory> fancyMessageSenderProvider;
      private Provider<HelpCommand_Factory> helpCommandProvider;
      private Provider<DatabaseUpdater_Factory> databaseUpdaterProvider;
      private Provider<DatabaseModule_ProvideWriteExecutorFactory> provideWriteExecutorProvider;
      private Provider<DatabaseModule_ProvideSQLDatabaseManagerFactory> provideSQLDatabaseManagerProvider;
      private Provider<SoundPlayer_Factory> soundPlayerProvider;
      private Provider<AchievementMap_Factory> achievementMapProvider;
      private Provider<BookCommand_Factory> bookCommandProvider;
      private Provider<MaterialHelper_Factory> materialHelperProvider;
      private Provider<RewardParser_Factory> rewardParserProvider;
      private Provider<InfoCommand_Factory> infoCommandProvider;
      private Provider<CacheManager_Factory> cacheManagerProvider;
      private Provider<ConfigModule_ProvideDisabledCategoriesFactory> provideDisabledCategoriesProvider;
      private Provider<ConfigModule_ProvidesGuiConfigFactory> providesGuiConfigProvider;
      private Provider<GUIItems_Factory> gUIItemsProvider;
      private Provider<MainGUI_Factory> mainGUIProvider;
      private Provider<CategoryGUI_Factory> categoryGUIProvider;
      private Provider<ListCommand_Factory> listCommandProvider;
      private Provider<StatsCommand_Factory> statsCommandProvider;
      private Provider<PluginLoader> pluginLoaderProvider;
      private Provider setOfReloadableProvider;
      private Provider<ReloadCommand_Factory> reloadCommandProvider;
      private Provider<ToggleCommand_Factory> toggleCommandProvider;
      private Provider<AdvancementManager_Factory> advancementManagerProvider;
      private Provider<GenerateCommand_Factory> generateCommandProvider;
      private Provider<EasterEggCommand_Factory> easterEggCommandProvider;
      private Provider<TopCommand_Factory> topCommandProvider;
      private Provider<WeekCommand_Factory> weekCommandProvider;
      private Provider<MonthCommand_Factory> monthCommandProvider;
      private Provider<GiveCommand_Factory> giveCommandProvider;
      private Provider<ResetCommand_Factory> resetCommandProvider;
      private Provider<CheckCommand_Factory> checkCommandProvider;
      private Provider<DeleteCommand_Factory> deleteCommandProvider;
      private Provider<StatisticIncreaseHandler_Factory> statisticIncreaseHandlerProvider;
      private Provider<AddCommand_Factory> addCommandProvider;
      private Provider<InspectCommand_Factory> inspectCommandProvider;
      private Provider setOfAbstractCommandProvider;
      private Provider<AchieveDistanceRunnable_Factory> achieveDistanceRunnableProvider;
      private Provider<AchievePlayTimeRunnable_Factory> achievePlayTimeRunnableProvider;
      private Provider<AnvilsListener_Factory> anvilsListenerProvider;
      private Provider<ArrowsListener_Factory> arrowsListenerProvider;
      private Provider<BedsListener_Factory> bedsListenerProvider;
      private Provider<BreaksListener_Factory> breaksListenerProvider;
      private Provider<BreedingListener_Factory> breedingListenerProvider;
      private Provider<BrewingListener_Factory> brewingListenerProvider;
      private Provider<ConnectionsListener_Factory> connectionsListenerProvider;
      private Provider<ConsumedPotionsListener_Factory> consumedPotionsListenerProvider;
      private Provider<CraftsListener_Factory> craftsListenerProvider;
      private Provider<DeathsListener_Factory> deathsListenerProvider;
      private Provider<DropsListener_Factory> dropsListenerProvider;
      private Provider<EatenItemsListener_Factory> eatenItemsListenerProvider;
      private Provider<EggsListener_Factory> eggsListenerProvider;
      private Provider<EnchantmentsListener_Factory> enchantmentsListenerProvider;
      private Provider<EnderPearlsListener_Factory> enderPearlsListenerProvider;
      private Provider<FertilisingListener_Factory> fertilisingListenerProvider;
      private Provider<FireworksListener_Factory> fireworksListenerProvider;
      private Provider<FishListener_Factory> fishListenerProvider;
      private Provider<HoePlowingListener_Factory> hoePlowingListenerProvider;
      private Provider<ItemBreaksListener_Factory> itemBreaksListenerProvider;
      private Provider<KillsListener_Factory> killsListenerProvider;
      private Provider<LavaBucketsListener_Factory> lavaBucketsListenerProvider;
      private Provider<LevelsListener_Factory> levelsListenerProvider;
      private Provider<MilksListener_Factory> milksListenerProvider;
      private Provider<MusicDiscsListener_Factory> musicDiscsListenerProvider;
      private Provider<PetMasterReceiveListener_Factory> petMasterReceiveListenerProvider;
      private Provider<PetMasterGiveListener_Factory> petMasterGiveListenerProvider;
      private Provider<PickupsListener_Factory> pickupsListenerProvider;
      private Provider<PlacesListener_Factory> placesListenerProvider;
      private Provider<PlayerAdvancedAchievementListener_Factory> playerAdvancedAchievementListenerProvider;
      private Provider<PlayerCommandsListener_Factory> playerCommandsListenerProvider;
      private Provider<PluginCommandExecutor_Factory> pluginCommandExecutorProvider;
      private Provider<ShearsListener_Factory> shearsListenerProvider;
      private Provider<SmeltingListener_Factory> smeltingListenerProvider;
      private Provider<SnowballsListener_Factory> snowballsListenerProvider;
      private Provider<TamesListener_Factory> tamesListenerProvider;
      private Provider<TargetsShotListener_Factory> targetsShotListenerProvider;
      private Provider<TradesListener_Factory> tradesListenerProvider;
      private Provider<TreasuresListener_Factory> treasuresListenerProvider;
      private Provider<WaterBucketsListener_Factory> waterBucketsListenerProvider;
      private Provider<WinRaidListener_Factory> winRaidListenerProvider;
      private Provider<RiptidesListener_Factory> riptidesListenerProvider;
      private Provider<AdvancementsCompletedListener_Factory> advancementsCompletedListenerProvider;
      private Provider<JobsRebornListener_Factory> jobsRebornListenerProvider;
      private Provider<BooksEditedListener_Factory> booksEditedListenerProvider;
      private Provider<EffectsHeldListener_Factory> effectsHeldListenerProvider;
      private Provider<JoinListener_Factory> joinListenerProvider;
      private Provider<ListGUIListener_Factory> listGUIListenerProvider;
      private Provider<TeleportListener_Factory> teleportListenerProvider;
      private Provider setOfCleanableProvider;
      private Provider<Cleaner_Factory> cleanerProvider;
      private Provider<AchievementPlaceholderHook_Factory> achievementPlaceholderHookProvider;
      private Provider<AsyncCachedRequestsSender_Factory> asyncCachedRequestsSenderProvider;
      private Provider<CommandTabCompleter_Factory> commandTabCompleterProvider;
      private Provider<YamlUpdater_Factory> yamlUpdaterProvider;
      private Provider<ConfigurationParser_Factory> configurationParserProvider;
      private Provider<AdvancedAchievementsBukkitAPI> advancedAchievementsBukkitAPIProvider;

      private DaggerAdvancedAchievementsComponent(ConfigModule var1, DatabaseModule var2, ServerVersionModule var3, AdvancedAchievements var4, Logger var5) {
            this.advancedAchievementsComponent = this;
            this.initialize(var1, var2, var3, var4, var5);
            this.initialize2(var1, var2, var3, var4, var5);
      }

      public static AdvancedAchievementsComponent.Builder builder() {
            return new Builder();
      }

      private void initialize(ConfigModule var1, DatabaseModule var2, ServerVersionModule var3, AdvancedAchievements var4, Logger var5) {
            this.advancedAchievementsProvider = InstanceFactory.create(var4);
            this.loggerProvider = InstanceFactory.create(var5);
            this.providesMainConfigProvider = DoubleCheck.provider(ConfigModule_ProvidesMainConfigFactory.create(var1));
            this.providesLangConfigProvider = DoubleCheck.provider(ConfigModule_ProvidesLangConfigFactory.create(var1));
            this.providePluginHeaderProvider = DoubleCheck.provider(ConfigModule_ProvidePluginHeaderFactory.create(var1));
            this.provideServerVersionProvider = DoubleCheck.provider(ServerVersionModule_ProvideServerVersionFactory.create(var3));
            this.fancyMessageSenderProvider = DoubleCheck.provider(FancyMessageSender_Factory.create(this.provideServerVersionProvider));
            this.helpCommandProvider = DoubleCheck.provider(HelpCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.fancyMessageSenderProvider));
            this.databaseUpdaterProvider = DoubleCheck.provider(DatabaseUpdater_Factory.create(this.loggerProvider));
            this.provideWriteExecutorProvider = DoubleCheck.provider(DatabaseModule_ProvideWriteExecutorFactory.create(var2));
            this.provideSQLDatabaseManagerProvider = DoubleCheck.provider(DatabaseModule_ProvideSQLDatabaseManagerFactory.create(var2, this.providesMainConfigProvider, this.loggerProvider, this.databaseUpdaterProvider, this.advancedAchievementsProvider, this.provideWriteExecutorProvider));
            this.soundPlayerProvider = DoubleCheck.provider(SoundPlayer_Factory.create(this.loggerProvider));
            this.achievementMapProvider = DoubleCheck.provider(AchievementMap_Factory.create());
            this.bookCommandProvider = DoubleCheck.provider(BookCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.loggerProvider, this.provideServerVersionProvider, this.provideSQLDatabaseManagerProvider, this.soundPlayerProvider, this.achievementMapProvider));
            this.materialHelperProvider = DoubleCheck.provider(MaterialHelper_Factory.create(this.loggerProvider));
            this.rewardParserProvider = DoubleCheck.provider(RewardParser_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.advancedAchievementsProvider, this.materialHelperProvider));
            this.infoCommandProvider = DoubleCheck.provider(InfoCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.advancedAchievementsProvider, this.rewardParserProvider));
            this.cacheManagerProvider = DoubleCheck.provider(CacheManager_Factory.create(this.advancedAchievementsProvider, this.provideSQLDatabaseManagerProvider));
            this.provideDisabledCategoriesProvider = DoubleCheck.provider(ConfigModule_ProvideDisabledCategoriesFactory.create(var1));
            this.providesGuiConfigProvider = DoubleCheck.provider(ConfigModule_ProvidesGuiConfigFactory.create(var1));
            this.gUIItemsProvider = DoubleCheck.provider(GUIItems_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providesGuiConfigProvider, this.materialHelperProvider));
            this.mainGUIProvider = DoubleCheck.provider(MainGUI_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.cacheManagerProvider, this.provideDisabledCategoriesProvider, this.gUIItemsProvider, this.achievementMapProvider));
            this.categoryGUIProvider = DoubleCheck.provider(CategoryGUI_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.cacheManagerProvider, this.provideSQLDatabaseManagerProvider, this.gUIItemsProvider, this.achievementMapProvider));
            this.listCommandProvider = DoubleCheck.provider(ListCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.mainGUIProvider, this.categoryGUIProvider, this.gUIItemsProvider));
            this.statsCommandProvider = DoubleCheck.provider(StatsCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.cacheManagerProvider, this.achievementMapProvider, this.soundPlayerProvider));
            this.pluginLoaderProvider = new DelegateFactory<>();
            this.setOfReloadableProvider = new DelegateFactory();
            this.reloadCommandProvider = DoubleCheck.provider(ReloadCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.advancedAchievementsProvider, this.loggerProvider, this.pluginLoaderProvider, this.setOfReloadableProvider));
            this.toggleCommandProvider = DoubleCheck.provider(ToggleCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider));
            this.advancementManagerProvider = DoubleCheck.provider(AdvancementManager_Factory.create(this.providesMainConfigProvider, this.gUIItemsProvider, this.achievementMapProvider, this.advancedAchievementsProvider, this.loggerProvider, this.provideDisabledCategoriesProvider));
            this.generateCommandProvider = DoubleCheck.provider(GenerateCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.advancementManagerProvider));
            this.easterEggCommandProvider = DoubleCheck.provider(EasterEggCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider));
            this.topCommandProvider = DoubleCheck.provider(TopCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.loggerProvider, this.provideSQLDatabaseManagerProvider, this.soundPlayerProvider));
            this.weekCommandProvider = DoubleCheck.provider(WeekCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.loggerProvider, this.provideSQLDatabaseManagerProvider, this.soundPlayerProvider));
            this.monthCommandProvider = DoubleCheck.provider(MonthCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.loggerProvider, this.provideSQLDatabaseManagerProvider, this.soundPlayerProvider));
            this.giveCommandProvider = DoubleCheck.provider(GiveCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.cacheManagerProvider, this.achievementMapProvider));
            this.resetCommandProvider = DoubleCheck.provider(ResetCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.cacheManagerProvider, this.achievementMapProvider));
            this.checkCommandProvider = DoubleCheck.provider(CheckCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.cacheManagerProvider));
            this.deleteCommandProvider = DoubleCheck.provider(DeleteCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.cacheManagerProvider, this.provideSQLDatabaseManagerProvider, this.achievementMapProvider));
            this.statisticIncreaseHandlerProvider = DoubleCheck.provider(StatisticIncreaseHandler_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.addCommandProvider = DoubleCheck.provider(AddCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.provideSQLDatabaseManagerProvider, this.cacheManagerProvider, this.statisticIncreaseHandlerProvider, this.achievementMapProvider));
            this.inspectCommandProvider = DoubleCheck.provider(InspectCommand_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providePluginHeaderProvider, this.advancedAchievementsProvider, this.provideSQLDatabaseManagerProvider, this.achievementMapProvider));
            this.setOfAbstractCommandProvider = SetFactory.builder(18, 0).addProvider(this.helpCommandProvider).addProvider(this.bookCommandProvider).addProvider(this.infoCommandProvider).addProvider(this.listCommandProvider).addProvider(this.statsCommandProvider).addProvider(this.reloadCommandProvider).addProvider(this.toggleCommandProvider).addProvider(this.generateCommandProvider).addProvider(this.easterEggCommandProvider).addProvider(this.topCommandProvider).addProvider(this.weekCommandProvider).addProvider(this.monthCommandProvider).addProvider(this.giveCommandProvider).addProvider(this.resetCommandProvider).addProvider(this.checkCommandProvider).addProvider(this.deleteCommandProvider).addProvider(this.addCommandProvider).addProvider(this.inspectCommandProvider).build();
            this.achieveDistanceRunnableProvider = DoubleCheck.provider(AchieveDistanceRunnable_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider, this.provideDisabledCategoriesProvider));
            this.achievePlayTimeRunnableProvider = DoubleCheck.provider(AchievePlayTimeRunnable_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.anvilsListenerProvider = DoubleCheck.provider(AnvilsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.arrowsListenerProvider = DoubleCheck.provider(ArrowsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.bedsListenerProvider = DoubleCheck.provider(BedsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider, this.advancedAchievementsProvider, this.providesLangConfigProvider));
            this.breaksListenerProvider = DoubleCheck.provider(BreaksListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.breedingListenerProvider = DoubleCheck.provider(BreedingListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.brewingListenerProvider = DoubleCheck.provider(BrewingListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider, this.advancedAchievementsProvider, this.providesLangConfigProvider, this.materialHelperProvider));
            this.connectionsListenerProvider = DoubleCheck.provider(ConnectionsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider, this.advancedAchievementsProvider, this.provideSQLDatabaseManagerProvider));
            this.consumedPotionsListenerProvider = DoubleCheck.provider(ConsumedPotionsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider, this.materialHelperProvider));
            this.craftsListenerProvider = DoubleCheck.provider(CraftsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.deathsListenerProvider = DoubleCheck.provider(DeathsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.dropsListenerProvider = DoubleCheck.provider(DropsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.eatenItemsListenerProvider = DoubleCheck.provider(EatenItemsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.eggsListenerProvider = DoubleCheck.provider(EggsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.enchantmentsListenerProvider = DoubleCheck.provider(EnchantmentsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.enderPearlsListenerProvider = DoubleCheck.provider(EnderPearlsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.fertilisingListenerProvider = DoubleCheck.provider(FertilisingListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.fireworksListenerProvider = DoubleCheck.provider(FireworksListener_Factory.create(this.providesMainConfigProvider, this.provideServerVersionProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.fishListenerProvider = DoubleCheck.provider(FishListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.hoePlowingListenerProvider = DoubleCheck.provider(HoePlowingListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.itemBreaksListenerProvider = DoubleCheck.provider(ItemBreaksListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.killsListenerProvider = DoubleCheck.provider(KillsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.lavaBucketsListenerProvider = DoubleCheck.provider(LavaBucketsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider, this.advancedAchievementsProvider, this.providesLangConfigProvider));
            this.levelsListenerProvider = DoubleCheck.provider(LevelsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.milksListenerProvider = DoubleCheck.provider(MilksListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider, this.advancedAchievementsProvider, this.providesLangConfigProvider));
            this.musicDiscsListenerProvider = DoubleCheck.provider(MusicDiscsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider, this.advancedAchievementsProvider, this.providesLangConfigProvider));
            this.petMasterReceiveListenerProvider = DoubleCheck.provider(PetMasterReceiveListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.petMasterGiveListenerProvider = DoubleCheck.provider(PetMasterGiveListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.pickupsListenerProvider = DoubleCheck.provider(PickupsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.placesListenerProvider = DoubleCheck.provider(PlacesListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.playerAdvancedAchievementListenerProvider = DoubleCheck.provider(PlayerAdvancedAchievementListener_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.loggerProvider, this.providePluginHeaderProvider, this.cacheManagerProvider, this.advancedAchievementsProvider, this.rewardParserProvider, this.achievementMapProvider, this.provideSQLDatabaseManagerProvider, this.toggleCommandProvider, this.fancyMessageSenderProvider));
            this.playerCommandsListenerProvider = DoubleCheck.provider(PlayerCommandsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.pluginCommandExecutorProvider = DoubleCheck.provider(PluginCommandExecutor_Factory.create(this.providesLangConfigProvider, this.setOfAbstractCommandProvider, this.providePluginHeaderProvider));
            this.shearsListenerProvider = DoubleCheck.provider(ShearsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.smeltingListenerProvider = DoubleCheck.provider(SmeltingListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.snowballsListenerProvider = DoubleCheck.provider(SnowballsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.tamesListenerProvider = DoubleCheck.provider(TamesListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.targetsShotListenerProvider = DoubleCheck.provider(TargetsShotListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.tradesListenerProvider = DoubleCheck.provider(TradesListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.treasuresListenerProvider = DoubleCheck.provider(TreasuresListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.waterBucketsListenerProvider = DoubleCheck.provider(WaterBucketsListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider, this.advancedAchievementsProvider, this.providesLangConfigProvider));
            this.winRaidListenerProvider = DoubleCheck.provider(WinRaidListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.riptidesListenerProvider = DoubleCheck.provider(RiptidesListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.advancementsCompletedListenerProvider = DoubleCheck.provider(AdvancementsCompletedListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.jobsRebornListenerProvider = DoubleCheck.provider(JobsRebornListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            this.booksEditedListenerProvider = DoubleCheck.provider(BooksEditedListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider, this.advancedAchievementsProvider, this.providesLangConfigProvider));
            this.effectsHeldListenerProvider = DoubleCheck.provider(EffectsHeldListener_Factory.create(this.providesMainConfigProvider, this.achievementMapProvider, this.cacheManagerProvider));
            DelegateFactory.setDelegate(
                    this.setOfReloadableProvider,
                    SetFactory.builder(54, 1)
                            .addCollectionProvider(this.setOfAbstractCommandProvider)
                            .addProvider(this.provideSQLDatabaseManagerProvider)
                            .addProvider(this.achieveDistanceRunnableProvider)
                            .addProvider(this.achievePlayTimeRunnableProvider)
                            .addProvider(this.advancementManagerProvider)
                            .addProvider(this.anvilsListenerProvider)
                            .addProvider(this.arrowsListenerProvider)
                            .addProvider(this.bedsListenerProvider)
                            .addProvider(this.breaksListenerProvider)
                            .addProvider(this.breedingListenerProvider)
                            .addProvider(this.brewingListenerProvider)
                            .addProvider(this.categoryGUIProvider)
                            .addProvider(this.connectionsListenerProvider)
                            .addProvider(this.consumedPotionsListenerProvider)
                            .addProvider(this.craftsListenerProvider)
                            .addProvider(this.deathsListenerProvider)
                            .addProvider(this.dropsListenerProvider)
                            .addProvider(this.eatenItemsListenerProvider)
                            .addProvider(this.eggsListenerProvider)
                            .addProvider(this.enchantmentsListenerProvider)
                            .addProvider(this.enderPearlsListenerProvider)
                            .addProvider(this.fertilisingListenerProvider)
                            .addProvider(this.fireworksListenerProvider)
                            .addProvider(this.fishListenerProvider)
                            .addProvider(this.gUIItemsProvider)
                            .addProvider(this.hoePlowingListenerProvider)
                            .addProvider(this.itemBreaksListenerProvider)
                            .addProvider(this.killsListenerProvider)
                            .addProvider(this.lavaBucketsListenerProvider)
                            .addProvider(this.levelsListenerProvider)
                            .addProvider(this.mainGUIProvider)
                            .addProvider(this.milksListenerProvider)
                            .addProvider(this.musicDiscsListenerProvider)
                            .addProvider(this.petMasterReceiveListenerProvider)
                            .addProvider(this.petMasterGiveListenerProvider)
                            .addProvider(this.pickupsListenerProvider)
                            .addProvider(this.placesListenerProvider)
                            .addProvider(this.playerAdvancedAchievementListenerProvider)
                            .addProvider(this.playerCommandsListenerProvider)
                            .addProvider(this.pluginCommandExecutorProvider)
                            .addProvider(this.shearsListenerProvider)
                            .addProvider(this.smeltingListenerProvider)
                            .addProvider(this.snowballsListenerProvider)
                            .addProvider(this.statisticIncreaseHandlerProvider)
                            .addProvider(this.tamesListenerProvider)
                            .addProvider(this.targetsShotListenerProvider)
                            .addProvider(this.tradesListenerProvider)
                            .addProvider(this.treasuresListenerProvider)
                            .addProvider(this.waterBucketsListenerProvider)
                            .addProvider(this.winRaidListenerProvider)
                            .addProvider(this.riptidesListenerProvider)
                            .addProvider(this.advancementsCompletedListenerProvider)
                            .addProvider(this.jobsRebornListenerProvider)
                            .addProvider(this.booksEditedListenerProvider)
                            .addProvider(this.effectsHeldListenerProvider)
                            .build()
            );
            this.joinListenerProvider = DoubleCheck.provider(JoinListener_Factory.create(this.advancedAchievementsProvider, this.cacheManagerProvider));
            this.listGUIListenerProvider = ListGUIListener_Factory.create(this.providesMainConfigProvider, this.provideDisabledCategoriesProvider, this.mainGUIProvider, this.categoryGUIProvider, this.gUIItemsProvider);
            this.teleportListenerProvider = TeleportListener_Factory.create(this.achieveDistanceRunnableProvider);
            this.setOfCleanableProvider = SetFactory.builder(10, 0).addProvider(this.achieveDistanceRunnableProvider).addProvider(this.bedsListenerProvider).addProvider(this.brewingListenerProvider).addProvider(this.bookCommandProvider).addProvider(this.cacheManagerProvider).addProvider(this.lavaBucketsListenerProvider).addProvider(this.milksListenerProvider).addProvider(this.musicDiscsListenerProvider).addProvider(this.waterBucketsListenerProvider).addProvider(this.booksEditedListenerProvider).build();
            this.cleanerProvider = Cleaner_Factory.create(this.setOfCleanableProvider);
            this.achievementPlaceholderHookProvider = AchievementPlaceholderHook_Factory.create(this.advancedAchievementsProvider, this.cacheManagerProvider, this.achievementMapProvider);
            this.asyncCachedRequestsSenderProvider = AsyncCachedRequestsSender_Factory.create(this.loggerProvider, this.cacheManagerProvider, this.provideSQLDatabaseManagerProvider);
            this.commandTabCompleterProvider = CommandTabCompleter_Factory.create(this.achievementMapProvider, this.setOfAbstractCommandProvider);
      }

      private void initialize2(ConfigModule var1, DatabaseModule var2, ServerVersionModule var3, AdvancedAchievements var4, Logger var5) {
            this.yamlUpdaterProvider = YamlUpdater_Factory.create(this.advancedAchievementsProvider);
            this.configurationParserProvider = ConfigurationParser_Factory.create(this.providesMainConfigProvider, this.providesLangConfigProvider, this.providesGuiConfigProvider, this.achievementMapProvider, this.provideDisabledCategoriesProvider, this.providePluginHeaderProvider, this.loggerProvider, this.provideServerVersionProvider, this.yamlUpdaterProvider, this.advancedAchievementsProvider, this.rewardParserProvider);
            DelegateFactory.setDelegate(this.pluginLoaderProvider, DoubleCheck.provider(PluginLoader_Factory.create(this.advancedAchievementsProvider, this.loggerProvider, this.setOfReloadableProvider, this.joinListenerProvider, this.listGUIListenerProvider, this.teleportListenerProvider, this.playerAdvancedAchievementListenerProvider, this.cleanerProvider, this.achievementPlaceholderHookProvider, this.provideSQLDatabaseManagerProvider, this.asyncCachedRequestsSenderProvider, this.pluginCommandExecutorProvider, this.commandTabCompleterProvider, this.provideDisabledCategoriesProvider, this.providesMainConfigProvider, this.configurationParserProvider, this.achieveDistanceRunnableProvider, this.achievePlayTimeRunnableProvider, this.reloadCommandProvider, this.achievementMapProvider)));
            this.advancedAchievementsBukkitAPIProvider = DoubleCheck.provider(AdvancedAchievementsBukkitAPI_Factory.create(this.advancedAchievementsProvider, this.cacheManagerProvider, this.provideSQLDatabaseManagerProvider, this.statisticIncreaseHandlerProvider, this.achievementMapProvider));
      }

      public PluginLoader pluginLoader() {
            return (PluginLoader)this.pluginLoaderProvider.get();
      }

      public AdvancedAchievementsBukkitAPI advancedAchievementsBukkitAPI() {
            return (AdvancedAchievementsBukkitAPI)this.advancedAchievementsBukkitAPIProvider.get();
      }

      // $FF: synthetic method
      DaggerAdvancedAchievementsComponent(ConfigModule var1, DatabaseModule var2, ServerVersionModule var3, AdvancedAchievements var4, Logger var5, Object var6) {
            this(var1, var2, var3, var4, var5);
      }

      private static final class Builder implements AdvancedAchievementsComponent.Builder {
            private AdvancedAchievements advancedAchievements;
            private Logger logger;

            private Builder() {
            }

            public Builder advancedAchievements(AdvancedAchievements var1) {
                  this.advancedAchievements = Preconditions.checkNotNull(var1);
                  return this;
            }

            public Builder logger(Logger var1) {
                  this.logger = Preconditions.checkNotNull(var1);
                  return this;
            }

            public AdvancedAchievementsComponent build() {
                  Preconditions.checkBuilderRequirement(this.advancedAchievements, AdvancedAchievements.class);
                  Preconditions.checkBuilderRequirement(this.logger, Logger.class);
                  return new DaggerAdvancedAchievementsComponent(new ConfigModule(), new DatabaseModule(), new ServerVersionModule(), this.advancedAchievements, this.logger);
            }

            // $FF: synthetic method
            Builder(Object var1) {
                  this();
            }
      }
}
