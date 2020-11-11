package com.pluralsight.orderfulfillment.catalog;

import com.pluralsight.orderfulfillment.order.OrderItemEntity;
import com.pluralsight.orderfulfillment.test.BaseJpaRepositoryTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class CatalogItemRepositoryTest extends BaseJpaRepositoryTest {

   @Autowired
   private CatalogItemRepository catalogItemRepository;
   
   @Before
   public void setUp() throws Exception {
   }

   @After
   public void tearDown() throws Exception {
   }

   @Test
   public void testFindAllSuccess() {
      List<CatalogItemEntity> catalogItems = catalogItemRepository.findAll();
      assertNotNull(catalogItems);
      assertFalse(catalogItems.isEmpty());
   }

   @Test
   public void testOrderOrderItemsSuccess() {
      List<CatalogItemEntity> catalogItems = catalogItemRepository.findAll();
      assertNotNull(catalogItems);
      assertFalse(catalogItems.isEmpty());
      CatalogItemEntity catalogItem = catalogItems.get(0);
      Set<OrderItemEntity> orderItems = catalogItem.getOrderItems();
      assertNotNull(orderItems);
      assertFalse(orderItems.isEmpty());
   }
}
