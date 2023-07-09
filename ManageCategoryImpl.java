package com.ecommerce;

import java.util.List;

public class ManageCategoryImpl implements ManageCategory {
    @Override
    public void addCategory(Category category) {
        SaveData.saveCategory(category);
    }

    @Override
    public void deleteCategory(Category category) {
        SaveData.deleteCategory(category);
    }

    @Override
    public List<Category> getListOfCategory() {
        return SaveData.getListOfCategory();
    }
}
