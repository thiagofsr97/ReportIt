package business.control;

public class ReportXml extends Report{
    
    @Override
    protected void reportFileType(){
        System.out.println("Gerou um relatório em XML.");
    }
    
}
