
class Animal {

    Animal() { }

    String makeNoise() {
        return "rawr";
    }

    String move(int distance) {
        String retval = "";
        for (int i=0; i<distance; i++) {
            retval += "tramp ";
        }
        return retval;
    }

}
