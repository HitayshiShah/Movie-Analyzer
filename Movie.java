package movies;

public class Movie implements Comparable<Movie> {
	private String title;
	private int year;
	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}
	public int compareTo(Movie that) {
		int titlecomp = this.title.compareTo(that.title);
		if (titlecomp != 0) {
			return titlecomp;
		}
		else {
			return this.year - that.year;
		}
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public boolean equals(Object x) {
		Movie check = (Movie)x;
		return this.compareTo(check) == 0;
	}
	public String toString() {
		return "Movie " + this.getTitle() + " " + "(" + this.getYear() + ")";
	}
	public static Movie[] getTestMovies() {
		Movie[] arr = new Movie[10];
		arr[0] = new Movie("Cheaper by the Dozen", 2003);
		arr[1] = new Movie("Cheaper by the Dozen", 2005);
		arr[2] = new Movie("Parasite", 2019);
		arr[3] = new Movie("Joker", 2019);
		arr[4] = new Movie("The Avengers", 2012);
		arr[5] = new Movie("The Avengers", 2012);
		arr[6] = new Movie("The Notebook", 2004);
		arr[7] = new Movie("The Last Airbender", 2010);
		arr[8] = new Movie("Wonder", 2017);
		arr[9] = new Movie("Fahrenheit 451", 2018);
		return arr;
	}
	public int hashCode() {
		return title.hashCode() + year;
	}
		
	
	
}

