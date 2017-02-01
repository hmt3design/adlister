import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harry on 2/1/17.
 */
public class MySQLAdDAO implements Ads {
    private Connection connection;

    public MySQLAdDAO(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
    }

    // get a list of all the ads
    public List<Ad> all() throws SQLException {
    // select * from ads

        String selectQuery = "Select * from ads";
        // create a new list
        List<Ad> ads = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectQuery);
        while (resultSet.next()) {
            // add a new Ad object to the ads list inside this loop
            //use the resultSet.getLong(), getString. mehdods to grab values from the row (in the db)
            long id = resultSet.getLong("id");
            long userId = resultSet.getLong("user_id");
            String title = resultSet.getString("title");
            String description = resultSet.getString("description");

            //use those values to instantiate a new Ad Object, passing them to the constructor
            Ad ad = new Ad(id, userId, title, description);

            // add that new Ad object to the Ads arrayList
            ads.add(ad);
        }
            return ads;
    }

    // insert a new ad and return the new ad's id
    public Long insert(Ad ad) {

        return null;
    }

    public Ad find(int id){

        return null;
    }
}

