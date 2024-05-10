package com.example.lab1_md18306

fun main() {
    // Làm việc với safety
//    val tenSV: String? = "Nguyen Van Long"
//
//    if (tenSV != null){
//        val mssv = getThongTinSV(tenSV!!)
//        println("MSSV của $tenSV : $mssv")
//    }

    val sv1 :  SinhVienModel = SinhVienModel("Nguyen Van Long", "PH33056", 9.5f)
    val sv2 :  SinhVienModel = SinhVienModel("Le Tuan Anh", "PH34923", 8.5f)

    sv2.daTotNghiep = false
    sv1.tuoi = 21

    val sv3 = SinhVienModel("Tran Thu Thao", "PH33942", 8.5f, false, 20)

//    println(sv1.getThongTin())
//    println(sv2.getThongTin())
//    println(sv3.getThongTin())

    // Tạo và xử lý danh sách SV
    val listSV = mutableListOf<SinhVienModel>() // mutableListOf: dùng cho add
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)
    // Xóa phần tử cuối cùng trong danh sách


    // cách 1: duyệt nhanh
    println("Duyệt nhanh")
    println("====================")
    for (sv in listSV){
        println(sv.getThongTin())
    }

    println("====================")

    // Cách 2: Duyệt có quan tam index phan tử trong list
    println("Duyệt có index")
    for(i in listSV.indices){
        println("Thong tin $i: ${listSV.get(i).getThongTin()}")
    }

}

fun getThongTinSV(tenSV: String): String? {
    when (tenSV) {
        "Nguyen Van Long" -> {
            return "PH33056"
        }

        "Le Tuan Anh" -> return "Ph33042"
        else -> return null

    }
    return null
}
