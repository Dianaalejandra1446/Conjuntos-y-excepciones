import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opmenu;
        int opsubmenu;
        Scanner leer = new Scanner(System.in);
        System.out.println("-----MENU-----\n");
        System.out.println("1.PRODUCTOS \n"); 
        System.out.println("2.INVENTARIO \n ");
        opmenu = leer.nextInt();

        Map<,String> categoria1 = new HashMap<>();

        
        if (opmenu == 1) {
            System.out.println("1.Agregar productos");
            System.out.println("2.Restar productos");
            opsubmenu = leer.nextInt();
            while (true) {
                switch (opsubmenu) {
                    case 1:

                        int selectCategoria;
                        System.out.println("Seleccione la categoria del producto: ");
                        System.out.println(categoria1.toString());
                        System.out.println("Seleccione el numero de categoria: ");
                        selectCategoria = leer.nextInt();
                        switch (selectCategoria) {
                            
                            case 1:
                                
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                
                                break;
                            case 4:
                                
                                break;
                            case 5:
                                
                                break;
                            case 6:
                                
                                break;
                            case 7:
                                
                                break;
                        }
                        
                    break;
                }
            }
        }if (opmenu == 2) {
            System.out.println("1.Mostrar inventario");   
            System.out.println("2.Eliminar categoria");
            opsubmenu = leer.nextInt();
            while (true) {
                switch (opsubmenu) {
                    case 1:
                        
                    break;
                    case 2:
                    
                    break;
                }
            }
        }else{
            System.out.println("Numero de menu incorrecto");
        }
    }
}
