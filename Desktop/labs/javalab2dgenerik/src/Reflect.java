import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect {

    public void getInfo(Class LoaderClass)  {

        if (LoaderClass != null) {
            System.out.println("//////////////////////////////////////////////////////////");
            System.out.println(String.format("Load %s", LoaderClass));
        }
        Method[] md =LoaderClass.getDeclaredMethods();
        String s;
        for (Method met : md)
        {s = met.toString();
            System.out.print("Метод  ");
        System.out.println(s);}

        Field[] fd = LoaderClass.getDeclaredFields();
        String f;
        for (Field fil : fd)
        {f = fil.toString();
                System.out.print("Поле  ");
                System.out.println(f);}

        Class[] inter = LoaderClass.getInterfaces();
        String i;
        if (inter.length == 0) {
            System.out.println("interfaces null"); }
        for (Class inf : inter)
        {i = inf.toString();
            System.out.print("Интерфейс  ");
            System.out.println(i);}

      //  Class supcl = LoaderClass.getSuperclass();
        if ( LoaderClass.getSuperclass() != null) {
            System.out.print("Предок  ");
            System.out.println(LoaderClass.getSuperclass());
            getInfo(LoaderClass.getSuperclass());
        }
        else System.out.print("Предка нет  ");



    }


}
