package de.slackspace.openkeepass.parser;

import java.util.ArrayList;
import java.util.List;

import de.slackspace.openkeepass.util.StringUtils;

public class TagParser {

    private static final String TAG_SEPARATOR = ";";
    private static final String TAG_SPLIT_PATTERN = "\\s*[;,:]\\s*";

    public List<String> fromTagString(String tags) {
        if (tags == null) {
            return new ArrayList<String>();
        }

        String[] splittedTags = tags.split(TAG_SPLIT_PATTERN);

        List<String> result = new ArrayList<String>();

        for (String tag : splittedTags) {
            String trimmedTag = tag.trim();

            if (!trimmedTag.isEmpty()) {
                result.add(trimmedTag);
            }
        }

        return result;
    }

    public String toTagString(List<String> tags) {
        if (tags == null) {
            return null;
        }

        return StringUtils.join(tags, TAG_SEPARATOR);
    }
}
