package com.example.quilombo_jobs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.quilombo_jobs.databinding.ValidationFragmentBinding

class ValidationFragment : Fragment() {
    private lateinit var binding: ValidationFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ValidationFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        binding.confirmButton.setOnClickListener {
            val validationAction =
                ValidationFragmentDirections.actionValidationFragmentToHomeFragment()
            findNavController().navigate(validationAction)
        }
    }
}