package com.example.simplesaxaphone;

import android.app.Activity;
import android.app.Instrumentation;
import android.view.View;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class LessonsMenuTest {

    @Rule
    public ActivityTestRule<LessonsMenu> lessonsMenuActivityTestRule = new ActivityTestRule<>(LessonsMenu.class);

    private LessonsMenu lessonsMenuActivity = null;

    //Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(LessonsMenu.class.getName(),null,false);

    @Before
    public void setUp() throws Exception {
        lessonsMenuActivity = lessonsMenuActivityTestRule.getActivity();
    }

    @Test
    public void testLessonButton(){

        View view = lessonsMenuActivity.findViewById(R.id.settingUp);
        assertNotNull(view);

        /*Espresso.onView(withId(R.id.buttonLesson)).perform(click());

        Activity secondActivity = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(secondActivity);

        secondActivity.finish();*/

    }

    @After
    public void tearDown() throws Exception {
        lessonsMenuActivity = null;
    }
}