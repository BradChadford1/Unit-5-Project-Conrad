public class SloganClient {
    public static void main(String[] args) {
        Slogan phil = new Slogan("With the power of flex tape!");
        Slogan nike = new Slogan("just do it");
        Slogan tonyTheTiger = new Slogan("They're Grrrrrrrrrrrrrreat!");
        Slogan mcDanks = new Slogan("I'm lovin it");

        System.out.println(phil.getSlogan());
        System.out.println(Slogan.getCount());
    }
}
