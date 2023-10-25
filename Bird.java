
class Bird extends Animal {

    Bird() { 
        System.out.println("hi i'm a bird");
    }

    String makeNoise() {
        int x = 3;
        if (x == 4) {
            return "tweet";
        } else 
            return "chirp";
        }
    }
    
    // Birds will "move" by flying.
    String move(int distance) {
        return super.move(distance);
    }

}


