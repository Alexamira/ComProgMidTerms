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

    public MixedFraction (Fraction fraction) {

    }

    public void setWholeNumber(int wholeNumber){
        this.wholeNumber = wholeNumber;
    }

    public int getWholeNumber(){return wholeNumber;}

    public String toString(){
      return this.wholeNumber+ " " + super.toString();

    }
    public Fraction toFraction(){
         return new Fraction();
    }
    
    public MixedFraction add (MixedFraction other) {
    }

}
