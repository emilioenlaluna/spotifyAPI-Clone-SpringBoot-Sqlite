package bedu.org.spotifyAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bedu.org.spotifyAPI.dto.CreateSongDTO;
import bedu.org.spotifyAPI.dto.SongDTO;
import bedu.org.spotifyAPI.service.SongService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name = "Endpoint de canciones",description = "CRUD canciones")
@RestController
@RequestMapping("songs")
public class SongController {

    @Autowired
    private SongService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SongDTO> findAll(){
        return service.findAll();
    }

     @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SongDTO save(@Valid @RequestBody CreateSongDTO data){
        return service.save(data);
    }
    
}
