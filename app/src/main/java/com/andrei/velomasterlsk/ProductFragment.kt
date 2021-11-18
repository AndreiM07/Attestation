package com.andrei.velomasterlsk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ProductFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_product, container, false)


        //      val userNameList: List<String> = listOf("Andrey", "Oleg", "Ivan", "Olga")
        val bannerList: List<Banner> = listOf(
            Banner(R.drawable.stelsmiss7100, "Stels Miss 7100"),
            Banner(R.drawable.samokatkmssk423, "Трюковой самокат Kms sk-423"),
            Banner(R.drawable.stelsnavigator910md29, "Stels Navigator 910 md29"),
            Banner(R.drawable.stelsviperv010, "Stels Viper V010 2020"),
            Banner(R.drawable.stelsadrenalin24md, "Stels Adrenalin 24md"),
            Banner(R.drawable.desna2710v, "Десна 2710 V 27.5 V020")
        )

        val usersRecyclerView: RecyclerView = view.findViewById(R.id.users_recycler_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        //      usersRecyclerView.adapter = UserAdapter(userNameList)
        usersRecyclerView.addItemDecoration(
            DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        )
        usersRecyclerView.adapter = BannerAdapter(bannerList)
        return view
    }
}



