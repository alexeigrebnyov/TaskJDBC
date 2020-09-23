package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    private static String url = "jdbc:mysql://localhost/store?serverTimezone=Europe/Moscow&useSSL=false";
   private static String username = "root";
    private static String password = "PASSFORJAZZDATAMANAge__1213455}[";
    private static String driver = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
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