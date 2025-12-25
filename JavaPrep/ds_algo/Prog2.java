public class Prog2 extends Prog1 
{

int function2(int n){
    int i, j, m = 0;
    for (i = 0; i < n; i++) {
        for (j = 0; j <n; j++){
            for ( j = 0; j < n; j++) {
                m += i + j;
            }
        }
     
    } 
    return m;
}


public static void main(String[] args) {
   
    } 
}
