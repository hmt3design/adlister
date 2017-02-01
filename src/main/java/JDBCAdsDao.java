import com.mysql.cj.jdbc.Driver;
import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.*;
import java.util.List;

/*** Created by Harry on 2/1/17.*/

public class JDBCAdsDao implements Ads {
    private Connection connection;

    public JDBCAdsDao() throws SQLException {
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);

        // logs in to MySQL and tells it to use the selected database
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost.adlister_db",
                "root",
                "Codeup"
                );
    }

    @Override
    public List<Ad> all() {
        String sql = "Select * from ads";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                Ad ad = new(id, title, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
