package org.betonquest.betonquest.quest.event.tag;

import org.betonquest.betonquest.database.TagData;

/**
 * A tag changer that will remove specified tags.
 */
public class RemoveTagChanger implements TagChanger {

    /**
     * Tags to remove from the player.
     */
    private final String[] tags;

    /**
     * Create the tag changer that removes tags.
     * @param tags tags to remove
     */
    public RemoveTagChanger(String... tags) {
        this.tags = tags;
    }

    @Override
    public void changeTags(TagData tagData) {
        for (final String tag : tags) {
            tagData.removeTag(tag);
        }
    }
}
