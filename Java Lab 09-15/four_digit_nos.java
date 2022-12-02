public class four_digit_nos {
    public static void main(String[] args) {
        int i,j,k,l,n=0;
        for(i=4;i<=7;i++){
          for(j=1;j<=7;j++){
            for(k=1;k<=7;k++){
              for(l=1;l<=7;l++){
                if(i!=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l){
                  n++;
                }
              }
            }
          }
        }
        System.out.println("No.of 4-digit numbers greater than 4000 formed using 1,2,3,4,5,6,7 with no repeating digits: "+n);           
    }
}
