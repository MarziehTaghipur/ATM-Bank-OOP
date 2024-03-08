
import java.util.Date;
import java.util.Scanner;

public class Account {
  
  int balance;
  int prevTransaction;
  String customerName;
  String customerID;
  
  Account (String cname , String cid){
    customerName = cname;
    customerID = cid;
  }
  
  void deposit (int amount ) {
    if(amount >0)
      balance = balance + amount ;
    prevTransaction = amount ;
  }
  
  void whitdraw ( int amount ) {
    if ( amount !=0 && amount >0) 
      balance = balance - amount ;
    prevTransaction = - amount ;
  }
  void getprevTransaction () {
    if ( prevTransaction > 0)
      System.out.println(" deposit : " + prevTransaction);
    else if ( prevTransaction < 0)
      System.out.println( " whitdraw : "+ Math.abs(prevTransaction));
    else 
       System.out.println("NO prevtransaction ");
  }
  void showMenu () {
    char option ='\0';
    Scanner scanner = new Scanner (System.in);
    System.out.println(" welcom :  " + customerName);
    System.out.println();
    System.out.println(" your ID :  " + customerID);
    System.out.println();
    System.out.println("  What would you lik do? ");
    System.out.println();
    System.out.println(" A . check your balance");
    System.out.println(" B . meack a deposit ");
    System.out.println(" C . meack a whitdraw ");
    System.out.println(" D . view prevtransaction ");
    System.out.println(" E . view show data ");
    System.out.println( " F . Exit ");
    System.out.println();

    
    do {
      System.out.println(" pleas Ennter an option ");
      char option1 = scanner . next().charAt(0);
      option = Character.toUpperCase(option1);
      System.out.println();

      
      switch (option ){
      case 'A':
        System.out.println(" balance = $ "+ balance);
        break;
        
      case 'B':
        System.out.println();
        System.out.println(" Enter an amount for deposit" );
          int amount = scanner.nextInt();
          deposit(amount);
          break;
          
      case 'C':
        System.out.println();
        System.out.println(" Enter an amount for whitdraw" );
          int amount1 = scanner.nextInt();
          whitdraw (amount1);
          break;
        
      case 'D':
        System.out.println();
        getprevTransaction();
        break;
        
      case 'E':
        System.out.println();
        Date data = new Date ();
        System.out.println(" today data : "+ data);
        break;
        
      case 'F':
        System.out.println();
        System.out.println("==========");
        break;
      }
    }while ( option !='F');
  }

}

//m.t added write this codes