package Movie;
import java.util.*;
class Movie
{
	String name;
	String director;
	int rating;
	String comment;
	
	Movie(String name, String director, int rating, String comment)
	{
		this.name = name;
		this.director = director;
		this.rating = rating; 
		this.comment = comment;
	}
	
	public void show(Movie m, Movie a, Movie b, Movie c)
	{
		System.out.println(m.name);
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
	}
	
	public Movie add()
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Movie z = new Movie(name, name, 3, name);
		return z;
	}
}

public class NewMovie {

	
	
	public static void main(String[] args) {
		Movie movie1 = new Movie("Radhe", "Salman", 2, "bad");
		Movie movie2 = new Movie("War", "Tiger", 1, "very bad");
		Movie movie3 = new Movie("3 idiots", "Amir", 5, "very good");
		Movie movie4 = new Movie("Harry Potter", "Harry", 5, "Excellent");
		
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		movies.add(movie1.add());
		
		for(Movie movie : movies)
		{
			System.out.println(movie.name + " " + movie.director + " " + movie.rating);
		}
		
		movie1.show(movie1, movie2, movie3, movie4);
	}

}
