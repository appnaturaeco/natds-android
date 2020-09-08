package com.natura.android.sample.components

import android.content.DialogInterface
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.natura.android.dialog.DialogAlert
import com.natura.android.dialog.DialogStandard
import com.natura.android.sample.R
import com.natura.android.sample.setChosenDefaultTheme
import kotlinx.android.synthetic.main.activity_dialog.*

class DialogActivity : AppCompatActivity() {
    lateinit var dialogStandard: DialogStandard
    lateinit var dialogAlert: DialogAlert

    override fun onCreate(savedInstanceState: Bundle?) {
        setChosenDefaultTheme()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        supportActionBar?.title = "Dialog"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        createDialog()

        standardDialogButton.setOnClickListener {
            dialogStandard.show()
        }

        alertDialogButton.setOnClickListener {
            dialogAlert.show()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return true
    }

    private fun createDialog() {
        val mainClickListener = DialogInterface.OnClickListener { _, _ -> Toast.makeText(this, "Dialog Main Action", Toast.LENGTH_LONG).show() }
        val secondaryClickListener = DialogInterface.OnClickListener { _, _ -> Toast.makeText(this, "Dialog Secondary Action", Toast.LENGTH_LONG).show() }

        dialogStandard = DialogStandard(
            this,
            "Title",
            "Confirm Button",
            mainClickListener,
            "Close",
            secondaryClickListener,
            R.layout.standard_dialog_content).create()

        dialogAlert = DialogAlert(
            this,
            "This is the content of dialog",
            "Main Action",
            mainClickListener).create()
    }
}
