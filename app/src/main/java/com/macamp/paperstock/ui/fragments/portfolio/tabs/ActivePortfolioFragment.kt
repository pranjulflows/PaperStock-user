package com.macamp.paperstock.ui.fragments.portfolio.tabs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.macamp.paperstock.R

class ActivePortfolioFragment : Fragment() {

    companion object {
        fun newInstance() = ActivePortfolioFragment()
    }

    private lateinit var viewModel: ActivePortfolioViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.active_portfolio_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ActivePortfolioViewModel::class.java)
        // TODO: Use the ViewModel
    }

}