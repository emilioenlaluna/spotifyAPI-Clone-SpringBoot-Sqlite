package bedu.org.spotifyAPI.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateArtistDTO {


    @NotBlank
    private String name;
    
}
