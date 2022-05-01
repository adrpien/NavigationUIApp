package com.adrpien.navigationuiapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.adrpien.navigationuiapp.R
import com.adrpien.navigationuiapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toProfileButton.setOnClickListener {

            //val pair = Pair<String, String>("Search", binding.EditText.text.toString())
            findNavController().navigate(
                HomeFragmentDirections.actionHomeFragment2ToProfileFragment()
            )
        }

        binding.toSearchButton.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragment2ToSearchFragment().actionId,
                bundleOf("search" to binding.editText.text.toString()))
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}