def message = 'hello world' // String object (java.lang)
// Metaprogramming in groovy
// Every groovy class has a static property called as `metaClass`
// Using this property we can inject dynamic members to existing classes

String.metaClass.csvify = {sep = ',' ->
  // println delegate // very much like `this`
  def result = ''
  for (def ch in delegate) {
    result += ch + sep
  }

  result[0..result.size()-2]
}

println message.csvify()

def fullName = 'mehulchopra'
println fullName.csvify('|')