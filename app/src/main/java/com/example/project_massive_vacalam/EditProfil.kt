package com.example.project_massive_vacalam

import android.app.Activity
import android.app.Fragment
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.project_massive_vacalam.R.id.*
import kotlin.contracts.Returns

class EditProfil : AppCompatActivity() {

    companion object {
        private const val REQUEST_IMAGE_CAPTURE = 1
        private const val GALLERY_REQUEST_CODE = 100
    }

    private lateinit var profileImageView: ImageView
    private lateinit var selectImageButton: ImageButton
    private lateinit var usernameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var passwordEditTextBaru: EditText
    private lateinit var passwordEditTextKonfirmasi: EditText
    private lateinit var saveButton: LinearLayout
    private lateinit var showHideImageView: ImageView

    private var isPasswordVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profil)

        profileImageView = findViewById(R.id.profileImageView)
        selectImageButton = findViewById(R.id.selectImageButton)
        usernameEditText = findViewById(R.id.usernameET)
        emailEditText = findViewById(R.id.emailET)
        passwordEditText = findViewById(R.id.passwordET)
        saveButton = findViewById(R.id.btn_simpan)
        showHideImageView = findViewById(R.id.ivShowHidePass)
        showHideImageView = findViewById(R.id.ivShowHidePass_baru)
        showHideImageView = findViewById(R.id.ivShowHidePass_konfirmasi)

        showHideImageView.setOnClickListener {
            togglePasswordVisibility()
        }

        saveButton.setOnClickListener {
            saveProfileChanges()
        }

        selectImageButton.setOnClickListener {
            openGallery()
        }
    }
    private fun togglePasswordVisibility() {
        if (isPasswordVisible) {
            // Hide password
            passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
            showHideImageView.setImageResource(R.drawable.ic_hide_password)
        } else {
            // Show password
            passwordEditText.transformationMethod = HideReturnsTransformationMethod.getInstance()
            showHideImageView.setImageResource(R.drawable.ic_show_password)
        }

        // Invert the value of isPasswordVisible
        isPasswordVisible = !isPasswordVisible

        // Set the cursor position to the end of the text
        passwordEditText.setSelection(passwordEditText.text.length)
    }

    private fun saveProfileChanges() {
        val name = usernameEditText.text.toString()
        val email = emailEditText.text.toString()
        val password = passwordEditText.text.toString()

        // Lakukan pemrosesan untuk menyimpan perubahan profil ke server atau penyimpanan lokal
        // Misalnya, menggunakan Retrofit untuk mengirim permintaan ke API backend

        // Setelah perubahan profil disimpan, kembali ke Activity sebelumnya atau ke halaman profil
        finish()
    }

    private fun openGallery() {
        val galleryIntent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(galleryIntent, GALLERY_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == GALLERY_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            val imageUri = data?.data
            val imageBitmap = imageUri?.let { uriToBitmap(it) }
            profileImageView.setImageBitmap(imageBitmap)
        }
    }

    private fun uriToBitmap(uri: Uri): Bitmap? {
        val inputStream = contentResolver.openInputStream(uri)
        return inputStream?.let {
            BitmapFactory.decodeStream(it)
        }
    }
}