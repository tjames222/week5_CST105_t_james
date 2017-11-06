/** Program: Creates Players
 * File: Player.java
 * Summary: Sets, gets, and displays players name, position, and stats
 * Author: Tim James
 * Date: November 5, 2017
 */

public class Player {
    // Declare instance variables
    private String name; // name of player
    private String position; // position of player
    private String team; // team of player
    private int attStats; // attempts of player
    private int ydsStats; // yards of player
    private int tdStats; // touchdowns of player
    private int weight; // weight of player
    private String height; // height of player
    private int age; // age of player
    private int number; // number of player
    
    
    // Declare the empty constructor
    public Player() {}
    
    // Declare Player constructor that accepts 3 parameters (name, position, stats)
    public Player(String nameIn, String positionIn, String teamIn,int attStatsIn,
        int ydsStatsIn, int tdStatsIn, int weightIn, String heightIn, int ageIn, int numberIn) {
        
        name = nameIn; // assigns the value of nameIn to the name class instance variable
        position = positionIn; // assigns the value of positionIn to the position class instance variable
        team = teamIn; // assigns the value of teamIn to the team class instance variable
        attStats = attStatsIn; // assigns the value of attStatsIn to the attStats class instance variable
        ydsStats = ydsStatsIn; // assigns the value of ydsStatsIn to the ydsStats class instance variable
        tdStats = tdStatsIn; // assigns the value of tdStatsIn to the tdStats class instance variable
        weight = weightIn; // assigns the value of weightIn to the weight class instance variable
        height = heightIn; // assigns the value of heightIn to the height class instance variable
        age = ageIn; // assigns the value of ageIn to the age class instance variable
        number = numberIn; // assigns the value of numberIn to the number class instance variable
    }
    
        public void setName(String nameIn) {
            this.name = nameIn; // set instance variable name to name passed in the method
        }
    
        public String getName() {
            return this.name; // get the value of the instance variable name
        }
    
        public void setPosition(String positionIn) {
            this.position = positionIn; // set instance variable position to position passed in the method
        }
    
        public String getPosition() {
            return this.position; // get the value of the instance variable position
        }
        
        public void setTeam(String teamIn) { 
            this.team = teamIn; // set instance variable team to the team passed in the method
        }
        
        public String getTeam() {
            return this.team; // get the value of the instance variable team
        }
    
        public void setAttStats(int attStatsIn) {
            this.attStats = attStatsIn; // set instance variable attStats to attStats passed in the method
        }
    
        public int getAttStats() {
            return attStats; // get the value of the instance variable attStats
        }
    
        public void setYdsStats(int ydsStatsIn) {
            this.ydsStats = ydsStatsIn; // set instance variable ydsStats to ydsStats passed in the method
        }
    
        public int getYdsStats() {
            return ydsStats; // get the value of the instance variable ydsStats
        }
    
        public void setTdStats(int tdStatsIn) {
            this.tdStats = tdStatsIn; // set instance variable tdStats to tdStats passed in the method
        }
    
        public int getTdStats() {
            return tdStats; // get the value of the instance variable tdStats
        }
        
        public void setWeight(int weightIn) {
            this.weight = weightIn; // set instance variable weight to weight passed in the method
        }
        
        public int getWeight() {
            return weight; // get the value of the instance variable weight
        }
        
        public void setHeight(String heightIn) {
            this.height = heightIn; // set instance variable height to height passed in the method
        }
        
        public String getHeight() {
            return height; // get the value of the instance variable height
        }
        
        public void setAge(int ageIn) {
            this.age = ageIn; // set instance variable age to age passed in the method
        }
        
        public int getAge() {
            return age; // get the value of the instance variable age
        }
        
        public void setNumber(int numberIn) {
            this.number = numberIn; // set instance variable number to number passed in the method 
        }
        
        public int getNumber() {
            return number; // get the value of the instance variable number
        }
    
        public void displayPlayerInfo() {
            // Displays Player information to the console
            System.out.println("Name: " + getName());
            System.out.println("Position: " + getPosition());
            System.out.println("Team: " + getTeam());
            System.out.println("ATT: " + getAttStats());
            System.out.println("YDS: " + getYdsStats());
            System.out.println("TD: " + getTdStats());
            System.out.println("Weight: " + getWeight());
            System.out.println("Height: " + getHeight());
            System.out.println("Age: " + getAge());
            System.out.println("Number: " + getNumber());
        }
    }

