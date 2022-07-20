package com.dhairya.societymanagementapplication.authActivity.authfragments.ui.forgotpasswordconfirmation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.dhairya.societymanagementapplication.R
import com.dhairya.societymanagementapplication.databinding.FragmentForgotPasswordConfrimationBinding


class PasswordConfirmFragment : Fragment(R.layout.fragment_forgot_password_confrimation) {

    private val viewModel: PasswordConfirmViewModel by viewModels()
    private lateinit var binding: FragmentForgotPasswordConfrimationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding = FragmentForgotPasswordConfrimationBinding.bind(view)
        binding.apply {

            btnBackTologin.setOnClickListener {
                findNavController().navigate(forgotPasswordConfirmationFragmentDirections.actionForgotPasswordConfirmationFragmentToLoginFragment())

            }

        }
    }

}