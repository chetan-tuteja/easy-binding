package com.chetanTuteja.viewbinding.views.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.chetanTuteja.viewbinding.R
import com.chetanTuteja.viewbinding.databinding.FragmentExampleBinding
import com.chetantuteja.easybinding.BindingFragment

/**
 * @author Chetan Tuteja (chetan.tuteja@gmail.com)
 * @since 14-Feb-21
 */
class ExampleFragment : BindingFragment<FragmentExampleBinding>() {

    companion object {
        const val TAG = "BindingFragment"
    }

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentExampleBinding {
        return FragmentExampleBinding.inflate(inflater, container, false)
    }

    override fun init() {
        setupViews()
    }

    private fun setupViews() {
        // Set Text using ViewBinding.
        binding.tvWelcomeMsg.text = getString(R.string.easy_binding_fragment)

        // Set onClick Action using ViewBinding.
        binding.btnShowToast.setOnClickListener {
            Toast.makeText(
                requireContext(), getString(R.string.easy_binding_fragment),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}