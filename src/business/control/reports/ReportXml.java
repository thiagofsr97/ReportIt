package business.control.reports;

public class ReportXml extends TemplateReport{
    
    @Override
    protected void reportFileType(){
        System.out.println("Gerou um relatório em XML.");
    }
    
}
