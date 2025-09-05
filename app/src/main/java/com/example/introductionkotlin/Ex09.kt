package com.example.introductionkotlin

/*
Ví dụ: nếu bạn đã gọi hàm chứa các đối số có tên như sau:

timeSpentToday = 300 và timeSpentYesterday = 250, hàm sẽ trả về giá trị true.
timeSpentToday = 300 và timeSpentYesterday = 300, hàm sẽ trả về giá trị false.
timeSpentToday = 200 và timeSpentYesterday = 220, hàm sẽ trả về giá trị false.
Gợi ý: Toán tử so sánh > sẽ trả về giá trị true nếu giá trị trước toán tử lớn
hơn giá trị sau toán tử. Nếu không, toán tử này sẽ trả về giá trị false.
 */

fun main() {
    println(compareTime(300, 250))
    println(compareTime(300, 300))
    println(compareTime(200, 220))
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
