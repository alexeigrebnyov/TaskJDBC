package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    private String url = "jdbc:mysql://localhost/store?serverTimezone=Europe/Moscow&useSSL=false";
   private String username = "root";
    private String password = "PASSFORJAZZDATAMANAge__1213455}[";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getConnection() {
        Connection conn = null;
        try {

            Class.forName(driver).getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(url, username, password);

                System.out.println("Connection to Store DB succesfull!");

        } catch (Exception ex) {
            System.out.println("Connection failed...");


            System.out.println(ex);

        }
        return conn;
    }

}