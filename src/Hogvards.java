public abstract class Hogvards {
    String fullName;
    int magic;
    int teleport;

    public static void compareStudents(Hogvards studentFirst, Hogvards studentSecond){
        int powerOne = studentFirst.magic + studentFirst.teleport;
        int powerTwo = studentSecond.magic + studentSecond.teleport;
        if(powerOne>powerTwo) {
            System.out.println(studentFirst.fullName + " сильнее, чем " + studentSecond.fullName);
        } else if (powerTwo>powerOne) {
            System.out.println(studentSecond.fullName + " сильнее, чем " + studentFirst.fullName);
        } else {
                System.out.println(studentFirst.fullName + " такой же сильный, как " + studentSecond);
            }
        }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void getMagic(int magic) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("Введено невенрное значение");
        }
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void getTeleport(int teleport) {
        if (teleport < 0 || teleport > 100)
        throw new RuntimeException("Введено неверное значение");
    }

    public void setTeleport(int teleport) {
        this.teleport = teleport;
    }
}
