package com.journaldev.maproutebetweenmarkers.utils

import android.app.Activity
import android.app.AlertDialog
import android.view.LayoutInflater
import com.journaldev.maproutebetweenmarkers.R
import com.journaldev.maproutebetweenmarkers.databinding.DialogLayoutBinding

class LoadingDialog(private val activity: Activity) {
    private var alertDialog: AlertDialog? = null

    fun startLoading() {
        val builder = AlertDialog.Builder(activity, R.style.loadingDialogStyle)
        val binding: DialogLayoutBinding =
            DialogLayoutBinding.inflate(LayoutInflater.from(activity), null, false)
        builder.setView(binding.getRoot())
        builder.setCancelable(false)
        alertDialog = builder.create()
        binding.rotateLoading.start()
        alertDialog!!.show()
    }

    fun stopLoading() {
        alertDialog!!.dismiss()
    }
}