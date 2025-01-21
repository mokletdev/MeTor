public class aritmatika {
    public static void main(String[] args) {
        int angka1=10;
        int angka2=5;
        int angka3=15;

        int hasilPenjumlahan=angka1+angka2;
        int hasilPerkalian=angka1*angka2;
        int hasilPengurangan=angka1-angka2;
        int hasilPembagian=angka1/angka2;
        int hasilModulus=angka1%angka2;

        System.out.println("hasil penjumlahan: "+hasilPenjumlahan);
        System.out.println("hasil perkalian: "+hasilPerkalian);
        System.out.println("hasil pengurangan: "+hasilPengurangan);
        System.out.println("hasil pembagian: "+hasilPembagian);
        System.out.println("hasil modulus: "+hasilModulus);
        System.out.println("hasil increment: "+(++angka1));
        System.out.println("hasil penjumlahan: "+(--angka1));
        
        System.out.println("angka1 += angka2: "+(angka1 += angka2));
        System.out.println("angka1 -= angka2: "+(angka1 -= angka2));
        System.out.println("angka1 *= angka2: "+(angka1 *= angka2));
        System.out.println("angka1 /= angka2: "+(angka1 /= angka2));
        System.out.println("angka1 %= angka2: "+(angka1 %= angka2));

        angka1=10;

        System.out.println("angka1 > angka2: "+(angka1>angka2));
        System.out.println("angka1 < angka2: "+(angka1<angka2));
        System.out.println("angka1 == angka2: "+(angka1==angka2));
        System.out.println("angka1 != angka2: "+(angka1!=angka2));
        System.out.println("angka1 >= angka2: "+(angka1>=angka2));
        System.out.println("angka1 <= angka2: "+(angka1<=angka2));

        System.out.println("angka1 > angka2 && angka1 < angka3: "+((angka1 > angka2) && (angka1 < angka3)));
        System.out.println("angka1 > angka2 || angka1 < angka3: "+((angka1 > angka2) || (angka2 < angka3)));
        System.out.println("!(angka1 < angka2): "+!(angka1 < angka2));
    }
}
