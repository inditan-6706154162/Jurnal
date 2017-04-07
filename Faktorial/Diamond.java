import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        System.out.print("Masukkan angka:");
        Scanner input = new Scanner(System.in);
        
        int angka = input.nextInt();
        
		int l = 1;
		for(int i=1;i<=angka;i++){
		for(int k=angka;k>i;k--){
		System.out.print("0");
		}
		for(int j=1;j<=l;j++){
		System.out.print("+");
		}
		l+=2;
		 
		System.out.println("0");
		}
		l -= 4;
		 
		for(int i=(angka-1);i>=1;i--){
		for(int k=i;k<=(angka-1);k++){
		System.out.print("0");
		}
		for(int j=l;j>=1;j--){
		System.out.print("+");
		}
		l-=2;
		 
		System.out.println("0");
		}
 
	}

}
