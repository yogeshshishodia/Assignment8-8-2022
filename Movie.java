package javaarraylist;

import java.util.Scanner;

public class Movie {
	private String movieName;
	private String hero;
	private String heroine;
	private Integer year;
	public Movie() {
		super();
	}
	public Movie(String movieName, String hero, String heroine, Integer year) {
		super();
		this.movieName = movieName;
		this.hero = hero;
		this.heroine = heroine;
		this.year = year;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", hero=" + hero + ", heroine=" + heroine + ", year=" + year + "]";
	}
	
	
	
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter movie name");
		
		String movie=sc.nextLine();
		
		Movie obj =new Movie();
		
		
		obj.setMovieName("Dhoom");
		obj.setHero("ravi");
		obj.setHeroine("katrina");
		obj.setYear(2008);
		
		
		obj.setMovieName("krish");
		obj.setHero("yogesh");
		obj.setHeroine("priyanka");
		obj.setYear(2005);
		
		obj.setMovieName("don");
		obj.setHero("roop");
		obj.setHeroine("roopa");
		obj.setYear(2010);
		
		System.out.println(obj);
		if(movie.equals(obj.getMovieName())) {
			System.out.println("Hero name:-"+obj.getHero());
			System.out.println("Heroine name:-"+obj.getHeroine());
			System.out.println("Movie year:-"+obj.getYear());
			
		}
		else {
			System.out.println("enter correct movie name");
		}
		sc.close();
		
	}
	

}
