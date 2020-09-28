package encapsulation;

public class Spotify {
	
	Music[] musics;
	private int qntMusics;
	
	public Spotify() {
		this(10);
	}
	
	
	public Spotify(int qnt) {
		this.musics = new Music[qnt];
		this.qntMusics = 0;
	}
	
	public void addMusic(Music m) {
		if(qntMusics == musics.length) {
			Music[] aux = new Music[2*musics.length];
			for (int i = 0; i < musics.length; i++) {
				aux[i] = musics[i];
			}
			this.musics = aux;
		}
		musics[qntMusics] = m;
		qntMusics ++;
	}
	
	
	public int getQntMusics() {
		return qntMusics;
	}
	
	
	public void RemoveMusicByName(String name) {
		boolean moveLeft = false;
		
		for(int i = 0; i < this.qntMusics; i++) {
			if(musics[i].getName().equals(name)) {
				moveLeft = true;
				}
			if (moveLeft) {
				this.musics[i] = this.musics[i + 1];
			}

		}
	}
	
	public Music[] musicsByArtist(String artist) {
		int count = 0;
		for(Music m : this.musics) {
			if (m != null && m.getArtist().equals(artist)) {
				count += 1;
			}
		}
		if (count > 0) {
			Music[] allMusics = new Music[count];
			int i = 0;
			for (Music m : this.musics) {
				if (m != null && m.getArtist().equals(artist)) {
					allMusics[i] = m;
					i ++;
		}

			}
			return allMusics;
		}
		else {
			return null;
		}
	}
	
	public Music[] musicsByYear(int year) {
		int count = 0;
		for (Music m : this.musics) {
			if (m != null && m.getYear() == year) {
				count += 1;
			}
			
		}
		if (count > 0) {
			Music[] allMusics = new Music[count];
			int i = 0;
			for (Music m : this.musics) {
				if (m != null && m.getYear() == year) {
					allMusics[i] = m;
					i ++;
		}

			}
			return allMusics;
		}
		else {
			return null;
		}
		
	}

}
