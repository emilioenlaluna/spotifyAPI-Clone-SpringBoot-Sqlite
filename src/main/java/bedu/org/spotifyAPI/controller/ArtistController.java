package bedu.org.spotifyAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bedu.org.spotifyAPI.dto.AddSongDTO;
import bedu.org.spotifyAPI.dto.ArtistDTO;
import bedu.org.spotifyAPI.dto.CreateArtistDTO;
import bedu.org.spotifyAPI.service.ArtistService;
import bedu.org.spotifyAPI.service.InterpretationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name = "Endpoint de artistas",description = "CRUD Artistas")
@RestController
@RequestMapping("artists")
public class ArtistController {

    @Autowired
    private ArtistService service;

    @Autowired
    private InterpretationService interpretationService;

    @Operation(summary="Listar todos los artistas")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ArtistDTO> findAll() {
        return service.findAll();
    }

    @Operation(summary = "Crear un nuevo artista")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ArtistDTO save(@Valid @RequestBody CreateArtistDTO data){
        return service.save(data);
    }

    //POST artist/43/songs
    //Ejemplo agregar la cancion con id 1 al artista con id 43
    //body {songId:1}
    @Operation(summary = "Asociar una cancion con un artista")
    @PostMapping("{artistId}/songs")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addSong(@PathVariable long artistId,@RequestBody AddSongDTO data){
        interpretationService.addSong(artistId, data.getSongId());
    }

}
