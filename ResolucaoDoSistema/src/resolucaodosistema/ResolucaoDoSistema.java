package resolucaodosistema;

import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoDoSistema {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("A resolução do sistema é ");
        System.out.println(d.width + " X " + d.height);
    }
    
}
