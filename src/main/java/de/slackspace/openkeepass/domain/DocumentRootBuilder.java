package de.slackspace.openkeepass.domain;

import java.util.ArrayList;
import java.util.List;

public class DocumentRootBuilder implements DocumentRootContract {

    public final static String DEFAULT_ROOT_GROUP_NAME = "Root";

    private GroupBuilder rootGroupBuilder;

    private List<DeletedObject> deletedObjects = new ArrayList<DeletedObject>();

    public DocumentRootBuilder() {
        rootGroupBuilder = new GroupBuilder(DEFAULT_ROOT_GROUP_NAME);
    }

    public DocumentRootBuilder(DocumentRoot documentRoot) {
        this.rootGroupBuilder = new GroupBuilder(documentRoot.getRootGroup());
        this.deletedObjects = documentRoot.getDeletedObjects();
    }

    public DocumentRootBuilder rootGroup(Group rootGroup) {
        this.rootGroupBuilder = new GroupBuilder(rootGroup);
        return this;
    }

    public DocumentRootBuilder addDeletedObjects(List<DeletedObject> deletedObjects) {
        this.deletedObjects.addAll(deletedObjects);
        return this;
    }

    public DocumentRootBuilder addTopGroups(Group... groups) {
        for (Group group : groups) {
            rootGroupBuilder.addGroup(group);
        }

        return this;
    }

    public DocumentRootBuilder addTopEntries(Entry... entries) {
        for (Entry entry : entries) {
            rootGroupBuilder.addEntry(entry);
        }

        return this;
    }

    public DocumentRoot build() {
        return new DocumentRoot(this);
    }

    @Override
    public Group getRootGroup() {
        return rootGroupBuilder.build();
    }

    @Override
    public List<DeletedObject> getDeletedObjects() {
        return deletedObjects;
    }
}
