
package Class;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public abstract class Song {
   public String title;
   private int identifier;
   public LocalDate date;
   public double duration;
   public String genre;
   public String cover;
   public String description;

    public Song(String title, int identifier, LocalDate date, double duration, String genre, String cover, String description) {
        this.title = title;
        this.identifier = identifier;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }
   
   public Song(){
       
   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public abstract int SongCounter();

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", identifier=" + identifier + ", date=" + date + ", duration=" + duration + ", genre=" + genre + ", cover=" + cover + ", description=" + description + '}';
    }
   
    
   
   
}
