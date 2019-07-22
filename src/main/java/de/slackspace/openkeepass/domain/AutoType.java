package de.slackspace.openkeepass.domain;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(strict = false, name = "AutoType")
@Order(elements = {"Enabled", "DataTransferObfuscation", "DefaultSequence", "Association"})
public class AutoType {

    @Element(name = "Enabled", required = false)
    private Boolean isEnabled;

    @Element(name = "DataTransferObfuscation", required = false)
    private int dataTransferObfuscation;

    @Element(name = "DefaultSequence", required = false)
    private String defaultSequence;

    @ElementList(name = "Association", inline = true, required = false)
    private List<AutoTypeAssociation> associations = new ArrayList<AutoTypeAssociation>();

    AutoType() {}

    public AutoType(AutoTypeContract autoTypeContract) {
        isEnabled = autoTypeContract.isEnabled();
        dataTransferObfuscation = autoTypeContract.getDataTransferObfuscation();
        defaultSequence = autoTypeContract.getDefaultSequence();
        associations = autoTypeContract.getAssociations();
    }

    public Boolean isEnabled() {
        return isEnabled;
    }

    public int getDataTransferObfuscation() {
        return dataTransferObfuscation;
    }

    public String getDefaultSequence() {
        return defaultSequence;
    }

    public List<AutoTypeAssociation> getAssociations() {
        return associations;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoType)) {
            return false;
        }

        AutoType autoType = (AutoType) o;

        if (dataTransferObfuscation != autoType.dataTransferObfuscation) {
            return false;
        }
        if (isEnabled != null ? !isEnabled.equals(autoType.isEnabled) : autoType.isEnabled != null) {
            return false;
        }
        if (defaultSequence != null ? !defaultSequence.equals(autoType.defaultSequence) : autoType.defaultSequence != null) {
            return false;
        }
        return associations != null ? associations.equals(autoType.associations) : autoType.associations == null;
    }

    @Override
    public final int hashCode() {
        int result = isEnabled != null ? isEnabled.hashCode() : 0;
        result = 31 * result + dataTransferObfuscation;
        result = 31 * result + (defaultSequence != null ? defaultSequence.hashCode() : 0);
        result = 31 * result + (associations != null ? associations.hashCode() : 0);
        return result;
    }
}
