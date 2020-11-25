package com.example.simplesaxaphone;

import android.view.View;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.regex.Matcher;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EspressoTest {
    private MainActivity mActivity;
    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testSettingUp() throws InterruptedException {
        Espresso.onView(withId(R.id.textView))
                .check(matches(isDisplayed()));

        sleep(2000);

        Espresso.onView(withId((R.id.buttonLesson)))
                .perform(click());

        Espresso.onView(withId(R.id.settingUp))
                .perform(click());

        Espresso.onView(Matchers.allOf(withId(R.id.continueBtn),isDisplayed())).perform(click());
        Espresso.onView(Matchers.allOf(withId(R.id.continueBtn),isDisplayed())).perform(click());
        Espresso.onView(Matchers.allOf(withId(R.id.continueBtn),isDisplayed())).perform(click());
        Espresso.onView(Matchers.allOf(withId(R.id.continueBtn),isDisplayed())).perform(click());
        Espresso.onView(Matchers.allOf(withId(R.id.continueBtn),isDisplayed())).perform(click());
        Espresso.onView(Matchers.allOf(withId(R.id.continueBtn),isDisplayed())).perform(click());
        Espresso.onView(Matchers.allOf(withId(R.id.finishBtn),isDisplayed())).perform(click());

        Espresso.onView(withId(R.id.settingUp))
                .check(matches(isDisplayed()));

    }

    @Test
    public void testFirstNotes() throws InterruptedException {
        Espresso.onView(withId(R.id.textView))
                .check(matches(isDisplayed()));

        sleep(2000);

        Espresso.onView(withId((R.id.buttonLesson)))
                .perform(click());

        Espresso.onView(withId(R.id.firstNote))
                .perform(click());

        Espresso.onView(withId(R.id.firstNote1))
                .check(matches(isDisplayed()));
        Espresso.onView(Matchers.allOf(withId(R.id.continueBtn),isDisplayed())).perform(click());

        Espresso.onView(withId(R.id.firstNote2))
                .check(matches(isDisplayed()));
        Espresso.onView(Matchers.allOf(withId(R.id.finishBtn),isDisplayed())).perform(click());

        Espresso.onView(withId(R.id.firstNote))
                .check(matches(isDisplayed()));

    }
}
