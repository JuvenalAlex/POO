class Main {
  public static void main(String[] args) {
    User u1 = new User("Juvenal",123234,"34324234","34343434");
    exemplary e1 = new exemplary(2442,true,false);
    Books b1 = new Books("Cage","Nicolas",1991,3434,"Company","ISbn");
    u1.setNome("Juvenal da Silva");
    u1.setCPF(24343556);
    u1.setPhone("99183-8494");
    u1.setTake("92838594");

    e1.setCode(234535);
    e1.setCaptive(false);
    e1.setLoan(true);

    System.out.println(e1);
    System.out.println(u1);
    System.out.println(b1);
  }
}