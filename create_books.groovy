import xyz.supercoders.college.domain.*

/* Contact c1 = new Contact(email: 'mehulc@hey.com', mobile: '8768768', country: 'IN', state: 'MH', postalCode: 400053)
Contact c2 = new Contact(email: 'caroline@hey.com', mobile: '88676862', country: 'US', state: 'WA', postalCode: 988678)

Author a1 = new Author(name: 'mehul', ratings: 5, gender: 'm', contact: c1)
Author a2 = new Author(name: 'caroline', ratings: 5, gender: 'f', contact: c2)

Book b1 = new Book(title: 'Book 1', pages: 900, price: 1000, authors: [a1, a2]) */

// ObjectGraphBuilder
def ogb = new ObjectGraphBuilder(classNameResolver: 'xyz.supercoders.college.domain')

def b1 = ogb.book(title: 'Book 1', pages: 900, price: 1000) {
  author(name: 'mehul', ratings: 5, gender: 'm') {
    contact(email: 'mehulc@hey.com', mobile: '8768768', country: 'IN', state: 'MH', postalCode: 400053)
  }

  author(name: 'caroline', ratings: 5, gender: 'f') {
    contact(email: 'caroline@hey.com', mobile: '88676862', country: 'US', state: 'WA', postalCode: 988678)
  }
}

println b1
b1.authors.each {
  println it
  println it.contact
}