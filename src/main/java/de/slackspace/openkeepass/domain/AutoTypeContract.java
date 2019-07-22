package de.slackspace.openkeepass.domain;

import java.util.List;

public interface AutoTypeContract {

    Boolean isEnabled();

    int getDataTransferObfuscation();

    String getDefaultSequence();

    List<AutoTypeAssociation> getAssociations();
}
