import java.sql.*;
import java.io.*;


public class PostgresCon {

 public static Connection con1;
 public static File dbLog;
 public static FileWriter fw;
 public static BufferedWriter bw;

 public PostgresCon() {
  con1 = null;
 }

 public void openLog() {

  try {

   dbLog = new File("/home/vagrant/Stan/db.log");

   if (!dbLog.exists()) {
    dbLog.createNewFile();
    System.out.println("File created");
   }

   fw = new FileWriter(dbLog.getName(), true);
   bw = new BufferedWriter(fw);


  } catch (IOException fe) {
   fe.printStackTrace();
   return;
  }
 }

 public void closeLog() {
  try {
   if (bw != null) {
    bw.close();
    System.out.println("Log file closed");
   }

  } catch (IOException ie) {
   ie.printStackTrace();
  }

 }


 public static void writeLog(String msg) {

  try {

   if (bw != null) {
    bw.write(msg + "\n");
    System.out.println("Wrote into log file");
   }
  } catch (IOException fe) {
   fe.printStackTrace();
   System.out.println("Writing into log file failed");
   return;
  }
}

 public void conn_close() {

  try {

   if (con1 != null) {
    con1.close();
    System.out.println("Connection closed");
   }
  } catch (SQLException se) {
   se.printStackTrace();
  }
 }

 public void regi_driver() {

  try {

   Class.forName("org.postgresql.Driver");
   System.out.println("Driver is Registered");
  } catch (ClassNotFoundException ce) {
   ce.printStackTrace();
   System.out.println("Driver not found");
  }
 }

 public void db_connect() {

  try {
   // replace username/password for "stan"
   con1 = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:3333/queue", "user_name", "password");
   System.out.println("DB Connected");
   writeLog("INFO: DB Connected");
  } catch (SQLException se) {
   System.out.println("Not Connected");
   writeLog("ERROR: DB Not Connected");
  }
}

 public void selectData() {

  String sql;

  Statement stmt = null;

  try {

   stmt = con1.createStatement();
   sql = "select * from \"PA-53b2f1d0641a0a0f000c2f10\" where id=2";
   ResultSet rs = stmt.executeQuery(sql);

   while (rs.next()) {

    String s2 = rs.getString("message");
    //String    s1 = rs.getString("loc");


    System.out.println("ChangeNotification = " + s2);
   }
   rs.close();

  } catch (SQLException se) {
   // se.printStackTrace();
   se.printStackTrace();
  }
}

 public static void main(String[] args) {

  PostgresCon dcon = new PostgresCon();

  dcon.openLog();

  dcon.regi_driver();
  dcon.db_connect();
  dcon.selectData();
  dcon.conn_close();
  dcon.closeLog();
 }
}
