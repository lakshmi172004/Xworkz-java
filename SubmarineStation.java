class SubmarineStation {
    public static void main(String[] args){

        String stationName = "INS Kadamba Naval Base";
        String commander = "Captain Arjun Singh";
        String location = "Karwar";

        String submarines[] = {"INS Arihant", "INS Chakra", "INS Kalvari"};
        String crewMembers[] = {"Lakshmi", "Shreeya", "Janapriya", "Anjali"};

        System.out.println("The Submarine Station Name is : " + stationName);
        System.out.println("The Commander Name is : " + commander);
        System.out.println("The Location is : " + location);

        System.out.println("The Number of Submarines are : " + submarines.length);
        for(String submarine : submarines){
            System.out.println(submarine);
        }

        System.out.println("The Number of Crew Members are : " + crewMembers.length);
        for(String crew : crewMembers){
            System.out.println(crew);
        }
    }
}
