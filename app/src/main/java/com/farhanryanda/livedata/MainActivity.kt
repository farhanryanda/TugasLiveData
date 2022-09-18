package com.farhanryanda.livedata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.farhanryanda.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vmProduct: ProductViewModel
    lateinit var adapterProduct: ProductAdapter
//    lateinit var rvProduct: RecyclerView
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //init viewModel dan adapter
        vmProduct = ViewModelProvider(this).get(ProductViewModel::class.java)
        adapterProduct = ProductAdapter(ArrayList())
        //observe livedata

        vmProduct.product.observe(this, Observer {
            adapterProduct.setDataProduct(it as ArrayList<DataProduct>)
        })
        vmProduct.getProduct()
//        binding.rvProduct = findViewById(R.id.rv_product)
        binding.rvProduct.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvProduct.adapter = adapterProduct

    }
}