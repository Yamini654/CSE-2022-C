package frames;

import java.util.Scanner;
	public class internal_1{

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int i, t;
	        String[] name;
	        name=new String[30];
	        int quantity[];
	        quantity = new int[30];
	        int cost[];
	        cost = new int[30];
	        System.out.println("Enter the number of products:");
	        int n=sc.nextInt();
	        sc.nextLine();

	        for (i = 0; i < n; i++) {
	            System.out.println("Enter  quantity:");
	            quantity[i] = sc.nextInt();
	            System.out.println("Enter  cost:");
	            cost[i] = sc.nextInt();
	            sc.nextLine();
	            System.out.println("Enter the Product name:");
	            name[i]=sc.nextLine();
	        } 
	        
	        for (int i1 = 0; i1 < n - 1; i1++) {
	                if (cost[i1] > cost[i1 + 1]) {
	                    t = cost[i1];
	                    cost[i1] = cost[i1 + 1];
	                    cost[i1 + 1] = t;
	                    
	                    t = quantity[i1];
	                    quantity[i1] = quantity[i1 + 1];
	                    quantity[i1 + 1] = t;
	                    
	                    String tempName = name[i1];
	                    name[i1] = name[i1 + 1];
	                    name[i1 + 1] = tempName;
	                }
	            }
	        System.out.println("Product with highest cost:");
	        System.out.println("Cost: " + cost[n - 1]);
	        System.out.println("quantity: " + quantity[n - 1]);
	        System.out.println("name: " + name[n - 1]);
	    }
	}