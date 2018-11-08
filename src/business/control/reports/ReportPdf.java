package business.control.reports;

public class ReportPdf extends TemplateReport{

    @Override
    protected void reportFileType() {
        System.out.println("Gerou um relatório em PDF.");        
    }
    
}
