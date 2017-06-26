public class Potluck {
  public static void main(String[] args) {
    String[] myFriends = {"Wendy", "Lisa", "Gayatri", "Pat"};
    for(String eachFriend: myFriends) {
      System.out.println(eachFriend + " is my friend");
      if (eachFriend.startsWith("W")){
        System.out.println(eachFriend + " should bring red rice.");
      } else if (eachFriend.startsWith("L")) {
        System.out.println(eachFriend + " should bring blueberry pie.");
      } else if (eachFriend.startsWith("G")) {
        System.out.println(eachFriend + " should bring curry.");
      } else if (eachFriend.startsWith("P")) {
        System.out.println(eachFriend + " should bring bbq chicken.");
      }
    }
  }
}
