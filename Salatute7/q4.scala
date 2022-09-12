object q4{

    class Account(x:Int, y:Int){
        val accNo = x;
        val bal = y;

        def pr() = {
            println("Account no." + accNo + ", balance = " + bal)
        }
    }

    def sum(n: List[Account]) = {
        var accsum = 0;
        for(x <- n){
            sum = sum + x.bal;
        }
        println("Sum of all accounts = "+sum)
    }

    def negative(n:List[Account]) = {
        println("negative balance accounts: ");
        for(x <- n){
            if(x.bal < 0){
                print("Acc no." + x.accNo + " with a balance of " + x.bal)
            }
        }
    }

    def finalbal(n:List[Account]) = {
        println("final balances of all accounts: ");
        for( x <- n){
            if(x.bal>=0){
                x.bal = x.bal*100.5
            }
            else{
                x.bal = x.bal*100.1
            }
            x.pri();
        }
    }
}