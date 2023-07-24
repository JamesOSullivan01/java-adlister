package dao;

import com.mysql.cj.jdbc.Driver;
import models.Ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection = null;


    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getURL(), config.getUser(), config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public MySQLAdsDao() {
    }

    public static void main(String[] args) {
        Config config = new Config();
        MySQLAdsDao adsDao = new MySQLAdsDao(config);
    }
    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

}
