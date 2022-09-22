package main.com.adventure.settings;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     *
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        CommandVerb commandVerb;
        if (verbString.equalsIgnoreCase(CommandVerb.TAKE.toString())) {
            commandVerb = CommandVerb.TAKE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.MOVE.toString())) {
            commandVerb = CommandVerb.MOVE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.USE.toString())) {
            commandVerb = CommandVerb.USE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.DIG.toString())) {
            commandVerb = CommandVerb.DIG;
        } else if (verbString.equalsIgnoreCase(CommandVerb.EXAMINE.toString())) {
            commandVerb = CommandVerb.EXAMINE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.LOOK.toString())) {
            commandVerb = CommandVerb.LOOK;
        } else if (verbString.equalsIgnoreCase(CommandVerb.HELP.toString())) {
            commandVerb = CommandVerb.HELP;
        } else if (verbString.equalsIgnoreCase(CommandVerb.FIGHT.toString())) {
            commandVerb = CommandVerb.FIGHT;
        } else if (verbString.equalsIgnoreCase(CommandVerb.INVENTORY.toString())) {
            commandVerb = CommandVerb.INVENTORY;
        } else {
            commandVerb = CommandVerb.INVALID;
        }
        return commandVerb;
    }
}
