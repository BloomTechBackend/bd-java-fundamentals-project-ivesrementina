package main.com.adventure.player;

import main.com.adventure.objects.Shovel;
import main.com.adventure.objects.Tangible;
import main.com.adventure.objects.keys.Key;

/**
 * Stores any Tangible item up to the MAX_CAPACITY.
 */
public class Backpack {

    private static final int MAX_CAPACITY = 5;
    private final Tangible[] items = new Tangible[MAX_CAPACITY];
    private Shovel shovel;
    private Key key;

    /**
     * Adds an item to the backpack array(items) only if there's an empty space in the array.
     *
     * @param item - item to add to the backpack array.
     * @return - true if the item is added. Otherwise, false.
     */
    public boolean addItem(Tangible item) {
        //TODO Complete the function
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    /**
     * Checks each backpack item's name to see if it matches the given name.
     *
     * @param name - the name of the item to search for.
     * @return - the item if it exists. Otherwise, null.
     */
    public Tangible getItem(String name) {
        //TODO Complete the function
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if (items[i].getName().equals(name)) {
                    return items[i];
                }

            }
        }
        return null;
    }

    /**
     * Checks if the given item exists in the backpack based on the item's name, and removes the item if it's found.
     *
     * @param item - item to remove
     * @return - true if the item was removed. Otherwise, false.
     */
    public boolean removeItem(Tangible item) {
        //TODO Complete the function
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if (items[i].getName() == item.getName()) {
                    items[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Prints the contents of the backpack. Before printing the contents, the following line should
     * be printed:
     * <p>
     * "Here are the items in your backpack:"
     * <p>
     * Then each item should be printed with " - " before it.
     */
    public void printItems() {
        //TODO Complete the function
        System.out.println("Here are the items in your backpack:");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(" - " + items[i].getName());
            }
        }
    }

    public Shovel getShovel() {
        return shovel;
    }

    public void setShovel(Shovel shovel) {
        this.shovel = shovel;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
