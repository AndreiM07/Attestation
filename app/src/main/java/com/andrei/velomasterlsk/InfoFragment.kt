package com.andrei.velomasterlsk

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class InfoFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null


    

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_info, container, false)
        val moreDetailed: Button = view.findViewById(R.id.more_detailed)
        val link = Uri.parse("https://vk.com/veloremont_liski")
        val intent = Intent(Intent.ACTION_VIEW, link)

        moreDetailed.setOnClickListener {
            startActivity(intent)
        }

        return view
    }
    



}