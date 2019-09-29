

public class Dog<T>  implements Catchh<T>{
    String name;
    Integer weight;
    //public void capture(){
    //    System.out.println("Собака, принеси палку");
    //}
    @Override
    public void capture(T test){
        System.out.println(test);
    }
}
