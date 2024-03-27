fun IntArray.print() {
    this.forEachIndexed { i, item ->
        if (i == 0) print("[$item")
        else print(", $item")
    }
    println("]")
}