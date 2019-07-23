package de.slackspace.openkeepass.domain.xml.adapter;

import org.simpleframework.xml.transform.Transform;

public class BooleanSimpleXmlAdapter implements Transform<Boolean> {

    @Override
    public Boolean read(String value) throws Exception {
        switch (value.toLowerCase()) {
            case "true":
                return true;
            case "false":
                return false;
            default:
                return null;
        }
    }

    @Override
    public String write(Boolean value) throws Exception {
        if(value == null) {
            return "null";
        } else if (value) {
            return "True";
        }
        return "False";
    }

}
