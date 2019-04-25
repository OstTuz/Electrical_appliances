public class Electrical_appliance {

    String name;
    int capacity;
    boolean turn;

    public Electrical_appliance() {
        name = "";
        capacity = 0;
        turn = false;
    }

    public Electrical_appliance(String name, int capacity, boolean turn) {
        this.name = name;
        this.turn = turn;
        if (isTurn() == true)
        {
            this.capacity = capacity;
        }
        else
        {
            this.capacity = 0;
        }
    }

    public void Display() {
        if (isTurn() == true) {
            System.out.println(getName() + " " + getCapacity() + " On");
        } else {
            System.out.println(getName() + " " + getCapacity() + " Off");
        }
    }

    public void Turn()          //метод що включає прилад в розетку
    {
        if (isTurn() == true) {
            setTurn(false);
        } else {
            setTurn(true);
        }
    }

    public void Search_using_turn(boolean turn)
    {
        if (isTurn() == turn)
        {
            Display();
        }
    }

        public void setTurn ( boolean turn){
            this.turn = turn;
        }

        public String getName () {
            return name;
        }

        public int getCapacity () {
            return capacity;
        }

        public boolean isTurn () {
            return turn;
        }
}

