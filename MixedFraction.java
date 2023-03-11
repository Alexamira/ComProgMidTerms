package prog2.prelimgroup;

public class MixedFraction extends Fraction{

    private int wholeNumber;

    public MixedFraction(){
        super();
        this.wholeNumber=0;
    }

    public MixedFraction( int num , int den, int wholeNumber){
        super(num, den);
        this.wholeNumber=wholeNumber;
    }

    public void setWholeNumber(int wholeNumber){
        this.wholeNumber = wholeNumber;
    }

    public int getWholeNumber(){return wholeNumber;}

    public Fraction toFraction(){
        return 
    }


}
