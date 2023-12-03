import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        double islem=0;
        double tutar=0;
        double cevirme=0;
        System.out.println("Aydın Döviz Mobil Atm'sine Hoş Geldiniz");
        System.out.println("Sistmden yapacağınız her işlem için yatırdığınız paranın 1/200 engelli vatandaşlar adına Türkiye Engelliler Vakfına bağışlanacaktır.");
        System.out.println("Atm'mizde 4 adet para birimi üzerinden işlem yapılabilir.Bunlar:Dolar,Tl,Euro,Riyal");
        System.out.println("Güncel kurtlar aşağıdaki gibi gösterimiştir(Karşılıkları tl cinsindendir).");
         final double dolar=28.90;
         final double euro=31.50;
         final double riyal=7.70;
         System.out.println("1Dolar=28.90tl  1euro=31.50tl  1riyal=7.70tl");
        do {
            System.out.println("Sisteme yatıracağınız paranın birimini giriniz(dolar=1,tl=2,euro=3,riyal=4) ");
            islem= klavye.nextInt();
        }while (islem < 1 || islem > 4);
        System.out.println("Sisteme ne kadar yatıracağınızı giriniz");
        tutar= klavye.nextInt();
          double tutara=tutar*1;

          if (islem==1){
           do {
               System.out.println("Dolarınızı çevirmek istediğiniz para birimini girin(tl=2,euro=3,riyal=4)");
               cevirme= klavye.nextInt();

           }while (cevirme < 2 || cevirme > 4);
        if(islem==1&&cevirme==2){
            double bagis=tutar/200;
            tutar=tutar-bagis;
            double tutaryeni=tutar*dolar;
            System.out.println("Sistme yatırdığınız para="+tutara+"dolar"+"Türev kesintisi sonucu kalan para="+tutar);
            System.out.println("Çevrilme sonucu"+tutar+"dolar="+tutaryeni+"tl");
            System.out.println("Türeve "+bagis+"dolar bağışladınz.Teşekkür ederiz");
        }
else if (islem==1&&cevirme==3){
            double bagis=tutar/200;
            tutar=tutar-bagis;
            double tutaryeni=tutar*dolar/euro;
            System.out.println("Sistme yatırdığınız para="+tutara+"dolar"+"Türev kesintisi sonucu kalan para="+tutar);
            System.out.println("Çevrilme sonucu"+tutar+"dolar="+tutaryeni+"euro");
            System.out.println("Türeve "+bagis+"dolar bağışladınz.Teşekkür ederiz");
}
else if (islem==1&&cevirme==4) {
            double bagis=tutar/200;
            tutar=tutar-bagis;
            double tutaryeni=tutar*dolar/riyal;
            System.out.println("Sistme yatırdığınız para="+tutara+"dolar"+"Türev kesintisi sonucu kalan para="+tutar);
            System.out.println("Çevrilme sonucu"+tutar+"dolar="+tutaryeni+"riyal");
            System.out.println("Türeve "+bagis+"dolar bağışladınz.Teşekkür ederiz");
}
          }
          else if (islem==2) {
              do {
                  System.out.println("Tl'nisi çevirmek istediğiniz para birimini girin(dolar=1,euro=3,riyal=4)");
                  cevirme = klavye.nextInt();
              } while (cevirme < 1 || cevirme > 4);
              if (islem == 2 && cevirme == 1) {
                  double bagis = tutar / 200;
                  tutar = tutar - bagis;
                  double tutaryeni = tutar / 28.9;
                  System.out.println("Sistme yatırdığınız para=" + tutara + "tl" + "Türev kesintisi sonucu kalan para=" + tutar);
                  System.out.println("Çevrilme sonucu" + tutar + "tl=" + tutaryeni + "dolar");
                  System.out.println("Türeve " + bagis + "tl bağışladınz.Teşekkür ederiz");
              } else if (islem == 2 && cevirme == 3) {
                  double bagis = tutar / 200;
                  tutar = tutar - bagis;
                  double tutaryeni = tutar / euro;
                  System.out.println("Sistme yatırdığınız para=" + tutara + "tl" + "Türev kesintisi sonucu kalan para=" + tutar);
                  System.out.println("Çevrilme sonucu" + tutar + "tl=" + tutaryeni + "euro");
                  System.out.println("Türeve " + bagis + "tl bağışladınz.Teşekkür ederiz");
              }
              if (islem == 2 && cevirme == 4) {
                  double bagis = tutar / 200;
                  tutar = tutar - bagis;
                  double tutaryeni = tutar / riyal;
                  System.out.println("Sistme yatırdığınız para=" + tutara + "tl" + "Türev kesintisi sonucu kalan para=" + tutar);
                  System.out.println("Çevrilme sonucu" + tutar + "tl=" + tutaryeni + "riyal");
                  System.out.println("Türeve " + bagis + "tl bağışladınz.Teşekkür ederiz");
              }
          }
          else if (islem==3) {

              do {
                  System.out.println("eurosu'nu çevirmek istediğiniz para birimini girin(dolar=1,tl=2,riyal=4)");
                  cevirme = klavye.nextInt();
              } while (cevirme != 1 && cevirme != 2 && cevirme != 4);

              if (islem == 3 && cevirme == 1) {
                  double bagis = tutar / 200;
                  tutar = tutar - bagis;
                  double tutaryeni = tutar*euro/dolar;
                  System.out.println("Sistme yatırdığınız para=" + tutara + "euro" + "Türev kesintisi sonucu kalan para=" + tutar);
                  System.out.println("Çevrilme sonucu" + tutar + "euro=" + tutaryeni + "dolar");
                  System.out.println("Türeve " + bagis + "euro bağışladınz.Teşekkür ederiz");
              }
              if (islem == 3 && cevirme == 2) {
                  double bagis = tutar / 200;
                  tutar = tutar - bagis;
                  double tutaryeni = tutar * euro;
                  System.out.println("Sistme yatırdığınız para=" + tutara + "euro" + "Türev kesintisi sonucu kalan para=" + tutar);
                  System.out.println("Çevrilme sonucu" + tutar + "euro=" + tutaryeni + "tl");
                  System.out.println("Türeve " + bagis + "euro bağışladınz.Teşekkür ederiz");
              }
              if (islem == 3 && cevirme == 4) {
                  double bagis = tutar / 200;
                  tutar = tutar - bagis;
                  double tutaryeni = tutar * euro / riyal;
                  System.out.println("Sistme yatırdığınız para=" + tutara + "euro" + "Türev kesintisi sonucu kalan para=" + tutar);
                  System.out.println("Çevrilme sonucu" + tutar + "euro=" + tutaryeni + "riyal");
                  System.out.println("Türeve " + bagis + "euro bağışladınz.Teşekkür ederiz");
              }
          }
          else if (islem==4) {
              do {
                  System.out.println("riyali'ni çevirmek istediğiniz para birimini girin(dolar=1,tl=2,euro=3)");
                  cevirme = klavye.nextInt();
              } while (cevirme != 1 && cevirme != 2 && cevirme != 3);
              if (islem == 4 && cevirme == 1) {
                  double bagis = tutar / 200;
                  tutar = tutar - bagis;
                  double tutaryeni = tutar*riyal/dolar;
                  System.out.println("Sistme yatırdığınız para=" + tutara + "riyal" + "Türev kesintisi sonucu kalan para=" + tutar);
                  System.out.println("Çevrilme sonucu" + tutar + "riyal=" + tutaryeni + "dolar");
                  System.out.println("Türeve " + bagis + "riyal bağışladınz.Teşekkür ederiz");
}

              if (islem == 4 && cevirme == 2) {
                  double bagis = tutar / 200;
                  tutar = tutar - bagis;
                  double tutaryeni = tutar*riyal;
                  System.out.println("Sistme yatırdığınız para=" + tutara + "riyal" + "Türev kesintisi sonucu kalan para=" + tutar);
                  System.out.println("Çevrilme sonucu" + tutar + "riyal=" + tutaryeni + "Tl");
                  System.out.println("Türeve " + bagis + "riyal bağışladınz.Teşekkür ederiz");
              }

              if (islem == 4 && cevirme == 3) {
                  double bagis = tutar / 200;
                  tutar = tutar - bagis;
                  double tutaryeni = tutar*riyal/euro;
                  System.out.println("Sistme yatırdığınız para=" + tutara + "riyal" + "Türev kesintisi sonucu kalan para=" + tutar);
                  System.out.println("Çevrilme sonucu" + tutar + "riyal=" + tutaryeni + "euro");
                  System.out.println("Türeve " + bagis + "riyal bağışladınz.Teşekkür ederiz");
              }
          }
    }
}