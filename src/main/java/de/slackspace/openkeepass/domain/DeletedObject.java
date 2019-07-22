package de.slackspace.openkeepass.domain;

import org.simpleframework.xml.Element;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

public class DeletedObject {

    @Element(name = "UUID")
    private UUID uuid;

    @Element(name = "DeletionTime", type = GregorianCalendar.class)
    private Calendar deletionTime;

    DeletedObject() {}

    public DeletedObject(DeletedObjectContract deletedObjectContract) {
        uuid = deletedObjectContract.getUuid();
        deletionTime = deletedObjectContract.getDeletionTime();
    }

    public UUID getUuid() {
        return uuid;
    }

    public Calendar getDeletionTime() {
        return deletionTime;
    }
}
