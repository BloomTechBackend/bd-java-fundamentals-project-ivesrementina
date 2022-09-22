package main.com.adventure.objects;

import main.com.adventure.objects.keys.HoleContent;
import main.com.adventure.objects.keys.Key;

public class Hole {
    private HoleContent holeContent;

    /**
     * Creates a hole with the given content.
     *
     * @param content - the item that is covered by the hole.
     */
    public Hole(Key content) {
        holeContent = new HoleContent(content);
    }

    /**
     * Uncovers the hole. If applicable, the contents are now revealed.
     */
    public void dig() {
        //TODO this function should update HoleContent's isCovered property.
        holeContent.setIsCovered(false);
    }

    public boolean isCovered() {
        //TODO This value should come from HoleContent
        return holeContent.isCovered();
    }


    /**
     * If the HoleContent is uncovered, return the key. Otherwise, return null.
     *
     * @return the key if the hold is uncovered.
     */
    private Key getKeyIfPossible() {
        //TODO Get the HoleContent's content only if the hole is uncovered.
        if (isCovered()) {
            return holeContent.getKey();
        } else {
            return null;
        }
    }


    /**
     * If the HoleContent is uncovered, return the content. Otherwise, return null.
     *
     * @return - the content if the hole is uncovered.
     */
    public Tangible getContent() {
        if (!isCovered()) {
            return holeContent.getContent();
        } else {
            return null;
        }
    }
}
