package com.example.kotlindemo

fun main() {
    var n :Int =4
    var i :Int = 1
    var result:String = " "
    while(i <= n)
    {
        result += (i).toString()+"@"
        ++i
    }
    print(result)
}