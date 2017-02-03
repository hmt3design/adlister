import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harry on 2/1/17.
 */
public class MySQLAdDAO implements Ads {
    private Connection connection;

    public MySQLAdDAO() {
        Driver driver;

        try {
            driver = new Driver();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.url,
                    Config.username,
                    Config.password
            );

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // get a list of all the ads
    @Override
    public List<Ad> all() { // checked exception
        // select * from ads

        String selectQuery = "SELECT * FROM ads";
        // create a new list
        List<Ad> ads = new ArrayList<>();
        try {
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

        } catch (SQLException e) {
            // re-throw an exception
            // wrapping the exception
            throw new RuntimeException(e);
        }

        return ads;
    }

    // insert a new ad and return the new ad's id
    public long insert(Ad ad) {
        String sql = "INSERT INTO ads (user_id, title, description)" + "VALUES ( ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setLong(1, ad.getUserId());
            statement.setString(2, ad.getTitle());
            statement.setString(3, ad.getDescription());
            statement.executeUpdate();
            ResultSet generatedKeys = statement.getGeneratedKeys();
            generatedKeys.next();
            long id = generatedKeys.getLong(1);
            ad.setId(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public Ad find(long id) {
        String sql = "SELECT * FROM ads WHERE id = " + id;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                return new Ad(id, title, description);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}

