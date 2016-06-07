package appewtc.masterung.itpbru;

/**
 * Created by masterUNG on 6/7/16 AD.
 */
public class MyOpenHelper {

    //Explicit
    public static final String database_name = "pbru.db";
    private static final int database_version = 1;

    private static final String create_user_table = "create table userTABLE (" +
            "_id integer primary key, " +
            "Name text, " +
            "Surname text, " +
            "User text, " +
            "Password text);";


    public MyOpenHelper() {
    }   // Constructor

}   // Main Class
