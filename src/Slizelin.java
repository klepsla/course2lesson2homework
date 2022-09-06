public class Slizelin extends Hogvards {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lastFopPower;

    public void compareStudents(Slizelin studentSecond) {
        int powerOne = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lastFopPower;
        int powerTwo = studentSecond.cunning + studentSecond.determination + studentSecond.ambition +
                studentSecond.resourcefulness + studentSecond.lastFopPower;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее, чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond);
        }
    }

    public Slizelin(String fullName, int magic, int teleport, int cunning, int determination, int ambition, int resourcefulness, int lastFopPower) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lastFopPower = lastFopPower;
    }

    public Slizelin(int cunning, int determination, int ambition, int resourcefulness, int lastFopPower) {
            if (cunning < 0 || cunning > 100)
                throw new RuntimeException(" Неверное значение cunning ");
            if (determination < 0 || determination > 100)
                throw new RuntimeException(" Неверное значение determination ");
            if (ambition < 0 || ambition > 100)
                throw new RuntimeException(" Неверное значение ambition ");
            if (resourcefulness < 0 || resourcefulness > 100)
                throw new RuntimeException(" Неверное значение resourcefulness ");
            if (lastFopPower < 0 || lastFopPower > 100)
                throw new RuntimeException(" Неверное значение lastForPower ");
        }


        public int getCunning() {
            return cunning;
        }

        public void setCunning(int cunning) {
            this.cunning = cunning;
        }

        public int getDetermination() {
            return determination;
        }

        public void setDetermination(int determination) {
            this.determination = determination;
        }

        public int getAmbition() {
            return ambition;
        }

        public void setAmbition(int ambition) {
            this.ambition = ambition;
        }

        public int getResourcefulness() {
            return resourcefulness;
        }

        public void setResourcefulness(int resourcefulness) {
            this.resourcefulness = resourcefulness;
        }

        public int getLastFopPower() {
            return lastFopPower;
        }

        public void setLastFopPower(int lastFopPower) {
            this.lastFopPower = lastFopPower;
        }

    @Override
    public String toString() {
        return "Я студент Slizelin. Мои качества : " +
                "  fullName = " + fullName +
                " cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", lastFopPower = " + lastFopPower +
                ", magic=" + magic +
                ", teleport=" + teleport;
    }
}
