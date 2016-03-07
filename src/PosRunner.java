import generate.ReceiptGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nancymi on 16/3/5.
 */
public class PosRunner {

    private static ReceiptGenerator receiptGenerator;

    private static List<String> inputs = new ArrayList<>();

    public static void main(String[] args) {

        Collections.addAll(inputs, new String[] {
                "ITEM000001-356",
                "ITEM000001",
                "ITEM000001",
                "ITEM000001",
                "ITEM000001-10000",
                "ITEM000001",
                "ITEM000003-200006",
                "ITEM000005-100",
                "ITEM000005",
                "ITEM000005"
        });

        receiptGenerator = new ReceiptGenerator();

        String shoppingCartStr = receiptGenerator.generate(inputs);

        System.out.println(shoppingCartStr);
    }

}
