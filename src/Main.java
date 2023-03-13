public class Main {
    public static void main(String[] args) {
        nurbek infa = new nurbek();
        infa.name = "Nurbek";
        infa.yo = 15;
        infa.pol = "man";
        infa.address = "Turgeneva";
        infa.schoolnumber = 28;
        infa.clas = 9;
        infa.maritalStatus = "Very nice";

        System.out.println("=========================\n" + "Name: " + infa.name + "\nYears old: " + infa.yo +
        "\nSex: " + infa.pol + "\nAddress: " + infa.address + "\nSchool number: " + infa.schoolnumber +
        "\nClass: " + infa.clas + "\nMarital status: " + infa.maritalStatus + "\n=========================");
    }
}