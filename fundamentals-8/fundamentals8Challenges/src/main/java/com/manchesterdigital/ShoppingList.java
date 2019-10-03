package com.manchesterdigital;


import java.util.ArrayList;

public class ShoppingList {

    public ArrayList<String> shoppingList = new ArrayList<>();

    public void addToShoppingList(String shoppingListItem) {
        shoppingList.add(shoppingListItem);
        System.out.println("Added " + shoppingListItem);
    }

    public void removeFromShoppingList(String item) {
        shoppingList.remove(item);
        System.out.println("Removed " + item);
    }

    public void removeFromShoppingList(int index) {
        shoppingList.remove(index);
        System.out.println("Removed item at position " + index);
    }

    public String retrieveShoppingList() {
        StringBuilder shoppingListOutput = new StringBuilder();
        for (String shoppingListItems : shoppingList) {
            shoppingListOutput.append(shoppingListItems);
        }
        return shoppingListOutput.toString();
    }

}
