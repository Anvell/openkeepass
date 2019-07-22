package de.slackspace.openkeepass.domain;

import java.util.List;

public interface DocumentRootContract {

    Group getRootGroup();

    List<DeletedObject> getDeletedObjects();
}
