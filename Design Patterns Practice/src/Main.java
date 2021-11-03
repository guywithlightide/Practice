import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import builders.Car.CarBuilder;
import factories.Car;
import factories.CarFactory;
import factories.CarFactorySwitched;
import factories.SedanFactory;
import singletons.BillPughSingleton;
import singletons.EagerSingleton;
import singletons.StaticBlockSingleton;
import singletons.ThreadSafeDoubleLockLazySingleton;
import singletons.ThreadSafeLazySingleton;
import singletons.UnsafeLazySingleton;

public class Main {

	public static void main(String[] args) {

//				
//		Thread thread1 = new Thread(new RunnableSingleton());
//		Thread thread2 = new Thread(new RunnableSingleton());
//		Thread thread3 = new Thread(new RunnableSingleton());
//		
//		thread1.start();
//		thread2.start();
//		thread3.start();
		
//		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
//		System.out.println(billPughSingleton.getData());
//		try {
//			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singletonobjects.dat"));
//			objectOutputStream.writeObject(billPughSingleton);
//			objectOutputStream.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//
//		try {
//			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singletonobjects.dat"));
//
//			BillPughSingleton billPughSingletonRead = (BillPughSingleton) objectInputStream.readObject();
//			System.out.println("READ = "+billPughSingletonRead.getData());
//			objectInputStream.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
//		Car car = CarFactorySwitched.getCar("Sedan", "Amaze", "Red", "9L");
//		Car car1 = CarFactorySwitched.getCar("SUV", "Kushaq", "Orange", "9L");
//		System.out.println(car+"\n"+car1);
		
//		Car car = CarFactory.getCar(new SedanFactory("Honda City", "Black", "11L"));
		
		builders.Car car = new builders.Car.CarBuilder("Jazz").printThis().setColorEnabled(true).printThis().setPriceAvailable(true)
				.printThis().setColor("Red").setPrice("10L").build();

		System.out.println(car);
	
	}
}

class RunnableSingleton implements Runnable{

	@Override
	public void run() {
		/*
		 * UnsafeLazySingleton lazySingleton = UnsafeLazySingleton.getInstance();
		 * System.out.println(lazySingleton.getData());
		 * 
		 * EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		 * System.out.println(eagerSingleton.getData());
		 * 
		 * StaticBlockSingleton staticBlockSingleton =
		 * StaticBlockSingleton.getInstance();
		 * 
		 * ThreadSafeLazySingleton threadSafeLazySingleton =
		 * ThreadSafeLazySingleton.getInstance();
		 * System.out.println(threadSafeLazySingleton.getData());
		 * 
		 * ThreadSafeDoubleLockLazySingleton doubleLockLazySingleton =
		 * ThreadSafeDoubleLockLazySingleton.getInstance();
		 * System.out.println(doubleLockLazySingleton.getData());
		 */
		
		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
		System.out.println(billPughSingleton.getData());
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singletonobjects.dat"));
			objectOutputStream.writeObject(billPughSingleton);
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
