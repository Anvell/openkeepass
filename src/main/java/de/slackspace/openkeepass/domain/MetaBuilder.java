package de.slackspace.openkeepass.domain;

import java.util.Calendar;
import java.util.UUID;

/**
 * A builder to create {@link Meta} objects.
 *
 */
public class MetaBuilder implements MetaContract {

    String generator = "KeePass";

    String databaseName;

    String databaseDescription;

    Calendar databaseNameChanged;

    Calendar databaseDescriptionChanged;

    String defaultUserName;

    Calendar defaultUserNameChanged;

    int maintenanceHistoryDays;

    String color;

    Calendar masterKeyChanged;

    Integer masterKeyChangeRec;

    Integer masterKeyChangeForce;

    UUID recycleBinUuid;

    Calendar recycleBinChanged;

    boolean recycleBinEnabled;

    UUID entryTemplatesGroup;

    Calendar entryTemplatesGroupChanged;

    UUID lastSelectedGroup;

    UUID lastTopVisibleGroup;

    long historyMaxItems;

    long historyMaxSize;

    CustomIcons customIcons;

    Binaries binaries;

    /**
     * Creates a new builder with the given database name.
     *
     * @param databaseName
     *            the name which should be used
     */
    public MetaBuilder(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * Initializes the builder with values from the given meta.
     *
     * @param meta
     *            the values from this will initialize the builder
     */
    public MetaBuilder(Meta meta) {
        this.generator = meta.getGenerator();
        this.databaseName = meta.getDatabaseName();
        this.databaseDescription = meta.getDatabaseDescription();
        this.databaseNameChanged = meta.getDatabaseNameChanged();
        this.defaultUserName = meta.getDefaultUserName();
        this.defaultUserNameChanged = meta.getDefaultUserNameChanged();
        this.databaseDescriptionChanged = meta.getDatabaseDescriptionChanged();
        this.color = meta.getColor();
        this.masterKeyChanged = meta.getMasterKeyChanged();
        this.masterKeyChangeRec = meta.getMasterKeyChangeRec();
        this.masterKeyChangeForce = meta.getMasterKeyChangeForce();
        this.maintenanceHistoryDays = meta.getMaintenanceHistoryDays();
        this.recycleBinUuid = meta.getRecycleBinUuid();
        this.recycleBinEnabled = meta.getRecycleBinEnabled();
        this.recycleBinChanged = meta.getRecycleBinChanged();
        this.historyMaxItems = meta.getHistoryMaxItems();
        this.historyMaxSize = meta.getHistoryMaxSize();
        this.entryTemplatesGroup = meta.getEntryTemplatesGroup();
        this.entryTemplatesGroupChanged = meta.getEntryTemplatesGroupChanged();
        this.lastSelectedGroup = meta.getLastSelectedGroup();
        this.lastTopVisibleGroup = meta.getLastTopVisibleGroup();
        this.customIcons = meta.getCustomIcons();
        this.binaries = meta.getBinaries();
    }

    public MetaBuilder databaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    public MetaBuilder generator(String generator) {
        this.generator = generator;
        return this;
    }

    public MetaBuilder databaseDescription(String databaseDescription) {
        this.databaseDescription = databaseDescription;
        return this;
    }

    public MetaBuilder databaseNameChanged(Calendar databaseNameChanged) {
        this.databaseNameChanged = databaseNameChanged;
        return this;
    }

    public MetaBuilder databaseDescriptionChanged(Calendar databaseDescriptionChanged) {
        this.databaseDescriptionChanged = databaseDescriptionChanged;
        return this;
    }

    public MetaBuilder defaultUserName(String defaultUserName) {
        this.defaultUserName = defaultUserName;
        return this;
    }

    public MetaBuilder defaultUserNameChanged(Calendar defaultUserNameChanged) {
        this.defaultUserNameChanged = defaultUserNameChanged;
        return this;
    }

    public MetaBuilder maintenanceHistoryDays(int maintenanceHistoryDays) {
        this.maintenanceHistoryDays = maintenanceHistoryDays;
        return this;
    }

    public MetaBuilder color(String color) {
        this.color = color;
        return this;
    }

    public MetaBuilder masterKeyChanged(Calendar masterKeyChanged) {
        this.masterKeyChanged = masterKeyChanged;
        return this;
    }

    public MetaBuilder masterKeyChangeRec(Integer masterKeyChangeRec) {
        this.masterKeyChangeRec = masterKeyChangeRec;
        return this;
    }

    public MetaBuilder masterKeyChangeForce(Integer masterKeyChangeForce) {
        this.masterKeyChangeForce = masterKeyChangeForce;
        return this;
    }

    public MetaBuilder recycleBinUuid(UUID recycleBinUuid) {
        this.recycleBinUuid = recycleBinUuid;
        return this;
    }

    public MetaBuilder recycleBinChanged(Calendar recycleBinChanged) {
        this.recycleBinChanged = recycleBinChanged;
        return this;
    }

    public MetaBuilder recycleBinEnabled(boolean recycleBinEnabled) {
        this.recycleBinEnabled = recycleBinEnabled;
        return this;
    }

    public MetaBuilder historyMaxItems(long historyMaxItems) {
        this.historyMaxItems = historyMaxItems;
        return this;
    }

    public MetaBuilder historyMaxSize(long historyMaxSize) {
        this.historyMaxSize = historyMaxSize;
        return this;
    }

    public MetaBuilder entryTemplatesGroup(UUID entryTemplatesGroup) {
        this.entryTemplatesGroup = entryTemplatesGroup;
        return this;
    }

    public MetaBuilder entryTemplatesGroupChanged(Calendar entryTemplatesGroupChanged) {
        this.entryTemplatesGroupChanged = entryTemplatesGroupChanged;
        return this;
    }

    public MetaBuilder lastSelectedGroup(UUID lastSelectedGroup) {
        this.lastSelectedGroup = lastSelectedGroup;
        return this;
    }

    public MetaBuilder lastTopVisibleGroup(UUID lastTopVisibleGroup) {
        this.lastTopVisibleGroup = lastTopVisibleGroup;
        return this;
    }

    public MetaBuilder customIcons(CustomIcons customIcons) {
        this.customIcons = customIcons;
        return this;
    }

    public MetaBuilder binaries(Binaries binaries) {
        this.binaries = binaries;
        return this;
    }

    /**
     * Builds a new meta with the values from the builder.
     *
     * @return a new meta object
     */
    public Meta build() {
        return new Meta(this);
    }

    @Override
    public String getGenerator() {
        return generator;
    }

    @Override
    public String getDatabaseName() {
        return databaseName;
    }

    @Override
    public String getDatabaseDescription() {
        return databaseDescription;
    }

    @Override
    public Calendar getDatabaseNameChanged() {
        return databaseNameChanged;
    }

    @Override
    public Calendar getDatabaseDescriptionChanged() {
        return databaseDescriptionChanged;
    }

    @Override
    public String getDefaultUserName() {
        return defaultUserName;
    }

    @Override
    public Calendar getDefaultUserNameChanged() {
        return defaultUserNameChanged;
    }

    @Override
    public int getMaintenanceHistoryDays() {
        return maintenanceHistoryDays;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Calendar getMasterKeyChanged() {
        return masterKeyChanged;
    }

    @Override
    public Integer getMasterKeyChangeRec() {
        return masterKeyChangeRec;
    }

    @Override
    public Integer getMasterKeyChangeForce() {
        return masterKeyChangeForce;
    }

    @Override
    public UUID getRecycleBinUuid() {
        return recycleBinUuid;
    }

    @Override
    public Calendar getRecycleBinChanged() {
        return recycleBinChanged;
    }

    @Override
    public boolean getRecycleBinEnabled() {
        return recycleBinEnabled;
    }

    @Override
    public long getHistoryMaxItems() {
        return historyMaxItems;
    }

    @Override
    public long getHistoryMaxSize() {
        return historyMaxSize;
    }

    @Override
    public UUID getEntryTemplatesGroup() {
        return entryTemplatesGroup;
    }

    @Override
    public Calendar getEntryTemplatesGroupChanged() {
        return entryTemplatesGroupChanged;
    }

    @Override
    public UUID getLastSelectedGroup() {
        return lastSelectedGroup;
    }

    @Override
    public UUID getLastTopVisibleGroup() {
        return lastTopVisibleGroup;
    }

    @Override
    public CustomIcons getCustomIcons() {
        return customIcons;
    }

    @Override
    public Binaries getBinaries() {
        return binaries;
    }

}
