package com.example.lab1_md18306.Lab2

fun main() {
    // Làm việc với safety
//    val tenSV: String? = "Nguyen Van Long"
//
//    if (tenSV != null){
//        val mssv = getThongTinSV(tenSV!!)
//        println("MSSV của $tenSV : $mssv")
//    }

    val sv1 : SinhVienModel = SinhVienModel("Nguyen Van Long", "PH33056", 9.5f)
    val sv2 : SinhVienModel = SinhVienModel("Le Tuan Anh", "PH34923", 8.5f)

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

    // Xem danh sách sinh viên
    listStudents(listSV)

    // Cập nhật thông tin sinh viên
    updateStudent(listSV, "PH34923", SinhVienModel("Le Tuan Anh", "PH34923", 8.0f, true, 22))

    // Xem danh sách sinh viên sau khi cập nhật
    listStudents(listSV)

    // Xóa sinh viên
    deleteStudent(listSV, "PH33942")

    // Xem danh sách sinh viên sau khi xóa
    listStudents(listSV)


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

fun listStudents(listSV: List<SinhVienModel>) {
    if (listSV.isEmpty()) {
        println("Chưa có sinh viên nào trong danh sách.")
    } else {
        println("Danh sách sinh viên:")
        listSV.forEach { println(it.getThongTin()) }
    }
}

fun updateStudent(listSV: MutableList<SinhVienModel>, mssv: String, updatedStudent: SinhVienModel) {
    val index = listSV.indexOfFirst { it.mssv == mssv }
    if (index != -1) {
        listSV[index] = updatedStudent
        println("Đã cập nhật thông tin sinh viên có mã số $mssv")
    } else {
        println("Không tìm thấy sinh viên có mã số $mssv")
    }
}

fun deleteStudent(listSV: MutableList<SinhVienModel>, mssv: String) {
    val index = listSV.indexOfFirst { it.mssv == mssv }
    if (index != -1) {
        val deletedStudent = listSV.removeAt(index)
        println("Đã xóa sinh viên: ${deletedStudent.getThongTin()}")
    } else {
        println("Không tìm thấy sinh viên có mã số $mssv")
    }
}