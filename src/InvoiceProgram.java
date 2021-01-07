public class InvoiceProgram {

    public static void main(String[] args) {
       Invoice i1 = new Invoice();
       i1.number = 1;
       char [] description = {'b','o','o','k'};
       i1.description = description;
       i1.quantity = 320;
       i1.price = 32.10;
       i1.vat = 0.23;
       i1.forNIP = 1236541287;
       i1.fromNIP = 1111111111;

        System.out.println("Number:" + i1.number);
        System.out.print("Description: ");
        for (char c : i1.description){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Quantity:" + i1.quantity);
        System.out.println("VAT:" + i1.vat);
        System.out.println("forNIP:" + i1.forNIP);
        System.out.println("fromNIP:" + i1.fromNIP);

        Invoice i2 = new Invoice();
        i2.number = 2;
        char [] description2 = {'h','o','m','e'};
        i2.description = description2;
        i2.quantity = 20;
        i2.price = 12.10;
        i2.vat = 0.08;
        i2.forNIP = 125541287;
        i2.fromNIP = 1551111111;

        System.out.println("Number:" + i2.number);
        System.out.print("Description: ");
        for (char c : i2.description){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Quantity:" + i2.quantity);
        System.out.println("VAT:" + i2.vat);
        System.out.println("forNIP:" + i2.forNIP);
        System.out.println("fromNIP:" + i2.fromNIP);

        // przypisanie f-r do tablicy
        Invoice [] invoices = new Invoice[2];
        invoices[0]=i1;
        invoices[1]=i2;
        for (Invoice invoice : invoices) {

            System.out.println("Number:" + invoice.number);
            System.out.print("Description: ");
            for (char c : invoice.description){
                System.out.print(c);
            }
            System.out.println();
            System.out.println("Quantity:" + invoice.quantity);
            System.out.println("VAT:" + invoice.vat);
            System.out.println("forNIP:" + invoice.forNIP);
            System.out.println("fromNIP:" + invoice.fromNIP);
        }

    }
}
