package tema_servlets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
public class TeamPlayer {

    private int id;
    private String playerName;
    private String playerNumber;
    private String playerPosition;
}
