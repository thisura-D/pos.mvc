/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.controller.OrderController;
import pos.mvc.controller.CustomerController;
import pos.mvc.controller.ItemController;
import pos.mvc.model.CustomerModel;
import pos.mvc.model.ItemModel;
import pos.mvc.model.OrderDetailModel;
import pos.mvc.model.OrderModel;

/**
 *
 * @author Thisura
 */
public class OrderView extends javax.swing.JFrame {

    /**
     * Creates new form OrderView
     */
    OrderController orderController;
    CustomerController customerController;
    ItemController itemController;

    ArrayList<OrderDetailModel> orderDetailModels = new ArrayList<>();

    public OrderView() {
        customerController = new CustomerController();
        orderController = new OrderController();
        itemController = new ItemController();
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasePanel = new javax.swing.JPanel();
        ManageCustomerPanel = new javax.swing.JPanel();
        HeaderLabel = new javax.swing.JLabel();
        CustDetailsPanel = new javax.swing.JPanel();
        ItemCodeLabel = new javax.swing.JLabel();
        OrderIDLabel = new javax.swing.JLabel();
        DiscountLabel = new javax.swing.JLabel();
        AddItemButton = new javax.swing.JButton();
        searchCustomerButton = new javax.swing.JButton();
        orderQty = new javax.swing.JLabel();
        itemCodeText = new javax.swing.JTextField();
        orderIdText = new javax.swing.JTextField();
        discountText = new javax.swing.JTextField();
        orderQtyText = new javax.swing.JTextField();
        CustomerIDLabel = new javax.swing.JLabel();
        customerIdText = new javax.swing.JTextField();
        customerLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        searchItemButton = new javax.swing.JButton();
        ItemLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        UpdateItemButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setText("ORDER");

        ItemCodeLabel.setText("Item  ID");

        OrderIDLabel.setText("Order ID");

        DiscountLabel.setText("Discount");

        AddItemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddItemButton.setText("Add Item");
        AddItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemButtonActionPerformed(evt);
            }
        });

        searchCustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchCustomerButton.setText("Search");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });

        orderQty.setText("Quantity ");

        itemCodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCodeTextActionPerformed(evt);
            }
        });

        orderIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTextActionPerformed(evt);
            }
        });

        discountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountTextActionPerformed(evt);
            }
        });

        orderQtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderQtyTextActionPerformed(evt);
            }
        });

        CustomerIDLabel.setText("Customer ID");

        customerIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdTextActionPerformed(evt);
            }
        });

        customerLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        searchItemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchItemButton.setText("Search");
        searchItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemButtonActionPerformed(evt);
            }
        });

        ItemLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout CustDetailsPanelLayout = new javax.swing.GroupLayout(CustDetailsPanel);
        CustDetailsPanel.setLayout(CustDetailsPanelLayout);
        CustDetailsPanelLayout.setHorizontalGroup(
            CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(CustDetailsPanelLayout.createSequentialGroup()
                        .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CustDetailsPanelLayout.createSequentialGroup()
                                .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CustomerIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OrderIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(orderIdText, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(customerIdText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchCustomerButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(orderQty, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CustDetailsPanelLayout.createSequentialGroup()
                                .addComponent(ItemCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CustDetailsPanelLayout.createSequentialGroup()
                                        .addComponent(itemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(searchItemButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(orderQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CustDetailsPanelLayout.createSequentialGroup()
                                .addComponent(DiscountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CustDetailsPanelLayout.setVerticalGroup(
            CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustDetailsPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CustomerIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customerIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CustDetailsPanelLayout.createSequentialGroup()
                        .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(itemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderQty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CustDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiscountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddItemButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        OrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(OrderTable);

        UpdateItemButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateItemButton.setText("PLACE ORDER");
        UpdateItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageCustomerPanelLayout = new javax.swing.GroupLayout(ManageCustomerPanel);
        ManageCustomerPanel.setLayout(ManageCustomerPanelLayout);
        ManageCustomerPanelLayout.setHorizontalGroup(
            ManageCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CustDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ManageCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ManageCustomerPanelLayout.createSequentialGroup()
                        .addGroup(ManageCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateItemButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ManageCustomerPanelLayout.setVerticalGroup(
            ManageCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManageCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addComponent(ManageCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemButtonActionPerformed
        addToTable();
    }//GEN-LAST:event_AddItemButtonActionPerformed

    private void searchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerButtonActionPerformed
        searchCustomer();
    }//GEN-LAST:event_searchCustomerButtonActionPerformed

    private void itemCodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCodeTextActionPerformed

    private void orderIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIdTextActionPerformed

    private void discountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountTextActionPerformed

    private void orderQtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderQtyTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderQtyTextActionPerformed

    private void customerIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdTextActionPerformed

    private void searchItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemButtonActionPerformed
        serachItem();
    }//GEN-LAST:event_searchItemButtonActionPerformed

    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderTableMouseClicked

    }//GEN-LAST:event_OrderTableMouseClicked

    private void UpdateItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateItemButtonActionPerformed
        placeOrder();
    }//GEN-LAST:event_UpdateItemButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItemButton;
    private javax.swing.JPanel BasePanel;
    private javax.swing.JPanel CustDetailsPanel;
    private javax.swing.JLabel CustomerIDLabel;
    private javax.swing.JLabel DiscountLabel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel ItemCodeLabel;
    private javax.swing.JLabel ItemLabel;
    private javax.swing.JPanel ManageCustomerPanel;
    private javax.swing.JLabel OrderIDLabel;
    private javax.swing.JTable OrderTable;
    private javax.swing.JButton UpdateItemButton;
    private javax.swing.JTextField customerIdText;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JTextField discountText;
    private javax.swing.JTextField itemCodeText;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField orderIdText;
    private javax.swing.JLabel orderQty;
    private javax.swing.JTextField orderQtyText;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JButton searchItemButton;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables

    private void searchCustomer() {
        String custID = customerIdText.getText();

        try {
            CustomerModel customerModel = customerController.searchCustomer2CC(custID);

            if (customerModel != null) {
                customerLabel.setText(customerModel.getName() + " | " + customerModel.getAddress() + ", " + customerModel.getCity());

            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }

    }

    private void serachItem() {

        String ItemID = itemCodeText.getText();

        try {
            ItemModel itemModel = itemController.searchItems2IC(ItemID);

            if (itemModel != null) {
                ItemLabel.setText(itemModel.getItemDescription() + " | " + itemModel.getItemPackSize() + " | Rs." + Double.toString(itemModel.getItemUnitPrice()));

            } else {
                JOptionPane.showMessageDialog(this, "Item Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void loadTable() {
        String[] columns = {"Item ID", "Quantity", "Discount"};

        DefaultTableModel dtm = new DefaultTableModel(columns, 0);
        OrderTable.setModel(dtm);

    }

    private void addToTable() {
        OrderDetailModel orderDetailModel = new OrderDetailModel("",
                itemCodeText.getText(),
                Integer.parseInt(orderQtyText.getText()),
                Double.parseDouble(discountText.getText()));

        orderDetailModels.add(orderDetailModel);

        Object[] rowData = {orderDetailModel.getItemCode(), orderDetailModel.getOrderQty(), orderDetailModel.getDiscount()};

        DefaultTableModel dtm = (DefaultTableModel) OrderTable.getModel();

        dtm.addRow(rowData);

        cleanItemData();

    }

    private void cleanItemData() {
        itemCodeText.setText("");
        orderQtyText.setText("");
        discountText.setText("");
        ItemLabel.setText("");

    }

    private void placeOrder() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        OrderModel orderModel = new OrderModel(orderIdText.getText(), sdf.format(new Date()), customerIdText.getText());

        try {
            String response = orderController.placeOrder2OC(orderDetailModels, orderModel);
            JOptionPane.showMessageDialog(this, response);

        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
        clearForm();

    }

    private void clearForm() {
        loadTable();
        cleanItemData();
        orderIdText.setText("");
        customerIdText.setText("");
        CustomerIDLabel.setText("");

    }
}
