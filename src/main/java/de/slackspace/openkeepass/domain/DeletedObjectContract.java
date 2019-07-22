package de.slackspace.openkeepass.domain;

import java.util.Calendar;
import java.util.UUID;

public interface DeletedObjectContract {

    UUID getUuid();

    Calendar getDeletionTime();
}
