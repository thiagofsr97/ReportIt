package business.control.reports;

public class ReportPdf extends Report{

    @Override
    protected void reportFileType() {
        System.out.println("Gerou um relatório em PDF.");        
    }
    
}
