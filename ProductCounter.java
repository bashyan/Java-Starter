import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

 class ProductCounter {

    private Map<String, Long> productCountMap = new HashMap<>();
    private Map<String, String> productNames = new TreeMap<>();

	public ProductCounter(Map productNames) {
        this.productNames = productNames;
    }
    public void printReport() {
        System.out.println("=== Product Report ===");
        for (String key : productNames.keySet()) {
            System.out.print("Name: " + key);
            System.out.println("\t\tCount: " + productCountMap.get(productNames.get(key)));
        }
    }
    public void processList(String[] list) {
        long curVal = 0;
        for (String itemNumber : list) {
            if (productCountMap.containsKey(itemNumber)) {
                curVal = productCountMap.get(itemNumber);
                curVal++;
                productCountMap.put(itemNumber, new Long(curVal));
            } else {
                productCountMap.put(itemNumber, new Long(1));
            }
        }
}
    public static void main(String[] args) {

        // List of part data
        String[] parts = new String[]{"S","S","M","M","M","L", "XL","S","L", "L","XL","XL"};

        // Create Product Name Part Number map
        Map<String, String> productNames = new TreeMap<>();
        productNames.put("Blue Polo Shirt", "L");
        productNames.put("Black Polo Shirt", "S");
        productNames.put("Red Ball Cap", "XL");
        productNames.put("Duke Mug   ", "M");

        // Create Product Counter Object and process
        ProductCounter pc1 = new ProductCounter(productNames);
        pc1.processList(parts);
        pc1.printReport();
    }

    
    }


