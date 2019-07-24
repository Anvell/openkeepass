package de.slackspace.openkeepass.domain.xml.adapter;

import org.simpleframework.xml.transform.Transform;

public class BooleanSimpleXmlAdapter implements Transform<Boolean> {

    @Override
    public Boolean read(String value) throws Exception {
        if (value.toLowerCase().equals("true")) {
            return true;
        } else if (value.toLowerCase().equals("false")) {
            return false;
        } else {
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
