package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FragmentDisplay extends AppCompatActivity {

    private SectionsStatePageAdapter mSectionsStatePageAdapter;
    private ViewPager mViewPager;
    private Button menubtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_display);

        // During the application runtime, this function will continuously listen for the menu button to be pressed
        // and run what's in the function when pressed
        menubtn = (Button) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FragmentDisplay.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Add all of the fragments to the SectionsStatePageAdapter class, which
        // holds the fragments and string names of the fragments in two separate lists
        mSectionsStatePageAdapter = new SectionsStatePageAdapter(getSupportFragmentManager());

        // Based on the chosen fragment, the menu fragment preset will be applied first,
        // and then overlayed by the desired fragment
        mViewPager = (ViewPager) findViewById(R.id.fragmentContainer);
        setupViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsStatePageAdapter adapter = new SectionsStatePageAdapter(getSupportFragmentManager());
        adapter.addFragment(new FingerChart1(),"FingerChart1");
        adapter.addFragment(new FingerChart2(),"FingerChart2");
        adapter.addFragment(new FingerChart3(),"FingerChart3");
        adapter.addFragment(new FingerChart4(),"FingerChart4");
        adapter.addFragment(new FingerChart5(),"FingerChart5");
        adapter.addFragment(new FingerChart6(),"FingerChart6");
        adapter.addFragment(new FingerChart7(),"FingerChart7");
        adapter.addFragment(new FingerChart8(),"FingerChart8");
        adapter.addFragment(new FingerChart9(),"FingerChart9");
        adapter.addFragment(new FingerChart10(),"FingerChart10");
        adapter.addFragment(new FingerChart11(),"FingerChart11");
        adapter.addFragment(new FingerChart12(),"FingerChart12");
        adapter.addFragment(new FingerChart13(),"FingerChart13");
        adapter.addFragment(new FingerChart14(),"FingerChart14");
        adapter.addFragment(new FingerChart15(), "FingerChart15");
        adapter.addFragment(new FingerChart16(),"FingerChart16");
        adapter.addFragment(new FingerChart17(), "FingerChart17");
        adapter.addFragment(new FingerChart18(),"FingerChart18");
        adapter.addFragment(new FingerChart19(), "FingerChart19");
        adapter.addFragment(new FingerChart20(),"FingerChart20");
        adapter.addFragment(new FingerChart21(), "FingerChart21");
        adapter.addFragment(new FingerChart22(),"FingerChart22");
        adapter.addFragment(new FingerChart23(), "FingerChart23");
        adapter.addFragment(new FingerChart24(), "FingerChart24");
        adapter.addFragment(new FingerChart25(), "FingerChart25");
        adapter.addFragment(new FingerChart26(), "FingerChart26");




        System.out.println("Here");
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber){

        mViewPager.setCurrentItem(fragmentNumber);
    }

    // Back button action
    @Override
    public void onBackPressed(){
        System.out.println("Inside of onBackPressed function");
        if(mViewPager.getCurrentItem() == 0){
            System.out.println("In back pressed");

            super.onBackPressed();
        }
        else {
            mViewPager.setCurrentItem(mViewPager.getCurrentItem()-1);
            System.out.println("HELLO FROM BACK PRESSED");
        }
    }

}