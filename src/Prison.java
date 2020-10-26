import java.util.ArrayList;
import java.util.Iterator;
/**
 * The Prison class holds the information of Cell with their prisoners.
 * It prints the details of the cell and shows which prisoner will be released first.
 * @author (solomon)
 *
 */
public class Prison
{
    // instance variables - replace the example below with your own
    private ArrayList<Cell> cellList;

    /**
     * Creates a Prison
     */
    public Prison()
    {
        this.cellList = new ArrayList<>();
    }

    /**
     * add a cell from the cellList.
     *
     * @param addCell The cell to be added to the cell.
     */
    public void addCellToPrison(Cell addCell)
    {
      this.cellList.add(addCell);
    }

    public ArrayList<Cell> getCellList()
    {
        return this.cellList;
    }

    /**
     * Remove a cell from the cellList.
     *
     * @param cellToRemove The cell to be removed from the cell list.
     */
    public void removeCell(Cell cellToRemove)
    {
      if(!this.cellList.isEmpty())
      {
      this.cellList.remove(cellToRemove);
      }
      else
      {
            System.out.println("cell is empty");
      }
    }

    /**
     *
     * @return Returns numbers of cells
     */
    public int getNumberOfCells()
    {
      return cellList.size();
    }

    /**
     * This methods prints the details of a prisoner in particular cell. Using Iterators.
     * @param enterCellNumber Accepts an int to represent the cell number.
     */
    public void printCellDetailsByGuard(int enterCellNumber)
    {
        for (Cell cells : this.cellList) {
            int cellNumber = cells.getCellNumber();
            if (cellNumber == enterCellNumber) {
                System.out.println("The cell Number is " + cells.getCellNumber() + ".\n" + cells.getPrisonersInCell() + "");
            }
        }
    }

    /**
     * This method prints the prisoner to be released first in a particular cell
     * @param enterCellNumber Accepts an int to represent the cell number
     */
    public void getPrisonerToBeReleasedFirst(int enterCellNumber)
    {
        for (Cell cells : this.cellList) {
            int cellNumber = cells.getCellNumber();
            if (cellNumber == enterCellNumber) {
                System.out.println("Prisoner To be released first is  " + cells.getFirstRelease().getPrisonerName());
            }
        }
    }

    public void getCellDetails()
    {
      for(Cell cell: this.cellList)
      {
          System.out.println(cell.getCellNumber() + cell.getPrisonersInCell() + "\n");;
      }
    }
}
