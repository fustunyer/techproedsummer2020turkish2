package day08nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan cinsiyetini ve yasini alin
		 Erkek ve 18 yasindan kucuk ise "Erkek cocuk" diger durumlarda "Bay" yazdirin
		 Kadin ve 18 yasindan kucuk ise "Kiz cocuk" diger durumlarda "Bayan" yazdirin
		 Diger cinsiyetler icin "Tanimlanamadi"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Cinsiyetinizi giriniz Erkek/Kad�n");
		String cinsiyet =scan.next();
		System.out.println("Ya��n�z� giriniz");
		int yas=scan.nextInt();
		
		if (cinsiyet.equals("Erkek")) {
			if(yas<18) {
				System.out.println("Erkek�ocuk");
			}else {
				System.out.println("Bay");
			}
		}else if(cinsiyet.equals("Kad�n")) {
			if (yas<18) {
				System.out.println("k�z �ocuk");
			}else {
				System.out.println("Bayan");
			}
		}else {
			System.out.println("Tan�mlanamad�");
		}
		
		scan.close();

	}

}
