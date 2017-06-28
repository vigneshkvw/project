/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viki
 */
public class mysqlQuery {
    private static final String HOST = "jdbc:mysql://localhost/";
	private static final String DB = "banking";
	private static final String USER = "root";
	private static final String PASSWORD = "viki";
    private static Connection conn;
    private static String QUERY;
	public static void main(String arg[])  {
		Scanner in = new Scanner(System.in);
              System.out.println("1.show tables.");

              int ch = in.nextInt();
				switch (ch) {

               case 1:
                          showTable();
                          break;
}
    }

    private static void getconnection() {
        try {
            conn = (Connection) DriverManager.getConnection(HOST + DB, USER, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(mysqlQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void showTable() {
        getconnection();
         QUERY = "SELECT * FROM logbook";
    }
}
