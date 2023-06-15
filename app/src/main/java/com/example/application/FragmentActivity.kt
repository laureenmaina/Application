package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class FragmentActivity : AppCompatActivity() {

    private lateinit var pager:ViewPager
    private lateinit var tab:TabLayout
    private lateinit var bar:androidx.appcompat.widget.Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        pager=findViewById(R.id.viewpager)
        tab=findViewById(R.id.tabs)
        bar=findViewById(R.id.toolbar)

        setSupportActionBar(bar)

        //Initializing the ViewPagerAdapter
        val adapter=ViewPagerAdapter(supportFragmentManager)

            //add fragment to the list
        adapter.addFragment(SignupFragment(),"SignUp")
        adapter.addFragment(LoginFragment(),"Login")
        adapter.addFragment(HomeFragment(),"Home")

        //Adding the Adapter to the ViewPager
        pager.adapter=adapter

        //bind the viewpager with the Tablelayout
        tab.setupWithViewPager(pager)


    }
}