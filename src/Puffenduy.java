public class Puffenduy extends Hogvards {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public void compareStudents(Puffenduy studentSecond) {
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее, чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond);
        }
    }

    public Puffenduy(String fullName, int magic, int teleport, int industriousness, int loyalty, int honesty) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void Puffenduy(int industriousness, int loyalty, int honesty) {
        if (industriousness < 0 || industriousness > 100)
            throw new RuntimeException(" Неверное значение industriousness ");
        if (loyalty < 0 || loyalty > 100)
            throw new RuntimeException(" Неверное значение loyalty ");
        if (honesty < 0 || honesty > 100)
            throw new RuntimeException(" Неверное значение honesty ");
    }

        public int getIndustriousness () {
            return industriousness;
        }

        public void setIndustriousness ( int industriousness) {
            this.industriousness = industriousness;
        }

        public int getLoyalty () {
            return loyalty;
        }

        public void setLoyalty ( int loyalty){
            this.loyalty = loyalty;
        }

        public int getHonesty () {
            return honesty;
        }

        public void setHonesty ( int honesty){
            this.honesty = honesty;
        }

    @Override
    public String toString() {
        return  "Я студент Puffenduy. Мои качества : " +
                "  fullName = " + fullName +
                " industriousness = " + industriousness +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty +
                ", magic = " + magic +
                ", teleport = " + teleport;
    }
}
