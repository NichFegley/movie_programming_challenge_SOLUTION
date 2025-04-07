public class Movie
{
    private String title;
    private int year;
    private double rating;

    public Movie(String title, int year, double rating)
    {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle()
    {
        return this.title;
    }

    public int getYear()
    {
        return this.year;
    }

    public double getRating()
    {
        return this.rating;
    }

    @Override
    public String toString()
    {
        return this.title + " (" + year + ") - Rating: " + rating;
    }
}