def list = [1, 2, 3, 4, 5]

println list.sum() //This will correctly print 15

//Safe approach using copy of the list 
def listCopy = new ArrayList(list) 
listCopy.each { it -> 
    println it
    list.remove(it) 
}

println list //This will print [] because all elements were correctly removed

// Another safe approach using an iterator
list = [1, 2, 3, 4, 5] 
Iterator<Integer> iterator = list.iterator()
while (iterator.hasNext()) {
    Integer item = iterator.next() 
    println item 
    iterator.remove() 
}
println list //This will also print []