def list = [1, 2, 3, 4, 5]

println list.sum() //This will correctly print 15

list.each { it ->
    println it
    list.remove(it) //This will remove elements from list during iteration causing unexpected behavior 
}

println list //This may print an unexpected result because of elements removed during iteration