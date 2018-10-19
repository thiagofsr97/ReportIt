
package report;

public class SystemReportPdf extends SystemReport{

    @Override
    protected void reportSystemFileType() {
        System.out.println("Gerou um relatório do sistema em PDF.");
    }
    
}
