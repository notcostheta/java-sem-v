
/* Write a Java Program which imports user defined package and uses members of the classes contained
in the package. */

import Operation.*;
class Slip8
{
    public static void main(String args[])
    {
	Addition a = new Addition();
	System.out.println("Add = " + a.add(3,4));
	System.out.println("Sub  = " + a.sub(3.5f,4.7f));

	Maximum m = new Maximum();
	System.out.println("Max = " + m.max(6,3));
    }
}