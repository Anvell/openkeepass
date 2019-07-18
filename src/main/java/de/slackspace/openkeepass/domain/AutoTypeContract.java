package de.slackspace.openkeepass.domain;

public interface AutoTypeContract {

    Boolean isEnabled();

    int getDataTransferObfuscation();

    AutoTypeAssociation getAssociation();
}
