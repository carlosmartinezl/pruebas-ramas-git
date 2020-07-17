public class NumeroMayorApp {
 
    public static void main(String[] args) {
 
        //Declaramos las variables
        int num1=30;
        int num2=15;
 
        //Hacemos la comprobación
        if (num1>=num2){
            //If anidado
            if(num1==num2){
                System.out.println("Los numeros "+num1+" y "+num2+" son iguales");
            }else{
                System.out.println("El número "+num1+" es mayor que el número "+num2);
            }
        }else{
            double discriminante=Math.pow(b, 2)-(4*a*c);
  
	        //Mensaje de traza
	        System.out.println(">>"+discriminante);
	  
	        if (discriminante>0){
	            //Tambien se puede hacer por parte si lo ves más facil
	            //recuerda que debes tener en cuenta la prioridad de elementos
	            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
	            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
	  
	            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
	        }else{
	            System.out.println("El discriminante es negativo");
	        }
        }
    }
}