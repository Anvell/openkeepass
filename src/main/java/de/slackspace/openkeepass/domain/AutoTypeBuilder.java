package de.slackspace.openkeepass.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoTypeBuilder implements AutoTypeContract {

    private Boolean isEnabled;

    private int dataTransferObfuscation;

    private String defaultSequence;

    private List<AutoTypeAssociation> associations = new ArrayList<AutoTypeAssociation>();

    public AutoTypeBuilder() {}

    public AutoTypeBuilder(AutoType autoType) {
        isEnabled = autoType.isEnabled();
        dataTransferObfuscation = autoType.getDataTransferObfuscation();
        defaultSequence = autoType.getDefaultSequence();
        associations = autoType.getAssociations();
    }

    public AutoTypeBuilder enabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    public AutoTypeBuilder dataTransferObfuscation(int dataTransferObfuscation) {
        this.dataTransferObfuscation = dataTransferObfuscation;
        return this;
    }

    public AutoTypeBuilder defaultSequence(String defaultSequence) {
        this.defaultSequence = defaultSequence;
        return this;
    }

    public AutoTypeBuilder addAssociation(AutoTypeAssociation... associations) {
        this.associations.addAll(Arrays.asList(associations));
        return this;
    }

    public AutoType build() {
        return new AutoType(this);
    }

    @Override
    public Boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public int getDataTransferObfuscation() {
        return dataTransferObfuscation;
    }

    @Override
    public String getDefaultSequence() {
        return defaultSequence;
    }

    @Override
    public List<AutoTypeAssociation> getAssociations() {
        return associations;
    }
}
