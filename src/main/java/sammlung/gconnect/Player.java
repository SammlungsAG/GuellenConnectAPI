package sammlung.gconnect;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class Player implements Serializable {

    @NotNull
    String name;
    @NotNull
    long playtimeTicks;

    public Player(@NotNull String name, @NotNull long playtimeTicks) {
        this.name = name;
        this.playtimeTicks = playtimeTicks;
    }
}
