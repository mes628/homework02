//Megan Shapiro, mes628@lehigh.edu
//CSE7 Homework02

//Purpose of this program is to compute the cost of items I bought including sales tax

class Arithmetic
{
    public static void main(String[] args)
    {
        int numPants = 3;           //Number of pairs of pants
        double pantsPrice = 34.98;  //Cost per pair of pants
        int numShirts = 2;          //Number of sweatshirts
        double shirtPrice = 24.99;  //Cost per shirt
        int numBelts = 1;           //Number of belts
        double beltCost = 33.99;    //cost per box of belts
        double paSalesTax = 0.06;   //the tax rate
        double totalCostOfPurchases, totalCostSalesTax, finalCost;      //values will be found later
        
        //variable declarations
        double totalCostOfPants;   //total cost of pants
        double pantsSalesTax;       //total cost of pants with sales tax
        double totalCostOfShirts;   //total cost of shirts
        double shirtsSalesTax;      //total cost of shirts with sales tax
        double totalCostOfBelts;    //total cost of belts
        double beltsSalesTax;       //total cost of belts with sales tax
        
        
        totalCostOfPants = numPants*pantsPrice;                  //calculates price of pants purchased
        pantsSalesTax = numPants*pantsPrice*paSalesTax;          //sales tax paid for pants
        totalCostOfShirts = numShirts*shirtPrice;                //calculates price of shirts purchased
        shirtsSalesTax = numShirts*shirtPrice*paSalesTax;        //sales tax paid for shirts
        totalCostOfBelts = numBelts*beltCost;                    //calculates price of belts purchased
        beltsSalesTax = numBelts*beltCost*paSalesTax;            //sales tax paid for belts
        totalCostOfPurchases = totalCostOfPants+totalCostOfShirts+totalCostOfBelts;          //calculates total cost of all items bought
        totalCostSalesTax = totalCostOfPurchases*paSalesTax;                                 //calculates total sales tax of items bought
        finalCost = totalCostOfPurchases+totalCostSalesTax;      //calculates the total cost of all items with sales tax included

        //print out the output data
        System.out.println("Total cost of the pants are $" + (totalCostOfPants) + " and the sales tax paid is $" + String.format("%.2f", pantsSalesTax));  //prints total cost of pants and sales tax paid 
        //String.format("%.2f") limits the number of decimal places to the hundreths place
        System.out.println("Total cost of the shirts are $" + (totalCostOfShirts) + " and the sales tax paid is $" + String.format("%.2f", shirtsSalesTax)); //prints total cost of shirts and sales tax paid
        System.out.println("Total cost of the belt is $" + (totalCostOfBelts) + " and the sales tax paid is $" + String.format("%.2f", beltsSalesTax));  //prints total cost of belts and the sales tax paid
        System.out.println("The total cost of the purchases before tax is $" + String.format("%.2f", totalCostOfPurchases));      //prints total cost of purchases
        System.out.println("The total sales tax from the purchases is $" + String.format("%.2f", totalCostSalesTax));             //prints total sales tax paid
        System.out.println("The final cost of the purchases including sales tax is $" + String.format("%.2f", finalCost));        //pritns the final cost of all items including sales tax
    }
}
