package Bank;

import java.util.ArrayList;
import java.util.List;

public class Database {
    static List<Account> allAccounts= new ArrayList();
    static{
        allAccounts.add(new Account("Petro", "461834", "81532", "82137"));
        allAccounts.add(new Account("Gleb", "257981", "36822", "15114"));
        allAccounts.add(new Account("Kirill", "862342", "69092", "89414"));
        allAccounts.add(new Account("Bogdan", "913279", "23489", "67895"));
        allAccounts.add(new Account("Volodymyr", "521411", "16809", "35790"));
    }

}
