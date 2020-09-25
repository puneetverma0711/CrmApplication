package practise;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import sun.jvm.hotspot.oops.java_lang_Class;

public class ReflectionClass {

	
	public void method1() {
		System.out.println("this is method 1");
		
	}
	
	
     public void method2() {
    	 System.out.println("this is method 2");
		
	}

     public void method3() {
	
    	 System.out.println("this is method 2");
     }

     public void method4() {
    	 System.out.println("this is method 2");
	
      }
     
     public void method5(int a) {
    	 System.out.println("this is method 5, and value is:" +a);
	
      }
     
     public void method6(int b) {
    	 System.out.println("this is method 5, and value is:" +b);
	
      }
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class cls= ReflectionClass.class;
		System.out.println(cls.getName());
	     Method meth[]=cls.getDeclaredMethods();
	   ReflectionClass rClass=new ReflectionClass();
	   Method mth=cls.getDeclaredMethod("method5",int.class);
	   mth.invoke(rClass, 25);
	   System.out.println("----------");
          for (Method m:meth) {
        	  int cnt=m.getParameterCount();
        	  System.out.println(cnt);
        	// m.invoke(rClass,m.getParameterCount()); 
			System.out.println(m.getName());  
		}
		
		
	}

}
