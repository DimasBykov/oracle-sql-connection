package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;

public class JdbcApplication {

    public static void main(String[] args) throws SQLException {

        PostgresDriverManager postgresDriverManager = new PostgresDriverManager();
        Locale.setDefault(Locale.ENGLISH);
        Connection connection = postgresDriverManager.openPostgresConnection();

        SimpleExample simpleExample = new SimpleExample(connection);
        simpleExample.insertExample();

    }
}


