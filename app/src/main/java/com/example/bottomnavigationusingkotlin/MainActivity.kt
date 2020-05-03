package com.example.bottomnavigationusingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.bottomnavigationusingkotlin.Fragment.Home_Fragment
import com.example.bottomnavigationusingkotlin.Fragment.Profile_Fragment
import com.example.bottomnavigationusingkotlin.Fragment.Setting_Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var homeFragment: Home_Fragment
    lateinit var settingFragment: Setting_Fragment
    lateinit var profileFragment: Profile_Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        homeFragment = Home_Fragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

        bottom_navigation.setOnNavigationItemSelectedListener { menuItem ->

            when(menuItem.itemId)
            {
                R.id.menu_home ->
                {
                    homeFragment = Home_Fragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.menu_setting ->
                {
                    settingFragment = Setting_Fragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, settingFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.menu_profile ->
                {
                    profileFragment = Profile_Fragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            }
            true
        }

    }
}
