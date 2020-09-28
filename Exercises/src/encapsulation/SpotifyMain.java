package encapsulation;


public class SpotifyMain {

	public static void main(String[] args) {
		Spotify spt = new Spotify(5);
		
		spt.addMusic(new Music("Musica1", "Artista1", "abc", Genre.FORRO, 1999, 3.5));
		spt.addMusic(new Music("Musica2", "Artista2", "def", Genre.SAMBA, 2005, 4.0));
		spt.addMusic(new Music("Musica3", "Artista3", "ghi", Genre.CLASSICO, 2010, 4.2));
		spt.addMusic(new Music("Musica4", "Artista1", "jkl", Genre.JAZZ, 2016, 3.0));
		spt.addMusic(new Music("Musica5", "Artista5", "mno", Genre.FUNK, 2019, 3.7));
		
		for(Music m : spt.musics) {
			System.out.println(m);
		}
		
		System.out.println("------------------\n");
		
		
		spt.addMusic(new Music("Musica6", "Artista6", "pqr", Genre.POP, 2016, 3.75));
		
		
		for(Music m : spt.musics) {
			System.out.println(m);
		}
		
		System.out.println("------------------\n");
		
		
		spt.RemoveMusicByName("Musica2");
		
		for(Music m : spt.musics) {
			System.out.println(m);
		}
		
		System.out.println("------------------\n");	
		
		
		Music[] musicsArtista1 = spt.musicsByArtist(new String("Artista1"));
		for(Music m : musicsArtista1) {
			System.out.println(m);
		}
		
		
		System.out.println("------------------\n");		
		
		Music[] musicsYear16 = spt.musicsByYear(2016);
		for (Music m : musicsYear16) {
			System.out.println(m);
		}


	}

}
