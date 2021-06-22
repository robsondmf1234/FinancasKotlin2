package com.example.finanask.extension

import java.text.SimpleDateFormat
import java.util.*

//Função utilizada para formatar uma data no padrão brasileiro

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