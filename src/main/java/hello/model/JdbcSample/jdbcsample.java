//package hello.model.JdbcSample;
//import java.sql.*;
//
///**
// * Created by 1 on 13.05.2017.
// */
//public class jdbcsample {
//
//    static final String JDBC_DRIVER = "org.postgresql.Driver";
//    static final String DB_URL = "jdbc:postgresql://localhost:5432/Kursovaya";
//
//
//        static final String USER = "postgres";
//        static final String PASS = "masha89106946323";
//
//
//        public static void main(String[] args) {
//            Connection conn = null;
//            Statement stmt = null;
//
//            try {
//                Class.forName(JDBC_DRIVER);
//
//
//                System.out.println("Connecting to database Kursovaya");
//                conn = DriverManager.getConnection(DB_URL, USER, PASS);
//
//                System.out.println("Creating statement");
//                stmt = conn.createStatement();
//                String sql  = "select * from Man";
//                ResultSet rs = stmt.executeQuery(sql);
//
//
//                while (rs.next()) {
//                    System.out.print(rs.getInt("N_man")+ ",");
//                    System.out.println(rs.getString("Year_of_birth"));
////                //Retrieve by column name
////                int id = rs.getInt("id");
////                int age = rs.getInt("age");
////                String first = rs.getString("first");
////                String last = rs.getString("last");
////
////                //Display values
////                System.out.print("ID: " + id);
////                System.out.print(", Age: " + age);
////                System.out.print(", First: " + first);
////                System.out.println(", Last: " + last);
//                }
//                //STEP 6: Clean-up environment
//                rs.close();
//                stmt.close();
//                conn.close();
//            } catch (SQLException se) {
//                //Handle errors for JDBC
//                se.printStackTrace();
//            } catch (Exception e) {
//                //Handle errors for Class.forName
//                e.printStackTrace();
//            } finally {
//                //finally block used to close resources
//                try {
//                    if (stmt != null) {
//                        stmt.close();
//                    }
//                } catch (SQLException se2) {
//                }// nothing we can do
//                try {
//                    if (conn != null) {
//                        conn.close();
//                    }
//                } catch (SQLException se) {
//                    se.printStackTrace();
//                }//end finally try
//            }//end try
//            System.out.println("Goodbye!");
//        }
//
//    }
//}
