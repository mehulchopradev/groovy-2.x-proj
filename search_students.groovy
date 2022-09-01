import xyz.supercoders.college.domain.StudentOld as Student

slist = [
  new Student('mehul', 10, 'm', 90),
  new Student('jane', 5, 'f', 95),
  new Student('caroline', 15, 'f', 85),
  new Student('bill', 3, 'm', 99)
]

def smap = slist.collectEntries {[it.roll, it]}

/* smap = [
  10: new Student('mehul', 10, 'm', 90),
  5: new Student('jane', 5, 'f', 95),
  15: new Student('caroline', 15, 'f', 85),
  3: new Student('bill', 3, 'm', 99)
] */

println "Enter roll to search: "
def scanner = new Scanner(System.in)
def sroll = scanner.nextInt()

/* def o = slist.find { it.roll == sroll }
if (o) {
  println o.getDetails()
} else {
  println "Student not found"
} */

def o = smap[sroll]
println(o ? o.getDetails() : "Student not found")