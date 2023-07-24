package dao;

public class DaoFactory {
    private static Ads adsDao;

//    private static dao.Config config = new dao.Config();
    public static Ads getAdsDao() {
        Config config = new Config();

        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }


}
