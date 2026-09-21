```java
class Book {
    int bookId;
    String title;
    String author;
    double price;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class Main {

    public static int removeDuplicates(Book[] books, int n) {
        if (n == 0)
            return 0;

        int j = 1;

        for (int i = 1; i < n; i++) {
            if (books[i].bookId != books[i - 1].bookId) {
                books[j] = books[i];
                j++;
            }
        }

        return j;
    }

    public static void searchByTitle(Book[] books, int count, String query) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(query.toLowerCase())) {
                System.out.println("Found: [" + books[i].bookId + "] "
                        + books[i].title + " - Rs. " + books[i].price);
            }
        }
    }

    public static void sortByPrice(Book[] books, int count) {
        int swaps = 0;

        for (int i = 0; i < count - 1; i++) {
            int min = i;

            for (int j = i + 1; j < count; j++) {
                if (books[j].price < books[min].price) {
                    min = j;
                }
            }

            if (min != i) {
                Book temp = books[i];
                books[i] = books[min];
                books[min] = temp;
                swaps++;
            }
        }

        System.out.println("Total Swaps: " + swaps);
    }

    public static int searchByPrice(Book[] books, int count, double targetPrice) {
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (books[mid].price == targetPrice)
                return mid;

            if (books[mid].price < targetPrice)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static int minBooksForTargetCost(Book[] books, int count, double targetCost) {
        int left = 0;
        double sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < count; right++) {
            sum += books[right].price;

            while (sum >= targetCost) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= books[left].price;
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE)
            return 0;

        return minLength;
    }

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Data Structures", "Mark", 400.0),
                new Book(101, "Data Structures", "Mark", 400.0),
                new Book(102, "Java Basics", "James", 300.0),
                new Book(103, "Python Guide", "Guido", 600.0),
                new Book(104, "Database Systems", "Raghu", 500.0),
                new Book(105, "Computer Networks", "Andrew", 700.0)
        };

        int count = books.length;

        count = removeDuplicates(books, count);

        System.out.println("Unique Books Count: " + count);

        System.out.println("\nSearch Results for 'data':");
        searchByTitle(books, count, "data");

        sortByPrice(books, count);

        System.out.println("\nBooks Sorted by Price:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". [" + books[i].bookId + "] "
                    + books[i].title + " - Rs. " + books[i].price);
        }

        int index = searchByPrice(books, count, 500.0);

        System.out.println("\nSearching for Price Rs. 500.0...");

        if (index != -1) {
            System.out.println("Book found at index " + index + ": ["
                    + books[index].bookId + "] " + books[index].title);
        } else {
            System.out.println("Book not found");
        }

        int result = minBooksForTargetCost(books, count, 1000.0);

        System.out.println("\nMinimum Consecutive Books Needed: " + result);
    }
}
```
