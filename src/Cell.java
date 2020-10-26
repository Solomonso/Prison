import java.util.ArrayList;
/**
 * The Cell class hold the information of the prisoner.
 * @author (Solomon Asezebhobor)
 * @date (10-25-2019)
 */
public class Cell
{
    // instance variables
    private int cellNumber;
    private ArrayList<Prisoner> prisonerList;

    /**
     * Constructor for objects of class Cell
     * @param cellNumber
     * Don't create cells with the same number.
     */
    public Cell(int cellNumber)
    {
        // initialise instance variables
        this.cellNumber = cellNumber;
        this.prisonerList = new ArrayList<>();
    }

    public ArrayList<Prisoner> getPrisonerList() {
        return this.prisonerList;
    }

    /**
     * Add a prisoner to the PrisonerList.
     *
     * @param addPrisoner The prisoner object to add to the prisonerList.
     */
    public void addPrisoner(Prisoner addPrisoner)
    {
        if(this.prisonerList.size() < 2)
        {
            this.prisonerList.add(addPrisoner);
        }
        else
        {
           System.out.println("You can not add more prisoners to cell");
        }
    }

    /**
     * Remove a prisoner from the cell.
     *
     * @param removePrisoner The prisoner to be removed from the cell.
     */
    public void removePrisoner(Prisoner removePrisoner)
    {
        if(!this.prisonerList.isEmpty())
        {
            this.prisonerList.remove(removePrisoner);
        }
        else
        {
            System.out.println("cannot remove anyMore prisoner it's empty");
        }
    }

    public int getCellNumber()
    {
        return this.cellNumber;
    }

    public int getNumberOfPrisoners()
    {
        return this.prisonerList.size();
    }

    public void setCellNumber(int newCellNumber)
    {
        this.cellNumber = newCellNumber;
    }

    /**
     * The methods checks if the method contains no prisoner, one prisoner or two prisoners
     * @return Returns a String with or without the details of the prisoner
     */
    public String getPrisonersInCell()
    {
         StringBuilder prisoners = new StringBuilder();
         if(this.prisonerList.size() < 1 )
         {
              prisoners = new StringBuilder(" There are currently no prisoners in cell");
         }
         else if(this.prisonerList.size() < 2)
         {
           for(Prisoner prisoner: this.prisonerList)
           {
               prisoners = new StringBuilder("Contains only " + prisoner.getPrisonerName() + " The prisoner date of offence is " + prisoner.getDateOfOffence() + " The prisoner will spend " + prisoner.getPrisonerSentenceLength() + " years in prison" + " so it has a free spot.");
           }
         }
         else
         {
             for(Prisoner prisoner: this.prisonerList)
             {
                  prisoners.append(" Prisoner in the cell is ").append(prisoner.getPrisonerName()).append(" The prisoner date of offence is ").append(prisoner.getDateOfOffence()).append(" The prisoner will spend ").append(prisoner.getPrisonerSentenceLength()).append(" years in prison").append(".\n");

             }

         }
       return prisoners.toString();
    }

    public void printDetails()
    {
       for(Prisoner prisoner: this.prisonerList)
        {
            System.out.println(prisoner);
        }
    }

    /**
     * This method gets the prisoner to be released first in the cell.
     * @return Returns a prisoner.
     */
    public Prisoner getFirstRelease()
    {
        Prisoner prisonerToBeReleased = null;
        for(Prisoner prisoner: this.prisonerList)
        {
            if(prisonerToBeReleased == null)
            {
                prisonerToBeReleased = prisoner;
            }

            if(prisoner.getPrisonerSentenceLength() < prisonerToBeReleased.getPrisonerSentenceLength())
            {
                prisonerToBeReleased = prisoner;
            }
        }
      return prisonerToBeReleased;
    }
}
