/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api.widgets;

/**
 * Represents a group-child {@link Widget} relationship.
 * <p>
 * For getting a specific widget from the client, see {@link net.runelite.api.Client#getWidget(WidgetInfo)}.
 */
public enum WidgetInfo
{
	FAIRY_RING_LEFT_ORB_CLOCKWISE(WidgetID.FAIRY_RING_GROUP_ID, WidgetID.FairyRing.LEFT_ORB_CLOCKWISE),
	FAIRY_RING_LEFT_ORB_COUNTER_CLOCKWISE(WidgetID.FAIRY_RING_GROUP_ID, WidgetID.FairyRing.LEFT_ORB_COUNTER_CLOCKWISE),
	FAIRY_RING_MIDDLE_ORB_CLOCKWISE(WidgetID.FAIRY_RING_GROUP_ID, WidgetID.FairyRing.MIDDLE_ORB_CLOCKWISE),
	FAIRY_RING_MIDDLE_ORB_COUNTER_CLOCKWISE(WidgetID.FAIRY_RING_GROUP_ID, WidgetID.FairyRing.MIDDLE_ORB_COUNTER_CLOCKWISE),
	FAIRY_RING_RIGHT_ORB_CLOCKWISE(WidgetID.FAIRY_RING_GROUP_ID, WidgetID.FairyRing.RIGHT_ORB_CLOCKWISE),
	FAIRY_RING_RIGHT_ORB_COUNTER_CLOCKWISE(WidgetID.FAIRY_RING_GROUP_ID, WidgetID.FairyRing.RIGHT_ORB_COUNTER_CLOCKWISE),

	FAIRY_RING_TELEPORT_BUTTON(WidgetID.FAIRY_RING_GROUP_ID, WidgetID.FairyRing.TELEPORT_BUTTON),

	WORLD_SWITCHER_BUTTON(WidgetID.LOGOUT_PANEL_ID, WidgetID.LogoutPanel.WORLD_SWITCHER_BUTTON),
	LOGOUT_BUTTON(WidgetID.LOGOUT_PANEL_ID, WidgetID.LogoutPanel.LOGOUT_BUTTON),

	INVENTORY(WidgetID.INVENTORY_GROUP_ID, 0),
	FRIENDS_LIST(WidgetID.FRIENDS_LIST_GROUP_ID, 0),
	CLAN_CHAT(WidgetID.CLAN_CHAT_GROUP_ID, 0),
	RAIDING_PARTY(WidgetID.RAIDING_PARTY_GROUP_ID, 0),

	WORLD_MAP_VIEW(WidgetID.WORLD_MAP_GROUP_ID, WidgetID.WorldMap.MAPVIEW),
	WORLD_MAP_OVERVIEW_MAP(WidgetID.WORLD_MAP_GROUP_ID, WidgetID.WorldMap.OVERVIEW_MAP),
	WORLD_MAP_SEARCH(WidgetID.WORLD_MAP_GROUP_ID, WidgetID.WorldMap.SEARCH),
	WORLD_MAP_SURFACE_SELECTOR(WidgetID.WORLD_MAP_GROUP_ID, WidgetID.WorldMap.SURFACE_SELECTOR),
	WORLD_MAP_TOOLTIP(WidgetID.WORLD_MAP_GROUP_ID, WidgetID.WorldMap.TOOLTIP),
	WORLD_MAP_OPTION(WidgetID.WORLD_MAP_MENU_GROUP_ID, WidgetID.WorldMap.OPTION),

	CLUE_SCROLL_TEXT(WidgetID.CLUE_SCROLL_GROUP_ID, WidgetID.Cluescroll.CLUE_TEXT),
	CLUE_SCROLL_REWARD_ITEM_CONTAINER(WidgetID.CLUE_SCROLL_REWARD_GROUP_ID, WidgetID.Cluescroll.CLUE_SCROLL_ITEM_CONTAINER),

	EQUIPMENT(WidgetID.EQUIPMENT_GROUP_ID, 0),
	EQUIPMENT_INVENTORY_ITEMS_CONTAINER(WidgetID.EQUIPMENT_INVENTORY_GROUP_ID, WidgetID.Equipment.INVENTORY_ITEM_CONTAINER),

	EQUIPMENT_HELMET(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.HELMET),
	EQUIPMENT_CAPE(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.CAPE),
	EQUIPMENT_AMULET(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.AMULET),
	EQUIPMENT_WEAPON(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.WEAPON),
	EQUIPMENT_BODY(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.BODY),
	EQUIPMENT_SHIELD(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.SHIELD),
	EQUIPMENT_LEGS(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.LEGS),
	EQUIPMENT_GLOVES(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.GLOVES),
	EQUIPMENT_BOOTS(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.BOOTS),
	EQUIPMENT_RING(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.RING),
	EQUIPMENT_AMMO(WidgetID.EQUIPMENT_GROUP_ID, WidgetID.Equipment.AMMO),

	EMOTE_WINDOW(WidgetID.EMOTES_GROUP_ID, WidgetID.Emotes.EMOTE_WINDOW),
	EMOTE_CONTAINER(WidgetID.EMOTES_GROUP_ID, WidgetID.Emotes.EMOTE_CONTAINER),

	DIARY_LIST(WidgetID.DIARY_GROUP_ID, 10),

	DIARY_QUEST_WIDGET_TITLE(WidgetID.DIARY_QUEST_GROUP_ID, WidgetID.Diary.DIARY_TITLE),
	DIARY_QUEST_WIDGET_TEXT(WidgetID.DIARY_QUEST_GROUP_ID, WidgetID.Diary.DIARY_TEXT),

	PEST_CONTROL_BOAT_INFO(WidgetID.PEST_CONTROL_BOAT_GROUP_ID, WidgetID.PestControlBoat.INFO),
	PEST_CONTROL_INFO(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.INFO),
	PEST_CONTROL_PURPLE_SHIELD(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.PURPLE_SHIELD),
	PEST_CONTROL_BLUE_SHIELD(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.BLUE_SHIELD),
	PEST_CONTROL_YELLOW_SHIELD(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.YELLOW_SHIELD),
	PEST_CONTROL_RED_SHIELD(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.RED_SHIELD),
	PEST_CONTROL_PURPLE_HEALTH(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.PURPLE_HEALTH),
	PEST_CONTROL_BLUE_HEALTH(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.BLUE_HEALTH),
	PEST_CONTROL_YELLOW_HEALTH(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.YELLOW_HEALTH),
	PEST_CONTROL_RED_HEALTH(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.RED_HEALTH),
	PEST_CONTROL_PURPLE_ICON(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.PURPLE_ICON),
	PEST_CONTROL_BLUE_ICON(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.BLUE_ICON),
	PEST_CONTROL_YELLOW_ICON(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.YELLOW_ICON),
	PEST_CONTROL_RED_ICON(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.RED_ICON),
	PEST_CONTROL_ACTIVITY_BAR(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.ACTIVITY_BAR),
	PEST_CONTROL_ACTIVITY_PROGRESS(WidgetID.PEST_CONTROL_GROUP_ID, WidgetID.PestControl.ACTIVITY_PROGRESS),

	VOLCANIC_MINE_GENERAL_INFOBOX_GROUP(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.GENERAL_INFOBOX_GROUP_ID),
	VOLCANIC_MINE_TIME_LEFT(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.TIME_LEFT),
	VOLCANIC_MINE_POINTS(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.POINTS),
	VOLCANIC_MINE_STABILITY(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.STABILITY),
	VOLCANIC_MINE_PLAYER_COUNT(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.PLAYER_COUNT),
	VOLCANIC_MINE_VENTS_INFOBOX_GROUP(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.VENTS_INFOBOX_GROUP_ID),
	VOLCANIC_MINE_VENT_A_PERCENTAGE(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.VENT_A_PERCENTAGE),
	VOLCANIC_MINE_VENT_B_PERCENTAGE(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.VENT_B_PERCENTAGE),
	VOLCANIC_MINE_VENT_C_PERCENTAGE(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.VENT_C_PERCENTAGE),
	VOLCANIC_MINE_VENT_A_STATUS(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.VENT_A_STATUS),
	VOLCANIC_MINE_VENT_B_STATUS(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.VENT_B_STATUS),
	VOLCANIC_MINE_VENT_C_STATUS(WidgetID.VOLCANIC_MINE_GROUP_ID, WidgetID.VolcanicMine.VENT_C_STATUS),

	FRIEND_CHAT_TITLE(WidgetID.FRIENDS_LIST_GROUP_ID, WidgetID.FriendList.TITLE),

	IGNORE_TITLE(WidgetID.IGNORE_LIST_GROUP_ID, WidgetID.IgnoreList.TITLE),

	CLAN_CHAT_TITLE(WidgetID.CLAN_CHAT_GROUP_ID, WidgetID.ClanChat.TITLE),
	CLAN_CHAT_NAME(WidgetID.CLAN_CHAT_GROUP_ID, WidgetID.ClanChat.NAME),
	CLAN_CHAT_OWNER(WidgetID.CLAN_CHAT_GROUP_ID, WidgetID.ClanChat.OWNER),
	CLAN_CHAT_LIST(WidgetID.CLAN_CHAT_GROUP_ID, WidgetID.ClanChat.LIST),

	BANK_CONTAINER(WidgetID.BANK_GROUP_ID, WidgetID.Bank.BANK_CONTAINER),
	BANK_SEARCH_BUTTON_BACKGROUND(WidgetID.BANK_GROUP_ID, WidgetID.Bank.SEARCH_BUTTON_BACKGROUND),
	BANK_ITEM_CONTAINER(WidgetID.BANK_GROUP_ID, WidgetID.Bank.ITEM_CONTAINER),
	BANK_INVENTORY_ITEMS_CONTAINER(WidgetID.BANK_INVENTORY_GROUP_ID, WidgetID.Bank.INVENTORY_ITEM_CONTAINER),
	BANK_TITLE_BAR(WidgetID.BANK_GROUP_ID, WidgetID.Bank.BANK_TITLE_BAR),
	BANK_INCINERATOR(WidgetID.BANK_GROUP_ID, WidgetID.Bank.INCINERATOR),
	BANK_INCINERATOR_CONFIRM(WidgetID.BANK_GROUP_ID, WidgetID.Bank.INCINERATOR_CONFIRM),
	BANK_CONTENT_CONTAINER(WidgetID.BANK_GROUP_ID, WidgetID.Bank.CONTENT_CONTAINER),
	BANK_DEPOSIT_EQUIPMENT(WidgetID.BANK_GROUP_ID, WidgetID.Bank.DEPOSIT_EQUIPMENT),
	BANK_DEPOSIT_INVENTORY(WidgetID.BANK_GROUP_ID, WidgetID.Bank.DEPOSIT_INVENTORY),

	GRAND_EXCHANGE_WINDOW_CONTAINER(WidgetID.GRAND_EXCHANGE_GROUP_ID, WidgetID.GrandExchange.WINDOW_CONTAINER),
	GRAND_EXCHANGE_OFFER_CONTAINER(WidgetID.GRAND_EXCHANGE_GROUP_ID, WidgetID.GrandExchange.OFFER_CONTAINER),
	GRAND_EXCHANGE_OFFER_TEXT(WidgetID.GRAND_EXCHANGE_GROUP_ID, WidgetID.GrandExchange.OFFER_DESCRIPTION),
	GRAND_EXCHANGE_OFFER_PRICE(WidgetID.GRAND_EXCHANGE_GROUP_ID, WidgetID.GrandExchange.OFFER_PRICE),

	GRAND_EXCHANGE_INVENTORY_ITEMS_CONTAINER(WidgetID.GRAND_EXCHANGE_INVENTORY_GROUP_ID, WidgetID.GrandExchangeInventory.INVENTORY_ITEM_CONTAINER),

	DEPOSIT_BOX_INVENTORY_ITEMS_CONTAINER(WidgetID.DEPOSIT_BOX_GROUP_ID, WidgetID.DepositBox.INVENTORY_ITEM_CONTAINER),

	SHOP_ITEMS_CONTAINER(WidgetID.SHOP_GROUP_ID, WidgetID.Shop.ITEMS_CONTAINER),
	SHOP_INVENTORY_ITEMS_CONTAINER(WidgetID.SHOP_INVENTORY_GROUP_ID, WidgetID.Shop.INVENTORY_ITEM_CONTAINER),

	SMITHING_INVENTORY_ITEMS_CONTAINER(WidgetID.SMITHING_GROUP_ID, WidgetID.Smithing.INVENTORY_ITEM_CONTAINER),

	GUIDE_PRICES_ITEMS_CONTAINER(WidgetID.GUIDE_PRICES_GROUP_ID, WidgetID.GuidePrices.ITEM_CONTAINER),
	GUIDE_PRICES_INVENTORY_ITEMS_CONTAINER(WidgetID.GUIDE_PRICES_INVENTORY_GROUP_ID, WidgetID.GuidePrices.INVENTORY_ITEM_CONTAINER),

	RUNE_POUCH_ITEM_CONTAINER(WidgetID.RUNE_POUCH_GROUP_ID, 0),

	MINIMAP_ORBS(WidgetID.MINIMAP_GROUP_ID, 0),
	MINIMAP_XP_ORB(WidgetID.MINIMAP_GROUP_ID, WidgetID.Minimap.XP_ORB),
	MINIMAP_PRAYER_ORB(WidgetID.MINIMAP_GROUP_ID, WidgetID.Minimap.PRAYER_ORB),
	MINIMAP_QUICK_PRAYER_ORB(WidgetID.MINIMAP_GROUP_ID, WidgetID.Minimap.QUICK_PRAYER_ORB),
	MINIMAP_RUN_ORB(WidgetID.MINIMAP_GROUP_ID, WidgetID.Minimap.RUN_ORB),
	MINIMAP_TOGGLE_RUN_ORB(WidgetID.MINIMAP_GROUP_ID, WidgetID.Minimap.TOGGLE_RUN_ORB),
	MINIMAP_RUN_ORB_TEXT(WidgetID.MINIMAP_GROUP_ID, WidgetID.Minimap.RUN_ORB_TEXT),
	MINIMAP_HEALTH_ORB(WidgetID.MINIMAP_GROUP_ID, WidgetID.Minimap.HEALTH_ORB),
	MINIMAP_SPEC_ORB(WidgetID.MINIMAP_GROUP_ID, WidgetID.Minimap.SPEC_ORB),

	LOGIN_CLICK_TO_PLAY_SCREEN(WidgetID.LOGIN_CLICK_TO_PLAY_GROUP_ID, 0),
	LOGIN_CLICK_TO_PLAY_SCREEN_MESSAGE_OF_THE_DAY(WidgetID.LOGIN_CLICK_TO_PLAY_GROUP_ID, WidgetID.LoginClickToPlayScreen.MESSAGE_OF_THE_DAY),

	FIXED_VIEWPORT(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.Viewport.FIXED_VIEWPORT),
	FIXED_VIEWPORT_ROOT_INTERFACE_CONTAINER(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.ROOT_INTERFACE_CONTAINER),
	FIXED_VIEWPORT_BANK_CONTAINER(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.BANK_CONTAINER),
	FIXED_VIEWPORT_INTERFACE_CONTAINER(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.INTERFACE_CONTAINER),
	FIXED_VIEWPORT_COMBAT_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.COMBAT_TAB),
	FIXED_VIEWPORT_STATS_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.STATS_TAB),
	FIXED_VIEWPORT_QUESTS_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.QUESTS_TAB),
	FIXED_VIEWPORT_INVENTORY_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.INVENTORY_TAB),
	FIXED_VIEWPORT_EQUIPMENT_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.EQUIPMENT_TAB),
	FIXED_VIEWPORT_PRAYER_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.PRAYER_TAB),
	FIXED_VIEWPORT_MAGIC_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.MAGIC_TAB),
	FIXED_VIEWPORT_CLAN_CHAT_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.CLAN_CHAT_TAB),
	FIXED_VIEWPORT_FRIENDS_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.FRIENDS_TAB),
	FIXED_VIEWPORT_IGNORES_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.IGNORES_TAB),
	FIXED_VIEWPORT_LOGOUT_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.LOGOUT_TAB),
	FIXED_VIEWPORT_OPTIONS_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.OPTIONS_TAB),
	FIXED_VIEWPORT_EMOTES_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.EMOTES_TAB),
	FIXED_VIEWPORT_MUSIC_TAB(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.MUSIC_TAB),
	FIXED_VIEWPORT_COMBAT_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.COMBAT_ICON),
	FIXED_VIEWPORT_STATS_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.STATS_ICON),
	FIXED_VIEWPORT_QUESTS_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.QUESTS_ICON),
	FIXED_VIEWPORT_INVENTORY_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.INVENTORY_ICON),
	FIXED_VIEWPORT_EQUIPMENT_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.EQUIPMENT_ICON),
	FIXED_VIEWPORT_PRAYER_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.PRAYER_ICON),
	FIXED_VIEWPORT_MAGIC_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.MAGIC_ICON),
	FIXED_VIEWPORT_CLAN_CHAT_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.CLAN_CHAT_ICON),
	FIXED_VIEWPORT_FRIENDS_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.FRIENDS_ICON),
	FIXED_VIEWPORT_IGNORES_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.IGNORES_ICON),
	FIXED_VIEWPORT_LOGOUT_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.LOGOUT_ICON),
	FIXED_VIEWPORT_OPTIONS_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.OPTIONS_ICON),
	FIXED_VIEWPORT_EMOTES_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.EMOTES_ICON),
	FIXED_VIEWPORT_MUSIC_ICON(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.MUSIC_ICON),
	FIXED_VIEWPORT_MINIMAP(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.MINIMAP),
	FIXED_VIEWPORT_MINIMAP_DRAW_AREA(WidgetID.FIXED_VIEWPORT_GROUP_ID, WidgetID.FixedViewport.MINIMAP_DRAW_AREA),

	RESIZABLE_MINIMAP_WIDGET(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_WIDGET),
	RESIZABLE_MINIMAP_CLICKBOX(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_CLICKBOX),
	RESIZABLE_MINIMAP_DRAW_AREA(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_DRAW_AREA),
	RESIZABLE_MINIMAP_DECORATIONS(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_DECORATIONS),
	RESIZABLE_MINIMAP_ORB_HOLDER(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_ORB_HOLDER),
	RESIZABLE_MINIMAP_LOGOUT_BUTTON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_LOGOUT_BUTTON),

	RESIZABLE_MINIMAP_STONES_WIDGET(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_WIDGET),
	RESIZABLE_MINIMAP_STONES_CLICKBOX(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_CLICKBOX),
	RESIZABLE_MINIMAP_STONES_DRAW_AREA(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_DRAW_AREA),
	RESIZABLE_MINIMAP_STONES_DECORATIONS(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_DECORATIONS),
	RESIZABLE_MINIMAP_STONES_ORB_HOLDER(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.Viewport.MINIMAP_RESIZABLE_ORB_HOLDER),

	RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.Viewport.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX),
	RESIZABLE_VIEWPORT_COMBAT_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.COMBAT_TAB),
	RESIZABLE_VIEWPORT_STATS_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.STATS_TAB),
	RESIZABLE_VIEWPORT_QUESTS_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.QUESTS_TAB),
	RESIZABLE_VIEWPORT_INVENTORY_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.INVENTORY_TAB),
	RESIZABLE_VIEWPORT_EQUIPMENT_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.EQUIPMENT_TAB),
	RESIZABLE_VIEWPORT_PRAYER_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.PRAYER_TAB),
	RESIZABLE_VIEWPORT_MAGIC_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.MAGIC_TAB),
	RESIZABLE_VIEWPORT_CLAN_CHAT_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.CLAN_CHAT_TAB),
	RESIZABLE_VIEWPORT_FRIENDS_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.FRIENDS_TAB),
	RESIZABLE_VIEWPORT_IGNORES_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.IGNORES_TAB),
	RESIZABLE_VIEWPORT_LOGOUT_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.LOGOUT_TAB),
	RESIZABLE_VIEWPORT_OPTIONS_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.OPTIONS_TAB),
	RESIZABLE_VIEWPORT_EMOTES_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.EMOTES_TAB),
	RESIZABLE_VIEWPORT_MUSIC_TAB(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.MUSIC_TAB),
	RESIZABLE_VIEWPORT_COMBAT_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.COMBAT_ICON),
	RESIZABLE_VIEWPORT_STATS_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.STATS_ICON),
	RESIZABLE_VIEWPORT_QUESTS_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.QUESTS_ICON),
	RESIZABLE_VIEWPORT_INVENTORY_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.INVENTORY_ICON),
	RESIZABLE_VIEWPORT_EQUIPMENT_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.EQUIPMENT_ICON),
	RESIZABLE_VIEWPORT_PRAYER_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.PRAYER_ICON),
	RESIZABLE_VIEWPORT_MAGIC_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.MAGIC_ICON),
	RESIZABLE_VIEWPORT_CLAN_CHAT_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.CLAN_CHAT_ICON),
	RESIZABLE_VIEWPORT_FRIENDS_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.FRIENDS_ICON),
	RESIZABLE_VIEWPORT_IGNORES_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.IGNORES_ICON),
	RESIZABLE_VIEWPORT_LOGOUT_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.LOGOUT_ICON),
	RESIZABLE_VIEWPORT_OPTIONS_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.OPTIONS_ICON),
	RESIZABLE_VIEWPORT_EMOTES_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.EMOTES_ICON),
	RESIZABLE_VIEWPORT_MUSIC_ICON(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.MUSIC_ICON),

	RESIZABLE_VIEWPORT_BOTTOM_LINE(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.Viewport.RESIZABLE_VIEWPORT_BOTTOM_LINE),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_LOGOUT_BUTTON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.LOGOUT_BUTTON_OVERLAY),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_QUESTS_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.QUESTS_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_TAB(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.INVENTORY_TAB),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.INVENTORY_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_PRAYER_TAB(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.PRAYER_TAB),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_PRAYER_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.PRAYER_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_EQUIPMENT_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.EQUIP_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_COMBAT_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.CMB_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_STATS_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.SKILLS_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_MAGIC_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.MAGIC_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_FRIEND_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.FRIEND_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_FRIEND_CHAT_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.FC_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_OPTIONS_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.SETTINGS_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_EMOTES_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.EMOTE_ICON),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_MUSIC_ICON(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewportBottomLine.MUSIC_ICON),
	RESIZABLE_VIEWPORT_INTERFACE_CONTAINER(WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID, WidgetID.ResizableViewport.INTERFACE_CONTAINER),
	RESIZABLE_VIEWPORT_BOTTOM_LINE_INTERFACE_CONTAINER(WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID, WidgetID.ResizableViewport.INTERFACE_CONTAINER),

	PRAYER_THICK_SKIN(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.THICK_SKIN),
	PRAYER_BURST_OF_STRENGTH(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.BURST_OF_STRENGTH),
	PRAYER_CLARITY_OF_THOUGHT(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.CLARITY_OF_THOUGHT),
	PRAYER_SHARP_EYE(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.SHARP_EYE),
	PRAYER_MYSTIC_WILL(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.MYSTIC_WILL),
	PRAYER_ROCK_SKIN(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.ROCK_SKIN),
	PRAYER_SUPERHUMAN_STRENGTH(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.SUPERHUMAN_STRENGTH),
	PRAYER_IMPROVED_REFLEXES(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.IMPROVED_REFLEXES),
	PRAYER_RAPID_RESTORE(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.RAPID_RESTORE),
	PRAYER_RAPID_HEAL(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.RAPID_HEAL),
	PRAYER_PROTECT_ITEM(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.PROTECT_ITEM),
	PRAYER_HAWK_EYE(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.HAWK_EYE),
	PRAYER_MYSTIC_LORE(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.MYSTIC_LORE),
	PRAYER_STEEL_SKIN(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.STEEL_SKIN),
	PRAYER_ULTIMATE_STRENGTH(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.ULTIMATE_STRENGTH),
	PRAYER_INCREDIBLE_REFLEXES(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.INCREDIBLE_REFLEXES),
	PRAYER_PROTECT_FROM_MAGIC(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.PROTECT_FROM_MAGIC),
	PRAYER_PROTECT_FROM_MISSILES(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.PROTECT_FROM_MISSILES),
	PRAYER_PROTECT_FROM_MELEE(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.PROTECT_FROM_MELEE),
	PRAYER_EAGLE_EYE(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.EAGLE_EYE),
	PRAYER_MYSTIC_MIGHT(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.MYSTIC_MIGHT),
	PRAYER_RETRIBUTION(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.RETRIBUTION),
	PRAYER_REDEMPTION(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.REDEMPTION),
	PRAYER_SMITE(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.SMITE),
	PRAYER_PRESERVE(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.PRESERVE),
	PRAYER_CHIVALRY(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.CHIVALRY),
	PRAYER_PIETY(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.PIETY),
	PRAYER_RIGOUR(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.RIGOUR),
	PRAYER_AUGURY(WidgetID.PRAYER_GROUP_ID, WidgetID.Prayer.AUGURY),

	QUICK_PRAYER_PRAYERS(WidgetID.QUICK_PRAYERS_GROUP_ID, WidgetID.QuickPrayer.PRAYERS),

	COMBAT_LEVEL(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.LEVEL),
	COMBAT_STYLE_ONE(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.STYLE_ONE),
	COMBAT_STYLE_TWO(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.STYLE_TWO),
	COMBAT_STYLE_THREE(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.STYLE_THREE),
	COMBAT_STYLE_FOUR(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.STYLE_FOUR),
	COMBAT_SPELLS(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.SPELLS),
	COMBAT_DEFENSIVE_SPELL_BOX(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.DEFENSIVE_SPELL_BOX),
	COMBAT_DEFENSIVE_SPELL_ICON(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.DEFENSIVE_SPELL_ICON),
	COMBAT_DEFENSIVE_SPELL_SHIELD(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.DEFENSIVE_SPELL_SHIELD),
	COMBAT_DEFENSIVE_SPELL_TEXT(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.DEFENSIVE_SPELL_TEXT),
	COMBAT_SPELL_BOX(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.SPELL_BOX),
	COMBAT_SPELL_ICON(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.SPELL_ICON),
	COMBAT_SPELL_TEXT(WidgetID.COMBAT_GROUP_ID, WidgetID.Combat.SPELL_TEXT),

	DIALOG_OPTION(WidgetID.DIALOG_OPTION_GROUP_ID, 0),

	DIALOG_SPRITE(WidgetID.DIALOG_SPRITE_GROUP_ID, 0),
	DIALOG_SPRITE_SPRITE(WidgetID.DIALOG_SPRITE_GROUP_ID, WidgetID.DialogSprite.SPRITE),
	DIALOG_SPRITE_TEXT(WidgetID.DIALOG_SPRITE_GROUP_ID, WidgetID.DialogSprite.TEXT),

	DIALOG_NPC(WidgetID.DIALOG_NPC_GROUP_ID, 0),
	DIALOG_NPC_NAME(WidgetID.DIALOG_NPC_GROUP_ID, WidgetID.DialogNPC.NAME),
	DIALOG_NPC_TEXT(WidgetID.DIALOG_NPC_GROUP_ID, WidgetID.DialogNPC.TEXT),
	DIALOG_NPC_HEAD_MODEL(WidgetID.DIALOG_NPC_GROUP_ID, WidgetID.DialogNPC.HEAD_MODEL),
	DIALOG_NPC_CONTINUE(WidgetID.DIALOG_NPC_GROUP_ID, WidgetID.DialogNPC.CONTINUE),

	DIALOG_PLAYER(WidgetID.DIALOG_PLAYER_GROUP_ID, 0),

	PRIVATE_CHAT_MESSAGE(WidgetID.PRIVATE_CHAT, 0),

	SLAYER_REWARDS_TOPBAR(WidgetID.SLAYER_REWARDS_GROUP_ID, WidgetID.SlayerRewards.TOP_BAR),

	CHATBOX_PARENT(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.PARENT),
	CHATBOX(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.FRAME),
	CHATBOX_MESSAGES(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.MESSAGES),
	CHATBOX_BUTTONS(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.BUTTONS),
	CHATBOX_TITLE(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.TITLE),
	CHATBOX_FULL_INPUT(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.FULL_INPUT),
	CHATBOX_CONTAINER(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.CONTAINER),
	CHATBOX_REPORT_TEXT(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.REPORT_TEXT),
	CHATBOX_INPUT(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.INPUT),
	CHATBOX_TRANSPARENT_BACKGROUND(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.TRANSPARENT_BACKGROUND),
	CHATBOX_TRANSPARENT_LINES(WidgetID.CHATBOX_GROUP_ID, WidgetID.Chatbox.TRANSPARENT_BACKGROUND_LINES),

	BA_HEAL_WAVE_TEXT(WidgetID.BA_HEALER_GROUP_ID, WidgetID.BarbarianAssault.CURRENT_WAVE),
	BA_HEAL_CALL_TEXT(WidgetID.BA_HEALER_GROUP_ID, WidgetID.BarbarianAssault.TO_CALL),
	BA_HEAL_LISTEN_TEXT(WidgetID.BA_HEALER_GROUP_ID, WidgetID.BarbarianAssault.CORRECT_STYLE),
	BA_HEAL_ROLE_TEXT(WidgetID.BA_HEALER_GROUP_ID, WidgetID.BarbarianAssault.ROLE),
	BA_HEAL_ROLE_SPRITE(WidgetID.BA_HEALER_GROUP_ID, WidgetID.BarbarianAssault.ROLE_SPRITE),

	BA_COLL_WAVE_TEXT(WidgetID.BA_COLLECTOR_GROUP_ID, WidgetID.BarbarianAssault.CURRENT_WAVE),
	BA_COLL_CALL_TEXT(WidgetID.BA_COLLECTOR_GROUP_ID, WidgetID.BarbarianAssault.TO_CALL),
	BA_COLL_LISTEN_TEXT(WidgetID.BA_COLLECTOR_GROUP_ID, WidgetID.BarbarianAssault.CORRECT_STYLE),
	BA_COLL_ROLE_TEXT(WidgetID.BA_COLLECTOR_GROUP_ID, WidgetID.BarbarianAssault.ROLE),
	BA_COLL_ROLE_SPRITE(WidgetID.BA_COLLECTOR_GROUP_ID, WidgetID.BarbarianAssault.ROLE_SPRITE),

	BA_ATK_WAVE_TEXT(WidgetID.BA_ATTACKER_GROUP_ID, WidgetID.BarbarianAssault.CURRENT_WAVE),
	BA_ATK_CALL_TEXT(WidgetID.BA_ATTACKER_GROUP_ID, WidgetID.BarbarianAssault.ATK.TO_CALL),
	BA_ATK_LISTEN_TEXT(WidgetID.BA_ATTACKER_GROUP_ID, WidgetID.BarbarianAssault.CORRECT_STYLE),
	BA_ATK_ROLE_TEXT(WidgetID.BA_ATTACKER_GROUP_ID, WidgetID.BarbarianAssault.ATK.ROLE),
	BA_ATK_ROLE_SPRITE(WidgetID.BA_ATTACKER_GROUP_ID, WidgetID.BarbarianAssault.ATK.ROLE_SPRITE),

	BA_DEF_WAVE_TEXT(WidgetID.BA_DEFENDER_GROUP_ID, WidgetID.BarbarianAssault.CURRENT_WAVE),
	BA_DEF_CALL_TEXT(WidgetID.BA_DEFENDER_GROUP_ID, WidgetID.BarbarianAssault.TO_CALL),
	BA_DEF_LISTEN_TEXT(WidgetID.BA_DEFENDER_GROUP_ID, WidgetID.BarbarianAssault.CORRECT_STYLE),
	BA_DEF_ROLE_TEXT(WidgetID.BA_DEFENDER_GROUP_ID, WidgetID.BarbarianAssault.ROLE),
	BA_DEF_ROLE_SPRITE(WidgetID.BA_DEFENDER_GROUP_ID, WidgetID.BarbarianAssault.ROLE_SPRITE),

	BA_REWARD_TEXT(WidgetID.BA_REWARD_GROUP_ID, WidgetID.BarbarianAssault.REWARD_TEXT),

	LEVEL_UP(WidgetID.LEVEL_UP_GROUP_ID, 0),
	LEVEL_UP_SKILL(WidgetID.LEVEL_UP_GROUP_ID, WidgetID.LevelUp.SKILL),
	LEVEL_UP_LEVEL(WidgetID.LEVEL_UP_GROUP_ID, WidgetID.LevelUp.LEVEL),

	QUEST_COMPLETED(WidgetID.QUEST_COMPLETED_GROUP_ID, 0),
	QUEST_COMPLETED_NAME_TEXT(WidgetID.QUEST_COMPLETED_GROUP_ID, WidgetID.QuestCompleted.NAME_TEXT),

	MOTHERLODE_MINE(WidgetID.MOTHERLODE_MINE_GROUP_ID, 0),

	PUZZLE_BOX(WidgetID.PUZZLE_BOX_GROUP_ID, WidgetID.PuzzleBox.VISIBLE_BOX),

	LIGHT_BOX(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.LIGHT_BOX),
	LIGHT_BOX_CONTENTS(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.LIGHT_BULB_CONTAINER),
	LIGHT_BOX_BUTTON_A(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.BUTTON_A),
	LIGHT_BOX_BUTTON_B(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.BUTTON_B),
	LIGHT_BOX_BUTTON_C(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.BUTTON_C),
	LIGHT_BOX_BUTTON_D(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.BUTTON_D),
	LIGHT_BOX_BUTTON_E(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.BUTTON_E),
	LIGHT_BOX_BUTTON_F(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.BUTTON_F),
	LIGHT_BOX_BUTTON_G(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.BUTTON_G),
	LIGHT_BOX_BUTTON_H(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.BUTTON_H),

	LIGHT_BOX_WINDOW(WidgetID.LIGHT_BOX_GROUP_ID, WidgetID.LightBox.LIGHT_BOX_WINDOW),

	NIGHTMARE_ZONE(WidgetID.NIGHTMARE_ZONE_GROUP_ID, 0),

	RAIDS_POINTS_INFOBOX(WidgetID.RAIDS_GROUP_ID, WidgetID.Raids.POINTS_INFOBOX),

	BLAST_FURNACE_COFFER(WidgetID.BLAST_FURNACE_GROUP_ID, 2),

	PYRAMID_PLUNDER_DATA(WidgetID.PYRAMID_PLUNDER_GROUP_ID, 3),

	EXPERIENCE_TRACKER(WidgetID.EXPERIENCE_TRACKER_GROUP_ID, 0),
	EXPERIENCE_TRACKER_WIDGET(WidgetID.EXPERIENCE_TRACKER_GROUP_ID, WidgetID.ExperienceTracker.WIDGET),
	EXPERIENCE_TRACKER_BOTTOM_BAR(WidgetID.EXPERIENCE_TRACKER_GROUP_ID, WidgetID.ExperienceTracker.BOTTOM_BAR),

	TITHE_FARM(WidgetID.TITHE_FARM_GROUP_ID, 1),

	BARROWS_INFO(WidgetID.BARROWS_GROUP_ID, 0),
	BARROWS_BROTHERS(WidgetID.BARROWS_GROUP_ID, WidgetID.Barrows.BARROWS_BROTHERS),
	BARROWS_POTENTIAL(WidgetID.BARROWS_GROUP_ID, WidgetID.Barrows.BARROWS_POTENTIAL),
	BARROWS_REWARD_INVENTORY(WidgetID.BARROWS_REWARD_GROUP_ID, WidgetID.Barrows.BARROWS_REWARD_INVENTORY),

	BLAST_MINE(WidgetID.BLAST_MINE_GROUP_ID, 2),

	FAIRY_RING(WidgetID.FAIRY_RING_GROUP_ID, 0),

	FAIRY_RING_HEADER(WidgetID.FAIRY_RING_PANEL_GROUP_ID, WidgetID.FairyRingPanel.HEADER),
	FAIRY_RING_LIST(WidgetID.FAIRY_RING_PANEL_GROUP_ID, WidgetID.FairyRingPanel.LIST),
	FAIRY_RING_FAVORITES(WidgetID.FAIRY_RING_PANEL_GROUP_ID, WidgetID.FairyRingPanel.FAVORITES),
	FAIRY_RING_LIST_SEPARATOR(WidgetID.FAIRY_RING_PANEL_GROUP_ID, WidgetID.FairyRingPanel.SEPARATOR),
	FAIRY_RING_LIST_SCROLLBAR(WidgetID.FAIRY_RING_PANEL_GROUP_ID, WidgetID.FairyRingPanel.SCROLLBAR),

	DESTROY_ITEM(WidgetID.DESTROY_ITEM_GROUP_ID, 0),
	DESTROY_ITEM_NAME(WidgetID.DESTROY_ITEM_GROUP_ID, WidgetID.DestroyItem.DESTROY_ITEM_NAME),
	DESTROY_ITEM_YES(WidgetID.DESTROY_ITEM_GROUP_ID, WidgetID.DestroyItem.DESTROY_ITEM_YES),
	DESTROY_ITEM_NO(WidgetID.DESTROY_ITEM_GROUP_ID, WidgetID.DestroyItem.DESTROY_ITEM_NO),

	VARROCK_MUSEUM_QUESTION(WidgetID.VARROCK_MUSEUM_QUIZ_GROUP_ID, WidgetID.VarrockMuseum.VARROCK_MUSEUM_QUESTION),
	VARROCK_MUSEUM_FIRST_ANSWER(WidgetID.VARROCK_MUSEUM_QUIZ_GROUP_ID, WidgetID.VarrockMuseum.VARROCK_MUSEUM_FIRST_ANSWER),
	VARROCK_MUSEUM_SECOND_ANSWER(WidgetID.VARROCK_MUSEUM_QUIZ_GROUP_ID, WidgetID.VarrockMuseum.VARROCK_MUSEUM_SECOND_ANSWER),
	VARROCK_MUSEUM_THIRD_ANSWER(WidgetID.VARROCK_MUSEUM_QUIZ_GROUP_ID, WidgetID.VarrockMuseum.VARROCK_MUSEUM_THIRD_ANSWER),

	KILL_LOG_TITLE(WidgetID.KILL_LOGS_GROUP_ID, WidgetID.KillLog.TITLE),
	KILL_LOG_MONSTER(WidgetID.KILL_LOGS_GROUP_ID, WidgetID.KillLog.MONSTER),
	KILL_LOG_KILLS(WidgetID.KILL_LOGS_GROUP_ID, WidgetID.KillLog.KILLS),
	KILL_LOG_STREAK(WidgetID.KILL_LOGS_GROUP_ID, WidgetID.KillLog.STREAK),

	WORLD_SWITCHER_LIST(WidgetID.WORLD_SWITCHER_GROUP_ID, WidgetID.WorldSwitcher.WORLD_LIST),

	FOSSIL_ISLAND_OXYGENBAR(WidgetID.FOSSIL_ISLAND_OXYGENBAR_ID, WidgetID.FossilOxygen.FOSSIL_ISLAND_OXYGEN_BAR),

	MINIGAME_TELEPORT_BUTTON(WidgetID.MINIGAME_TAB_ID, WidgetID.Minigames.TELEPORT_BUTTON),

	SPELL_LUMBRIDGE_HOME_TELEPORT(WidgetID.SPELLBOOK_GROUP_ID, WidgetID.StandardSpellBook.LUMBRIDGE_HOME_TELEPORT),
	SPELL_EDGEVILLE_HOME_TELEPORT(WidgetID.SPELLBOOK_GROUP_ID, WidgetID.AncientSpellBook.EDGEVILLE_HOME_TELEPORT),
	SPELL_LUNAR_HOME_TELEPORT(WidgetID.SPELLBOOK_GROUP_ID, WidgetID.LunarSpellBook.LUNAR_HOME_TELEPORT),
	SPELL_ARCEUUS_HOME_TELEPORT(WidgetID.SPELLBOOK_GROUP_ID, WidgetID.ArceuusSpellBook.ARCEUUS_HOME_TELEPORT),

	PVP_CONTAINER(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.PVP_WIDGET_CONTAINER),
	PVP_SKULL_CONTAINER(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.SKULL_CONTAINER),
	PVP_SKULL(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.SKULL),
	PVP_WILDERNESS_LEVEL(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.ATTACK_RANGE),
	PVP_BOUNTY_HUNTER_INFO(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.BOUNTY_HUNTER_INFO),
	PVP_BOUNTY_HUNTER_STATS(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.BOUNTY_HUNTER_STATS),
	PVP_KILLDEATH_COUNTER(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.KILLDEATH_RATIO),

	PVP_WORLD_SAFE_ZONE(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.SAFE_ZONE),
	PVP_WORLD_ATTACK_RANGE(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.ATTACK_RANGE),

	DEADMAN_PROTECTION_TEXT(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.WILDERNESS_LEVEL),
	DEADMAN_PROTECTION_TIME(WidgetID.PVP_GROUP_ID, WidgetID.Pvp.DEADMAN_PROTECTION_TIME),

	KOUREND_FAVOUR_OVERLAY(WidgetID.KOUREND_FAVOUR_GROUP_ID, WidgetID.KourendFavour.KOUREND_FAVOUR_OVERLAY),
	ZEAH_MESS_HALL_COOKING_DISPLAY(WidgetID.ZEAH_MESS_HALL_GROUP_ID, WidgetID.Zeah.MESS_HALL_COOKING_DISPLAY),

	LOOTING_BAG_CONTAINER(WidgetID.LOOTING_BAG_GROUP_ID, WidgetID.LootingBag.LOOTING_BAG_INVENTORY),

	SKOTIZO_CONTAINER(WidgetID.SKOTIZO_GROUP_ID, WidgetID.Skotizo.CONTAINER);

	private final int groupId;
	private final int childId;

	WidgetInfo(int groupId, int childId)
	{
		this.groupId = groupId;
		this.childId = childId;
	}

	/**
	 * Gets the ID of the group-child pairing.
	 *
	 * @return the ID
	 */
	public int getId()
	{
		return groupId << 16 | childId;
	}

	/**
	 * Gets the group ID of the pair.
	 *
	 * @return the group ID
	 */
	public int getGroupId()
	{
		return groupId;
	}

	/**
	 * Gets the ID of the child in the group.
	 *
	 * @return the child ID
	 */
	public int getChildId()
	{
		return childId;
	}

	/**
	 * Gets the packed widget ID.
	 *
	 * @return the packed ID
	 */
	public int getPackedId()
	{
		return groupId << 16 | childId;
	}

	/**
	 * Utility method that converts an ID returned by {@link #getId()} back
	 * to its group ID.
	 *
	 * @param id passed group-child ID
	 * @return the group ID
	 */
	public static int TO_GROUP(int id)
	{
		return id >>> 16;
	}

	/**
	 * Utility method that converts an ID returned by {@link #getId()} back
	 * to its child ID.
	 *
	 * @param id passed group-child ID
	 * @return the child ID
	 */
	public static int TO_CHILD(int id)
	{
		return id & 0xFFFF;
	}

	/**
	 * Packs the group and child IDs into a single integer.
	 *
	 * @param groupId the group ID
	 * @param childId the child ID
	 * @return the packed ID
	 */
	public static int PACK(int groupId, int childId)
	{
		return groupId << 16 | childId;
	}

}
