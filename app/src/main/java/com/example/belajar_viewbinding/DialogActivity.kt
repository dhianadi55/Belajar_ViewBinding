package com.example.belajar_viewbinding

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajar_viewbinding.databinding.ActivityDialogBinding

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Contoh penggunaan View Binding pada dialog
        val dialog = Dialog(this)
        val dialogBinding = ActivityDialogBinding.inflate(layoutInflater)
        dialog.setContentView(dialogBinding.root)

        dialogBinding.dialogText.text = getString(R.string.Text2)
        dialogBinding.dialogButton.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}