
package trandpl.pojo;

/**
 *
 * @author som
 */
public class CurrentUser {

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        CurrentUser.name = name;
    }

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        CurrentUser.userId = userId;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        CurrentUser.id = id;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        CurrentUser.type = type;
    }
    private static String name;
    private static String userId;
    private static String id;
    private static String type;
    
}
