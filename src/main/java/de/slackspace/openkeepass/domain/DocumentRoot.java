package de.slackspace.openkeepass.domain;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(strict = false, name = "Root")
public class DocumentRoot implements KeePassFileElement {

    @Element(name = "Group")
    private Group rootGroup;

    @ElementList(name = "DeletedObjects", inline = true, required = false)
    private List<DeletedObject> deletedObjects = new ArrayList<DeletedObject>();

    DocumentRoot() {}

    public DocumentRoot(DocumentRootContract documentRootContract) {
        rootGroup = documentRootContract.getRootGroup();
        deletedObjects = documentRootContract.getDeletedObjects();
    }

    public Group getRootGroup() {
        return rootGroup;
    }

    public List<DeletedObject> getDeletedObjects() {
        return deletedObjects;
    }
}
