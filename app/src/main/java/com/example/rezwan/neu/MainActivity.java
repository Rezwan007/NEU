package com.example.rezwan.neu;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.navigation_Exhibition:
                    setTitle("Exhibition");
                                            //this will set title of Action Bar
                    ExhibitionFragment fragment1 = new ExhibitionFragment();
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.frame, fragment1, "Fragment One");
                                            //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction1.commit();
                    return true;

                case R.id.navigation_Navigation:
                    setTitle("Navigation");
                                //this will set title of Action Bar
                    NavigationFragment fragment2 = new NavigationFragment();
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.frame, fragment2, "Fragment two");
                                //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction2.commit();
                    return true;
                case R.id.navigation_AR:
                    setTitle("Navigation");
                    //this will set title of Action Bar
                    ARFragment fragment4 = new ARFragment();
                    FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction4.replace(R.id.frame, fragment4, "Fragment two");
                    //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction4.commit();
                    return true;
                case R.id.navigation_home:
                    setTitle("Home");
                    //this will set title of Action Bar
                    HomeFragment fragment3 = new HomeFragment();
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.frame, fragment3, "Fragment two");
                    //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction3.commit();
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        setTitle("Exhibition");
        //this will set title of Action Bar
        ExhibitionFragment fragment1 = new ExhibitionFragment();
        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.replace(R.id.frame, fragment1, "Fragment One");
        //create first framelayout with id fram in the activity where fragments will be displayed
        fragmentTransaction1.commit();
    }

}
