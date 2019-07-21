package de.slackspace.openkeepass.domain;

import java.util.List;
import java.util.UUID;

public interface GroupContract {

    UUID getUuid();

    String getName();

    String getNotes();

    int getIconId();

    Times getTimes();

    boolean isExpanded();

    String getDefaultAutoTypeSequence();

    Boolean isEnableAutoType();

    Boolean isEnableSearching();

    UUID getLastTopVisibleEntry();

    byte[] getIconData();

    UUID getCustomIconUuid();

    List<Entry> getEntries();

    List<Group> getGroups();
}
