import java.util.Arrays;
public class HelloWorld{

     public static void main(String []args){
         Product door = new Product("wodden door",35);
         Product floorPanel = new Product("Floor panel",40);
         
         Product[] products = {door , floorPanel};
          System.out.println(Arrays.toString(products));
      Product window = new Product("window", 45);
         products = add(window,products);
        System.out.println(Arrays.toString(products));
         products = remove(window,products);
        System.out.println(Arrays.toString(products));
        
     }
     
     private static Product[] add(Product product, Product[] array) {
         int length = array.length;
         Product[] newArray = Arrays.copyOf(array,length + 1);
         newArray[length] = product;
         return newArray;
     }
     
     private static Product[] remove(Product product,Product[] array) {
         int length = array.length;
         Product[] newArray = Arrays.copyOf(array, length -1);
          
          return newArray;
     }
}
