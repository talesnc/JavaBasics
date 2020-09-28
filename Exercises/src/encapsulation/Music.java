package encapsulation;

public class Music {
	private String name, artist, lyrics;
	private Genre genre;
	private int year, numReproductions;
	private double duration;
	
	public Music(String name, String artist, String lyrics, Genre genre, 
			int year, double duration) {
		this.name = name;
		this.artist = artist;
		this.lyrics = lyrics;
		this.genre = genre;
		this.year = year;
		this.numReproductions = 0;
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getLyrics() {
		return lyrics;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getNumReproductions() {
		return numReproductions;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public void playMusic() {
		this.numReproductions++;
	}
	
	public String toString() {
		String output = "";
		output += "Artista: " + artist + " - Nome: " + name + " - Ano de lançamento: " + year + "\n";
		output += "Duração: " + duration + " minutos" + " - Gênero: " + genre  + "\n";
		output += numReproductions + " vezes reproduzidas\n";
		return output;
	}

}
