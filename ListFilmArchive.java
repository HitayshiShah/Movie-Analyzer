package movies;
import java.util.ArrayList;
import java.util.TreeSet;

public class ListFilmArchive  extends ArrayList<Movie> implements FilmArchive {
	@Override
	public boolean add(Movie a) {
		for (Movie check : this) {
			if (a.equals(check)) {
				return false;
			}
		}
		return super.add(a);
}
	public ArrayList<Movie> getSorted(){
		TreeSet<Movie> tree = new TreeSet<Movie>(this);
		ArrayList<Movie> secondList = new ArrayList<Movie>(tree);
		return secondList;
	}
	public static void main(String[] args)
	{
		ListFilmArchive archive = new ListFilmArchive();
		for (Movie m: Movie.getTestMovies())
			archive.add(m);
		for (Movie m: archive)
			System.out.println(m); 
		System.out.println("**************");
		for (Movie m: archive.getSorted())
			System.out.println(m);
      }


}
