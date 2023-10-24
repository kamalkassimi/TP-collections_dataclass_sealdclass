fun main() {
    var list = ArrayList<Int>()
//var num = readLine()?.toIntOrNull()
    println("Enter size en list :")
    var n= readLine()!!.toInt()

    for (i in 0..n){
        println("Enter number of list ")
        var  liste= readLine()!!.toInt()

        list.add(liste)
    }
    println("affichage en list :"+list)
    println(list.max())
    list[0]=16
    println("affichage en list :"+list)
    println(list.trimToSize())

}
