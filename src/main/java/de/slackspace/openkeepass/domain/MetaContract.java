package de.slackspace.openkeepass.domain;

import java.util.Calendar;
import java.util.UUID;

public interface MetaContract {

    String getGenerator();

    String getDatabaseName();

    String getDatabaseDescription();

    Calendar getDatabaseNameChanged();

    Calendar getDatabaseDescriptionChanged();

    String getDefaultUserName();

    Calendar getDefaultUserNameChanged();

    int getMaintenanceHistoryDays();

    String getColor();

    Calendar getMasterKeyChanged();

    Integer getMasterKeyChangeRec();

    Integer getMasterKeyChangeForce();

    UUID getRecycleBinUuid();

    Calendar getRecycleBinChanged();

    boolean getRecycleBinEnabled();

    UUID getEntryTemplatesGroup();

    Calendar getEntryTemplatesGroupChanged();

    UUID getLastSelectedGroup();

    UUID getLastTopVisibleGroup();

    long getHistoryMaxItems();

    long getHistoryMaxSize();

    CustomIcons getCustomIcons();

    Binaries getBinaries();
}
