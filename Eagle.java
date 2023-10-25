
class Eagle extends Bird {

    String makeNoise() {
        return "whistle";
    }

    String move(int distance) {
        return super.move(distance * 2);
    }


    void soar() {
        System.out.println("SOAR EAGLES!!");
    }
}




