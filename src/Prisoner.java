import java.time.LocalDate;

/**
 * This Class holds the information of a prisoner.
 * With the getters and setters of the fields.
 * @author (Solomon Asezebhobor)
 * @date (10-25-2019)
 */
public class Prisoner
{
    // instance variables
    private String prisonerName;
    private LocalDate dateOfOffence;
    private int prisonerSentenceLength;

    /**
     * Creates a  Prisoner
     * @param prisonerName the name of the prisoner
     * @param dateOfOffence the prisoner date of offence
     * @param prisonerSentenceLength the prisoner sentence length.
     * format for date dd-mm-yyyy
     */
    public Prisoner(String prisonerName,LocalDate dateOfOffence,int prisonerSentenceLength)
    {
        // initialise instance variables
        this.prisonerName = prisonerName;
        this.dateOfOffence = dateOfOffence;
        this.prisonerSentenceLength = prisonerSentenceLength;
    }

    public String getPrisonerName()
    {
        return this.prisonerName;
    }

    /*
     * format dd-mm-yyyy
    */
    public LocalDate  getDateOfOffence()
    {
        return this.dateOfOffence;
    }

    public int getPrisonerSentenceLength()
    {
        return this.prisonerSentenceLength;
    }

    public void setPrisonerName(String prisonerName)
    {
        prisonerName = prisonerName;
    }

    public void setDateOfOffence(LocalDate dateOfOffence)
    {
        this.dateOfOffence = dateOfOffence;
    }

    public void setPrisonerSentenceLength(int prisonerSentenceLength)
    {
        this.prisonerSentenceLength = prisonerSentenceLength;
    }

    @Override
    public String toString() {
        return "Prisoner{" +
                "prisonerName='" + prisonerName + '\'' +
                ", dateOfOffence=" + dateOfOffence +
                ", prisonerSentenceLength=" + prisonerSentenceLength +
                '}';
    }
}
