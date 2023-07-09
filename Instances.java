package com.ecommerce;

class ManagerFactory {

    static Manager manager;

    static Manager instance() {
        if (manager == null) {
            manager = new Manager(new ManageProductImpl(), new ManageCategoryImpl());
        }

        return manager;
    }

}