package com.app.model.product;

import io.swagger.annotations.*;
import lombok.*;
import java.util.*;
import com.app.model.response.*;

@Data
@EqualsAndHashCode(callSuper=false)
public class ProductResponse extends PageResponse {
  @ApiModelProperty(required = true, value = "")
  private List<Product> items;

public List<Product> getItems() {
	return items;
}

public void setItems(List<Product> items) {
	this.items = items;
}
}
