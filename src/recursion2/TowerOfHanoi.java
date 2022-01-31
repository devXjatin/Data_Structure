package recursion2;

public class TowerOfHanoi {

    static void towerofHanoi(int input, char source, char auxiliary, char destination){
    if(input == 0){
        return;
    }
    towerofHanoi(input-1, source, destination, auxiliary);
    System.out.println(source+"-->"+destination);
    towerofHanoi(input-1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int input = 2;
        towerofHanoi(input, 'a', 'b', 'c');
    }
}
