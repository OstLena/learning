package module2;

public class ExonNames {

    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
//        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        String nameHappy = names.makeNamePositive("Noo");
        System.out.println(nameHappy);
    }

    public boolean areNamesEqual(String name1, String name2) {
        return name1 == name2;
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return (name.contains("a") || name.contains("A") || name.contains("o") || name.contains("O"));
    }

    public String getNameCode(String name) {
        if (name.length() == 1) {
            return name.toUpperCase();
        } else {
            return (name.toUpperCase().charAt(0) + "" + name.toUpperCase().charAt(name.length() - 1));
        }
    }

    public boolean isMoneyName(String name) {
        return ((name.charAt(0) >= '0' || name.charAt(0) <= '9') &&
                (name.charAt(name.length() - 1) >= '0' || name.charAt(name.length() - 1) <= '9'));
    }

    public boolean isInvisibleName(String name) {
        if (name.length() != 0) {
            for (int i = 0; i < name.length() - 1; i++) {
                char ch = name.charAt(i);
                if (ch != '\n' && ch != '\t' && ch != ' ') {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
//    public String makeHalfOfName(String name) {
//        int lenghtName = name.length() / 2;
//        return name.substring(0, lenghtName);
//    }

    public String makeNamePositive(String name) {
        String newName = name.toLowerCase();
        if (name.toLowerCase().contains("no")) {
            return newName.replace("no", "yes");
        }
        return name;
    }

//    public String makeNamePositive(String name){
//        if (name.toLowerCase().contains("no")) {
//            return name.replace("no", "yes").replace("No", "yes").replace("NO", "yes").replace("nO", "yes");
//        }
//        return name;
//    }

    public String makeNameClean(String name) {
        name = name.strip();
        return "CLEAN" + name + "CLEAN";
    }

    public String makeHalfOfName(String name) {
        int lenghtName = name.length() / 2;
        return name.substring(0, lenghtName);
    }
}
