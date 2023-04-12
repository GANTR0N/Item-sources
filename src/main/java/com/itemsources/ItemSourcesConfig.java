package com.itemsources;

import com.itemsources.utils.Constants;
import com.itemsources.views.GridRowOption;
import com.itemsources.views.PriceType;
import com.itemsources.views.ViewOption;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;
import static com.itemsources.utils.Constants.*;

@ConfigGroup(Constants.CONFIG_GROUP)
public interface ItemSourcesConfig extends Config{
    @ConfigItem(
        position = 0,
        keyName = "defaultViewOption",
        name = "Default View Option",
        description = "Select default view option"
    )
    default ViewOption viewOption() {
        return ViewOption.LIST;
    }

    @ConfigItem(
        position = 1,
        keyName = "showItemSpawns",
        name = "Spawns",
        description = "Show/hide list of spawns for item"
    )
    default boolean showRarity() {
        return true;
    }

    @ConfigItem(
            position = 2,
            keyName = "showShops",
            name = "Shops",
            description = "Show/hide shop stock for item"
    )
    default boolean showQuantity() {
        return true;
    }

    @ConfigItem(
            position = 3,
            keyName = "showDrops",
            name = "Show Drop Table",
            description = "Show/hide drop table for item"
    )
    default boolean showPrice() {
        return true;
    }

    @ConfigItem( //BELOW THIS IS PROBABLY NOT NEEDED
            position = 4,
            keyName = "priceType",
            name = "Price Type",
            description = "Select price type for item"
    )
    default PriceType priceType() {
        return PriceType.GE;
    }

    @ConfigItem(
            position = 5,
            keyName = "disableMenuOption",
            name = "Disable Right Click Menu option",
            description = "Disable the right click menu option for monsters"
    )
    default boolean disableMenuOption() {
        return false;
    }

    @ConfigItem(
            position = 6,
            keyName = "disableItemLinks",
            name = "Disable Item links (List only)",
            description = "Disable links to OSRS Wiki page for item"
    )
    default boolean disableItemsLinks() {
        return false;
    }

    @ConfigItem(
            position = 7,
            keyName = "gridRowOption",
            name = "Items per row (Grid only)",
            description = "Number of items displayed in a grid row"
    )
    default GridRowOption gridRowOption() {
        return GridRowOption.FOUR;
    }

    @ConfigItem(
            position = 8,
            keyName = "commonColor",
            name = "Common Color",
            description = "Color to highlight the rarity of items with a value greater than 1/100"
    )
    default Color commonColor() {
        return DEFAULT_COMMON_COLOR;
    }

    @ConfigItem(
            position = 9,
            keyName = "rareColor",
            name = "Rare Color",
            description = "Color to highlight the rarity of items with a value of 1/100 - 1/1000"
    )
    default Color rareColor() {
        return DEFAULT_RARE_COLOR;
    }

    @ConfigItem(
            position = 10,
            keyName = "superRareColor",
            name = "Super Rare Color",
            description = "Color to highlight the rarity of items with a value of 1/1000 or less"
    )
    default Color superRareColor() {
        return DEFAULT_SUPER_RARE_COLOR;
    }

    @ConfigItem(
            position = 11,
            keyName = "priceColor",
            name = "Price Color",
            description = "Color to highlight item prices"
    )
    default Color priceColor() {
        return DEFAULT_PRICE_COLOR;
    }
}
