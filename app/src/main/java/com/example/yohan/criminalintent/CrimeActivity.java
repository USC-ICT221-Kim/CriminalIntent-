package com.example.yohan.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

//FragmentActivity
public class CrimeActivity extends SingleFragmentActivity {



    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
