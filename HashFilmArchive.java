package movies;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashFilmArchive extends HashSet<Movie> implements FilmArchive {
	public ArrayList<Movie>getSorted(){
		TreeSet<Movie>secondtree = new TreeSet<Movie>(this);
		ArrayList<Movie> secondList = new ArrayList<Movie>(secondtree);
		return secondList;
	}
	public static void main(String[] args)
	{
		HashFilmArchive archive = new HashFilmArchive();
		for (Movie m: Movie.getTestMovies())
			archive.add(m);
		for (Movie m: archive)
			System.out.println(m); 
		System.out.println("**************");
		for (Movie m: archive.getSorted())
			System.out.println(m);
      }

}
