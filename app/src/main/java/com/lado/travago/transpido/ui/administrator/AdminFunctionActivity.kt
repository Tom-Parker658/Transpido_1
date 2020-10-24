package com.lado.travago.transpido.ui.administrator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.lado.travago.transpido.R
import com.lado.travago.transpido.databinding.ActivityAdminFunctionBinding
import com.lado.travago.transpido.viewmodel.admin.AdminFunctionViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Used by me to do specific task to the database
 */
@ExperimentalCoroutinesApi
class AdminFunctionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminFunctionBinding
    private lateinit var viewModel: AdminFunctionViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_admin_function)
        viewModel = ViewModelProvider(this)[AdminFunctionViewModel::class.java]
        binding.root
    }


}