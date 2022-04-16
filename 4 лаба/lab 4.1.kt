
class Book(var author : String, var title : String, var year : String){
    fun Info(){
        println("Книга " + title + "за авторством " + author + ". Выпущена в " + year + "  году.")
    }
}

class Library(){
    var books = mutableListOf<Book>();

    fun AllBooks(){
        for (i in books){
            i.Info();
        }
    }

    fun add(book : Book){
        books.add(book);
    }

    fun pop(title : String){
        for (i in books){
            if (i.title == title){
                books.removeAt(books.indexOf(i));
            }
        }
    }

    fun find(author: String = "", title : String = "", year : String = ""){
        for (i in books){
            if (author == i.author || title == i.title || year == i.year){
                i.Info();
            }
        }
    }
}

fun main() {
    var book1 = Book("Пушкин","Евгений Онегин","1831");
    var book2 = Book( "Толстой", "Война и мир", "1867");
    var book3 = Book( "Пупкин", "Какая-то книга", "2024");
    var book4 = Book( "Неизвестный", "Почему падает снег", "1");
    var book5 = Book( "Иванов", "Иванов", "2020");

    var lib = Library();

    lib.add(book1);
    lib.add(book2);
    lib.add(book3);
    lib.add(book4);
    lib.add(book5);

    lib.AllBooks();
    println();

    lib.pop("Иванов");
    println();

    lib.AllBooks();
    println();

    println("Поиск по году 1831:")
    print(lib.find(year="1831"))
    println()

    println("Поиск по автору Толстой:")
    print(lib.find(author="Толстой"))
    println()

    println("Поиск по названию Какая-то книга:")
    print(lib.find(title="Какая-то книга"))
    println()

}