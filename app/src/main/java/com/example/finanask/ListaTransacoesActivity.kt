package com.example.finanask

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.finanask.adapter.ListaTransacoesAdapter
import com.example.finanask.model.Transacao
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        //Declarando uma lista e populando com valores
        val transacoes = listOf(
            Transacao(BigDecimal(20.50), "Comida", Tipo.DESPESAS),
            Transacao(BigDecimal(100.00), "Internet", Tipo.RECEITA)
        )

        //Declarando um ArrayAdapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transacoes)


        //setando o ArrayAdapter na lista
        lista_transacoes_listview.setAdapter(ListaTransacoesAdapter(transacoes, this))

    }
}