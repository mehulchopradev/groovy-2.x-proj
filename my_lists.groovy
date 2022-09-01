List.metaClass.odds = {
  delegate.findAll { it % 2 }
}

def pointers = [5, 6, 5, 4, 3, 7, 8, 1, 2, 9, 5, 6, 7]

def od = pointers.odds()
println od