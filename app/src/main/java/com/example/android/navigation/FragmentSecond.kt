package com.example.android.navigation

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.button.MaterialButton


class FragmentSecond : Fragment(R.layout.fragment_demo) {



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv: TextView = view.findViewById(R.id.textView)
        val backButton: MaterialButton = view.findViewById(R.id.backButton)
        val nextButton: MaterialButton = view.findViewById(R.id.nextButton)

        tv.text = "Second Fragment"
        nextButton.isVisible = false
        backButton.isVisible = true
        backButton.setOnClickListener {
            findNavController()
                .popBackStack()
        }
    }
}