package com.example.hwqe2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hwqe2.databinding.FragmentPopularBinding
import com.example.hwqe2.databinding.FragmentMainBinding


class PopularFragment:Fragment(R.layout.fragment_popular) {
    private var _binding: FragmentPopularBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPopularBinding.bind(view)

        with(binding){
            btnPopProf.setOnClickListener {
                findNavController().navigate(R.id.action_popularFragment_to_profileFragment,
                    ProfileFragment.createBudle("Popular")
                )
            }
        }
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}