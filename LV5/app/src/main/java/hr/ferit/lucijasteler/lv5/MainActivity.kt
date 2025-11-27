package hr.ferit.lucijasteler.lv5

import androidx.activity.ComponentActivity
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    private fun main() {
        var libraryManager = LibraryManager()

        libraryManager.addBook(Book("Jane Eyre", "Charlotte Bronte", 1847, 623, 5.0f))
        libraryManager.addBook(Book("The Picture of Dorian Gray", "Oscar Wilde", 1890, 288, 4.8f))
        libraryManager.addBook(Book("1984", "George Orwell", 1949, 328, 4.7f))
        libraryManager.addBook(Book("Pride and Prejudice", "Jane Austen", 1813, 352, 4.9f))
        libraryManager.addBook(Book("Persuasion", "Jane Austen", 1818, 314, 4.8f))
        libraryManager.addBook(Book("Ulysses", "James Joyce", 1922, 228, 4.5f))

        libraryManager.displayCollection()
        println("\n")

        libraryManager.removeBook("Ulysses")
        libraryManager.displayCollection()
        println("\n")

        var sortedByYear = libraryManager.sortByYear()
        sortedByYear.forEach {
            println("Title: ${it.title}, Author: ${it.author}, Year: ${it.publicationYear}")
        }
        println("\n")

        var sortedByAuthor = libraryManager.sortByAuthor("Jane Austen")
        sortedByAuthor.forEach {
            println("Title: ${it.title}, Author: ${it.author}, Year: ${it.publicationYear}")
        }
    }

    @Composable
    fun SearchBar(modifier: Modifier = Modifier) {
        var text by remember { mutableStateOf("") }

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Label") },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search Bar") }
        )
    }
}
