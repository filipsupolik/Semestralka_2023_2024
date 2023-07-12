package entity;

public enum Player_Classes {

    MAGE("Wand"),
    DRUID("Cloak"),
    DWARF("Hammer");

    private String startingItem;

    Player_Classes(String startingItem) {
        this.startingItem = startingItem;
    }

    public String getStartingItem() {
        return this.startingItem;
    }
}
