package newproject;

public class quest1 {
		// TODO Auto-generated method stub
		void drive()
		   {
			   System.out.println("driving a car");
		   }

		public class Car extends Vehicle{
			 void drive()
			{
				System.out.println("Repairing a car");
			}
		}
		}
		public class quest1 {

			public static void main(String args[])
			{
				Car obj=new Car();
				obj.drive();
			}


	}


