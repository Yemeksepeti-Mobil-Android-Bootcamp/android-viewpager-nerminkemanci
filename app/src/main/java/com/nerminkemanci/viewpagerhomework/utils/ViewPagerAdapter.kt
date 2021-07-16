package com.nerminkemanci.viewpagerhomework.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nerminkemanci.viewpagerhomework.MainActivity
import com.nerminkemanci.viewpagerhomework.OnboardingScreens.OnboardingFragmentOne
import com.nerminkemanci.viewpagerhomework.OnboardingScreens.OnboardingFragmentThree
import com.nerminkemanci.viewpagerhomework.OnboardingScreens.OnboardingFragmentTwo

class ViewPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    private val FRAGMENT_COUNT : Int = 3
    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return OnboardingFragmentOne()
            1 -> return OnboardingFragmentTwo()
            2 -> return OnboardingFragmentThree()
            else -> return OnboardingFragmentOne()

        }
    }

    override fun getItemCount(): Int {
        return FRAGMENT_COUNT
    }
}