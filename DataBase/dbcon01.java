import    java.sql.*;
import    java.io.*;


public class dbcon01 {


     public   static   Connection      con1;
     public   static   String          ins1;
     public   static   File            dbLog;
     public   static   FileWriter      fw;
     public   static   BufferedWriter  bw;



     public   dbcon01() {

         con1 = null;
     }



      public void openLog() {

          try{

               dbLog = new File("c:/ORA/db.log");

               if (!dbLog.exists()) {
		  dbLog.createNewFile();
                  System.out.println("File created");
	       }

               fw = new     FileWriter(dbLog.getName(), true );
               bw = new     BufferedWriter(fw);


          } catch(IOException  fe)  {
               fe.printStackTrace();
               return;
          }
     }



     public void closeLog() {
         try {
             if( bw != null) {
                 bw.close();
                 System.out.println("Log file closed");
             }

         } catch(IOException  ie) {
             ie.printStackTrace();
         }

     }


     public static void writeLog(String   msg) {

          try{

               if (bw != null) {
		  bw.write(msg + "\n");
                  System.out.println("Wrote into log file");
	       }


          } catch(IOException  fe)  {
               fe.printStackTrace();
               System.out.println("Writing into log file failed");
               return;
          }

     }




     public  void  conn_close() {

         try{

             if(con1 != null) {
                 con1.close();
                 System.out.println("Connection closed");
             }

         } catch(SQLException   se) {
             se.printStackTrace();
         }
     }


     public void regi_driver(){

          try{

               Class.forName("oracle.jdbc.driver.OracleDriver");
               System.out.println("Driver is Registered");
          } catch(ClassNotFoundException ce) {
               ce.printStackTrace();
               System.out.println("Driver not found");
          }
     }



     public void   db_connect() {

          try{

               con1   = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
               System.out.println("DB Connected");
               writeLog("INFO: DB Connected");
          } catch(SQLException   se) {
              System.out.println("Not Connected");
               writeLog("ERROR: DB Not Connected");
          }

     }



     public void ins_dept(){

          ins1 = "INSERT INTO DEPT " + "(DEPTNO, DNAME, LOC)" + "VALUES(?,?,?)";
          try{

                PreparedStatement    prepStmt = con1.prepareStatement(ins1);

                prepStmt.setInt(1, 110);
                prepStmt.setString(2, "Health");
                prepStmt.setString(3, "London");


                prepStmt.executeUpdate();

                System.out.println("Prepared statement formed");
                //bw.writeln("Prepared statement formed");
          } catch(SQLException  pe) {
                System.out.println("Prepared statement problem");
                //bw.writeln("Prepared statement problem");
          }

     }


     public void selectData() {

           String          sql;

           Statement       stmt = null;

           try {

                stmt = con1.createStatement();
                sql = "SELECT deptno, dname, loc FROM DEPT";
                ResultSet   rs = stmt.executeQuery(sql);

                while(rs.next() ) {

                     int   dnum = rs.getInt("deptno");
                     String    s1 = rs.getString("loc");


                     System.out.println("DEPTNO = " + dnum + "   LOC = " + s1 );
                }
                rs.close();

           } catch(SQLException   se) {
               // se.printStackTrace();
                se.printStackTrace();
           }

     }

     public static void main(String[]     args) {

          dbcon01     dcon = new    dbcon01();

          dcon.openLog();

          dcon.regi_driver();
          dcon.db_connect();
          dcon.ins_dept();
          dcon.selectData();
          dcon.conn_close();
          dcon.closeLog();

     }

}