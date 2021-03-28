package br.edu.infnet.carlos.ui.InformacoesPessoais

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.edu.infnet.carlos.R

class InformacoesPessoaisFragment : Fragment() {

    private lateinit var homeViewModel: InformacoesPessoaisViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(InformacoesPessoaisViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        return root
    }
}