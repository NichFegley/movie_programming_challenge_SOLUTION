public class MovieManager
{
    /* The main method to control program.
    Should prompt user to collect details
    and provide control for the user through
    a console program.  Here is an example of
    the output your program should provide.

    Welcome to the Movie Collection Manager!
    1. Add a Movie
    2. Remove a Movie
    3. Search for a Movie
    4. Display all Movies
    5. Exit

    Enter your choice: 1
    Enter movie title: Inception
    Enter release year: 2010
    Enter rating (out of 10): 8.8
    Movie added successfully!
    */ 
   public static void main(String [] args)
   {
        Scanner scanner = new Scanner(System.in);
        MovieCollection movieCollection = new MovieCollection();
        int choice = 0;

        while (choice != 5)
        {
            choice = Integer.parseInt(scanner.nextLine());
        }
   }

   public static void writeOptions()
   {
        System.out.println("Welcome to the Movie Manager!");
        System.out.println("1. add a movie");
        System.out.println("2. remove a movie");
        System.out.println("Search for a movie");
        System.out.println("Display all Movies");
        System.out.println("exit");
   }
}