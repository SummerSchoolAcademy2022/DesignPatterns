package creational.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class HouseLombok {
    private int walls;
    private int doors;
    private int windows;
    private boolean roof;
    private boolean garage;
}
