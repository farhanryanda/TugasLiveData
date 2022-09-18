package com.farhanryanda.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel(){
    val list = arrayListOf(
        DataProduct("Xiaomi Poco M3 Pro 5G 4/64GB",R.drawable.xiomi_poco,50,"Rp 2.316.000","SIM Hybrid Dual SIM (Nano-SIM, dual stand-by)\n" +
                "Size 6.5 inches, 102.0 cm2 (~83.7% screen-to-body ratio)\n" +
                "Protection Corning Gorilla Glass 3\n" +
                "PLATFORM OS Android 11, MIUI 12\n" +
                "Chipset MediaTek MT6833 Dimensity 700 5G (7 nm)\n" +
                "CPU Octa-core (2x2.2 GHz Cortex-A76 & 6x2.0 GHz Cortex-A55)\n" +
                "GPU Mali-G57 MC2\n" +
                "Internal 64GB 4GB RAM\n" +
                "MAIN CAMERA Triple 48 MP, f/1.8, 26mm (wide), 1/2.0\", 0.8µm, PDAF\n" +
                "2 MP, f/2.4, (macro)\n" +
                "2 MP, f/2.4, (depth)\n" +
                "SELFIE CAMERA Single 8 MP, f/2.0, (wide)\n" +
                "BATTERY Type Li-Po 5000 mAh, non-removable"),
        DataProduct("sepatu nike original BNIB",R.drawable.nike_jordan,50,"Rp 999.000","Conditions :\n" +
                "- Colorway : Red/Black Toe\n" +
                "- Artcode : 553668-903 (Google Authorized)\n" +
                "- Brand New in The Box (BNIB)/ Tag (BNWT)\n" +
                "Made In Vietnam"),
        DataProduct("GeForce RTX 3050",R.drawable.rtx,50,"Rp 6.177.600","Specification：\n" +
                "●Chip series：GeForce ® RTX 3050\n" +
                "●Product series：igame series\n" +
                "●Graphics chip ：GA106\n" +
                "●Core process ：8nm\n" +
                "●CUDA Core ：2560\n" +
                "●Fundamental frequency Base: 1552mhz; Boost: 1777mhz\n" +
                "●One key OC core frequency Base: 1552mhz; Boost: 1860mhz\n" +
                "●Display memory rate ：14Gbps\n" +
                "●Memory capacity：8GB\n" +
                "●Memory interface ：128 bit\n" +
                "●Video memory type ：GDDR6\n" +
                "●Video memory bandwidth ：224 GB / S"),
        DataProduct("Samsung Galaxy Tab S8 Ultra 5G",R.drawable.samsung_tab,50,"Rp 9.610.000","Processor : Qualcomm Snapdragon 8 Gen 1\n" +
                "Display : 11\"LCD WQXGA\n" +
                "Camera\n" +
                "Rear Camera Resolution : 13.0 MP + 6 MP\n" +
                "Front Camera Resolution : 12.0 MP\n" +
                "Memory : RAM 8GB + ROM 128\n" +
                "Network : Dual-SIM 5G\n" +
                "Battery Capacity : 8.000mAh\n" +
                "Special Interface : S-Pen, Samsung DeX\n" +
                "\n" +
                "Galaxy Tab S8+ 5G\n" +
                "Processor :Qualcomm Snapdragon 8 Gen 1\n" +
                "Display : 12.4\" Super AMOLED WQXGA+\n" +
                "Camera\n" +
                "Rear Camera Resolution : 13.0 MP + 6 MP\n" +
                "Front Camera Resolution : 12.0 MP\n" +
                "Memory : RAM 8GB + ROM 256GB\n" +
                "Network : Dual-SIM 5G\n" +
                "Battery Capacity : 10.090mAh\n" +
                "Special Interface : S-Pen, Samsung DeX\n" +
                "\n" +
                "Galaxy Tab S8+ Ultra 5G\n" +
                "Processor : Qualcomm Snapdragon 8 Gen 1\n" +
                "Display : 14.6\" Super AMOLED WQXGA+\n" +
                "Camera\n" +
                "Rear Camera Resolution : 13.0 MP + 6 MP\n" +
                "Front Camera Resolution : 12.0 MP + 12.0 MP\n" +
                "Memory : RAM 12GB + 256GB\n" +
                "Network : Dual-SIM 5G\n" +
                "Battery Capacity : 11.200mAh\n" +
                "Special Interface : S-Pen, Samsung DeX"),
        DataProduct("MamyPoko Pants Standar M",R.drawable.popok,50,"Rp 45.200","Inovasi Baru: BANTALAN X-TRA KERING\n" +
                "Makin hebat dengan inovasi terbaru Bantalan X-tra Kering yang bisa menyerap pipis berkali-kali sampai dengan 10 jam. Si kecil tetap kering dan nyaman siang maupun malam."),
        DataProduct("Frozen Original Puff Paratha",R.drawable.frozen,50,"Rp 29.900","Frozen Original Puff Paratha/Roti Canai/Roti Canai/Roti Maryam\n" +
                "\n" +
                "Tersedia kemasan 5pcs per bag total 500gram dan kemasan 25pcs total 2500gram\n" +
                "\n" +
                "Produk ini berbeda dengan frozen Scallion Puff Paratha yang ada daun bawangnya!!!\n"),
    )


    val product: MutableLiveData<List<DataProduct>> = MutableLiveData()

    fun getProduct() {
        product.value = list
    }
}