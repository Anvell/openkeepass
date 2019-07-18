package de.slackspace.openkeepass.domain;

public class AutoTypeAssociationBuilder implements AutoTypeAssociationContract {

    private String windowTitle;

    private String keystrokeSequence;

    public AutoTypeAssociationBuilder() {}

    public AutoTypeAssociationBuilder(AutoTypeAssociation autoTypeAssociation) {
        windowTitle = autoTypeAssociation.getWindowTitle();
        keystrokeSequence = autoTypeAssociation.getKeystrokeSequence();
    }

    public AutoTypeAssociationBuilder windowTitle(String windowTitle) {
        this.windowTitle = windowTitle;
        return this;
    }

    public AutoTypeAssociationBuilder keystrokeSequence(String keystrokeSequence) {
        this.keystrokeSequence = keystrokeSequence;
        return this;
    }

    public AutoTypeAssociation build() {
        return new AutoTypeAssociation(this);
    }

    @Override
    public String getWindowTitle() {
        return windowTitle;
    }

    @Override
    public String getKeystrokeSequence() {
        return keystrokeSequence;
    }
}
