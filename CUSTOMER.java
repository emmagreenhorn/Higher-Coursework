
/**
 * Write a description of class CUSTOMER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CUSTOMER
{

    {
        {
            private string CustomerID();
            private char TicketID;
            private char method;
            private int NumOfTickets
            public float total; 
            public char night;
            public String SeatSecction;

        }
    }

    public void CUSTOMER()
    {
        CustomerID ="";
        TicketID = 0;
        NumOftickets = 0;
        method = 0;
        total = 0;

       
    }

    public void readCustomerDetails (String dataItems)
    {
        String [] rowItems = dataItems.split(",");
        CustomerID = rowItems [0];
        TicketID = (rowItems[1]).charAt(0);
        SeatSection = (rowItems[1]);
        NumOfTickets = Integer.parseInt(rowItems[2]);
        method = (rowItems[3]).charAt(0);
    }

    public String writeDetails()
    {
        String customerData = "";
        customerData = customerData.concat(CustomerID);
        customerData = customerData.concat(",");
        customerData = customerData.concat(SeatSection);
        customerData = customerData.concat(",");
        customerData = customerData.concat(Integer.toString(NumOfTickets));
        customerData =customerData.concat(",");
        customerData = customerData.concat(Character.toString(method));
        return customerData;
    }

    public char getmethod() 
    {
        return method;
    }

    public char getnight() 
    {
        return TicketID;
    }

    public int getNumOfTickets() 
    { return NumOfTickets; 
    }
}
}
