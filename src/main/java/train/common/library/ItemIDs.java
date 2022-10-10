/*******************************************************************************
 * Copyright (c) 2012 mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author mrbrutal
 ******************************************************************************/

package train.common.library;

import net.minecraft.item.Item;

public enum ItemIDs {
	diesel("ItemContainer", "item_diesel_filled", 20),
	stake("ItemStacked", "item_stake", 1),
	steeldust("ItemTrain", "item_steeldust", 0),
	coaldust("ItemTrain", "item_coaldust", 15),
	graphite("ItemTrain", "item_graphite", 10),
	boiler("ItemTrain", "item_boiler_steel", 5),
	firebox("ItemTrain", "item_firebox_steel", 5),
	bogie("ItemTrain", "item_bogie_steel", 4),
	steelframe("ItemTrain", "item_frame_steel", 6),
	steelcab("ItemTrain", "item_cab_steel", 5),
	steelchimney("ItemTrain", "item_chimney_steel", 5),
	airship("ItemZeppelin", "item_zeppelin", 1),
	balloon("ItemTrain", "item_balloon", 7),
	propeller("ItemTrain", "item_propeller", 6),
	steamengine("ItemTrain", "item_engine_steam", 2),
	dieselengine("ItemTrain", "item_engine_diesel", 1),
	piston("ItemTrain", "item_piston", 9),
	camshaft("ItemTrain", "item_camshaft", 8),
	cylinder("ItemTrain", "item_cylinder", 7),
	electmotor("ItemTrain", "item_engine_electric", 1),
	woodenFrame("ItemTrain", "item_frame_wood", 12),
	woodenBogie("ItemTrain", "item_bogie_wood", 15),
	woodenCab("ItemTrain", "item_cab_wood", 10),
	ironChimney("ItemTrain", "item_chimney_iron", 7),
	ironFirebox("ItemTrain", "item_firebox_iron", 4),
	ironBoiler("ItemTrain", "item_boiler_iron", 5),
	ironFrame("ItemTrain", "item_frame_iron", 6),
	ironBogie("ItemTrain", "item_bogie_iron", 8),
	ironCab("ItemTrain", "item_cab_iron", 5),
	steel("ItemTrain", "item_steel", 4),
	refinedFuel("ItemContainer", "item_fuel_filled", 15),
	signal("ItemSignal", "item_signal", 0),
	kSignal("ItemsignalSpanish","signalK",2),
	seats("ItemTrain", "item_seats", 15),
	transformer("ItemTrain", "item_transformer", 4),
	controls("ItemTrain", "item_controls", 7),
	transmition("ItemTrain", "item_transmition", 5),
	generator("ItemTrain", "item_generator", 5),
	overalls("ItemTCArmor", "armour_overalls", 1),
	jacket("ItemTCArmor", "armour_jacket", 1),
	hat("ItemTCArmor", "armour_hat", 1),
	rawPlastic("ItemTrain", "item_plastic", 20),
	ingotCopper("ItemTrain", "item_copper", 9),
	copperWireFine("ItemTrain", "item_wire", 4),
	electronicCircuit("ItemTrain", "item_circuit", 2),
	chunkLoaderActivator("ItemChunkLoaderActivator", "item_chunk_loader", 1),
	//refinedFuelLiquid("ItemTrain", "item_liquid_fuel"),
	//dieselLiquid("ItemTrain", "item_liquid_diesel"),
	emptyCanister("ItemContainer", "item_canister", 40),
	//copperRail("ItemRail", "item_rail_copper", 1),
	//steelRail("ItemRail", "item_rail_steel", 1),
	copperRail("ItemTrain", "item_rail_copper", 1),
	steelRail("ItemTrain", "item_rail_steel", 1),
	recipeBook("ItemRecipeBook", "item_book_blue", 1),
	adminBook("ItemAdminBook", "item_book_blue", 0),
	wirelessTransmitter("ItemWirelessTransmitter", "wireless_transmitter", 3),
	paintbrushThing("ItemPaintbrushThing","paintbrushThing",1),
	whistle("ItemWhistle","whistle", 1),
	bolt("ItemBolt", "bolt", 1),
	hat_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_hat", 1),
	pants_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_pants", 1),
	jacket_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_jacket", 1),
	hat_driver_paintable("ItemTCArmor", "armor_driver_hat", 1),
	pants_driver_paintable("ItemTCArmor", "armor_driver_pants", 1),
	jacket_driver_paintable("ItemTCArmor", "armor_driver_jacket", 1),

	helmet_suit_paintable("ItemTCArmor", "armor_composite_helmet", 1),
	pants_suit_paintable("ItemTCArmor", "armor_composite_pants", 1),
	boots_suit_paintable("ItemTCArmor", "armor_composite_boots", 1),
	jacket_suit_paintable("ItemTCArmor", "armor_composite_chest", 1),
	reinforcedPlastic("ItemTrain", "item_fiberglass_plate", 10),
	reinforcedPlates("ItemTrain", "item_reinforced_plate", 10),
	composite_wrench("ItemWrench", "item_composite_wrench", 1),

	/**Normal Tracks*/
	tcRailSmallStraight("ItemTCRail", "item_rail_straight_small", 5),
	tcRailMediumStraight("ItemTCRail", "item_rail_straight_medium", 5),
	tcRailLongStraight("ItemTCRail", "item_rail_straight_large", 5),
	tcRailVeryLongStraight("ItemTCRail", "item_rail_straight_very_large", 5),

	tcRailSmallDiagonalStraight("ItemTCRail", "item_rail_diagonal_straight_small", 5 ),
	tcRailMediumDiagonalStraight("ItemTCRail", "item_rail_diagonal_straight_medium", 5 ),
	tcRailLongDiagonalStraight("ItemTCRail", "item_rail_diagonal_straight_long", 5 ),
	tcRailVeryLongDiagonalStraight("ItemTCRail", "item_rail_diagonal_straight_very_long", 5 ),

	tcRailMediumTurn("ItemTCRail", "item_rail_turn_medium", 5),
	tcRailLargeTurn("ItemTCRail", "item_rail_turn_large", 5),
	tcRailVeryLargeTurn("ItemTCRail", "item_rail_turn_veryLarge", 5),
	tcRailSuperLargeTurn("ItemTCRail", "item_rail_tc_super_large_turn", 5),


	tcRailMedium45DegreeTurn("ItemTCRail", "item_rail_45degree_turn_medium", 5),
	tcRailLarge45DegreeTurn("ItemTCRail", "item_rail_45degree_turn_large", 5),

	tcRailSmallParallelCurve("ItemTCRail", "item_rail_tc_parallel_curve_small", 3),
	tcRailMediumParallelCurve("ItemTCRail", "item_rail_tc_parallel_curve_medium", 3),
	tcRailLargeParallelCurve("ItemTCRail", "item_rail_tc_parallel_curve_large", 3),

	tcRailTwoWaysCrossing("ItemTCRail","item_rail_two_ways_crossing",5),

	tcRailMediumSwitch("ItemTCRail", "item_rail_switch_medium", 5),
	tcRailLargeSwitch("ItemTCRail", "item_rail_switch_large", 5),
	tcRailMediumParallelSwitch("ItemTCRail", "item_rail_switch_parallel", 5),
	tcRailMedium45DegreeSwitch("ItemTCRail","item_rail_switch_45degree_medium", 5 ),

	tcRailSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
	tcRailSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
	tcRailSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),
	tcRailSlopeSnowGravel("ItemTCRail", "item_rail_straight_slope_snow_gravel", 3),
	tcRailSlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),
	tcRailLargeSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
	tcRailLargeSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
	tcRailLargeSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),
	tcRailLargeSlopeSnowGravel("ItemTCRail", "item_rail_straight_slope_snow_gravel", 3),
	tcRailLargeSlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),
	tcRailVeryLargeSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
	tcRailVeryLargeSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
	tcRailVeryLargeSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),
	tcRailVeryLargeSlopeSnowGravel("ItemTCRail", "item_rail_straight_slope_snow_gravel", 3),
	tcRailVeryLargeSlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),

	/**Embedded Tracks*/
	tcRailEmbeddedSmallStraight("ItemTCRail","item_rail_straight_embedded_small_", 5),
	tcRailEmbeddedMediumStraight("ItemTCRail", "item_rail_straight_embedded_medium", 5),
	tcRailEmbeddedLongStraight("ItemTCRail", "item_rail_straight_embedded_large", 5),
	tcRailEmbeddedVeryLongStraight("ItemTCRail", "item_rail_straight_embedded_very_large", 5),

	tcRailEmbeddedSmallDiagonalStraight("ItemTCRail", "item_rail_embedded_straight_diagonal_small", 5),
	tcRailEmbeddedMediumDiagonalStraight("ItemTCRail", "item_rail_embedded_straight_diagonal_medium", 5),
	tcRailEmbeddedLongDiagonalStraight("ItemTCRail", "item_rail_embedded_straight_diagonal_long", 5),
	tcRailEmbeddedVeryLongDiagonalStraight("ItemTCRail", "item_rail_embedded_straight_diagonal_very_long", 5),

	tcRailEmbeddedMediumTurn("ItemTCRail", "item_rail_tc_embedded_medium_turn", 5),
	tcRailEmbeddedLargeTurn("ItemTCRail", "item_rail_tc_embedded_large_turn", 5),
	tcRailEmbeddedVeryLargeTurn("ItemTCRail", "item_rail_tc_embedded_very_large_turn", 5),
	tcRailEmbeddedSuperLargeTurn("ItemTCRail", "item_rail_tc_embedded_super_large_turn", 5 ),

	tcRailEmbeddedMedium45DegreeTurn("ItemTCRail", "item_rail_embedded_45degree_turn_medium", 5),

	tcRailEmbeddedSmallParallelCurve("ItemTCRail", "item_rail_tc_embedded_parallel_curve_small", 3),
	tcRailEmbeddedMediumParallelCurve("ItemTCRail", "item_rail_tc_embedded_parallel_curve_medium", 3),
	tcRailEmbeddedLargeParallelCurve("ItemTCRail", "item_rail_tc_embedded_parallel_curve_large", 3),

	tcRailEmbeddedTwoWaysCrossing("ItemTCRail","item_rail_embedded_two_ways_crossing",5),

	tcRailEmbeddedMediumSwitch("ItemTCRail", "item_rail_embedded_switch_medium", 5),
	tcRailEmbeddedLargeSwitch("ItemTCRail", "item_rail_embedded_switch_large", 5),
	tcRailEmbeddedMediumParallelSwitch("ItemTCRail", "item_rail_embedded_switch_parallel", 5),
	tcRailEmbeddedMedium45DegreeSwitch("ItemTCRail","item_rail_embedded_switch_45degree_medium", 5 ),

	tcRailSmallRoadCrossing("ItemTCRail", "item_rail_small_road_crossing", 5),
	tcRailSmallRoadCrossing1("ItemTCRail", "item_rail_small_road_crossing_1", 5),
	tcRailSmallRoadCrossing2("ItemTCRail", "item_rail_small_road_crossing_2", 5),

	/**RollingStock*/
	atoCard("ItemATOCard", "ato_card", 5),
	minecartWork("ItemRollingStock", "train_work", 4),
	minecartTender("ItemRollingStock", "train_tender", 4),
	minecartChest("ItemRollingStock", "train_freight_1", 4),
	minecartFreightBamboo("ItemRollingStock", "train_freight_bamboo", 2),
	minecartTrainBamboo("ItemRollingStock", "train_train_bamboo", 3),
	minecartPassengerBamboo("ItemRollingStock", "train_passenger_bamboo", 1),
	minecartFreightGermanPost("ItemRollingStock", "train_freight_german_post", 2),
	minecartFreightDepressedFlatbed("ItemRollingStock", "train_freight_depressed_flatbed", 2),
	minecartPower("ItemRollingStock", "train_steam_normal", 10),
	minecartASTFAutorack("ItemRollingStock", "train_autorack", 5),
	minecartLoco3("ItemRollingStock", "train_steam_small", 7),
	minecartBuilder("ItemRollingStock", "train_builder", 20),
	minecartCaboose("ItemRollingStock", "train_caboose", 6),
	minecartGrain("ItemRollingStock", "train_hopper_grain", 6),
	minecartWatertransp("ItemRollingStock", "train_tank_lava", 7),
	minecartWood("ItemRollingStock", "train_transport_wood", 3),
	minecartPassenger2("ItemRollingStock", "train_passenger_1", 2),
	minecartBR_E69("ItemRollingStock", "train_bre69", 10),
	minecartShunter("ItemRollingStock", "train_shunter", 10),
	minecartVL10("ItemRollingStock", "train_vl10", 10),
	minecartTramWood("ItemRollingStock", "train_tram", 7),
	minecartChmE3("ItemRollingStock", "train_chme3", 8),
	minecartHeavySteam("ItemRollingStock", "train_steam_heavy", 7),
	minecartTenderHeavy("ItemRollingStock", "train_tender_heavy", 5),
	minecartFlatCart("ItemRollingStock", "train_flat", 1),
	//minecartNewHighSpeedLoco("ItemRollingStock","train_speed",10),
	minecartFreightCart2("ItemRollingStock", "train_freight_2", 2),
	minecartOpenWagon("ItemRollingStock", "train_hopper", 3),
	minecartTankWagon("ItemRollingStock", "train_tank_us", 5),
	minecartJukeBoxCart("ItemRollingStock", "train_jukebox", 10),
	minecartStockCar("ItemRollingStock", "train_stock", 10),
	minecartDRWGStockCar("ItemRollingStock", "drwg_stockcar", 10),
	minecartCabooseWork("ItemRollingStock", "train_caboose_work", 3),
	minecartPassenger5("ItemRollingStock", "train_passenger_2", 2),
	minecartTankWagon2("ItemRollingStock", "train_tank_blue", 5),
	minecartPassengerBlue("ItemRollingStock", "train_passenger_3", 2),
	minecartGP7Red("ItemRollingStock", "train_gp7", 10),
	minecartCD742("ItemRollingStock", "train_cd742", 10),
	minecartFlatCartSU("ItemRollingStock", "train_flat_su", 1),
	minecartFlatCartUS("ItemRollingStock", "train_flat_us", 1),
	minecartBoxCartUS("ItemRollingStock", "train_box_us", 4),
	minecartBoxCartPRR("ItemRollingStock", "train_box_prr", 4),
	minecartFreightHopperUS("ItemRollingStock", "train_hopper_us", 6),
	minecartFreight100TonHopper("ItemRollingStock", "train_100_ton_hopper", 8),
	minecartTankWagonUS("ItemRollingStock", "train_tank_us_2", 8),
	minecartTankWagonThreeDome("ItemRollingStock", "train_tank_three_dome", 7),
	minecartFlatCartWoodUS("ItemRollingStock", "train_flat_wood", 3),
	minecartBulkheadFlatCart("ItemRollingStock", "train_bulkheadflat_wood", 3),
	minecartFreightCartUS("ItemRollingStock", "train_freight_3", 4),
	minecartFreightCartSmall("ItemRollingStock", "train_freight_4", 2),
	minecartLocoCherepanov("ItemRollingStock", "train_cherpanov", 4),
	minecartMineTrain("ItemRollingStock", "train_mine_cart", 1),
	minecartLocoMineTrain("ItemRollingStock", "train_mine_train", 2),
	minecartSteamRedTender("ItemRollingStock", "train_tender_steam", 4),
	minecartFreightWood2("ItemRollingStock", "train_transport_wood_2", 6),
	minecartCaboose3("ItemRollingStock", "train_caboose_2", 3),
	minecartGWRBrakeVan("ItemRollingStock", "train_gwr_brakevan", 3),
	minecartPassenger7("ItemRollingStock", "train_passenger_4", 2),
	minecartFreightClosed("ItemRollingStock", "train_freight_closed", 5),
	minecartFreightOpen2("ItemRollingStock", "train_freight_open", 6),
	minecartLocomogulBlue("ItemRollingStock", "train_mogul", 10),
	minecartLocoForneyRed("ItemRollingStock", "train_forney", 10),
	minecartLocoBR01_DB("ItemRollingStock", "train_br01", 15),
	minecartLocoCoranationClass("ItemRollingStock", "train_coronationclass", 15),
	minecartLocoCoranationClassTender("ItemRollingStock", "train_coronationclasstender", 15),
	minecartMailWagon_DB("ItemRollingStock", "train_mail", 4),
	minecartFreightWagon_DB("ItemRollingStock", "train_freight_db", 3),
	minecartPassenger8_1class_DB("ItemRollingStock", "train_passenger_5", 6),
	minecartPassenger9_2class_DB("ItemRollingStock", "train_passenger_6", 5),
	minecartLocoBR80_DB("ItemRollingStock", "train_br80", 10),
	minecartTenderBR01_DB("ItemRollingStock", "train_tender_br01", 15),
	minecartFlatCartRail_DB("ItemRollingStock", "train_transport_rail", 6),
	minecartFlatCart_DB("ItemRollingStock", "train_flat_db", 1),
	minecartFlatCartLogs_DB("ItemRollingStock", "train_transport_wood_3", 2),
	minecartPropagandaJapan("ItemRollingStock", "propaganda_japan", 2),
	minecartPropagandaBritish("ItemRollingStock", "propaganda_british", 2),
	minecartPropagandaUSSR("ItemRollingStock", "propaganda_ussr", 2),
	minecartPropagandaUs("ItemRollingStock", "propaganda_us", 2),
	minecartFreightGondola_DB("ItemRollingStock", "train_freight_gondola", 3),
	minecartFreightL("ItemRollingStock", "train_freight_l", 3),
	minecartTankWagon_DB("ItemRollingStock", "train_tank_db", 6),
	minecartLocoSD70("ItemRollingStock", "train_sd70", 10),
	minecartLocoBP4("ItemRollingStock", "train_bp4", 10),
	minecartHeavyweightFreight("ItemRollingStock", "train_heavyweight_freight", 10),
	minecartLocoEMDF7("ItemRollingStock", "train_emdf7", 10),
	minecartLocoEMDF3("ItemRollingStock", "train_emdf3", 10),
	minecartLocoEMDF7B("ItemRollingStock", "train_emdf7b", 10),
	minecartLocoEMDF3B("ItemRollingStock", "train_emdf3b", 10),
	minecartLocoDD35B("ItemRollingStock", "train_dd35b", 10),
	minecartLocoWLs40("ItemRollingStock", "train_wls40", 10),
	//minecartRotativeDigger("ItemRotativeDigger","train_",10),
	minecartLocoEr("ItemRollingStock", "train_ussr", 10),
	minecartTenderEr("ItemRollingStock", "train_tender_ussr", 4),
	minecartTenderC41("ItemRollingStock", "train_tender_c41", 4),
	minecartLocoC41("ItemRollingStock", "train_c41", 6),
	minecartLocoC41_080("ItemRollingStock", "train_c41_080", 6),
	minecartLocoAlcoSC4("ItemRollingStock", "train_alcosc4", 6),
	minecartLocoC41T("ItemRollingStock", "train_c41t", 6),
	minecartLocoSouthern1102("ItemRollingStock", "train_southern1102", 6),
	minecartTenderSouthern1102("ItemRollingStock", "train_southern1102tender", 3),
	minecartLocoUSATCUS("ItemRollingStock", "train_S100US", 6),
	minecartLocoUSATCUK("ItemRollingStock", "train_S100UK", 6),
	//minecartLocoU57("ItemRollingStock","train_",10),
	//minecartTenderU57("ItemRollingStock","train_",10),
	//minecartLocoSD40("ItemRollingStock","train_",10),
	minecartFreightCenterBeam_Empty("ItemRollingStock", "train_freight_empty", 2),
	minecartFreightCenterBeam_Wood_1("ItemRollingStock", "train_freight_wood_1", 3),
	minecartFreightCenterBeam_Wood_2("ItemRollingStock", "train_freight_wood_2", 3),
	minecartFreightTrailer("ItemRollingStock", "train_freight_trailer", 5),
	minecartFreightWellcar("ItemRollingStock", "train_freight_wellcar", 5),
	minecartFreightGTNG("ItemRollingStock", "freight_gtng", 5),
	minecartHeavyweightMailcar("ItemRollingStock", "heavyweight_mailcar", 5),
	minecartKof_DB("ItemRollingStock", "train_kof", 10),
	minecartV60_DB("ItemRollingStock", "train_v60", 10),
	minecartLocoCD151("ItemRollingStock", "train_CD151", 3),
	minecartE10_DB("ItemRollingStock", "train_e10db", 10),
	minecartE103("ItemRollingStock", "train_e103", 10),
	minecartIC4_DSB_FG("ItemRollingStock", "train_ic4_dsb_fg", 10),
	minecartIC4_DSB_FH("ItemRollingStock", "train_ic4_dsb_fh", 10),
	minecartIC4_DSB_MG("ItemRollingStock", "train_ic4_dsb_mg", 10),
	minecartGS4_Loco("ItemRollingStock", "GS4_engine", 10),
	minecartGS4_Passenger("ItemRollingStock", "GS4_passenger", 10),
	minecartGS4_Baggage("ItemRollingStock", "GS4_baggage", 10),
	minecartGS4_Observatory("ItemRollingStock", "GS4_observatory", 10),
	minecartGS4_Tail("ItemRollingStock", "GS4_tail", 10),
	minecartGS4_Tender("ItemRollingStock", "GS4_tender", 10),
	minecart4000GallonTender("ItemRollingStock", "4000GallonTender", 10),
	minecarttenderBerk1225("ItemRollingStock", "BerkshireTender", 10),
	minecartLocoHallClass("ItemRollingStock", "HallClass", 3),
	minecartLocoBerk1225("ItemRollingStock", "Berkshire1225", 3),
	minecartLocoBerk765("ItemRollingStock", "Berkshire765", 3),
	minecartLocoFowler("ItemRollingStock", "Fowler 4F", 3),
	minecartFowler4FTender("ItemRollingStock", "Fowler 4F Tender", 3),
	minecartLocoKingClass("ItemRollingStock", "KingClass", 3),
	minecartLoco44TonSwitcher("ItemRollingStock", "train_44tonner", 10),
	minecartDenverRioGrandePassenger("ItemRollingStock", "denverriogrande_passenger", 10),
	minecartDenverRioGrandeCombo("ItemRollingStock", "denverriogrande_combo", 10),
	minecartDenverRioGrandeBaggage("ItemRollingStock", "denverriogrande_baggage", 10),
	minecartMILW_H1044("ItemRollingStock", "MILW_H1044", 10),
	minecartSlateWagon("ItemRollingStock", "slatewagon", 10),
	minecartIceWagon("ItemRollingStock", "icewagon", 10),
	minecartICE1_Loco("ItemRollingStock", "train_ice1", 10),
	minecartICE1_1stClass("ItemRollingStock", "train_ice1_passenger", 10),
	minecartICE1_2ndClass("ItemRollingStock", "train_ice1_passenger", 10),
	minecartICE1_Restaurant("ItemRollingStock", "train_ice1_restaurant", 10),
	minecartBoulderWagon("ItemRollingStock", "BoulderWagon", 1),
	minecartKVB_2300("ItemRollingStock", "kvb_2300", 3),
	minecartKVB_2300_B("ItemRollingStock", "kvb_2300_b", 3),
	minecartBR_Mk1_BSO("ItemRollingStock", "Mk1_BSO_Icon", 3),
	minecartBR_Mk1_TSO("ItemRollingStock", "Mk1_TSO_Icon", 3),
	minecartBR_Mk1_Buffet("ItemRollingStock", "Mk1_Buffet_Icon", 3),
	minecartBR_Mk1_BG("ItemRollingStock", "Mk1_BG_Icon", 3),
	minecartBR_Mk1_TPO_Stowage("ItemRollingStock", "Mk1_TPO_Stowage_Icon", 3),
	minecartBR_MK2F_Coach("ItemRollingStock", "Mk2f_Coach_Icon", 3),
	minecartBR_Mk2f_BSO("ItemRollingStock", "Mk2f_BSO_Icon", 3),
	minecartBR_MK3_DVT("ItemRollingStock", "br_mk3_dvt", 3),
	minecartBR_MK3_Buffet("ItemRollingStock", "br_mk3_buffet", 3),
	minecartBR_MK3_Coach("ItemRollingStock", "br_mk3_coach", 3),
	minecartBR_MK3a_Coach("ItemRollingStock", "Mk3a_Coach_Icon", 3),
	minecartBR_MK4_DVT("ItemRollingStock","br_mk4_dvt",5),
	minecartBR_MK4_Coach("ItemRollingStock","br_mk4_coach",3),
	minecartBR_MK4_Buffet("ItemRollingStock", "br_mk4_buffet", 3),
	minecartClass43("ItemRollingStock", "class43",5),
	minecartClass90("ItemRollingStock", "class90", 5),
	minecartClass91("ItemRollingStock", "class91", 5),
	minecartClass321("ItemRollingStock","class321", 5),
	minecartClass321Panto("ItemRollingStock","class321panto",3),
	minecartClass321Coach("ItemRollingStock","class321coach", 3),
	minecartPassengerHighSpeedCarZeroED("ItemRollingStock", "train_high_speed_cart_zeroed", 14),
	minecartNYTram("ItemRollingStock", "train_tram_ny", 7),
	minecartMetro2000Loco("ItemRollingStock", "metro2000_motor", 5),
	minecartMetro2000Passenger("ItemRollingStock", "metro2000_Tail", 5),
	minecartLocoHighSpeedZeroED("ItemRollingStock", "train_high_speed_loco_zeroed", 17),
	minecartLocoA4Mallard("ItemRollingStock", "train_loco_a4_mallard", 14),
	minecartLocoA4MallardTender("ItemRollingStock", "train_loco_a4_mallard_tender", 5),
	minecartLocoC62Class("ItemRollingStock", "train_loco_c62_class", 14),
	minecartLocoD51Short("ItemRollingStock", "train_loco_d51s", 14),
	minecartLocoD51Long("ItemRollingStock", "train_loco_d51", 14),
	minecartTenderC62Class("ItemRollingStock", "train_tender_c62_class", 5),
	minecartTenderD51("ItemRollingStock", "train_tender_d51", 5),

	minecartLocoSteamShay("ItemRollingStock", "train_shay", 4),
	minecartLocoSteamVBShay("ItemRollingStock", "train_vbshay", 4),
	minecartLocoSteamClimax("ItemRollingStock", "train_climax", 4),
	minecartLocoSteamPannier("ItemRollingStock", "train_pannier", 4),
	minecartLocoSteamAdler("ItemRollingStock", "train_adler", 3),
	minecartLocoSteamAlice("ItemRollingStock", "train_alice", 3),
	minecartLocoSteamGLYN("ItemRollingStock", "train_glyn", 3),
	minecartLocoSteam262T("ItemRollingStock", "train_262t", 3),
	minecartLocoSteam040vb("ItemRollingStock", "train_040VB", 3),
	minecartLocoBR185("ItemRollingStock", "train_br101", 3),
	minecartLocoClass85("ItemRollingStock", "train_class85", 3),
	minecartLocoDeltic("ItemRollingStock", "train_deltic", 3),
	minecartLocoDD35A("ItemRollingStock", "train_dd35a", 3),
	minecartLocoSnowPlow("ItemRollingStock", "train_snowplow", 3),
	minecartLocoEWSClass66("ItemRollingStock", "train_ewsclass66", 3),
	minecartTenderAdler("ItemRollingStock", "train_tender_adler", 1),
	minecartPassengerAdler("ItemRollingStock", "train_passenger_adler", 2),
	minecartLocoFOLM1("ItemRollingStock", "train_fol_m1", 10),
	minecartKClassRailBox("ItemRollingStock", "train_k_class_railbox", 2),
	minecartLocoLSSP7("ItemRollingStock", "train_lssp7", 4),
	minecartLongCoveredHopper("ItemRollingStock", "train_longcoveredhopper", 3),
	minecartShortCoveredHopper("ItemRollingStock", "train_shortcoveredhopper", 2),

	minecartPassengerRheingold("ItemRollingStock", "train_passenger_rheingold", 5),
	minecartPassengerRheingoldDining1("ItemRollingStock", "train_passenger_rheingolddining1", 5),
	minecartPassengerRheingoldDining2("ItemRollingStock", "train_passenger_rheingolddining2", 5),
	minecartPassengerRheingoldPanorama("ItemRollingStock", "train_passenger_rheingoldpanorama", 5),
    minecartPassengerBW305("ItemRollingStock","bw_icon",3),
	minecartLocoElectricTW305("ItemRollingStock","tw_icon",5),
	minecartLocoElectricInterurbanSeries100("ItemRollingStock","Interurban_100_icon",2),

	minecartPassengerMILW("ItemRollingStock", "train_passenger_milw", 5),
	minecartPassengerMILWTail("ItemRollingStock", "train_passenger_milw_tail", 5),
	minecartBaggageMILW("ItemRollingStock", "train_baggage_milw", 5),
	//minecartPassengerMILWDiner("ItemRollingStock", "train_passenger_milw_diner", 5),
	minecartLocoMILWClassA("ItemRollingStock", "train_milw_class_a", 7),
	minecartMILWTender("ItemRollingStock", "train_milw_tender", 5),

	minecartCabooseLogging("ItemRollingStock", "train_logging_caboose", 1),
	minecartCabooseLoggingPRR("ItemRollingStock", "train_prr_caboose", 1),
	minecartPassengerTramNY("ItemRollingStock", "train_tram_ny", 3),

	minecartPassengerDBOriental("ItemRollingStock", "train_passenger_orient", 2),
	minecartLocoSD40("ItemRollingStock", "train_sd40", 10),
	zeppelin("ItemZeppelin", "item_zeppelin_one_balloon", 1),
	minecartLocoCF7("ItemRollingStock", "train_cf7", 4),
	minecartLocoGP15("ItemRollingStock", "train_gp15", 4),
	minecartLocoSW8("ItemRollingStock", "train_sw8", 4),
	minecartFOLM1B("ItemRollingStock", "folm1b", 4),
	minecartLocoSM42("ItemRollingStock", "train_sm42", 4),
	//minecartLocoWWCPGP7("ItemRollingStock", "train_WWCPGP7", 4),
	minecartLocoGE44Ton("ItemRollingStock", "44-tonner_icon", 4),
	minecartF7A("ItemRollingStock", "f7a", 5),
	minecartF7B("ItemRollingStock", "f7b", 5),
	minecartH1044("ItemRollingStock", "h1044", 4),
	minecartGP13("ItemRollingStock", "gp13", 9),
	minecartB23("ItemRollingStock", "b23", 5),
	minecartC424("ItemRollingStock", "c424", 5),
	minecartC425("ItemRollingStock", "c425", 5),
	minecartGP9("ItemRollingStock", "gp9", 4),
	minecartGP7b("ItemRollingStock", "gp7b", 4),
	minecartGP7u("ItemRollingStock", "gp7u", 4),
	minecartGP7("ItemRollingStock", "gp7", 4),
	minecartGP30("ItemRollingStock", "gp30", 5),
	minecartGP38dash2("ItemRollingStock", "gp38dash2", 5),
	minecartKofIII("ItemRollingStock", "KofIII_Icon", 3),
	minecartKofIIIM("ItemRollingStock", "KofIII_Modernized_Icon", 3),
	minecartU36C( "ItemRollingStock", "u36c", 6),
	minecartGP49("ItemRollingStock", "gp49", 5),
	minecartGP15("ItemRollingStock", "gp15", 4),
	minecartSD9("ItemRollingStock", "sd9", 4),
	minecartSD40dash2("ItemRollingStock", "sd40dash2", 6),
	minecartU23B("ItemRollingStock", "u23b", 4),
	minecartU18B("ItemRollingStock", "U18B", 3),
	minecartHH660("ItemRollingStock", "hh660", 2),
	minecartKrautt("ItemRollingStock", "ML4000", 5),
	minecartDash840B("ItemRollingStock", "B40-8", 4),
	minecartDash840C("ItemRollingStock", "C40-8", 4),
	minecartClass44("ItemRollingStock", "Class44Icon", 4),
	minecartSW1("ItemRollingStock","sw1", 2),
	minecartSW1500("ItemRollingStock", "sw1500", 4),
	minecartSW1200("ItemRollingStock","sw1200", 3),
	minecartRSD15("ItemRollingStock","RSD15_Icon", 4),
	minecartES44("ItemRollingStock", "es44", 8),
	minecartSD70Mac("ItemRollingStock", "sd70mac", 7),
	minecartDash9_44CW("ItemRollingStock", "d944cw", 7),
	minecartDash840BB("ItemRollingStock", "B40-8B", 4),
	minecartDash840BW("ItemRollingStock", "B40-8W", 4),
	minecartDH643("ItemRollingStock", "DH643", 5),
	minecartAlcoS2("ItemRollingStock", "alco_s2", 2),
	minecartCF7("ItemRollingStock", "cf7angle", 3),
	minecartCF7round("ItemRollingStock", "cf7round", 3),
	minecartBeep("ItemRollingStock", "BeepIcon", 2),
	minecartNRE3gs21b("ItemRollingStock", "3gs21b", 4),
	minecartGP38dash9W("ItemRollingStock", "gp38dash9w", 3),

	minecartClimaxNew("ItemRollingStock", "train_climax2", 5),
	minecartVBShay2("ItemRollingStock", "vbshay2", 5),
	minecartLocoC11("ItemRollingStock", "train_C11", 5),
	minecartStarClass("ItemRollingStock", "StarIcon", 3),
	minecartStarClassTender("ItemRollingStock", "StarTenderIcon", 3),
	minecartOnion("ItemRollingStock", "Onion", 10),
	minecartOnionTender("ItemRollingStock", "OnionTender", 10),
	minecartPELocomotive("ItemRollingStock", "PELocoIcon", 5),
	minecartPETender("ItemRollingStock", "PETenderIcon", 3),
	minecartGarrattFront("ItemRollingStock", "garrattFrontIcon", 3),
	minecartGarrattMid("ItemRollingStock", "garrattMidIcon", 3),
	minecartGarrattBack("ItemRollingStock", "garrattRearIcon", 3),
	minecartSkook("ItemRollingStock", "skookum", 5),
	minecartSkookTender("ItemRollingStock", "skookum_tender", 4),
	minecartShay3Truck("ItemRollingStock", "3TruckShay", 5),
	minecartShay3TruckTender("ItemRollingStock", "3TruckShayTender", 4),
	//minecartSteamCrane("ItemRollingStock", "GarrattMidIcon", 3),

	minecartLocoRenfe446Motor("ItemRollingStock", "446_motor_icon", 3),
	minecartPassengerRenfe446Coach("ItemRollingStock", "446_middle_icon", 3),
	minecartCabooseRenfe446Tail("ItemRollingStock", "446_tail_icon", 3),
	minecartPCH120Commute("ItemRollingStock", "pch120", 4),
	minecartPCH120Car("ItemRollingStock", "pch120car", 3),
	minecartPS52seatCoach("ItemRollingStock", "PS52seatCoach", 3),
	minecartPScombine("ItemRollingStock", "PScombine", 3),
	minecartPSCenterDiner("ItemRollingStock", "PScenterDiner", 3),
	minecartPSAnotherDiner("ItemRollingStock", "BAP_Pullman_Standard_lightweight_center_diner_icom", 3),
	minecartDstockEngine("ItemRollingStock","DstockEngine", 4),
	minecartDstockCar("ItemRollingStock","DstockCar", 3),
	minecartLUengine("ItemRollingStock","luengine", 4),
	minecartLUcar("ItemRollingStock","lupassenger", 3),
	minecartClass345engine("ItemRollingStock", "Class345Engine", 4),
	minecartClass345car("ItemRollingStock", "Class345Coach", 3),
	minecartLocoRenfe450Motor("ItemRollingStock", "450_front_icon", 3),
	minecartPassengerRenfe450Coach("ItemRollingStock", "450_middle_icon", 3),
	minecartCabooseRenfe450Tail("ItemRollingStock", "450_tail_icon", 3),
	minecartCD010("ItemRollingStock", "CD010", 2),
	minecartCD810("ItemRollingStock", "CD810", 2),
	minecartCD014("ItemRollingStock", "CD014", 2),// bruh
	minecartCD814("ItemRollingStock", "CD814", 2),
	minecartCD914("ItemRollingStock", "CD914", 2),
	minecartAmfleet("ItemRollingStock", "Amfleet", 3),
	minecartAmfleet2("ItemRollingStock", "Amfleet2", 3),
	minecartPEcooch("ItemRollingStock", "pecoach", 6),
	minecartPEobserve("ItemRollingStock", "peobserve", 6),
	minecartStarCarFat("ItemRollingStock", "GWRClosed_Icon", 3),
	minecartStarCarNotFat("ItemRollingStock", "GWROpen_Icon", 3),
	minecart440RFront("ItemRollingStock", "440R_end_icon", 3),
	minecart440RMid("ItemRollingStock", "440R_middle_icon", 3),
	minecart440RRear("ItemRollingStock", "440R_tail_icon", 3),
	minecart3300Front("ItemRollingStock", "3300_engine_icon", 3),
	minecart3300Rear("ItemRollingStock", "3300_tail_icon", 3),
	minecartPS73Baggage("ItemRollingStock", "PS_73_baggage_icon", 3),
	minecartPS85Baggage("ItemRollingStock", "PS_85_baggage_icon", 3),
	minecartClass158engine("ItemRollingStock", "Class_158_Icon", 4),
	minecartClass158car("ItemRollingStock", "Class_158_Middle_Icon", 3),
	minecartClass47("ItemRollingStock", "Class_47_Icon", 3),
	minecartClass156engine("ItemRollingStock", "Class_156_Icon", 3),
	minecartClass153engine("ItemRollingStock", "153_icon", 3),
	minecartClass153Coach("ItemRollingStock", "153_icon", 3),
	minecartClass175("ItemRollingStock", "Class_175_Icon", 3),
	minecartClass175Coach("ItemRollingStock", "Class_175_Middle_Car_Icon", 3),
	minecartPSSleeper565("ItemRollingStock", "BAP_PS_lightweight_5-6-5_sleeper_icon", 3),
	minecartPSSleeper565DRGW("ItemRollingStock", "BAP_PS_lightweight_DRGW_5-6-5_sleeper_icon", 3),

	minecartBR155("ItemRollingStock", "Db_155_icon", 4),
	minecartDB143("ItemRollingStock", "143_icon", 4),
	minecartEF1("ItemRollingStock", "ef1", 6),
	minecartEF1B("ItemRollingStock", "ef1b", 5),
	minecartEP1A("ItemRollingStock", "ep1a", 6),
	minecartILMA("ItemRollingStock", "I.L.MA_icon", 2),
	minecartILMB("ItemRollingStock", "I.L.M.B", 2),
	//minecartBoxMotor("ItemRollingStock", "BoxMotor", 4),
	minecartEU07("ItemRollingStock", "EU07Icon", 2),
	minecartGM6C("ItemRollingStock", "GM6C_Icon", 5),

	minecartRoundHopper("ItemRollingStock", "train_RoundHopper", 2),
	minecartRibbedHopper("ItemRollingStock", "train_ribbed_hopper", 2),
	minecart40highcube("ItemRollingStock", "40highcube", 3),
	minecartWoodchipHopper("ItemRollingStock", "woodchiphopper", 4),
	minecartOreJenny("ItemRollingStock", "orejenny", 2),
	minecartMillGondola("ItemRollingStock", "millgondola", 4),
	minecartMILW40boxcar("ItemRollingStock", "milw40", 3),
	minecart60centerbeam("ItemRollingStock", "60centerbeam", 3),
	minecart66centerbeam("ItemRollingStock", "66centerbeam", 3),
	minecart73centerbeam("ItemRollingStock", "73centerbeam", 4),
	minecartPS140("ItemRollingStock", "ps140", 3),
	minecartPS150("ItemRollingStock", "ps150", 4),
	minecartPS160("ItemRollingStock", "ps160", 5),
	//minecartOWO60Verticube("ItemRollingStock", "owocube", 6),
	minecartVersaLongi("ItemRollingStock", "versalongi", 5),
	minecartVersaTrans("ItemRollingStock", "versatrans", 5),
	minecart11000DOT111("ItemRollingStock", "11000DOT", 4),
	minecart20600DOT111("ItemRollingStock", "20600DOT", 5),
	minecart29080DOT111("ItemRollingStock", "29080DOT", 6),
	minecartLightCrane("ItemRollingStock", "LightCrane_Icon", 3),
	//minecartWWCP40FootBox("ItemRollingStock", "40fticon", 3),
	//minecartHuskyStackWellcar("ItemRollingStock", "huskystack", 5),
	minecarthicube60foot("ItemRollingStock", "hicube60", 5),
	minecartBNSFGon("ItemRollingStock", "BNSFGondola", 3),
	minecartHopper5201("ItemRollingStock", "Hopper5201", 4),
	minecartHopper6260("ItemRollingStock", "Hopper6260", 5),
	minecartSkeletonLogCar("ItemRollingStock", "Skeleton", 1),
	minecartReefer64("ItemRollingStock", "Reefer64", 5),

	minecartWVcaboose("ItemRollingStock", "wvcaboose",3),
	//minecartHBC1Ccaboose("ItemRollingStock", "HBC1C",3),
	minecartDRGWCaboose("ItemRollingStock", "DRGW_01400_series_caboose",3),
	minecartAlcoPA1("ItemRollingStock", "AlcoPA1Icon",5),
	minecartAlcoPB1("ItemRollingStock", "AlcoPB1Icon",4),
	minecartEMDE8A("ItemRollingStock", "EMDE8AIcon",5),
	minecartEMDE8B("ItemRollingStock", "EMDE8BIcon",5),
	minecartSNCB_M6("ItemRollingStock", "SNCB_M6_Coach_Icon", 5),
	minecartSNCB_M6_TAIL("ItemRollingStock", "SNCB_M6_Tail_Icon", 5),
	minecartNMBS_HLE_18("ItemRollingStock", "NMBS_HLE_18", 5),
	minecartClass319Engine("ItemRollingStock", "Class319Engine", 5),
	minecartClass319passenger("ItemRollingStock", "Class319Middle", 5),
	minecartClass319panto("ItemRollingStock", "Class319Panto", 5),
	minecartClass319Tail("ItemRollingStock", "Class319Tail", 5),
	minecartPSRPOPM("ItemRollingStock", "PSRPOPMIcon", 3),
	minecartPSRPO("ItemRollingStock", "PSRPOIcon", 3),
	minecartPassengerMinetrain("ItemRollingStock","train_mine_cart", 1),
	minecartBNLRV_B("ItemRollingStock", "BNLRV_B", 1 ),
	minecartBNLRV_A("ItemRollingStock", "BNLRV_A", 1 ),
	//minecartasteri("ItemRollingStock", "asteri",1),
	minecartBR_Black_5("ItemRollingStock", "BR_Black_5", 2),
	minecartBR_Black_5_Tender("ItemRollingStock", "BR_Black_5_Tender", 1),
	minecartC415H("ItemRollingStock", "c415h", 4),
	minecartC415S("ItemRollingStock", "c415s", 4),
	minecartC415L("ItemRollingStock", "c415l", 4),
	minecart25Ton("ItemRollingStock", "25-tonner_icon", 2),
	minecartGSI60FootBulkhead("ItemRollingStock", "gsi_bulky", 4),
	minecartGSC60FootFlatcar("ItemRollingStock", "gsc_flatass", 3),
	minecartH24_66("ItemRollingStock", "FM_H24-66_icon", 5),
	minecartH24_66L("ItemRollingStock", "FM_H24-66_L_icon", 5),
	minecartPSLunchCounter_Lounge("ItemRollingStock", "PSLunchCounter_Lounge", 3),
	minecartPS30SeatParlor("ItemRollingStock", "PS30SeatParlor", 3),
	minecartPS54SeatCoach_Lounge("ItemRollingStock", "PS54SeatCoach_Lounge", 3),
	minecartPS58SeatCoach_Observation("ItemRollingStock", "PS58SeatCoach_Observation", 3),
	minecartPSBM56SeatCoach("ItemRollingStock", "PSBM56SeatCoach", 3),
	minecartPSBMCombine("ItemRollingStock", "PSBMCombine", 3),
	minecartPSBMDiner_Lounge("ItemRollingStock", "PSBMDiner_Lounge", 3),
	minecartEMDE7A("ItemRollingStock", "EMDE7AIcon",5),
	minecartEMDE7B("ItemRollingStock", "EMDE7BIcon",5),
	minecart5Plank("ItemRollingStock", "5 plank icon", 5),
	minecartH16_66("ItemRollingStock", "FM_H16-66_icon", 5),
	minecartACFGNRPO_30("ItemRollingStock", "ACFGNRPO_30", 3),
	minecartACFGN60SeatCoach("ItemRollingStock", "ACFGN60SeatCoach", 3),
	minecartFGV4300Motor("ItemRollingStock","FGV4300", 5 ),
	minecartFGV4300Coach("ItemRollingStock", "FGV4300Coach", 5),
	minecartFGV4300Tail("ItemRollingStock","FGV4300Tail",5),
	minecartMetro3000Loco("ItemRollingStock","MM3000_Motor_icon",4),
	minecartMetro3000Passenger("ItemRollingStock","MM3000_Middle_icon",4),
	minecartMetro3000Tail("ItemRollingStock","MM3000_Tail_icon",4),
	minecartcq310Loco("ItemRollingStock","CQ_310_Loco_icon",3),
	minecartcq310Tail("ItemRollingStock","CQ_310_Tail_icon",2),
	minecartClass162Engine("ItemRollingStock","Class_162_Engine_icon",2),
	minecartClass162CoachB("ItemRollingStock","Class_162_Coach_B_icon",1),
	minecartClass162CoachA("ItemRollingStock","Class_162_Coach_A_icon",1),
	minecartClass34("ItemRollingStock", "class_34_icon", 4),
	minecartTanker_UK("ItemRollingStock", "Tanker_UK_icon", 1),
	minecartMetalTram("ItemRollingStock", "Metal_Tram_icon", 2),
	minecartMetalTramCoach("ItemRollingStock", "Metal_Tram_Coach_icon", 1),
	minecartRWType3("ItemRollingStock", "RW_Type_3_icon",2),
	minecartRWType2("ItemRollingStock", "Type_2_Loco_Icon",2),
	minecartRWType2Tender("ItemRollingStock", "Type_2_Tender_Icon", 1),
	minecartHopper_UK("ItemRollingStock", "Hopper_UK_icon", 1),
	minecartGWR42xx("ItemRollingStock", "2-8-0_icon",2),
	minecartGWR72xx("ItemRollingStock", "72xx_icon",2),
	minecartGWR101Class("ItemRollingStock", "GWR_101_icon",2),
	minecartB80C_A("ItemRollingStock", "B80C_A_icon",2),
	minecartB80C_B("ItemRollingStock", "B80C_B_icon",1),
	minecartWoodenTramCoach("ItemRollingStock", "Wooden_Tram_Coach_icon",1),
	minecartMA100_Loco("ItemRollingStock", "MA100_Loco_icon",2),
	minecartMA100_Tail("ItemRollingStock", "MA100_Tail_icon",1),
	minecartExpressFreightVan("ItemRollingStock", "Express_Freight_Van_icon",1),
	minecartWWCPClass062T("ItemRollingStock", "WWCP_Standard_0-6-2_icon",2),

	//signalSpanish("ItemsignalSpanish","signalSpanish", 1),



	;

	public Item item;
	public String className;
	public String iconName;

	/**
	 * amount for one emerald. For ItemRollingStock, it is the price for one train
	 */
	public int amountForEmerald;

	/**
	 * @param classMethodName
	 * @param iconName
	 * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
	 */
	ItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

}