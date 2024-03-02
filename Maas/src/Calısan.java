public class Calısan {
    String ad;
    double maas;
    int CalismaSaatleri, IseAlimYili;

    public Calısan(){

        this.ad = " ";
        this.maas = 0;
        this.CalismaSaatleri = 0;
        this.IseAlimYili = 0;
    }
    public Calısan(String ad, double maas, int CalismaSaatleri, int IseAlimYili){
        this.ad = ad;
        this.maas = maas;
        this.CalismaSaatleri = CalismaSaatleri;
        this.IseAlimYili = IseAlimYili;
    }
    public double vergi(){
        if(maas > 1000)
            return (maas * 3) / 100;
        else
            return 0;
    }
    public double ekOdeme(){
        if(CalismaSaatleri > 30)
            return (CalismaSaatleri - 40) * 30;
        else
            return 0;
    }
    public double MaasZam(){
        if(2021 - IseAlimYili < 10){
            return ((maas * 5) / 100);
        }
        else if(2021 - IseAlimYili > 9 && 2021 - IseAlimYili < 20){
            return ((maas * 10) / 100);
        }
        else if(2021 - IseAlimYili > 19 ){
            return ((maas * 15) / 100);
        }
        else
            return 0;
    }
    public void Print(){
        double toplam = maas + ekOdeme() - vergi();
        double netMaas= maas + MaasZam();

        System.out.println( "Adı: " + ad + "\n" + "\t" +
                "Maaşı: " + maas + "\n" + "\t" +
                "Çalışma Saati: " + CalismaSaatleri + "\n" + "\t" +
                "Başlangıç Yılı: " + IseAlimYili + "\n" + "\t" +
                "Vergi: " + vergi() + "\n" + "\t" +
                "Bonus: " + ekOdeme() + "\n" + "\t" +
                "Maaş Artışı: " + MaasZam() + "\n" + "\t" +
                "Vergi ve Bonuslar ile birlikte maaş: "  + toplam + "\n" + "\t" +
                "Toplam Maaş: " + netMaas);
        if(netMaas < 20000){
            System.out.println("You're so poor you can't even afford to pay attention PEASANT");
        }
        else {
            System.out.println("Welcome thine excellency, how may i be of service to thee");
        }

    }


}
