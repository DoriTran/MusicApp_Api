package api.MusicApi.repositories;

import api.MusicApi.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SongRepository extends JpaRepository<Song, Integer> {
}
