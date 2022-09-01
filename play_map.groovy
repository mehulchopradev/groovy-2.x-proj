import xyz.supercoders.college.domain.StudentOld as Student

smap = [
  10: new Student('mehul', 10, 'm', 90),
  5: new Student('jane', 5, 'f', 95),
  15: new Student('caroline', 15, 'f', 85),
  3: new Student('bill', 3, 'm', 99)
]

// print the roll no, name and gender of every student in the class
/* smap.each {roll, student ->
  println "Roll: ${roll}"
  println "Name: ${student.name}"
  println "Gender: ${student.gender}"
} */

smap.each {
  // `it` -> Entry object -> (key, value)
  println "Roll: ${it.key}"
  println "Name: ${it.value.name}"
  println "Gender: ${it.value.gender}"
}

// get a new map consisting of only the females
def m1 = smap.findAll { it.value.gender == 'f' }
println m1

// get a new list of names from the map smap
def nl = smap.collect { it.value.name }
println nl

// get a new map consisting of roll as key and name as value from smap
def m2 = smap.collectEntries { [it.key, it.value.name] }
println m2

// has every student scored more than 80
println smap.every { it.value.marks > 80 }

// any student who has scored 100
println smap.any { it.value.marks == 100 }
