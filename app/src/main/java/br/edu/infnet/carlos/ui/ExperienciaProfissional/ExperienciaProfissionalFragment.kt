package br.edu.infnet.carlos.ui.ExperienciaProfissional

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.edu.infnet.carlos.R
import br.edu.infnet.carlos.ui.ExperienciaProfissionalInformacoesPessoaisViewModel.ExperienciaProfissionalViewModel

class ExperienciaProfissionalFragment : Fragment() {

    private lateinit var slideshowViewModel: ExperienciaProfissionalViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
                ViewModelProvider(this).get(ExperienciaProfissionalViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_experiencia_profissional, container, false)
        return root
    }
}