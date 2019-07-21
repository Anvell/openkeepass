package de.slackspace.openkeepass.domain;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import de.slackspace.openkeepass.parser.SimpleXmlParser;
import de.slackspace.openkeepass.processor.NullProtectionStrategy;
import de.slackspace.openkeepass.util.CalendarHandler;
import de.slackspace.openkeepass.util.XmlStringCleaner;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class MetaTest {

    private final static UUID TEST_UUID = UUID.fromString("87d4f441-a5ec-4ce0-8ca9-82a5079d28ef");

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(Meta.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void shouldMarshallObjectToXml() throws Exception {
        Meta meta = new MetaBuilder("SomeDb")
            .databaseDescription("some description")
            .databaseDescriptionChanged(CalendarHandler.createCalendar(2016, 1, 15))
            .databaseNameChanged(CalendarHandler.createCalendar(2016, 1, 16))
            .generator("OpenKeePass")
            .defaultUserName("user")
            .defaultUserNameChanged(CalendarHandler.createCalendar(2016, 1, 17))
            .color("#ffffff")
            .masterKeyChanged(CalendarHandler.createCalendar(2016, 1, 17))
            .masterKeyChangeRec(-1)
            .masterKeyChangeForce(-1)
            .entryTemplatesGroup(TEST_UUID)
            .entryTemplatesGroupChanged(CalendarHandler.createCalendar(2016, 1, 17))
            .lastSelectedGroup(TEST_UUID)
            .lastTopVisibleGroup(TEST_UUID)
            .historyMaxItems(10)
            .historyMaxSize(20)
            .maintenanceHistoryDays(30)
            .recycleBinChanged(CalendarHandler.createCalendar(2016, 1, 17))
            .recycleBinEnabled(true)
            .recycleBinUuid(TEST_UUID)
            .build();

        ByteArrayOutputStream bos = new SimpleXmlParser().toXml(meta);
        
        String xml = XmlStringCleaner.cleanXmlString(new String(bos.toByteArray()));
        Assert.assertEquals("<meta><Generator>OpenKeePass</Generator><DatabaseName>SomeDb</DatabaseName><DatabaseDescription>some description</DatabaseDescription><DatabaseNameChanged>2016-01-16T00:00:00</DatabaseNameChanged><DatabaseDescriptionChanged>2016-01-15T00:00:00</DatabaseDescriptionChanged><DefaultUserName>user</DefaultUserName><DefaultUserNameChanged>2016-01-17T00:00:00</DefaultUserNameChanged><MaintenanceHistoryDays>30</MaintenanceHistoryDays><Color>#ffffff</Color><MasterKeyChanged>2016-01-17T00:00:00</MasterKeyChanged><MasterKeyChangeRec>-1</MasterKeyChangeRec><MasterKeyChangeForce>-1</MasterKeyChangeForce><RecycleBinUUID>h9T0QaXsTOCMqYKlB50o7w==</RecycleBinUUID><RecycleBinChanged>2016-01-17T00:00:00</RecycleBinChanged><RecycleBinEnabled>True</RecycleBinEnabled><EntryTemplatesGroup>h9T0QaXsTOCMqYKlB50o7w==</EntryTemplatesGroup><EntryTemplatesGroupChanged>2016-01-17T00:00:00</EntryTemplatesGroupChanged><LastSelectedGroup>h9T0QaXsTOCMqYKlB50o7w==</LastSelectedGroup><LastTopVisibleGroup>h9T0QaXsTOCMqYKlB50o7w==</LastTopVisibleGroup><HistoryMaxItems>10</HistoryMaxItems><HistoryMaxSize>20</HistoryMaxSize></meta>", xml);
    }
    
    @Test
    public void shouldUnmarshallXmlToObject() throws Exception {
        Meta meta = new MetaBuilder("SomeDb")
                .databaseDescription("some description")
                .databaseDescriptionChanged(CalendarHandler.createCalendar(2016, 1, 15))
                .databaseNameChanged(CalendarHandler.createCalendar(2016, 1, 16))
                .generator("OpenKeePass")
                .defaultUserName("user")
                .defaultUserNameChanged(CalendarHandler.createCalendar(2016, 1, 17))
                .color("#ffffff")
                .masterKeyChanged(CalendarHandler.createCalendar(2016, 1, 17))
                .masterKeyChangeRec(-1)
                .masterKeyChangeForce(-1)
                .entryTemplatesGroup(TEST_UUID)
                .entryTemplatesGroupChanged(CalendarHandler.createCalendar(2016, 1, 17))
                .lastSelectedGroup(TEST_UUID)
                .lastTopVisibleGroup(TEST_UUID)
                .historyMaxItems(10)
                .historyMaxSize(20)
                .maintenanceHistoryDays(30)
                .recycleBinChanged(CalendarHandler.createCalendar(2016, 1, 17))
                .recycleBinEnabled(true)
                .recycleBinUuid(TEST_UUID)
                .build();

        String xml = "<meta><Generator>OpenKeePass</Generator><DatabaseName>SomeDb</DatabaseName><DatabaseDescription>some description</DatabaseDescription><DatabaseNameChanged>2016-01-16T00:00:00</DatabaseNameChanged><DatabaseDescriptionChanged>2016-01-15T00:00:00</DatabaseDescriptionChanged><DefaultUserName>user</DefaultUserName><DefaultUserNameChanged>2016-01-17T00:00:00</DefaultUserNameChanged><MaintenanceHistoryDays>30</MaintenanceHistoryDays><Color>#ffffff</Color><MasterKeyChanged>2016-01-17T00:00:00</MasterKeyChanged><MasterKeyChangeRec>-1</MasterKeyChangeRec><MasterKeyChangeForce>-1</MasterKeyChangeForce><RecycleBinUUID>h9T0QaXsTOCMqYKlB50o7w==</RecycleBinUUID><RecycleBinChanged>2016-01-17T00:00:00</RecycleBinChanged><RecycleBinEnabled>True</RecycleBinEnabled><EntryTemplatesGroup>h9T0QaXsTOCMqYKlB50o7w==</EntryTemplatesGroup><EntryTemplatesGroupChanged>2016-01-17T00:00:00</EntryTemplatesGroupChanged><LastSelectedGroup>h9T0QaXsTOCMqYKlB50o7w==</LastSelectedGroup><LastTopVisibleGroup>h9T0QaXsTOCMqYKlB50o7w==</LastTopVisibleGroup><HistoryMaxItems>10</HistoryMaxItems><HistoryMaxSize>20</HistoryMaxSize></meta>";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Meta metaUnmarshalled = new SimpleXmlParser().fromXml(inputStream, new NullProtectionStrategy(), Meta.class);

        Assert.assertEquals(meta.getDatabaseDescription(), metaUnmarshalled.getDatabaseDescription());
        Assert.assertEquals(meta.getDatabaseName(), metaUnmarshalled.getDatabaseName());
        Assert.assertEquals(meta.getHistoryMaxItems(), metaUnmarshalled.getHistoryMaxItems());
        Assert.assertEquals(meta.getHistoryMaxSize(), metaUnmarshalled.getHistoryMaxSize());
        Assert.assertEquals(meta.getGenerator(), metaUnmarshalled.getGenerator());
        Assert.assertEquals(meta.getDefaultUserName(), metaUnmarshalled.getDefaultUserName());
        Assert.assertEquals(meta.getColor(), metaUnmarshalled.getColor());
        Assert.assertEquals(meta.getMasterKeyChangeRec(), metaUnmarshalled.getMasterKeyChangeRec());
        Assert.assertEquals(meta.getMasterKeyChangeForce(), metaUnmarshalled.getMasterKeyChangeForce());
        Assert.assertEquals(meta.getEntryTemplatesGroup(), metaUnmarshalled.getEntryTemplatesGroup());
        Assert.assertEquals(meta.getLastSelectedGroup(), metaUnmarshalled.getLastSelectedGroup());
        Assert.assertEquals(meta.getLastTopVisibleGroup(), metaUnmarshalled.getLastTopVisibleGroup());
        Assert.assertEquals(meta.getMaintenanceHistoryDays(), metaUnmarshalled.getMaintenanceHistoryDays());
        Assert.assertEquals(meta.getRecycleBinEnabled(), metaUnmarshalled.getRecycleBinEnabled());
        Assert.assertEquals(meta.getRecycleBinUuid(), metaUnmarshalled.getRecycleBinUuid());
        CalendarHandler.isEqual(meta.getDatabaseDescriptionChanged(), metaUnmarshalled.getDatabaseDescriptionChanged());
        CalendarHandler.isEqual(meta.getDatabaseNameChanged(), metaUnmarshalled.getDatabaseNameChanged());
        CalendarHandler.isEqual(meta.getRecycleBinChanged(), metaUnmarshalled.getRecycleBinChanged());
        CalendarHandler.isEqual(meta.getDefaultUserNameChanged(), metaUnmarshalled.getDefaultUserNameChanged());
        CalendarHandler.isEqual(meta.getMasterKeyChanged(), metaUnmarshalled.getMasterKeyChanged());
        CalendarHandler.isEqual(meta.getEntryTemplatesGroupChanged(), metaUnmarshalled.getEntryTemplatesGroupChanged());
    }
}
