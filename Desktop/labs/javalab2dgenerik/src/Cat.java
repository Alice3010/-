    public class Cat<T> extends Pitomets implements Catchh<T> {
       String color;
       Integer age;

       // public void capture() {
       //     System.out.println("Кошка, поймай мышь");
       // }
       @Override
         public void capture(T test){
             System.out.println(test);
         }

        //  public static void main(String[] args) {
      //      Cat cat = new Cat();
       //     cat.capture();

      //  }
    }
