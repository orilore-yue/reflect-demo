package com.lore;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		try {
			Class cs = Class.forName("com.lore.Person");
//			Field[] fields = cs.getDeclaredFields();
//			for (Field field : fields) {
//				String name = field.getName();
//				Class ts = field.getType();
//				int m = field.getModifiers();
//				System.out.println(m);
//				System.out.println(ts.getName());
//				System.out.println(name);
//			}
//			Constructor[] cons = cs.getDeclaredConstructors();
//			for (Constructor c : cons) {
//				Class[] ps = c.getParameterTypes();
//				for (Class p : ps) {
//					System.out.println(p.getName());
//				}
//			}
			
			Constructor struc = cs.getDeclaredConstructor(int.class);
			Object obj = struc.newInstance(10);
			
//			Object obj = cs.newInstance();
			
			Field field = cs.getDeclaredField("name");
			field.setAccessible(true);
			field.set(obj, "Tom");
//			System.out.println(obj);
//			Object name = field.get(obj);
//			System.out.println(name);
//			Method[] methods = cs.getDeclaredMethods();
//			for (Method method : methods) {
//				int m = method.getModifiers();
//				String type = method.getReturnType().getName();
//				System.out.print(m+"\t"+type+"\t"+method.getName()+"(");
//				Class[] ptypes = method.getParameterTypes();
//				for (Class pt : ptypes) {
//					System.out.print(pt.getName()+",");
//				}
//				System.out.println(")");
//			}
			Method method = cs.getDeclaredMethod("say");
			method.invoke(obj);
			
			Method meth2 = cs.getDeclaredMethod("calc", int.class,double.class);
			Object o = meth2.invoke(obj,9,8);
			System.out.println(o);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
