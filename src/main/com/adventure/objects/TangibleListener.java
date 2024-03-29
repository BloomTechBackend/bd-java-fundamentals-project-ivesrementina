package main.com.adventure.objects;

public interface TangibleListener {
    /**
     * The tangible item parameter has been used.
     * @param tangible - the item the player used.
     */
    void tangibleUsed(Tangible tangible);
}
