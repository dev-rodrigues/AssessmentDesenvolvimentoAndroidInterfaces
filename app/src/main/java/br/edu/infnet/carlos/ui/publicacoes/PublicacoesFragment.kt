package br.edu.infnet.carlos.ui.publicacoes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import br.edu.infnet.carlos.R
import br.edu.infnet.carlos.ui.InformacoesPessoais.InformacoesPessoaisViewModel

class PublicacoesFragment : Fragment() {

    private lateinit var homeViewModel: PublicacoesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(PublicacoesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_publicacoes, container, false)

        return root
    }
}


