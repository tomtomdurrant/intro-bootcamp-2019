package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;



public class ShoppingListTest {
    @Test
    public void whenShoppingListIsEmptyReturnNothing() {
//        Arrange
        ShoppingList shoppingList2 = new ShoppingList();
//        Act

    }
    @Test
    public void whenCarrotsAreAddedToTheShoppingListTheOutputIsCarrots() {
//        Arrange

        ShoppingList shoppingList2 = new ShoppingList();
        shoppingList2.addToShoppingList("Carrots");

//        Act
        String result = shoppingList2.retrieveShoppingList();

//        Assert
        Assertions.assertThat(result).isEqualTo("Carrots");

    }


}
