package methods;
class workout{
    String day;
    String muscle;
    int reps;
    workout(String day,String muscle,int reps){
        this.day=day;
        this.muscle=muscle;
        this.reps=reps;
    }
    void printDetails(){
        System.out.println("DAy="+day);
        System.out.println("MUSCLE="+muscle);
        System.out.println("REPETATIONS="+reps);
    }
}
class driver{
    static void main() {
        workout day1 = new workout("Monday","Chest and triceps",4*4);
        workout day2 = new workout("Tuesday","Back and Shoulder",4*4);
        workout day3 = new workout("Wednesday","legs and core",4*4);
        workout day4 = new workout("Thursday","biceps and chest",4*4);
        workout day5 = new workout("Friday","triceps and back",4*4);
        workout day6 = new workout("Saturday","core and legs",4*4);
        day1.printDetails();
        day2.printDetails();
        day3.printDetails();
        day4.printDetails();
        day5.printDetails();
        day6.printDetails();

    }
}

