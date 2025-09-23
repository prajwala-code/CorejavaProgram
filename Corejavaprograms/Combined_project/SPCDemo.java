package com.tnsif.lambdaexpressions;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SPCDemo {
	public static void main(String[] args) {
		Supplier<String> supplier=() ->"Hello from supplier";
		String supplierValue=supplier.get();
		System.out.println(supplierValue);
		Predicate<Integer> isEven= number ->number%2==0;
		int testNumber=10;
		if(isEven.test(testNumber))
			System.out.println(testNumber + " is even");
	}
	else
	{
		String testNumber;
		System.out.println(testNumber + "is odd" );
	}
	Consumer<String> consumer= message ->System.out.println("consumer received " + message);
	consumer.accept("This is test message");
	System.out.println(consumer);
}
}



