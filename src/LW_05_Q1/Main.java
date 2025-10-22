package LW_05_Q1;

public class Main {
    public static void main(String[] args) {
        Book book1=new Book( "Seena Maragatham", "Sujatha Thilaka",
        "9789553023975",true);
        Book book2=new Book( "Nuramakadya Bauthika Nuladanayakshanamaala",
        "Seynamasasekaka", "9789553548721" ,true);
        Book book3=new Book("Island of a Thousand Mirrors","Nayomi Munaweera",
        "9781616953623",true );


        Library FctLibrary=new Library();

        FctLibrary.addLibraryItems(book1);
        FctLibrary.addLibraryItems(book2);
        FctLibrary.addLibraryItems(book3);

        FctLibrary.displayLibraryInfomation();
        FctLibrary.listAllBorrowableItems();
        FctLibrary.checkoutBorrowableItems("Island of a Thousand Mirrors");

        FctLibrary.listAllBorrowableItems();
    }
}
