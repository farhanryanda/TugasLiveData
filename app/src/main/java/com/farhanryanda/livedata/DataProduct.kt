package com.farhanryanda.livedata

import java.io.Serializable

data class DataProduct(
    val namaProduct: String,
    val imgProduct: Int,
    val stock: Int,
    val price: String,
    val descProduct: String
) : Serializable
