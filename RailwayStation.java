class RailwayStation {
    public static void main(String[] args){

        String stationName = "Bangalore City Junction";
        String stationMaster = "Ramesh Kumbaralli";
        String city = "Bangalore";

        String platforms[] = {"Platform 1", "Platform 2", "Platform 3", "Platform 4"};
        String trains[] = {"Murudeshwara Express", "Shatabdi Express", "Mysuru Express", "Manglore Express"};

        System.out.println("The Railway Station Name is : " + stationName);
        System.out.println("The Station Master Name is : " + stationMaster);
        System.out.println("The City is : " + city);

        System.out.println("The Number of Platforms are : " + platforms.length);
        for(String platform : platforms){
            System.out.println(platform);
        }

        System.out.println("The Number of Trains are : " + trains.length);
        for(String train : trains){
            System.out.println(train);
        }
    }
}
