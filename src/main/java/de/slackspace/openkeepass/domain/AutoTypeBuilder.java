package de.slackspace.openkeepass.domain;

public class AutoTypeBuilder implements AutoTypeContract {

    private Boolean isEnabled;

    private int dataTransferObfuscation;

    private AutoTypeAssociation association;

    public AutoTypeBuilder() {}

    public AutoTypeBuilder(AutoType autoType) {
        isEnabled = autoType.isEnabled();
        dataTransferObfuscation = autoType.getDataTransferObfuscation();
        association = autoType.getAssociation();
    }

    public AutoTypeBuilder isEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    public AutoTypeBuilder dataTransferObfuscation(int dataTransferObfuscation) {
        this.dataTransferObfuscation = dataTransferObfuscation;
        return this;
    }

    public AutoTypeBuilder association(AutoTypeAssociation association) {
        this.association = association;
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
    public AutoTypeAssociation getAssociation() {
        return association;
    }
}
