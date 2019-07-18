package de.slackspace.openkeepass.domain;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "Association")
public class AutoTypeAssociation {

    @Element(name = "Window", required = false)
    private String windowTitle;

    @Element(name = "KeystrokeSequence", required = false)
    private String keystrokeSequence;

    AutoTypeAssociation() {}

    public AutoTypeAssociation(AutoTypeAssociationContract autoTypeAssociationContract) {
        windowTitle = autoTypeAssociationContract.getWindowTitle();
        keystrokeSequence = autoTypeAssociationContract.getKeystrokeSequence();
    }

    public String getWindowTitle() {
        return windowTitle;
    }

    public String getKeystrokeSequence() {
        return keystrokeSequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AutoTypeAssociation that = (AutoTypeAssociation) o;

        if (windowTitle != null ? !windowTitle.equals(that.windowTitle) : that.windowTitle != null) {
            return false;
        }
        return keystrokeSequence != null ? keystrokeSequence.equals(that.keystrokeSequence) : that.keystrokeSequence == null;
    }

    @Override
    public int hashCode() {
        int result = windowTitle != null ? windowTitle.hashCode() : 0;
        result = 31 * result + (keystrokeSequence != null ? keystrokeSequence.hashCode() : 0);
        return result;
    }
}
