package com.chetanTuteja.viewbinding.views.activities

import android.view.LayoutInflater
import com.chetanTuteja.viewbinding.R
import com.chetanTuteja.viewbinding.databinding.ActivityMainBinding
import com.chetanTuteja.viewbinding.views.fragments.ExampleFragment
import com.chetanTuteja.viewbinding.views.utils.performFragmentTransaction
import com.chetantuteja.easybinding.BindingActivity

/**
 * @author Chetan Tuteja (chetan.tuteja@gmail.com)
 * @since 07-Feb-21
 */
class MainActivity : BindingActivity<ActivityMainBinding>() {

    companion object {
        const val TAG = "MainActivity"
    }

    override fun setupViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun init() {
        setupViews()
    }

    private fun setupViews() {
        // Set Text using ViewBinding.
        binding.tvWelcomeMsg.text = getString(R.string.easy_binding_activity)

        // Set onClick Action using ViewBinding.
        binding.btnLoadFrag.setOnClickListener {
            performFragmentTransaction(
                ExampleFragment(), ExampleFragment.TAG
            )
        }
    }
}