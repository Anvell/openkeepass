package de.slackspace.openkeepass.parser;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TagParserTest {

    @Test
    public void whenTagStringInputIsNullShouldReturnEmptyList() {
        TagParser parser = createParser();
        List<String> tags = parser.fromTagString(null);

        assertThat(tags.size(), is(0));
    }

    @Test
    public void whenTagStringInputIsSeparatedStringShouldReturnTags() {
        TagParser parser = createParser();
        List<String> tags1 = parser.fromTagString("a;b;c");
        List<String> tags2 = parser.fromTagString("a, b, ,c");
        List<String> tags3 = parser.fromTagString(",a:b;c: ");

        assertThat(tags1, hasItems("a", "b", "c"));
        assertThat(tags2, hasItems("a", "b", "c"));
        assertThat(tags3, hasItems("a", "b", "c"));
    }

    @Test
    public void whenTagStringInputIsSimpleStringShouldReturnSingleTag() {
        TagParser parser = createParser();
        List<String> tags = parser.fromTagString("abc");

        assertThat(tags, hasItems("abc"));
    }

    @Test
    public void whenTagsAreNullShouldReturnNull() {
        TagParser parser = createParser();
        String tags = parser.toTagString(null);

        assertThat(tags, is(nullValue()));
    }

    @Test
    public void whenTagListHasThreeItemsShouldReturnTagStringWithThreeItems() {
        TagParser parser = createParser();
        String tags = parser.toTagString(Arrays.asList("a", "b", "c"));

        assertThat(tags, is("a;b;c"));
    }

    private TagParser createParser() {
        return new TagParser();
    }
}
