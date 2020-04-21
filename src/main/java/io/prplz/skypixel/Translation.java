package io.prplz.skypixel;

import net.minecraft.client.resources.I18n;

public enum Translation {

    FEATURE_ANVIL_USES,
    FEATURE_ANVIL_USES_ENABLED,
    FEATURE_ANVIL_USES_POSITION,
    FEATURE_CANCEL_INVENTORY_DRAG,
    FEATURE_CANCEL_INVENTORY_DRAG_ENABLED,
    FEATURE_CANCEL_ITEM_DAMAGE,
    FEATURE_CANCEL_ITEM_DAMAGE_ENABLED,
    FEATURE_CLIENT_COMMAND_FIX,
    FEATURE_CLIENT_COMMAND_FIX_ENABLED,
    FEATURE_ENCHANTMENT_MENU,
    FEATURE_ENCHANTMENT_MENU_ENABLED,
    FEATURE_HIDE_END_PORTALS,
    FEATURE_HIDE_END_PORTALS_ENABLED,
    FEATURE_HIDE_NPCS_ON_TAB,
    FEATURE_HIDE_PLAYERS,
    FEATURE_HIDE_PLAYERS_NEAR_NPCS,
    FEATURE_HITBOXES,
    FEATURE_ITEM_TIER,
    FEATURE_ITEM_TIER_ARMOR,
    FEATURE_ITEM_TIER_MINION,
    FEATURE_ITEM_TIER_POTION,
    FEATURE_KEYBINDS,
    FEATURE_MOB_HITBOXES,
    FEATURE_NUMERAL_TYPE,
    FEATURE_PLAYER_HITBOXES,
    FEATURE_TAB_LIST_TWEAKS,
    FEATURE_TEXT_COLOR,
    KEY_CATEGORIES_SKYPIXEL,
    KEY_MENU,
    KEY_WARP_HOME,
    KEY_WARP_HUB,
    SETTING_DISABLED,
    SETTING_ENABLED,
    SETTING_OFF,
    SETTING_ON;

    public final String key = "skypixel." + name().toLowerCase();

    public String format(Object... args) {
        return I18n.format(key, args);
    }
}
