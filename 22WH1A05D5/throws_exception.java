package frames;

import java.io.IOException;  
class throws_exception{  
  void m()throws IOException{  
    throw new IOException("device error");
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
	  throws_exception obj=new throws_exception();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  