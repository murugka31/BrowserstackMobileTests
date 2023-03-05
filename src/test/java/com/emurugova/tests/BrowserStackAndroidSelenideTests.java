package com.emurugova.tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BrowserStackAndroidSelenideTests extends TestBase {

    @Tag("android")
    @Test
    void searchTest() {
        $(MobileBy.AccessibilityId("Search Wikipedia")).click();
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                .shouldHave(sizeGreaterThan(0));
    }

    @Tag("android")
    @Test
    void checkPageTest(){

        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView"))
                .click();
        $(MobileBy.id("org.wikipedia.alpha:id/view_news_fullscreen_story_text"))
                .shouldHave(text("Bola Tinubu (pictured), of the ruling All Progressives Congress, is elected President of Nigeria."));
    }
}
