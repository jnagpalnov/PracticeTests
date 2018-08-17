package resonsePojos;

/**
 * Created by Jatin on 8/16/2018.
 */
public class GetResults {
    private String MaximumTitleLength;

    private String IsFreeToRelist;

    private String DefaultRelistDuration;

    private String AreaOfBusiness;

    private Promotions[] Promotions;

    private boolean CanRelist;

    private String LegalNotice;

    private String Path;

    private String Name;

    private Fees Fees;

    private String CanListAuctions;

    private String CategoryId;

    private String CanListClassifieds;

    private String DefaultDuration;

    private String[] EmbeddedContentOptions;

    private String FreePhotoCount;

    private String MaximumPhotoCount;

    private String[] AllowedDurations;

    public String getMaximumTitleLength ()
    {
        return MaximumTitleLength;
    }

    public void setMaximumTitleLength (String MaximumTitleLength)
    {
        this.MaximumTitleLength = MaximumTitleLength;
    }

    public String getIsFreeToRelist ()
    {
        return IsFreeToRelist;
    }

    public void setIsFreeToRelist (String IsFreeToRelist)
    {
        this.IsFreeToRelist = IsFreeToRelist;
    }

    public String getDefaultRelistDuration ()
    {
        return DefaultRelistDuration;
    }

    public void setDefaultRelistDuration (String DefaultRelistDuration)
    {
        this.DefaultRelistDuration = DefaultRelistDuration;
    }

    public String getAreaOfBusiness ()
    {
        return AreaOfBusiness;
    }

    public void setAreaOfBusiness (String AreaOfBusiness)
    {
        this.AreaOfBusiness = AreaOfBusiness;
    }

    public Promotions[] getPromotions ()
    {
        return Promotions;
    }

    public void setPromotions (Promotions[] Promotions)
    {

        this.Promotions = Promotions;
    }

    public boolean getCanRelist ()
    {
        return CanRelist;
    }

    public void setCanRelist (boolean CanRelist)
    {
        this.CanRelist = CanRelist;
    }

    public String getLegalNotice ()
    {
        return LegalNotice;
    }

    public void setLegalNotice (String LegalNotice)
    {
        this.LegalNotice = LegalNotice;
    }

    public String getPath ()
    {
        return Path;
    }

    public void setPath (String Path)
    {
        this.Path = Path;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public Fees getFees ()
    {
        return Fees;
    }

    public void setFees (Fees Fees)
    {
        this.Fees = Fees;
    }

    public String getCanListAuctions ()
    {
        return CanListAuctions;
    }

    public void setCanListAuctions (String CanListAuctions)
    {
        this.CanListAuctions = CanListAuctions;
    }

    public String getCategoryId ()
    {
        return CategoryId;
    }

    public void setCategoryId (String CategoryId)
    {
        this.CategoryId = CategoryId;
    }

    public String getCanListClassifieds ()
    {
        return CanListClassifieds;
    }

    public void setCanListClassifieds (String CanListClassifieds)
    {
        this.CanListClassifieds = CanListClassifieds;
    }

    public String getDefaultDuration ()
    {
        return DefaultDuration;
    }

    public void setDefaultDuration (String DefaultDuration)
    {
        this.DefaultDuration = DefaultDuration;
    }

    public String[] getEmbeddedContentOptions ()
    {
        return EmbeddedContentOptions;
    }

    public void setEmbeddedContentOptions (String[] EmbeddedContentOptions)
    {
        this.EmbeddedContentOptions = EmbeddedContentOptions;
    }

    public String getFreePhotoCount ()
    {
        return FreePhotoCount;
    }

    public void setFreePhotoCount (String FreePhotoCount)
    {
        this.FreePhotoCount = FreePhotoCount;
    }

    public String getMaximumPhotoCount ()
    {
        return MaximumPhotoCount;
    }

    public void setMaximumPhotoCount (String MaximumPhotoCount)
    {
        this.MaximumPhotoCount = MaximumPhotoCount;
    }

    public String[] getAllowedDurations ()
    {
        return AllowedDurations;
    }

    public void setAllowedDurations (String[] AllowedDurations)
    {
        this.AllowedDurations = AllowedDurations;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [MaximumTitleLength = "+MaximumTitleLength+", IsFreeToRelist = "+IsFreeToRelist+", DefaultRelistDuration = "+DefaultRelistDuration+", AreaOfBusiness = "+AreaOfBusiness+", Promotions = "+Promotions+", CanRelist = "+CanRelist+", LegalNotice = "+LegalNotice+", Path = "+Path+", Name = "+Name+", Fees = "+Fees+", CanListAuctions = "+CanListAuctions+", CategoryId = "+CategoryId+", CanListClassifieds = "+CanListClassifieds+", DefaultDuration = "+DefaultDuration+", EmbeddedContentOptions = "+EmbeddedContentOptions+", FreePhotoCount = "+FreePhotoCount+", MaximumPhotoCount = "+MaximumPhotoCount+", AllowedDurations = "+AllowedDurations+"]";
    }
}
