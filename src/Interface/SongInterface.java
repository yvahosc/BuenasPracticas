package Interface;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface SongInterface {
    public ArrayList FilterByGender(ArrayList Gender);
    public ArrayList FilterByYear(ArrayList Year);
    public ArrayList SortByDuration(ArrayList Sort);
    public ArrayList DateFilter(ArrayList Date);
}
