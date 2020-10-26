package assignment.object_oriented.revision1;

 class ab {

        protected void msg(){System.out.println("Hello java");}

        }
        public class r3 extends ab{

        protected void msg()                                 //  -- overidden method cant be more restrictive then parent method
        {System.out.println("Hello java");}

        public static void main(final String args[]) {
        final r3 obj = new r3();
        obj.msg();

        }
        
        } 
