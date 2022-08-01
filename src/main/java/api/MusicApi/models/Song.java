package api.MusicApi.models;
import javax.persistence.*;
import java.sql.Blob;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="teams")
public class Song {
    // Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer musicID;

    // Columns
    @Column(name="name", nullable = false)
    private String name;

    @Column(name="genre", nullable = false)
    private String genre;

    @Column(name="vocalist")
    private String vocalist;

    @Column(name="image")
    private Blob image;

    @Column(name="content")
    private Blob content;

    @Column(name="lastUpdate")
    private Date lastUpdate;

    // Contructor
    public Song() {
    }

    public Song(Integer musicID, String name, String genre, String vocalist, Date lastUpdate) {
        this.musicID = musicID;
        this.name = name;
        this.genre = genre;
        this.vocalist = vocalist;
        this.lastUpdate = lastUpdate;
    }

    public Song(Integer musicID, String name, String genre, String vocalist, Blob image, Blob content, Date lastUpdate) {
        this.musicID = musicID;
        this.name = name;
        this.genre = genre;
        this.vocalist = vocalist;
        this.image = image;
        this.content = content;
        this.lastUpdate = lastUpdate;
    }

    // Getter & Setter
    public Integer getMusicID() {
        return musicID;
    }

    public void setMusicID(Integer musicID) {
        this.musicID = musicID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVocalist() {
        return vocalist;
    }

    public void setVocalist(String vocalist) {
        this.vocalist = vocalist;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public Blob getContent() {
        return content;
    }

    public void setContent(Blob content) {
        this.content = content;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    // Equal & hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return getMusicID().equals(song.getMusicID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMusicID());
    }
}
