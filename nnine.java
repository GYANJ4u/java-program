public class nnine {
    public static void main(String[] args) {
        String name = "harDTFFyff";
        int value = name.length();
        System.out.println(value);
        String lstring = name.toUpperCase();
        System.out.println(lstring);

        String nonTrimmedString = "    harry   ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(0));
        System.out.println(name.substring(2,8));
        System.out.println(name.replace("r", "ier"));
        System.out.println(name.startsWith("hee"));

        System.out.println(name.endsWith("f"));

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ar"));

        System.out.println(name.indexOf("yf", 3));
        System.out.println(name.indexOf("r"));

        System.out.println(name.lastIndexOf("y"));
        System.out.println(name.lastIndexOf("y", 7));
        System.out.println(name.equals("hrDTFFyff"));
        System.out.println(name.equalsIgnoreCase("harDTFFyff"));
    }

}
