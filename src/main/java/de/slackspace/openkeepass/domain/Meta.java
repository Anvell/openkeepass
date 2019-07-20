package de.slackspace.openkeepass.domain;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

/**
 * Represents the metadata of the KeePass database like database name, custom
 * icons or how much history entries will be preserved.
 *
 */
@Root(strict = false)
public class Meta {

    @Element(name = "Generator", required = false)
    private String generator;

    @Element(name = "DatabaseName", required = false)
    private String databaseName;

    @Element(name = "DatabaseDescription", required = false)
    private String databaseDescription;

    @Element(name = "DatabaseNameChanged", type = GregorianCalendar.class, required = false)
    private Calendar databaseNameChanged;

    @Element(name = "DatabaseDescriptionChanged", type = GregorianCalendar.class, required = false)
    private Calendar databaseDescriptionChanged;

    @Element(name = "DefaultUserName", required = false)
    private String defaultUserName;

    @Element(name = "DefaultUserNameChanged", type = GregorianCalendar.class, required = false)
    private Calendar defaultUserNameChanged;

    @Element(name = "MaintenanceHistoryDays", required = false)
    private int maintenanceHistoryDays;

    @Element(name = "Color", required = false)
    private String color;

    @Element(name = "MasterKeyChanged", type = GregorianCalendar.class, required = false)
    private Calendar masterKeyChanged;

    @Element(name = "MasterKeyChangeRec", required = false)
    private Integer masterKeyChangeRec;

    @Element(name = "MasterKeyChangeForce", required = false)
    private Integer masterKeyChangeForce;

    @Element(name = "RecycleBinUUID", required = false)
    private UUID recycleBinUuid;

    @Element(name = "RecycleBinChanged", type = GregorianCalendar.class, required = false)
    private Calendar recycleBinChanged;

    @Element(name = "RecycleBinEnabled", required = false)
    private Boolean recycleBinEnabled;

    @Element(name = "EntryTemplatesGroup", required = false)
    private UUID entryTemplatesGroup;

    @Element(name = "EntryTemplatesGroupChanged", type = GregorianCalendar.class, required = false)
    private Calendar entryTemplatesGroupChanged;

    @Element(name = "LastSelectedGroup", required = false)
    private UUID lastSelectedGroup;

    @Element(name = "LastTopVisibleGroup", required = false)
    private UUID lastTopVisibleGroup;

    @Element(name = "HistoryMaxItems", required = false)
    private long historyMaxItems;

    @Element(name = "HistoryMaxSize", required = false)
    private long historyMaxSize;

    @Element(name = "CustomIcons", required = false)
    private CustomIcons customIcons;

    @Element(name = "Binaries", required = false)
    private Binaries binaries;

    Meta() {
    }

    public Meta(MetaContract metaContract) {
        this.databaseDescription = metaContract.getDatabaseDescription();
        this.databaseDescriptionChanged = metaContract.getDatabaseDescriptionChanged();
        this.databaseName = metaContract.getDatabaseName();
        this.databaseNameChanged = metaContract.getDatabaseNameChanged();
        this.defaultUserName = metaContract.getDefaultUserName();
        this.defaultUserNameChanged = metaContract.getDefaultUserNameChanged();
        this.color = metaContract.getColor();
        this.masterKeyChanged = metaContract.getMasterKeyChanged();
        this.masterKeyChangeRec = metaContract.getMasterKeyChangeRec();
        this.masterKeyChangeForce = metaContract.getMasterKeyChangeForce();
        this.generator = metaContract.getGenerator();
        this.historyMaxItems = metaContract.getHistoryMaxItems();
        this.historyMaxSize = metaContract.getHistoryMaxSize();
        this.maintenanceHistoryDays = metaContract.getMaintenanceHistoryDays();
        this.recycleBinChanged = metaContract.getRecycleBinChanged();
        this.recycleBinEnabled = metaContract.getRecycleBinEnabled();
        this.recycleBinUuid = metaContract.getRecycleBinUuid();
        this.entryTemplatesGroup = metaContract.getEntryTemplatesGroup();
        this.entryTemplatesGroupChanged = metaContract.getEntryTemplatesGroupChanged();
        this.lastSelectedGroup = metaContract.getLastSelectedGroup();
        this.lastTopVisibleGroup = metaContract.getLastTopVisibleGroup();
        this.customIcons = metaContract.getCustomIcons();
        this.binaries = metaContract.getBinaries();
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getDatabaseDescription() {
        return databaseDescription;
    }

    public String getGenerator() {
        return generator;
    }

    public Calendar getDatabaseNameChanged() {
        return databaseNameChanged;
    }

    public Calendar getDatabaseDescriptionChanged() {
        return databaseDescriptionChanged;
    }

    public String getDefaultUserName() {
        return defaultUserName;
    }

    public Calendar getDefaultUserNameChanged() {
        return defaultUserNameChanged;
    }

    public int getMaintenanceHistoryDays() {
        return maintenanceHistoryDays;
    }

    public String getColor() {
        return color;
    }

    public Calendar getMasterKeyChanged() {
        return masterKeyChanged;
    }

    public Integer getMasterKeyChangeRec() {
        return masterKeyChangeRec;
    }

    public Integer getMasterKeyChangeForce() {
        return masterKeyChangeForce;
    }

    public UUID getRecycleBinUuid() {
        return recycleBinUuid;
    }

    public Calendar getRecycleBinChanged() {
        return recycleBinChanged;
    }

    public long getHistoryMaxItems() {
        return historyMaxItems;
    }

    public long getHistoryMaxSize() {
        return historyMaxSize;
    }

    public boolean getRecycleBinEnabled() {
        return recycleBinEnabled;
    }

    public UUID getEntryTemplatesGroup() {
        return entryTemplatesGroup;
    }

    public Calendar getEntryTemplatesGroupChanged() {
        return entryTemplatesGroupChanged;
    }

    public UUID getLastSelectedGroup() {
        return lastSelectedGroup;
    }

    public UUID getLastTopVisibleGroup() {
        return lastTopVisibleGroup;
    }

    public CustomIcons getCustomIcons() {
        return customIcons;
    }

    public Binaries getBinaries() {
        return binaries;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meta)) return false;

        Meta meta = (Meta) o;

        if (maintenanceHistoryDays != meta.maintenanceHistoryDays) return false;
        if (historyMaxItems != meta.historyMaxItems) return false;
        if (historyMaxSize != meta.historyMaxSize) return false;
        if (generator != null ? !generator.equals(meta.generator) : meta.generator != null)
            return false;
        if (databaseName != null ? !databaseName.equals(meta.databaseName) : meta.databaseName != null)
            return false;
        if (databaseDescription != null ? !databaseDescription.equals(meta.databaseDescription) : meta.databaseDescription != null)
            return false;
        if (databaseNameChanged != null ? !databaseNameChanged.equals(meta.databaseNameChanged) : meta.databaseNameChanged != null)
            return false;
        if (databaseDescriptionChanged != null ? !databaseDescriptionChanged.equals(meta.databaseDescriptionChanged) : meta.databaseDescriptionChanged != null)
            return false;
        if (defaultUserName != null ? !defaultUserName.equals(meta.defaultUserName) : meta.defaultUserName != null)
            return false;
        if (defaultUserNameChanged != null ? !defaultUserNameChanged.equals(meta.defaultUserNameChanged) : meta.defaultUserNameChanged != null)
            return false;
        if (color != null ? !color.equals(meta.color) : meta.color != null) return false;
        if (masterKeyChanged != null ? !masterKeyChanged.equals(meta.masterKeyChanged) : meta.masterKeyChanged != null)
            return false;
        if (masterKeyChangeRec != null ? !masterKeyChangeRec.equals(meta.masterKeyChangeRec) : meta.masterKeyChangeRec != null)
            return false;
        if (masterKeyChangeForce != null ? !masterKeyChangeForce.equals(meta.masterKeyChangeForce) : meta.masterKeyChangeForce != null)
            return false;
        if (recycleBinUuid != null ? !recycleBinUuid.equals(meta.recycleBinUuid) : meta.recycleBinUuid != null)
            return false;
        if (recycleBinChanged != null ? !recycleBinChanged.equals(meta.recycleBinChanged) : meta.recycleBinChanged != null)
            return false;
        if (recycleBinEnabled != null ? !recycleBinEnabled.equals(meta.recycleBinEnabled) : meta.recycleBinEnabled != null)
            return false;
        if (entryTemplatesGroup != null ? !entryTemplatesGroup.equals(meta.entryTemplatesGroup) : meta.entryTemplatesGroup != null)
            return false;
        if (entryTemplatesGroupChanged != null ? !entryTemplatesGroupChanged.equals(meta.entryTemplatesGroupChanged) : meta.entryTemplatesGroupChanged != null)
            return false;
        if (lastSelectedGroup != null ? !lastSelectedGroup.equals(meta.lastSelectedGroup) : meta.lastSelectedGroup != null)
            return false;
        if (lastTopVisibleGroup != null ? !lastTopVisibleGroup.equals(meta.lastTopVisibleGroup) : meta.lastTopVisibleGroup != null)
            return false;
        if (customIcons != null ? !customIcons.equals(meta.customIcons) : meta.customIcons != null)
            return false;
        return binaries != null ? binaries.equals(meta.binaries) : meta.binaries == null;
    }

    @Override
    public final int hashCode() {
        int result = generator != null ? generator.hashCode() : 0;
        result = 31 * result + (databaseName != null ? databaseName.hashCode() : 0);
        result = 31 * result + (databaseDescription != null ? databaseDescription.hashCode() : 0);
        result = 31 * result + (databaseNameChanged != null ? databaseNameChanged.hashCode() : 0);
        result = 31 * result + (databaseDescriptionChanged != null ? databaseDescriptionChanged.hashCode() : 0);
        result = 31 * result + (defaultUserName != null ? defaultUserName.hashCode() : 0);
        result = 31 * result + (defaultUserNameChanged != null ? defaultUserNameChanged.hashCode() : 0);
        result = 31 * result + maintenanceHistoryDays;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (masterKeyChanged != null ? masterKeyChanged.hashCode() : 0);
        result = 31 * result + (masterKeyChangeRec != null ? masterKeyChangeRec.hashCode() : 0);
        result = 31 * result + (masterKeyChangeForce != null ? masterKeyChangeForce.hashCode() : 0);
        result = 31 * result + (recycleBinUuid != null ? recycleBinUuid.hashCode() : 0);
        result = 31 * result + (recycleBinChanged != null ? recycleBinChanged.hashCode() : 0);
        result = 31 * result + (recycleBinEnabled != null ? recycleBinEnabled.hashCode() : 0);
        result = 31 * result + (entryTemplatesGroup != null ? entryTemplatesGroup.hashCode() : 0);
        result = 31 * result + (entryTemplatesGroupChanged != null ? entryTemplatesGroupChanged.hashCode() : 0);
        result = 31 * result + (lastSelectedGroup != null ? lastSelectedGroup.hashCode() : 0);
        result = 31 * result + (lastTopVisibleGroup != null ? lastTopVisibleGroup.hashCode() : 0);
        result = 31 * result + (int) (historyMaxItems ^ (historyMaxItems >>> 32));
        result = 31 * result + (int) (historyMaxSize ^ (historyMaxSize >>> 32));
        result = 31 * result + (customIcons != null ? customIcons.hashCode() : 0);
        result = 31 * result + (binaries != null ? binaries.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Meta [generator=" + generator + ", databaseName=" + databaseName + ", databaseDescription=" + databaseDescription + "]";
    }
}
