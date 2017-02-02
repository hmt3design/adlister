import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            // adsDao = newListAdsDao();
            adsDao = new MySQLAdDAO();
        }
        return adsDao;
    }
}
