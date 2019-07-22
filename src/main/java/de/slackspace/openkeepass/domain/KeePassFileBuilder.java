package de.slackspace.openkeepass.domain;

import de.slackspace.openkeepass.domain.zipper.GroupZipper;

/**
 * A builder to create {@link KeePassFile}s.
 * <p>
 * Can be used to create a completely new {@link KeePassFile} or to modify an
 * existing one.
 * <p>
 * To modify an existing one use the {@link GroupZipper}.
 *
 */
public class KeePassFileBuilder implements KeePassFileContract {

    private Meta meta;
    private DocumentRoot root = new DocumentRootBuilder().build();

    public KeePassFileBuilder(KeePassFile keePassFile) {
        meta = keePassFile.getMeta();
        root = keePassFile.getRoot();
    }

    public KeePassFileBuilder(String databaseName) {
        meta = new MetaBuilder(databaseName).historyMaxItems(10).build();
    }

    public KeePassFileBuilder(Meta meta) {
        this.meta = meta;
    }

    public KeePassFileBuilder withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public KeePassFileBuilder withRoot(DocumentRoot root) {
        this.root = root;
        return this;
    }

    public KeePassFile build() {
        return new KeePassFile(this);
    }

    @Override
    public Meta getMeta() {
        return meta;
    }

    @Override
    public DocumentRoot getRoot() {
        return root;
    }
}
