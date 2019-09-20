package uk.ac.belfastmet.toptens.domain;

public class TopTen {

	// Instance variables
		private String song;
		private String artist;
		private String album;
		private String image;
		
		
	    // Constructors    
		public TopTen() {
			super();
		}
		
		public TopTen(String song, String artist, String album, String image) {
		}
		
			
		public String getSong() {
			return song;
		}

		public void setSong(String song) {
			this.song = song;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public String getAlbum() {
			return album;
		}

		public void setAlbum(String album) {
			this.album = album;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}
		
        public String toString() {
        	return song + "hello" + album;
        }
}
