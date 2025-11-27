package hr.ferit.lucijasteler.lv5

class LibraryManager {
    var bookCollection: MutableList<Book> = mutableListOf()

    fun addBook(book: Book) {
        bookCollection.add(book)
    }

    fun removeBook(title: String) {
        bookCollection.removeAll { it.title == title }
    }

    fun sortByYear(): List<Book> {
        return bookCollection.sortedByDescending { it.publicationYear }
    }

    fun sortByAuthor(authorName: String): List<Book> {
        return bookCollection.filter { it.author == authorName }
    }

    fun displayCollection() {
        bookCollection.forEach {
            println("Title: ${it.title}, Author: ${it.author}, Year: ${it.publicationYear}, Pages: ${it.numberOfPages}, Rating: ${it.rating}")
        }
    }
}
