package collection;

public class Pyr {
    public static void main(String[] args) {
        int i,j,k,n=10;
        for ( i = 1; i <=n/2 ; i++) {
            for(k=1;k<=n/2-i;k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

