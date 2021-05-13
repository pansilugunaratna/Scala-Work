object Price extends App{
    var x = 60;
    print("Total wholesale cost for " + x + " copies = Rs." );  

    if(x > 50){
        def calc(x:Int):Double=(x*24.95*0.6 + 50*3.00 + (x-50)*0.75);
        print(BigDecimal(calc(x)).setScale(2, BigDecimal.RoundingMode.HALF_UP));
    }        
    else{
        def calc(x:Int):Double=(x*24.95*0.6 + 50*3.00);
        print(BigDecimal(calc(x)).setScale(2, BigDecimal.RoundingMode.HALF_UP));
    }
      
}
