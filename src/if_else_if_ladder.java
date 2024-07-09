public class if_else_if_ladder {
    public static void main(String[] args){
        int a = 12 ;
        int b = 12 ;
        int c = 12 ;

        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(a<b){
            System.out.println("b is greater than a");
        }
        else if(b<c){
            System.out.println(" c is greater than b");
        }
        else{
            System.out.println("a , b , c are three equal");
        }
    }
}
