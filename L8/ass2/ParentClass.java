import java.io.Serializable;

public class ParentClass implements Serializable{

	private String Product;
	private int ProductId;

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		this.Product = product;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int Id) {
		this.ProductId = Id;
	}
}
