package com.farhanryanda.livedata

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanryanda.livedata.databinding.ActivityDetailProductBinding

class DetailProductActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var getProductDetail = intent.getSerializableExtra("product") as DataProduct
        binding.imgProduct.setImageResource(getProductDetail.imgProduct)
        binding.tvName.text = getProductDetail.namaProduct
        binding.tvPrice.text = getProductDetail.price
        binding.tvDesc.text = getProductDetail.descProduct


        binding.btnBuy.setOnClickListener {
            var url = "https://api.whatsapp.com/send?phone=+6281280524466&text=Halo, apakah untuk ${getProductDetail.namaProduct} dengan harga ${getProductDetail.price}, Tersedia ?"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}