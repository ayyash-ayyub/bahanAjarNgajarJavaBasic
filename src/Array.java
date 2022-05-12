public class Array {
  public static void main(String[] args) {

    String[] stringArray;
    stringArray = new String[4];

    stringArray[0] = "Abdullah";
    stringArray[1] = "Ayyash";
    stringArray[2] = "Ayyub";
    stringArray[3] = "Adompo";

    System.out.println(stringArray[0]);
    System.out.println(stringArray[1]);
    System.out.println(stringArray[2]);
    System.out.println(stringArray[3]);

    stringArray[0] = "Abdullah";

    System.out.println(stringArray[0]);

    String[] stringArray2 = new String[4];

    String[] namaNama = {
        "Abdullah", "Ayyash", "Adompo"
    };

    namaNama[0] = null;

    int[] arrayInt = new int[]{
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    };

    long[] arrayLong = {
        10L, 20L, 30L
    };

    arrayLong[0] = 0;

    System.out.println(arrayLong.length);

    String[][] members = {
        {"Ayyash", "Ayyub"},
        {"Yeni", "Nurhasanah"},
        {"Adompo"}
    };

    System.out.println(members[0][1]);
    System.out.println(members[1][0]);
  }

}
