package com.natura.android.sample.data

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class IconsRepositoryTest {

    lateinit var iconsRepository: IconsRepository

    @Before
    fun setUp() {
        iconsRepository = IconsRepository(ApplicationProvider.getApplicationContext())
    }

    @Test
    fun checksIfIconsListHasTheRightSize() {
        val iconsList = iconsRepository.getIconsNamesFromFile()

        assertEquals(200, iconsList.size)
    }

    @Test
    fun checkIfIconsListIsAsExpected() {
        val iconsListFromRepository = iconsRepository.getIconsNamesFromFile()
        val expectedIconsList = getExpectedIconsList()

        assertEquals(expectedIconsList, iconsListFromRepository)
    }

    private fun getExpectedIconsList(): List<String> {
        return (
            listOf("outlined_action_add",
                "outlined_action_addproduct",
                "outlined_action_attachment",
                "outlined_action_autofilter",
                "outlined_action_calendar",
                "outlined_action_camerachange",
                "outlined_action_cancel",
                "outlined_action_change",
                "outlined_action_check",
                "outlined_action_clock",
                "outlined_action_closedbox",
                "outlined_action_copy",
                "outlined_action_copylink",
                "outlined_action_cycle",
                "outlined_action_delete",
                "outlined_action_done",
                "outlined_action_download",
                "outlined_action_edit",
                "outlined_action_favorite",
                "outlined_action_filter",
                "outlined_action_gridsquare",
                "outlined_action_help",
                "outlined_action_history",
                "outlined_action_lightoff",
                "outlined_action_lighton",
                "outlined_action_like",
                "outlined_action_list",
                "outlined_action_love",
                "outlined_action_mic",
                "outlined_action_micrec",
                "outlined_action_newregister",
                "outlined_action_newrequest",
                "outlined_action_order",
                "outlined_action_phone",
                "outlined_action_print",
                "outlined_action_rating",
                "outlined_action_recycle",
                "outlined_action_request",
                "outlined_action_runningclock",
                "outlined_action_save",
                "outlined_action_schedule",
                "outlined_action_search",
                "outlined_action_selectedalllines",
                "outlined_action_send",
                "outlined_action_settings",
                "outlined_action_share",
                "outlined_action_shareios",
                "outlined_action_subtract",
                "outlined_action_text",
                "outlined_action_update",
                "outlined_action_upload",
                "outlined_action_visibility",
                "outlined_action_visibilityoff",
                "outlined_alert_cancel",
                "outlined_alert_check",
                "outlined_alert_empty",
                "outlined_alert_indeterminate",
                "outlined_alert_info",
                "outlined_alert_notification",
                "outlined_alert_warning",
                "outlined_communication_chat",
                "outlined_communication_email",
                "outlined_communication_help",
                "outlined_communication_message",
                "outlined_communication_occurrence",
                "outlined_communication_phoneringing",
                "outlined_communication_reademail",
                "outlined_communication_signal",
                "outlined_communication_speaker",
                "outlined_communication_treatment",
                "outlined_content_adddocument",
                "outlined_content_agility",
                "outlined_content_bellringing",
                "outlined_content_book",
                "outlined_content_brightness",
                "outlined_content_changeview",
                "outlined_content_channel",
                "outlined_content_christmascard",
                "outlined_content_consistency",
                "outlined_content_divulgation",
                "outlined_content_education",
                "outlined_content_exchangereports",
                "outlined_content_gallery",
                "outlined_content_gift",
                "outlined_content_global",
                "outlined_content_handglobal",
                "outlined_content_hands",
                "outlined_content_health",
                "outlined_content_healthy",
                "outlined_content_indicator",
                "outlined_content_lifebuoy",
                "outlined_content_lock",
                "outlined_content_magic",
                "outlined_content_medal",
                "outlined_content_menu",
                "outlined_content_mirror",
                "outlined_content_planb",
                "outlined_content_produtivity",
                "outlined_content_report",
                "outlined_content_store",
                "outlined_content_wellness",
                "outlined_content_wifi",
                "outlined_default_mockup",
                "outlined_finance_bag",
                "outlined_finance_bank",
                "outlined_finance_cards",
                "outlined_finance_charging",
                "outlined_finance_creditcard",
                "outlined_finance_debit",
                "outlined_finance_discount",
                "outlined_finance_idcard",
                "outlined_finance_littlemachine",
                "outlined_finance_money",
                "outlined_finance_moneypaper",
                "outlined_finance_paid",
                "outlined_finance_promotion",
                "outlined_finance_shoppingcart",
                "outlined_finance_shoppingcartproduct",
                "outlined_finance_suitcase",
                "outlined_finance_tagdiscount",
                "outlined_finance_transfermoney",
                "outlined_media_app",
                "outlined_media_camera",
                "outlined_media_monitor",
                "outlined_media_play",
                "outlined_navigation_arrowbottom",
                "outlined_navigation_arrowleft",
                "outlined_navigation_arrowright",
                "outlined_navigation_arrowtop",
                "outlined_navigation_close",
                "outlined_navigation_directionbottom",
                "outlined_navigation_directionleft",
                "outlined_navigation_directionright",
                "outlined_navigation_directiontop",
                "outlined_navigation_exit",
                "outlined_navigation_goback",
                "outlined_navigation_gofront",
                "outlined_navigation_home",
                "outlined_navigation_menu",
                "outlined_place_bus",
                "outlined_place_forklift",
                "outlined_place_gps",
                "outlined_place_local",
                "outlined_place_rocket",
                "outlined_place_runningtruck",
                "outlined_place_truck",
                "outlined_place_waze",
                "outlined_product_bagproduct",
                "outlined_product_beard",
                "outlined_product_brandsproduct",
                "outlined_product_childish",
                "outlined_product_dailycare",
                "outlined_product_ekos",
                "outlined_product_erlenmeyer",
                "outlined_product_hair",
                "outlined_product_makeup",
                "outlined_product_outlet",
                "outlined_product_perfumery",
                "outlined_product_promotionproduct",
                "outlined_product_vegan",
                "outlined_social_addcontact",
                "outlined_social_birthday",
                "outlined_social_collaborate",
                "outlined_social_contact",
                "outlined_social_digitalconsultant",
                "outlined_social_groupofpeople",
                "outlined_social_myprofile",
                "outlined_social_network",
                "outlined_social_person",
                "filled_action_add",
                "filled_action_cancel",
                "filled_action_check",
                "filled_action_delete",
                "filled_action_love",
                "filled_action_newrequest",
                "filled_action_rating",
                "filled_action_subtract",
                "filled_brand_facebook",
                "filled_brand_instagram",
                "filled_brand_linkedin",
                "filled_brand_naturarosacea",
                "filled_brand_pinterest",
                "filled_brand_spotify",
                "filled_brand_twitter",
                "filled_brand_youtube",
                "filled_content_channel",
                "filled_content_quote",
                "filled_finance_charging",
                "filled_media_pause",
                "filled_media_play",
                "filled_media_stop",
                "filled_navigation_directionleft",
                "filled_navigation_directionright",
                "filled_navigation_directiontbottom",
                "filled_navigation_directiontop",
                "filled_navigation_menu",
                "filled_navigation_more",
                "filled_product_brandsproduct",
                "filled_social_myprofile",
                "filled_toggle_indeterminatecheckbox"))
    }
}
