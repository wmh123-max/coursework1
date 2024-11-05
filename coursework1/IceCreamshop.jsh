void iceCreamShop(String flavour, int scoops) {
    int vanillaPrice = 20;     
    int chocolatePrice = 0;   
    int strawberryPrice = 71; 
    int conePrice = 100;       
    int scoopPrice;
    switch (flavour.toLowerCase()) {
        case "v":
            scoopPrice = vanillaPrice;
            break;
        case "c":
            scoopPrice = chocolatePrice;
            break;
        case "s":
            scoopPrice = strawberryPrice;
            break;
        default:
            System.out.println("We don't have that flavour.");
            return;
    }
    if (scoops < 1) {
        System.out.println("We don't sell just a cone.");
        return;
    } else if (scoops > 3) {
        System.out.println("That's too many scoops to fit in a cone.");
        return;
    }
    int totalPricePence = conePrice + (scoopPrice * scoops);
    int pounds = totalPricePence / 100;
    int pence = totalPricePence % 100;
    System.out.printf("That will be %d.%02d please.%n", pounds, pence);
}
