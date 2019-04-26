public class Electrical_appliance {

    String name;
    int capacity;
    boolean turn;

    static int for_capacity;
    public Electrical_appliance() {
        name = "";
        capacity = 0;
        turn = false;
    }

    public Electrical_appliance(String name, int capacity, boolean turn) {
        this.name = name;
        this.turn = turn;
        for_capacity = capacity;
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

    public void Turn()          //метод що включає/виключає прилад в розетку
    {
        if (isTurn() == true) {
            setTurn(false);
            setCapacity(0);
            System.out.println(getName()+" is turned off !!!");
        }
        else{
            setTurn(true);
            setCapacity(for_capacity);
            System.out.println(getName()+" is turned on !!!");
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

        public void setCapacity(int capacity)
        {
            this.capacity = capacity;
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

