import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generator implements GeneratorADT {
  
  private List<Product> productList;
  private Map<String, List<Product>> productMap;
  
  public Generator() {
    productList = new ArrayList<>();
    productMap = new HashMap<>();
  }
  
  @Override
  public void importProductFile(String filename) {
    // TODO Auto-generated method stub    
  }

  @Override
  public List<Product> generateChecklist() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void requestShoppingList() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void exportChecklist() {
    // TODO Auto-generated method stub
    
  }

}
