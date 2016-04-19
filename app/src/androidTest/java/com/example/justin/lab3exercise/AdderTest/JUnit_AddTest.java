package com.example.justin.lab3exercise.AdderTest;

import android.test.ActivityInstrumentationTestCase2;

import com.example.justin.lab3exercise.MainActivity;

/**
 * Created by Justin on 4/19/2016.
 */
public class JUnit_AddTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_AddTest(){
        super(MainActivity.class);
    }

    public void test_Sum(){
        mainActivity = getActivity();
        int sumRet = mainActivity.sum(10,10);
        assertEquals(sumRet, 20);
    }
}
