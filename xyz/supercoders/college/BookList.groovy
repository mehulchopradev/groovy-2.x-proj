package xyz.supercoders.college

class BookList {
  List books

  def methodMissing(String methodName, args) {
    // println methodName
    // println args
    // this

    def property = methodName['findAllBy'.size()..methodName.size()-1]
    property = "${property[0].toLowerCase()}${property[1..property.size()-1]}"

    this.books.findAll { it[property] ==  args[0] }
  }
}