package com.farhanryanda.livedata

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.farhanryanda.livedata.databinding.ItemProductBinding

class ProductAdapter(var listProduct: ArrayList<DataProduct>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(var binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root) {
        //        var nama = view.findViewById<TextView>(R.id.tv_name)
//        var price = view.findViewById<TextView>(R.id.tv_price)
//        var img = view.findViewById<ImageView>(R.id.img_product)
//        var card = view.findViewById<TextView>(R.id.cv_product)
        fun bindproduct(itemProduct: DataProduct) {
            binding.product = itemProduct
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

//        holder.nama.text = listProduct[position].namaProduct
//        holder.price.text = listProduct[position].price
//        holder.img.setImageResource(data.imgProduct)
        val data = listProduct[position]
        holder.bindproduct(data)
        holder.binding.cvProduct.setOnClickListener {
            val context = holder.itemView.context
            val bundle = Bundle()
            bundle.putSerializable("product",data)
            val intent = Intent(context,DetailProductActivity::class.java)
            intent.putExtras(bundle)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = listProduct.size

    fun setDataProduct(itemData: ArrayList<DataProduct>) {
        this.listProduct = itemData
    }
}