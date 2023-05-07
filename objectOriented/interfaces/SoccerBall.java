package objectOriented.interfaces;
class SoccerBall implements MultipleExtends {

    @Override
    public void move() {
        System.out.println("\nmove method inherited from interface Moveable,\n" +
                "\tand override on the SoccerBall class that implements MultipleExtends interface.");
    }

    @Override
    public void moveLikeSphere() {
        System.out.println("\nmove like a sphere method inherited from interface the interface Spherical,\n" +
                "\tand override on the SoccerBall class that implements MultipleExtends interface.");
    }

    public static void main(String[] args) {
        SoccerBall bolaFutebol = new SoccerBall();

        bolaFutebol.move();
        bolaFutebol.moveLikeSphere();
    }
}
