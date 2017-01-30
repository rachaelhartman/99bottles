package ninetyninebottles;

public class BeerSong {

    public static void main(String[] args) {

    }
    
    public static void Ninety_Nine_Bottles_of_Beer (){
        int numBottles = 99;
        for (int i = 99; i > 0; i--) {
		System.out.println(numBottles + " bottles of beer on the wall, " + numBottles + " bottles of beer,");
                numBottles = numBottles - 1;
                System.out.println("Take one down, pass it around, " + numBottles + " bottles of beer on the wall.");
	}

    }
    
}