package api.MusicApi.controllers;

import api.MusicApi.models.ResponseObject;
import api.MusicApi.models.Song;

import api.MusicApi.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/song")
@CrossOrigin("*")
public class SongController {
    // Dependency Injection
    @Autowired
    private SongRepository songRepository;

    // Get all songs
    @GetMapping("/all")
    List<Song> getAllSongs() { return songRepository.findAll(); }

    // Get songs by page and page size
    @GetMapping("/all/page={page}/pagesize={pagesize}")
    List<Song> getAllSongsByPage(@PathVariable("page") Integer page, @PathVariable("pagesize") Integer pagesize) {
        // Find all
        List<Song> songs = songRepository.findAll();

        // Cut index
        Integer from = pagesize * (page - 1);
        Integer to = pagesize * (page - 1) + pagesize - 1;
        if (to > songs.size()) to = songs.size() - 1;

        // Cut by page and page size
        return songs.subList(from, to);
    }
}
