package com.example.hwqe2

import com.example.hwqe2.databinding.FragmentPodcastsBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

class PodcastsFragment:Fragment(R.layout.fragment_podcasts) {
    private var _binding: FragmentPodcastsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPodcastsBinding.bind(view)

        with(binding){
            btnPodProf.setOnClickListener {
                findNavController().navigate(R.id.action_podcastsFragment_to_profileFragment,
                    ProfileFragment.createBudle("Podcast")
                )
            }
        }
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}