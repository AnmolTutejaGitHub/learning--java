package enums;

enum Cereals {
    CAPATIAN_CRUNCH(50),
    FROOT_LOOPS(60),
    REESES_PUFFS(100),
    COCOA_PUFFS(75);

    // enums can have both fields and methods like normal class
    // difference is we can't instantiate an enum
    // fileds
    int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }

}

public class Basic3 {
    public static void main(String[] args) {
        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness); // 60
    }
}
