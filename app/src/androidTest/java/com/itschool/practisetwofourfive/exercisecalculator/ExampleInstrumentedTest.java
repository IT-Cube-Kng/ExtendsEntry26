package com.itschool.practisetwofourfive.exercisecalculator;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import com.itschool.practisetwofourfive.exercisecalculator.calculate.PlusOperation;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule
            = new ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.itschool.practisetwofourfive.exercisecalculator", appContext.getPackageName());
    }


    @Test
    public void testPlusOperation() {
        Double one = 42.0d;
        Double two = 42.0d;
        PlusOperation op = new PlusOperation(one, two);
        Double res = op.calc();
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        // подготовка к тесту
        onView(withId(R.id.et_op1)).perform(typeText(Double.toString(one)), closeSoftKeyboard());
        onView(withId(R.id.et_op2)).perform(typeText(Double.toString(two)), closeSoftKeyboard());
        onView(withId(R.id.bt_result_sum)).perform(click());


        // проверка результатов
        String r= appContext.getString(R.string.result, ""+res);
        onView(withId(R.id.tw_result)).check(matches(withText(r)));
    }
}
