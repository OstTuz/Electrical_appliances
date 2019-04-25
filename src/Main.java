import java.util.ArrayList;

public class Main {

    public static int Capacity_calculation(ArrayList<Electrical_appliance> electrical_appliances)
    {
        int result = 0;
        for (Electrical_appliance e: electrical_appliances)
        {
            result+= e.getCapacity();
        }
        return result;
    }

    public static void Sort(ArrayList<Electrical_appliance> electrical_appliances)
    {
        for (int i = 0; i<electrical_appliances.size()-1; i++)
        {
            Electrical_appliance minimum = electrical_appliances.get(i);
            int min_index = i;
            for (int j = i+1; j<electrical_appliances.size(); j++)
            {
                if (electrical_appliances.get(j).getCapacity() < minimum.getCapacity())
                {
                    minimum = electrical_appliances.get(j);
                    min_index = j;
                }
            }
            electrical_appliances.set(min_index, electrical_appliances.get(i));
            electrical_appliances.set(i, minimum);
        }
    }


    public static void main(String[] args)
    {
        ArrayList<Electrical_appliance>electrical_appliances = new ArrayList<>();
        
        Electrical_appliance e1 = new Electrical_appliance("Fridhe", 500, true);
        Electrical_appliance e2 = new Electrical_appliance("Toster", 1000, true);
        Electrical_appliance e3 = new Electrical_appliance("TV", 200, false);
        Electrical_appliance e4 = new Electrical_appliance("Washing machine", 2000, true);
        Electrical_appliance e5 = new Electrical_appliance("Kettle", 800, false);

        electrical_appliances.add(e1);
        electrical_appliances.add(e2);
        electrical_appliances.add(e3);
        electrical_appliances.add(e4);
        electrical_appliances.add(e5);

        System.out.println("------------All appliances-------------");
        for (Electrical_appliance e: electrical_appliances)
        {
            e.Display();
        }

        Sort(electrical_appliances);
        System.out.println();
        System.out.println("----------------Sorted-------------");
        for (Electrical_appliance e: electrical_appliances)
        {
            e.Display();
        }

        System.out.println();
        System.out.println("----------------Find all turned on-------------");
        for (Electrical_appliance e: electrical_appliances)
        {
            e.Search_using_turn(true);
        }

        System.out.println();
        System.out.println("-----------All capacity--------------");
        System.out.println("Capacity = "+ Capacity_calculation(electrical_appliances));
    }
}
