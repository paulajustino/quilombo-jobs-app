package com.example.quilombo_jobs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quilombo_jobs.databinding.HomeCandidateFragmentBinding

class HomeCandidateFragment : Fragment() {
    private lateinit var binding: HomeCandidateFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HomeCandidateFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}