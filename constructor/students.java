package constructor;

public class students {
    String  firstname;
    String  lastname;
    enuma enum1;
    public students (String firstname, String lastname, enuma enum1){
        this.firstname=firstname;
        this.lastname=lastname;
        this.enum1=enum1;

    }

    public static void main(String[] args){
        students st = new students("shubham","shukla",enuma.male);
        System.out.println(st.firstname);
    }
    
}