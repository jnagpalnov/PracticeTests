package resonsePojos;

/**
 * Created by Jatin on 8/16/2018.
 */
public class ListingFeeTiers {
    private String MinimumTierPrice;

    private String FixedFee;

    public String getMinimumTierPrice ()
    {
        return MinimumTierPrice;
    }

    public void setMinimumTierPrice (String MinimumTierPrice)
    {
        this.MinimumTierPrice = MinimumTierPrice;
    }

    public String getFixedFee ()
    {
        return FixedFee;
    }

    public void setFixedFee (String FixedFee)
    {
        this.FixedFee = FixedFee;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [MinimumTierPrice = "+MinimumTierPrice+", FixedFee = "+FixedFee+"]";
    }
}
