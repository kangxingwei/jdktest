package jdkTest;

import java.util.Arrays;
import java.util.List;

public class MyTest {
	public static void main(String[] args) {
		//Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		/*Arrays.asList( "a", "b", "d" ).forEach( e -> {
		    System.out.print( e );
		    System.out.print( e );
		} );*/
		//Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		
		final Car car = Car.create( Car::new );
		final List< Car > cars = Arrays.asList( car );
		cars.forEach( Car::collide );
		cars.forEach( Car::repair );
		final Car police = Car.create( Car::new );
		System.out.println(police);
		cars.forEach( police::follow );


		
		
		
		
		
		
		



		
	}

}
