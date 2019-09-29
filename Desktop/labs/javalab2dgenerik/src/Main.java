import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

      MyClassLoader loader = new MyClassLoader();
      MyClassLoader loader1 = new MyClassLoader();
      Class cl = loader.findClass( "Cat");
      Class cl1 = loader1.findClass(  "Dog");

      Catchh inter = (Catchh) cl.newInstance();

      // Method method = cl1.getMethod("capture", new Class[]{});
      // method.invoke(cl1.newInstance(), new Object[]{});

       Method method1 = cl.getMethod("capture", Object.class);
       method1.invoke(cl.newInstance(), "123");
      // inter.capture(123);


        Reflect info = new Reflect();
        info.getInfo(cl);
        System.out.println("Class 1 ");
        //System.out.println(out);
        //out = info.getInfo(cl1);
        info.getInfo(cl1);
        System.out.println("Class 2");

        //System.out.println(out);

        /**
        Class<?> cl = Class.forName("Pitomets");
        Reflect.getInfo(cl);

         */


    //    Class cl = Class.forName("Cat");
    //    Method[] md =cl.getDeclaredMethods();
    //    for (Method met : md)
    //        System.out.println(met);
    //    Field[] fd = cl.getDeclaredFields();
    //    for (Field fil : fd)
    //        System.out.println(fil);
    //    Class[] inter = cl.getInterfaces();
    //    for (Class inf : inter)
    //        System.out.println(inf);
    //    System.out.println(cl.getSuperclass());

    //     Class dl = Class.forName("Dog");
    //    Method[] mdd =dl.getDeclaredMethods();
    //    for (Method mett : mdd)
    //        System.out.println(mett);
    //    Field[] fdd = dl.getDeclaredFields();
    //    for (Field fill : fdd)
    //        System.out.println(fill);
    //    Class[] interr = dl.getInterfaces();
    //    for (Class inff : interr)
    //        System.out.println(inff);
    //    System.out.println(dl.getSuperclass());

    //    System.out.println(cl);
    //    System.out.println(dl);
    }


}

