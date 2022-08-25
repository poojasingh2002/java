interface MAIN_ACCOUNT{
  public void ACCOUNT_NO(); // interface method
}

interface SAVING {
  public void account_no(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class LOAN implements MAIN_ACCOUNT,SAVING {
  public void ACCOUNT_NO() {
    System.out.println("5999");
  }
  public void account_no() {
    System.out.println("7800");
  }
}

class Main {
  public static void main(String[] args) {
    LOAN l = new LOAN();
    l.ACCOUNT_NO();
    l.account_no();
  }
}