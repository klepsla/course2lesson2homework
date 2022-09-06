public class Griffindor extends Hogvards {
    private int honour;
    private int nobility;
    private int bravery;

    public void compareStudents(Griffindor studentSecond){
        int powerOne = this.honour + this.nobility + this.bravery;
        int powerTwo = studentSecond.honour + studentSecond.nobility + studentSecond.bravery;
        if(powerOne>powerTwo) {
            System.out.println(this.fullName + " сильнее, чем " + studentSecond.fullName);
        } else if (powerTwo>powerOne) {
            System.out.println(studentSecond.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond);
        }
    }

    public Griffindor(String fullName, int magic, int teleport, int honour, int nobility, int bravery) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.honour = honour;
        this.nobility = nobility;
        this.bravery = bravery;
    }

    public void Griffindor(int honour, int nobility, int bravery) {
        if (honour < 0 || honour > 100)
            throw new RuntimeException(" Неверное значение honour ");
        if (nobility < 0 || nobility > 100)
            throw new RuntimeException(" Неверное значение nobility ");
        if (bravery < 0 || bravery > 100)
            throw new RuntimeException(" Неверное значение bravery ");
    }

    public int getHonour() {
        return honour;
    }



    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Я студент Griffindor. Мои качества : " +
                " fullName = " + fullName +
                " honour = " + honour +
                ", nobility = " + nobility +
                ", bravery = " + bravery +
                ", magic = " + magic +
                ", teleport = " + teleport;
    }
}
