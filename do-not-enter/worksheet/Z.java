public class Z {
public static void main(String args[]){
    int var;
    var = X.a;		
    var = X.b;		
    var = X.c;		
    var = X.d;	
    var = X.m;		
    
    X x1 = new X();
    var = x1.a;
    var = x1.b;	
    var = x1.c;
    var = x1.d;
    var = x1.m;	
    
    x1.func1();	
    x1.func2();
    x1.func3();
    x1.func4();	

    Y y1 = new Y();
    var = y1.a;
    var = y1.b; 
    var = y1.c;
    var = y1.d;
    var = y1.m;

    y1.func1(); 
    y1.func2();
    y1.func3();
    y1.func4();

  }
}