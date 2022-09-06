public class Kogtevran extends Hogvards {

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public void compareStudents(Kogtevran studentSecond) {
        int powerOne = this.mind + this.wisdom + this.wit + this.creation;
        int powerTwo = studentSecond.mind + studentSecond.wisdom + studentSecond.wit + studentSecond.creation;
        if(powerOne>powerTwo) {
            System.out.println(this.fullName + " сильнее, чем " + studentSecond.fullName);
        } else if (powerTwo>powerOne) {
            System.out.println(studentSecond.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond);
        }
    }

    public Kogtevran(String fullName, int magic, int teleport, int mind, int wisdom, int wit, int creation) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public void Kogtevran(int mind, int wisdom, int wit, int creation) {
        if (mind < 0 || mind > 100)
            throw new RuntimeException(" Неверное значение mind ");
        if (wisdom < 0 || wisdom > 100)
            throw new RuntimeException(" Неверное значение wisdom ");
        if (wit < 0 || wit > 100)
            throw new RuntimeException(" Неверное значение wit ");
        if (creation < 0 || creation > 100)
            throw new RuntimeException(" Неверное значение creation ");
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return "Я студент Kogtevran . Мои качкства : " +
                "  fullName = " + fullName +
                " mind = " + mind +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creation = " + creation +
                ", magic = " + magic +
                ", teleport = " + teleport;
    }
}
