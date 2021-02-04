package tudelft.chocolate;

public class ChocolateBags {

    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxes = maxBigBoxes < big ? maxBigBoxes : big;

        total -= (bigBoxes * 5);
        //if(small <= total)
        if(small < total)
            return -1;
        else
            return total;
        //int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        //total -= (bigBoxesWeCanUse * 5);

        //if(small < total)
          //  return -1;
        //return total;

    }

}
