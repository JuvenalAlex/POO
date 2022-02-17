class Main{
    public static void main(String[] args) {
        professor p1 = new professor(054355454,"Juvenal", "Treze" );
        porta d1 = new porta ("Vermelha", 190, 50, true);
        televisor Lg = new televisor(7, 12, true, false, false, true, false);
        controleremoto Lgcontrol = new controleremoto(7, 15,true, Lg);

        System.out.println(p1);
        System.out.println(d1);
        System.out.println(Lg);
        System.out.println(Lgcontrol);
    }  
}
    

