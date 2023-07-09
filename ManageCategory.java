package com.ecommerce;

import java.util.List;

public interface ManageCategory {

    void addCategory(Category category);

    void deleteCategory(Category category);

    List<Category> getListOfCategory();

}
