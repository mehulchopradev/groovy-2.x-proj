import xyz.supercoders.college.BookList
import xyz.supercoders.college.domain.Book
import com.abc.MyBook

def blist1 = new BookList(books: [
  new Book(title: 'Book 1', price: 900, pages: 1000),
  new Book(title: 'Book 2', price: 500, pages: 1500),
  new Book(title: 'Book 3', price: 900, pages: 400)
])

// DSL (Domain specific language)
println(blist1.findAllByPrice 900)
println(blist1.findAllByPages 400)


def blist2 = new BookList(books: [
  new MyBook(name: 'Prog in C', pr: 900, pages: 800),
  new MyBook(name: 'Prog in Java', pr: 870, pages: 1000),
  new MyBook(name: 'Prog in Python', pr: 1000, pages: 1000)
])

println(blist2.findAllByPr 870)
println(blist2.findAllByPages 1000)