import java.io.*;
public class MyClassLoader extends ClassLoader {
    //Переопределяем метод findClass, которому надо передать путь к файлу с расширением .class
    @Override
    protected Class<?> findClass(String   name) throws ClassNotFoundException {
        //Проверяем, существует ли такой файл
        File f = new File("/Users/macbook/Desktop/labs/javalab2/out/production/javalab2/"+name+".class");
        if(!f.isFile())
            throw new ClassNotFoundException("Нет такого класса " + name);
        InputStream ins = null;
        try{
            //С помощью потока считываем файл в массив байт
            ins = new BufferedInputStream(new FileInputStream(f));
            byte[]b = new byte[(int)f.length()];
            ins.read(b);
            //С помощью функции defineClass загружаем класс
            Class c = defineClass(name, b, 0, b.length);
            return c;
        }catch (Exception e){
            e.printStackTrace();
            throw new ClassNotFoundException("Проблемы с байт кодом");
        }
        finally {
            try {
                ins.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}