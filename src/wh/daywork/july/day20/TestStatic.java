package wh.daywork.july.day20;

 class Book {
     private String title;
     private static int count = 0;

     public Book(){
         this( "NOTITLE"+count++);
     }

     public Book(String title) {
         this.title = title;


     }

     public String getTitle() {
         return this.title;
     }
 }
public class TestStatic{
     public static void main(String[]args){
         System.out.println(new Book("java").getTitle());
         System.out.println(new Book("JSP").getTitle());
         System.out.println( new Book("ABC").getTitle());
         System.out.println( new Book().getTitle());
         System.out.println( new Book().getTitle());


     }

        }

