package MahatTest_01;

public class Store_01 {
    private Tablet_01[] tablet01s;
    private int[] systems;

    public Store_01() {
        tablet01s = new Tablet_01[1000];
        systems = new int[3];
    }

    // Function that receives a tablet and add it to the store
    // checks a few conditions to ensure logical handling
    public boolean addTablet(Tablet_01 tab) {
        // FOR-loop that traverse upon the tablets array
        for (int i = 0; i < tablet01s.length; i++) {
            // as long as the value is not null -
            if (tablet01s[i] != null) {
                // Check if the existing tablet matches the new tablet
                if (tablet01s[i].isSame(tab)) {
                    // Update the price if the new tablet's price is higher
                    if (tab.getPrice() > tablet01s[i].getPrice()) {
                        tablet01s[i].setPrice(tab.getPrice());
                    }
                    return true;
                }
            } else {
                // If a null entry is found, add the new tablet here
                tablet01s[i] = tab;
                return true;
            }
        }
        // If no null spot was found and no existing tablet was matched and updated, return false
        return false;
    }


    // The function sorts the tablets by their operating systems.
    // initially will be the 'Windows' than 'Android' than 'ios'.
    // the function will return number of free places in the store.
    public int sortStore() {
        int winIndex = 0;
        int androIndex = 0;
        int iosIndex = 0;
        int freeSpaces = 0;

        // Create a temporary array to hold sorted tablets
        Tablet_01[] sortedTablet01s = new Tablet_01[tablet01s.length];

        // First pass: Count free spaces and position tablets based on OS
        for (Tablet_01 tablet01 : tablet01s) {
            if (tablet01 != null) {
                switch (tablet01.getSystem()) {
                    case 'W':
                        sortedTablet01s[winIndex++] = tablet01;
                        break;
                    case 'A':
                        sortedTablet01s[winIndex + (androIndex++)] = tablet01;
                        break;
                    case 'I':
                        sortedTablet01s[winIndex + androIndex + (iosIndex++)] = tablet01;
                        break;
                }
            } else {
                freeSpaces++;
            }
        }

        // Replace the original array content with the sorted tablets
        for (int i = 0; i < tablet01s.length; i++) {
            tablet01s[i] = sortedTablet01s[i];
        }

        return freeSpaces;
    }



}
