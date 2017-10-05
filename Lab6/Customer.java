/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 1 "lab6.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private String name;
  private boolean returningCustomer;

  //Customer Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(String aName, boolean aReturningCustomer, Account aAccount)
  {
    name = aName;
    returningCustomer = aReturningCustomer;
    if (aAccount == null || aAccount.getCustomer() != null)
    {
      throw new RuntimeException("Unable to create Customer due to aAccount");
    }
    account = aAccount;
  }

  public Customer(String aName, boolean aReturningCustomer, int aAccountNumberForAccount)
  {
    name = aName;
    returningCustomer = aReturningCustomer;
    account = new Account(aAccountNumberForAccount, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setReturningCustomer(boolean aReturningCustomer)
  {
    boolean wasSet = false;
    returningCustomer = aReturningCustomer;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public boolean getReturningCustomer()
  {
    return returningCustomer;
  }

  public Account getAccount()
  {
    return account;
  }

  public void delete()
  {
    Account existingAccount = account;
    account = null;
    if (existingAccount != null)
    {
      existingAccount.delete();
    }
  }

  // line 7 "lab6.ump"
   public void addCustomer(){
    
  }

  // line 9 "lab6.ump"
   public void removeCustomer(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "returningCustomer" + ":" + getReturningCustomer()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}