
package business.control.reports;

public class SystemReportPdf extends TemplateSystemReport{

    @Override
    protected void reportSystemFileType() {
        System.out.println("Gerou um relatório do sistema em PDF.");
    }
    
}
