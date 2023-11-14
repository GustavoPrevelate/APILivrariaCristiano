package br.senai.sp.jandira.retrofit_api_livraria

import com.google.gson.annotations.SerializedName

data class CategoryResponse(
    @SerializedName("codigo_categoria")  var codigo_categoria:Int? = 0,
    @SerializedName("nome_categoria")    var nome_categoria:String? = ""
)