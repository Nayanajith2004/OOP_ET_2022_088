package LW_05_Q1;

import java.util.ArrayList;

public class Library {
   private ArrayList<Book> BorrowableItemsList =new ArrayList<>();

   public void addLibraryItems(Book borrowableItems){
      BorrowableItemsList.add(borrowableItems);
   }
   public void checkoutBorrowableItems(String title){
      for (Book book:BorrowableItemsList){
           if (book.getTitle().equals(title) && book.isAvailable()){
              System.out.println("the book searched is available.");
              System.out.println("checking out: "+book.getTitle());
              book.setAvailable(false);
           }
      }

   }public void listAllBorrowableItems(){
      System.out.println("Available Books: ");
      for (Book book:BorrowableItemsList){
         if (book.isAvailable()){
            System.out.println(book.getTitle());
         }
      }
   }public void displayLibraryInfomation(){
      int bookCount=0;
      for (Book book:BorrowableItemsList){
         if (book.isAvailable()){
            bookCount++;
         }
      }
      System.out.println("No of books available: "+ bookCount);
   }


}
