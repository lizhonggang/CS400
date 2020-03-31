import java.util.List;

public interface GeneratorADT {

    /**
     * Filename:   ChecklistGenerator.java
     * Project:    teamProject
     * Authors:    John Li
     * Email:      zli769@wisc.edu
     * ADT for checklistgenerator
     */
    
    public void importProductFile (String filename) ;
    
    
    public void requestShoppingList();
    
    
    public List<Product> generateChecklist();
    
    
    
    public void exportChecklist();

}
