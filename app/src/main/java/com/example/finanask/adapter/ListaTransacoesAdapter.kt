package com.example.finanask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.finanask.R
import com.example.finanask.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*
import java.text.SimpleDateFormat
import java.util.Calendar

class ListaTransacoesAdapter(transacoes: List<Transacao>,
                                context: Context) : BaseAdapter() {

    private val transacoes = transacoes
    private val context = context

    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View {
        val viewCriada =
            LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)

        //pegando o objeto de acordo com a posicao na lista
        val transacao = transacoes[posicao]

        //setando o valor no textfield do layout
        viewCriada.transacao_valor.text = transacao.valor.toString()
        viewCriada.transacao_categoria.text = transacao.categoria

        viewCriada.transacao_data.text = transacao.data.formataDataParaBrasileiro()

        //retornando a view criada
        return viewCriada
    }

    override fun getItem(posicao: Int): Transacao {
        return transacoes[posicao]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transacoes.size
    }

    // Função para colocar a função formataDataParaBrasileiro direto na clase Calendar
    fun Calendar.formataDataParaBrasileiro(): String {
        //formatando a data para o formato brasileiro
        val formatoBrasileiro = "dd/MM/yyyy"
        val format = SimpleDateFormat(formatoBrasileiro)
        //própria classe Calendar irá chamar o método time
        val dataFormatada = format.format(this.time)

        //retornando a data com o padrão informado("dd/MM/yyyy")
        return dataFormatada
    }
}