package de.slackspace.openkeepass.domain;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "AutoType")
@Order(elements = {"Enabled", "DataTransferObfuscation", "Association"})
public class AutoType {

    @Element(name = "Enabled", required = false)
    private Boolean isEnabled;

    @Element(name = "DataTransferObfuscation", required = false)
    private int dataTransferObfuscation;

    @Element(name = "Association", required = false)
    private AutoTypeAssociation association;

    AutoType() {}

    public AutoType(AutoTypeContract autoTypeContract) {
        isEnabled = autoTypeContract.isEnabled();
        dataTransferObfuscation = autoTypeContract.getDataTransferObfuscation();
        association = autoTypeContract.getAssociation();
    }

    public Boolean isEnabled() {
        return isEnabled;
    }

    public int getDataTransferObfuscation() {
        return dataTransferObfuscation;
    }

    public AutoTypeAssociation getAssociation() {
        return association;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AutoType)) return false;

        AutoType autoType = (AutoType) o;

        if (dataTransferObfuscation != autoType.dataTransferObfuscation) return false;
        if (isEnabled != null ? !isEnabled.equals(autoType.isEnabled) : autoType.isEnabled != null)
            return false;
        return association != null ? association.equals(autoType.association) : autoType.association == null;
    }

    @Override
    public final int hashCode() {
        int result = isEnabled != null ? isEnabled.hashCode() : 0;
        result = 31 * result + dataTransferObfuscation;
        result = 31 * result + (association != null ? association.hashCode() : 0);
        return result;
    }
}
