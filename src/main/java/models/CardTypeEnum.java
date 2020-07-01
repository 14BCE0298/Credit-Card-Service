package models;

public enum CardTypeEnum {
    SILVER("silver"),
    GOLD("gold"),
    PLATINUM("platinum");

    public final String type;

    CardTypeEnum(String type) {
        this.type = type;
    }
}
