package business.control;

public class ReportPdf extends Report{

    @Override
    protected void reportFileType() {
        System.out.println("Gerou um relatório em PDF.");        
    }
    
}
