
class Eagle extends Bird {

    String makeNoise() {
        return "screech";
    }

    String move(int distance) {
        return super.move(distance * 2);
    }
}




