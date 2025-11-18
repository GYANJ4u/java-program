public class ten {

    public static void main(String[] args) {
        String name="gyan prakash";
        System.out.println(name.toUpperCase());
        name=name.replace(" ", "_");
        System.out.println(name);
        String letter = "dear <|name|>, thanks a lot";
        letter = letter.replace("<|name|>", "harry");
        System.out.println(letter);
        String my="uuuddu  budd   uedud   buedbehd";
        System.out.println(my.indexOf("  "));
        System.out.println(my.indexOf("   "));
        System.out.println("dear gyan,\" \t this name is cute");


    }
}
