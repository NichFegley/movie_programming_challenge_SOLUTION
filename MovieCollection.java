import java.util.*;

public class MovieCollection
{
    private ArrayList<Movie> movies;

    public MovieCollection()
    {
        movies = new ArrayList<Movie>();
    }

    // adds a new movie to the movie collection
    public void addMovie(String title, int year, double rating)
    {
        movie newMovie= new Movie(title,year,rating);
        if (movies.size() == 0 || (newMovie.getRating() >= movies.get(0).getRating()))
        {
            movies.add(0,newMovie);

        }
        else if (newMovie.getRating() < movies.get(movies.size()-1).getRating())
        {
            movies.add(newMovie);
        }
        else
        {
            for (int i = 0; i < movies.size()-1; i++)
            {
                if (newMovie.getRating() <= movies.get(i).getRating() && newMovie.getRating() > movies.get(i+1).getRating())
                {
                    movies.add(i, newMovie);
                }
            }
        }
    }

    // removes a movie from the movie collection
    // return true if movie was successfully removed
    // return false if movie cannot be found
    public boolean removeMovie(String title)
    {
        // Implement this method
    }

    // search for a movie
    // returns Movie object if exists
    // return null if movie is not in collection
    public Movie searchMovie(String title)
    {
        // Implement this method
        return null;
    }

    // displays all movies in the collection in order sorted by rating
    public void displayMovies()
    {
        // Implement this method
    }

    // sorts movies by rating - use Bubblesort
    private void sortMoviesByRating()
    {
        // Implement this method
    }
}