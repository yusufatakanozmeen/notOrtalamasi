public class notOrtalamasi {
    public static void main(String[] args) {
        //not ortalamasi
        int not1 , not2 , not3 , not4 , not5, not6;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notu giriniz : ");
        not1 = input.nextInt();
        System.out.println("Fizik Notu giriniz : ");
        not2 = input.nextInt();
        System.out.println("Kimya Notu giriniz : ");
        not3 = input.nextInt();
        System.out.println("Türkçe Notu giriniz : ");
        not4 = input.nextInt();
        System.out.println("Tarih Notu giriniz : ");
        not5 = input.nextInt();
        System.out.println("Müzik Notu giriniz : ");
        not6 = input.nextInt();
        ortalama = (not1 + not2 + not3 + not4 + not5 + not6) / 6;
        if(ortalama>60){
           System.out.println("Sınıfı Geçti Ortalamaniz : " + ortalama);
        }elsse{
                System.out.println("Sınıfta Kaldınız Ortalamaniz : " + ortalama);

        }       

    }
}
