public class Product implements Comparable<Product> {
    private String name;
    private float price;
    private String store;
    
    public Product(String name, float price, String store) {
      this.name = name;
      this.price = price;
      this.store = store;
    }

    /**
     * @return the name
     */
    public String getName() {
      return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
      this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
      return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
      this.price = price;
    }

    /**
     * @return the store
     */
    public String getStore() {
      return store;
    }

    /**
     * @param store the store to set
     */
    public void setStore(String store) {
      this.store = store;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((store == null) ? 0 : store.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Product other = (Product) obj;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (store == null) {
        if (other.store != null)
          return false;
      } else if (!store.equals(other.store))
        return false;
      return true;
    }

    @Override
    public int compareTo(Product o) {
        return (int)this.price - (int)o.price;
    }
    
    
}
