package com.rosterloh.things.hapanel.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.rosterloh.things.hapanel.R
import com.rosterloh.things.hapanel.databinding.FragmentWebviewBinding

class WebViewFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentWebviewBinding>(
                inflater, R.layout.fragment_webview, container, false).apply {
            setLifecycleOwner(this@WebViewFragment)
        }

        binding.webview.loadUrl("https://hassio.local:8123")

        return binding.root
    }
}