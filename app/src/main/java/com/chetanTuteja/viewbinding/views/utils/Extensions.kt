package com.chetanTuteja.viewbinding.views.utils

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.chetanTuteja.viewbinding.R

/**
 * @author Chetan Tuteja (chetan.tuteja@gmail.com)
 * @since 14-Feb-21
 */

/*
 * Provides utility to perform Fragment Transaction in activity.
 */
fun AppCompatActivity.performFragmentTransaction(
    frag: Fragment,
    transactionTag: String,
    isAddFragment: Boolean = true,
    @IdRes fragContainerId: Int = R.id.flFragContainer
) {
    supportFragmentManager.beginTransaction().apply {
        if (isAddFragment) {
            add(fragContainerId, frag, transactionTag)
        } else {
            replace(fragContainerId, frag, transactionTag)
        }
        addToBackStack(transactionTag)
    }.commit()
}