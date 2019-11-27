/**
 *
 * @author Rifqi
 */
public class Ignore {

    public static boolean Case(String toModify, String modifier) {
        if (toModify.toLowerCase().contains(modifier.trim().toLowerCase())) {
            return true;
        }
        return false;
    }

}
