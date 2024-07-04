package models;

import java.util.List;
import java.util.UUID;

public class GeneratorID {
    public static Long userId =  0L;

    public static Long getUserId() {
        return ++userId;
    }


}




