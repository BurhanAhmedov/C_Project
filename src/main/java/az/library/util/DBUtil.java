package az.library.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.io.Closeable;
import java.sql.Connection;

public class DBUtil {
    public static Connection getConnection(){
        Connection connect = null;
        try {
            Context context = new InitialContext();
            DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/B-Library");
            connect=ds.getConnection();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return connect;
    }
    public static void closeAll(AutoCloseable... closeables) throws Exception {
        for (AutoCloseable c: closeables) {
            if(c!=null){
                c.close();
            }

        }
    }
}

