public class Main {public static void main(String[] args) {
    for (int i = 0; i < nameAndMinute.minutes().length; i++) {
        if (nameAndMinute.minutes()[i] == placement.placement1(nameAndMinute.minutes()))
            System.out.println("Birinci : " +nameAndMinute.name()[i] + " " +placement.placement1(nameAndMinute.minutes()));
    }
    for (int i = 0; i < nameAndMinute.minutes().length; i++) {
        if (nameAndMinute.minutes()[i] == placement.placement2(nameAndMinute.minutes()))
            System.out.println("İkinci : " +nameAndMinute.name()[i] + " " +placement.placement2(nameAndMinute.minutes()));
    }
    for (int i = 0; i < nameAndMinute.minutes().length; i++) {
        if (nameAndMinute.minutes()[i] == placement.placement3(nameAndMinute.minutes()))
            System.out.println("Üçüncü : " +nameAndMinute.name()[i] + " " +placement.placement3(nameAndMinute.minutes()));
    }
    Groups.groups(nameAndMinute.minutes());
}
}
