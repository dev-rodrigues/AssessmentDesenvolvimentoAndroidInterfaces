package br.edu.infnet.carlos.ui.Formacao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.edu.infnet.carlos.R

class FormacaoFragment : Fragment() {

    private lateinit var galleryViewModel: FormacaoViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel = ViewModelProvider(this).get(FormacaoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_formacao, container, false)


        return root
    }
}