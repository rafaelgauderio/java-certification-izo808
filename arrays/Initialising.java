package arrays;

import java.util.Arrays;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}

public class Initialising {

    public static void main(String[] args) {

        int [] vetor = {4, 17 ,3 ,8, 22 ,95};

        // printing elements of the array
        for(int i=0; i < vetor.length ; i++) {
            System.out.println(vetor[i]);
        }


        System.out.println("\n");
        // printing the array
        System.out.println(Arrays.toString(vetor));


        Book b1 = new Book("Dom Casmurro");
        Book b2 = new Book("Harry Potter");
        Book b3 = new Book("Sobre o suicídio");

        Book [] books = new Book[3];
        books[0]=b1;
        books[1]=b2;
        books[2]=b3;

        System.out.println("\n");
        for(Book apelido : books) {
            System.out.println(apelido);
        }
    }
}
