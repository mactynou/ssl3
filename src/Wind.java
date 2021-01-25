import java.util.Objects;

public class Wind {
    private static boolean isWind;

    public static void setIsWind(boolean isWind) {
        Wind.isWind = isWind;
    }

    public static boolean isWind() {
        System.out.println("There was no tailwind");
        return isWind;
    }
}
