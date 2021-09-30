package com.java.main;
import com.javatpoint.numberprograms.*;
import com.javatpoint.basicprograms.*;
public class NumberProgramsMain {
    public static void numberPrograms(){
        //##Exercise 1.1 - Reverse number using while
        /*int randomNum=RandomNumber.getRandomNumber(1000,10000);
        System.out.println("Reverse Number for (while) " + randomNum);
        System.out.println(ReverseNumber.reverseNumberWhile(randomNum));
        //##Exercise 1.2 - Reverse number using for
        System.out.println("Reverse Number for (for) " + randomNum);
        System.out.println(ReverseNumber.reverseNumberFor(randomNum));*/
        //##Exercise 2.1 - Number to word
        /*for (int i=0;i<=10;i++) {
            int randomNum=RandomNumber.getRandomNumber(1,9999);
            System.out.println(NumberToWord.numberToWord(String.valueOf(randomNum).toCharArray()));
        }*/
        //##AuthomorphicNumber
        /*for (int i=1;i<=100;i++) {
            //int randomNum=RandomNumber.getRandomNumber(1,1000);
            System.out.print("Number: "+i+" is ");
            System.out.print(AuthomorphicNumber.authomorphic(i)?"Authomorphic":"Not automorphic");
            System.out.println();
        }*/
        //##PetersonNumber
        //System.out.print("Number: 145 is ");
        //System.out.print(PetersonNumber.isPeterson(145) ?"Peterson Number":" not Peterson Number");
        //System.out.println();
        //System.out.print("Number: 130 is ");
        //System.out.print(PetersonNumber.isPeterson(130) ?"Peterson Number":" not Peterson Number");

        //## Sunny Number
        //int sunnyNumber=25;
        //System.out.print("Number:"+sunnyNumber+" is");
        //System.out.print(SunnyNumber.isSunnyNumber(sunnyNumber)?" sunny number":" not sunny number");

        //##Technumber
        /*int techNumber1=2025,techNumber2=1312;
        System.out.println(TechNumber.isTechNumber2(techNumber1));
        System.out.println(TechNumber.isTechNumber2(techNumber2));
        System.out.println(TechNumber.isTechNumber2(9));*/

        //##FascinatingNumber
        /*int techNumber1=192,techNumber2=328;
        System.out.println(FascinatingNumber.isFascinatingNumber(techNumber1));
        System.out.println(FascinatingNumber.isFascinatingNumber(techNumber2));*/

        //##Keith Number
        /*int number1=20,number2=742;
        System.out.println(KeithNumber.isKeithNumber(number1)?"Number:"+number1+" is keith number":"Number:"+number1+" is not keith number");
        System.out.println(KeithNumber.isKeithNumber(number2)?"Number:"+number2+" is keith number":"Number:"+number2+" is not keith number");
*/
       /* //##Neon Number
        int neonNumber1=9,neonNumber2=45;
        System.out.println(NeonNumber.isNeonNumber(neonNumber1));
        System.out.println(NeonNumber.isNeonNumber(neonNumber2));*/

        //##Spy Number
        /*int spyNumber1=132,spyNumber2=217;
        SpyNumber spyNum1 = new SpyNumber(spyNumber1);
        SpyNumber spyNum2= new SpyNumber(spyNumber2);
        System.out.println(spyNum1.isSpyNumber()?"Number:"+spyNumber1+" is a spynumber":"Number:"+spyNumber1+" is not a spynumber");
        System.out.println(spyNum2.isSpyNumber()?"Number:"+spyNumber2+" is a spynumber":"Number:"+spyNumber2+" is not a spynumber");*/

        //##ATM
       /* int money, transCode=0;
        ATM atm = new ATM();
        for (int i=1;i<=4;i++){
            System.out.println("Current balance amount:"+ atm.getBalance());
            money=RandomNumber.getRandomNumber(1000,10000);
            switch (i){
                case 1:
                    transCode=atm.withdraw(money);
                    System.out.println("Withdraw amount:"+money);
                    System.out.println(atm.message("withdraw",transCode));
                    break;
                case 2:
                    transCode=atm.deposit(money);
                    System.out.println("Deposit amount:"+money);
                    System.out.println(atm.message("deposit",transCode));
                    break;
                case 3:
                    transCode=200;
                    System.out.println(atm.message("balance",transCode));
                    break;
                default:
                    System.out.println("Have a good day!");
            }*/

        //##Autobiographical number
        //AutobiographicalNumber test = new AutobiographicalNumber();
        //AutobiographicalNumber.
        //System.out.println(AutobiographicalNumber.autobiographicalNumber(1210));
        //Emirp Number
        //logMessage(EmirpNumber.isEmirpNumber(12)? "Number"+ 199 +" is Emirp Number":"Number"+ 199 +" is not Emirp Number");
        //BuzzNumber
        logMessage(BuzzNumber.isBuzzNumber(32)? "It's a buzz number":"It's not a buzz number");
        //DuckNumber
        logMessage("Duck Number");
        logMessage(DuckNumber.isDuckNumber(10)?"It's a duck number":"It's not a duck number");
        logMessage(DuckNumber.isDuckNumber(32)?"It's a duck number":"It's not a duck number");
        //ISBN number
        logMessage("ISBN Number");
        logMessage(ISBNNumber.isISBNNumber(8147852369L)?"It's a ISBN number":"It's not a ISBN number");
        logMessage(ISBNNumber.isISBNNumber(1259060977)?"It's a ISBN number":"It's not a ISBN number");
        //Krishnamurthy number
        logMessage("Krishnamurthy number");
        logMessage(KrishnamurthyNumber.isKrishnaNum(145)?"It's a Krishnamurthy number":"It's not a Krishnamurthy number");
        logMessage(KrishnamurthyNumber.isKrishnaNum(130)?"It's a Krishnamurthy number":"It's not a Krishnamurthy number");
        //Bouncy number
        logMessage("Bouncy number");
        logMessage(BouncyNumber.isBouncyNumber(30)?"It's a Bouncy number":"It's not a Bouncy number");
        logMessage(BouncyNumber.isBouncyNumber(123742)?"It's a Bouncy number":"It's not a Bouncy number");
        logMessage(BouncyNumber.isBouncyNumber(135)?"It's a Bouncy number":"It's not a Bouncy number");
        //Mistery number
        logMessage("Mistery number");
        logMessage(MisteryNumber.isMisteryNumner(154)?"It's a Mistery number":"It's not a Mistery number");
        logMessage(MisteryNumber.isMisteryNumner(123)?"It's a Mistery number":"It's not a Mistery number");
        //Smith Number
        logMessage("Smith Number");
        logMessage(SmithNumber.isSmitNumber(265)?"It's a Smith Number":"It's not a Smith Number");
        logMessage(SmithNumber.isSmitNumber(668)?"It's a Smith Number":"It's not a Smith Number");
        //StrontioNumber Number
        logMessage("Strontio Number");
        logMessage(StrontioNumber.isStrontioNumber(1386)?"It's a Strontio Number":"It's not a Strontio Number");
        logMessage(StrontioNumber.isStrontioNumber(7587)?"It's a Strontio Number":"It's not a Strontio Number");

        //Xylem and Phloem Numberr
        logMessage("Xylem and Phloem Number");
        logMessage(XylemPhoemNumber.isXylenOrPhoenNumber(12348));
        logMessage(XylemPhoemNumber.isXylenOrPhoenNumber(761312));
    }
    public static void logMessage(String message){
        System.out.println(message);
    }
}
