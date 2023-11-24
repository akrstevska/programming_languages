import java.lang.reflect.*;
import java.lang.Class;


public class Main {

	public static void main(String[] args) {
		Test test = new Test();
		Class cls = test.getClass();
		System.out.println("The name of the class is " + cls.getName());
		Constructor constructor;
		try {
			constructor = cls.getConstructor();
			System.out.println("The name of the constructor is " + constructor.getName());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Method[] methods = cls.getMethods();
		for(Method m : methods) {
			System.out.println("Method name: " + m.getName());
		}
		
		System.out.println("Printing the result of method 1: ");
		Method methodCall1;
		try {
			methodCall1 = cls.getDeclaredMethod("method1");
			try {
				methodCall1.invoke(test);
				
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printing the result of method 2: ");
		try {
			Method methodCall2 = cls.getDeclaredMethod("method2", int.class);
			try {
				methodCall2.invoke(test, 15);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Field field;
		try {
			field = cls.getDeclaredField("s");
			try {
				field.setAccessible(true);
				System.out.println(field.get(test));
				System.out.println("Print the changed value of s: ");
				field.set(test, "JAVA");
				try {
					methodCall1 = cls.getDeclaredMethod("method1");
					try {
						methodCall1.invoke(test);
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			Method methodCall3 = cls.getDeclaredMethod("method3");
			methodCall3.setAccessible(true);
			try {
				methodCall3.invoke(test);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
