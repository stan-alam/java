import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
  * This is a Single Linked List.
  * This list will hold data that will be retrived from the DB.
  * Once data in the Linked List, itcan be processed accordingly.
  */



class  Link {

     public  int        idata;
     public  double     ddata;
     public  Link       next;


     public Link(int    id,  double    dd) {

         idata = id;
         ddata = dd;
         next = null;
     }

}


class LinkList {

    public  Link      curr;
    public  Link      last;
    public  Link      head;

    public  int       count = 0;
    public  int       pcount = 0;






    public LinkList(){

         head =null;
         last = null;

         curr= head;

    }


    public void insert(int     id,   double    dd) {

         Link      tmp;



        // System.out.println("In side  insert");


         if (head == null ) {
             head = new   Link( id, dd);
             curr=  head;

             count++;

         } else {
              tmp = new   Link( id, dd);
              curr.next  = tmp;
              curr = curr.next;

              count++;
          }
          //System.out.println("count = " + count);

     }


      public void countList() {
         Link      temp = null;
         int       cnt = 0;

          temp = head;

          while(temp != null) {

              cnt++;
              temp = temp.next;


          }

      }


     public void printList() {
         Link   tmp;

         tmp = head;

         if(tmp == null) {

            System.out.println("No list in the Link");
         } else {
             while(tmp != null) {
                 pcount++;
                 System.out.println(" data: " + tmp.idata + "  " + tmp.ddata);
                 System.out.println(" pcount = " +pcount);

                 tmp = tmp.next;
             }

         }
     }

}


public class lnList{

      public static void main( String [ ] args ) {

          LinkList   L1 = new  LinkList();

          read10    r10 = new  read10();

          r10.readData();

          L1.insert(10, 20.5);
          L1.insert(20, 40.5);
          L1.insert(30, 60.5);

          L1.printList();

      }
}



 class read10{

	//public static void main(String[] args)

           public void readData() {

		BufferedReader br = null;

		try {

			String sCurrentLine;


                        FileReader fr = new FileReader("C:\\STAN\\lnData.dat");



			br = new BufferedReader(fr);

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);



			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
