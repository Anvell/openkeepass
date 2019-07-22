package de.slackspace.openkeepass.domain;

import java.util.Calendar;
import java.util.UUID;

public class DeletedObjectBuilder implements DeletedObjectContract {

    private UUID uuid;

    private Calendar deletionTime;

    public DeletedObjectBuilder(UUID uuid) {
        this.uuid = uuid;
    }

    public DeletedObjectBuilder(DeletedObject deletedObject) {
        uuid = deletedObject.getUuid();
        deletionTime = deletedObject.getDeletionTime();
    }

    public DeletedObjectBuilder uuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public DeletedObjectBuilder deletionTime(Calendar deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }

    public DeletedObject build() {
        return new DeletedObject(this);
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public Calendar getDeletionTime() {
        return deletionTime;
    }
}
