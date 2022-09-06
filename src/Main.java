public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter",33, 67,88,43,99);
        Griffindor ronWizly = new Griffindor("Ron Wizly",23, 44,22,11,77);
        Kogtevran joyChang = new Kogtevran("Joy Chang",42,66,71,11,15,47);
        Kogtevran padiaPatil = new Kogtevran("Padia Patil",47,61,31,81,25,67);
        Puffenduy zakhariyaSmit = new Puffenduy("Zakhariya Smit",55,65,78,43,22);
        Puffenduy sedricDiggory = new Puffenduy("Sedric Diggory",59,45,98,13,62);
        Slizelin dragoMalfoy = new Slizelin("Drago Malfoy",77,45,33,66,41,55,73);
        Slizelin gregoryGoil = new Slizelin("Gregory Goil",37,75,11,47,52,49,33);
        System.out.println(harryPotter);
        System.out.println(joyChang);
        System.out.println(zakhariyaSmit);
        System.out.println(gregoryGoil);
        harryPotter.compareStudents(ronWizly);
        Hogvards.compareStudents(harryPotter,dragoMalfoy);
        joyChang.compareStudents(padiaPatil);
    }
}