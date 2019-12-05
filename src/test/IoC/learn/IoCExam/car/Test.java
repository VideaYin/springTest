package IoC.learn.IoCExam.car;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/10.
 */
public class Test {

    public static void main(String[] args) {

        com.imooc.IoC.learn.IoCExam.car.Audi audi = new com.imooc.IoC.learn.IoCExam.car.Audi();

        boolean b1 = getClass1(audi)==getClass2();

        System.out.println("- - - - - -"+b1);

        boolean b2 = getClass1(audi)==getClass3();
        System.out.println("- - - - - -"+b2);

        boolean b3 = getClass1(audi).equals(getClass3());
        System.out.println("- - - - - -"+b3);

        boolean b4 = getClass2()==getClass3();
        System.out.println("- - - - - -"+b4);

        boolean b5 = getClass2().equals(getClass3());
        System.out.println("- - - - - -"+b5);



    }

    private static Class getClass1(com.imooc.IoC.learn.IoCExam.car.Audi audi){
        Class audiClass = audi.getClass();
        System.out.println(audiClass.getName());

        return audiClass;
    }

    private static Class getClass2(){
        Class audiClass1 = com.imooc.IoC.learn.IoCExam.car.Audi.class;

        return audiClass1;
    }


    private static Class getClass3(){
        Class audiClass2 = null;
        try {
            audiClass2 = Class.forName("com.imooc.IoC.learn.IoCExam.car.Audi");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }

        return audiClass2;
    }


}
