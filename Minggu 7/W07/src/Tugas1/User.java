package Tugas1;

/**
 *
 * @author ASUS
 */
public class User {

    public static void main(String[] args) {
        Televisi tv = new Televisi("TV Tempoe Doloem 14 inch ", 10);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
            "METRO TV", "TRANS TV", "TPI", "TV 7", "TVRI","G TV","Jams Tv"};

        String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV", "METRO TV",
            "TRANS TV", "TPI", "TV 7"};
        
        System.out.println("Pak hadi membeli tv : " + tv.Desk());
        
        tv.getChannel();
        tv.setChannel(semuaChannel);
        tv.setChannel(channelFavorit);

        tv.setChannelAktif(1);
        tv.Volume(10);
        tv.setChannelAktif(8);
        tv.setChannelAktif(5);
        
    }

}
