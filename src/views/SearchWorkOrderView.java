/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.service.InvoiceService;
import controller.service.WorkOrderService;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.sql.Time;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import views.tableModel.WorkDiaryTableModel;

/**
 *
 * @author Jhoe
 */
public class SearchWorkOrderView extends javax.swing.JDialog {

    private final WorkOrderService workOrderService;
    private final WorkDiaryTableModel workDiaryTableModel;
    private final InvoiceService invoiceService;

    public SearchWorkOrderView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.workOrderService = new WorkOrderService();
        this.workDiaryTableModel = new WorkDiaryTableModel();
        this.invoiceService = new InvoiceService();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchWorkOrderButtonGroup = new javax.swing.ButtonGroup();
        searchWorkOrderTablePopupOptions = new javax.swing.JPopupMenu();
        showWorkOrderViewMenuItem = new javax.swing.JMenuItem();
        proformGenerateMenuItem = new javax.swing.JMenuItem();
        invoiceGenerateMenuItem = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchWorkOrderTxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        workOrderStateCb = new javax.swing.JComboBox<>();
        workOrderStateRb = new javax.swing.JRadioButton();
        workOrderPaymentStateRb = new javax.swing.JRadioButton();
        workOrderPaymentStateCb = new javax.swing.JComboBox<>();
        customerFilterRb = new javax.swing.JRadioButton();
        employeeFilterRb = new javax.swing.JRadioButton();
        allWorkOrderRb = new javax.swing.JRadioButton();
        searchWorkOrderBt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchWorkOrderTable = new javax.swing.JTable();

        showWorkOrderViewMenuItem.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        showWorkOrderViewMenuItem.setText("Visualizar Orden de Trabajo");
        showWorkOrderViewMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showWorkOrderViewMenuItemActionPerformed(evt);
            }
        });
        searchWorkOrderTablePopupOptions.add(showWorkOrderViewMenuItem);

        proformGenerateMenuItem.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        proformGenerateMenuItem.setText("Generar Proforma");
        searchWorkOrderTablePopupOptions.add(proformGenerateMenuItem);

        invoiceGenerateMenuItem.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        invoiceGenerateMenuItem.setText("Generar Factura");
        invoiceGenerateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceGenerateMenuItemActionPerformed(evt);
            }
        });
        searchWorkOrderTablePopupOptions.add(invoiceGenerateMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Orden de Trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabel1.setText("Criterio:");

        searchWorkOrderTxt.setEnabled(false);
        searchWorkOrderTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWorkOrderTxtActionPerformed(evt);
            }
        });
        searchWorkOrderTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchWorkOrderTxtKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 11), new java.awt.Color(0, 153, 255))); // NOI18N

        workOrderStateCb.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        workOrderStateCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDIENTE", "PAUSADO", "REALIZADO" }));

        workOrderStateRb.setBackground(new java.awt.Color(255, 255, 255));
        searchWorkOrderButtonGroup.add(workOrderStateRb);
        workOrderStateRb.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        workOrderStateRb.setText("Estado");

        workOrderPaymentStateRb.setBackground(new java.awt.Color(255, 255, 255));
        searchWorkOrderButtonGroup.add(workOrderPaymentStateRb);
        workOrderPaymentStateRb.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        workOrderPaymentStateRb.setText("Pago");

        workOrderPaymentStateCb.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        workOrderPaymentStateCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDIENTE", "PAGADO" }));

        customerFilterRb.setBackground(new java.awt.Color(255, 255, 255));
        searchWorkOrderButtonGroup.add(customerFilterRb);
        customerFilterRb.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        customerFilterRb.setText("Cliente");
        customerFilterRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerFilterRbActionPerformed(evt);
            }
        });

        employeeFilterRb.setBackground(new java.awt.Color(255, 255, 255));
        searchWorkOrderButtonGroup.add(employeeFilterRb);
        employeeFilterRb.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        employeeFilterRb.setText("Empleado");
        employeeFilterRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeFilterRbActionPerformed(evt);
            }
        });

        allWorkOrderRb.setBackground(new java.awt.Color(255, 255, 255));
        searchWorkOrderButtonGroup.add(allWorkOrderRb);
        allWorkOrderRb.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        allWorkOrderRb.setSelected(true);
        allWorkOrderRb.setText("Todos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(allWorkOrderRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerFilterRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(employeeFilterRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workOrderStateRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(workOrderStateCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(workOrderPaymentStateRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workOrderPaymentStateCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workOrderStateCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workOrderStateRb)
                    .addComponent(workOrderPaymentStateRb)
                    .addComponent(workOrderPaymentStateCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerFilterRb)
                    .addComponent(employeeFilterRb)
                    .addComponent(allWorkOrderRb))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        searchWorkOrderBt.setText("Buscar");
        searchWorkOrderBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWorkOrderBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchWorkOrderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchWorkOrderBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchWorkOrderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchWorkOrderBt))
                .addGap(73, 73, 73))
        );

        searchWorkOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        searchWorkOrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchWorkOrderTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchWorkOrderTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(searchWorkOrderTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchWorkOrderTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchWorkOrderTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchWorkOrderTxtActionPerformed

    private void searchWorkOrderBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchWorkOrderBtActionPerformed
        // TODO add your handling code here:

        if (allWorkOrderRb.isSelected()) {
            chargeWorkOrderTable();
        }

    }//GEN-LAST:event_searchWorkOrderBtActionPerformed

    private void customerFilterRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerFilterRbActionPerformed
        // TODO add your handling code here:
        if (customerFilterRb.isSelected()) {
            searchWorkOrderTxt.setEnabled(true);
            searchWorkOrderBt.setEnabled(false);
        }
    }//GEN-LAST:event_customerFilterRbActionPerformed

    private void searchWorkOrderTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchWorkOrderTxtKeyReleased
        // TODO add your handling code here:
        chargeWorkOrderTable();

    }//GEN-LAST:event_searchWorkOrderTxtKeyReleased

    private void employeeFilterRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeFilterRbActionPerformed
        // TODO add your handling code here:
        if (employeeFilterRb.isSelected()) {
            searchWorkOrderTxt.setEnabled(true);
            searchWorkOrderBt.setEnabled(false);
        }
    }//GEN-LAST:event_employeeFilterRbActionPerformed

    private void searchWorkOrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchWorkOrderTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchWorkOrderTableMouseClicked

    private void searchWorkOrderTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchWorkOrderTableMousePressed
        // TODO add your handling code here:          
            tableOptionsPopup(evt);
    }//GEN-LAST:event_searchWorkOrderTableMousePressed

    private void chargeInvoiceData(){
        this.invoiceService.getInvoice().setInIssueDate(new Date());
        this.invoiceService.getInvoice().setInIssueTime(new Date());
        this.invoiceService.getInvoice().setInIva(this.workOrderService.getWorkOrder().getWorkOrderIva());
        this.invoiceService.getInvoice().setInNumber("12345");
        this.invoiceService.getInvoice().setInState("Realizada");
        this.invoiceService.getInvoice().setInSubtotalIva(this.workOrderService.getWorkOrder().getWorkOrderSubtotal());
        this.invoiceService.getInvoice().setInTotal(this.workOrderService.getWorkOrder().getWorkOrderTotal());
        this.invoiceService.getInvoice().setPerson(this.workOrderService.getWorkOrder().getPerson());
        
        
        this.workOrderDetailToInvoiceDetail();
        this.invoiceService.getInvoice().setDetailList(this.workOrderService.getWorkOrder().getDetailList());
        
    }
    
    //Actualizamos el tipo de detalle de oreden de trabajo a factura
    private void workOrderDetailToInvoiceDetail(){
        
        for (int i = 0; i < this.workOrderService.getWorkOrder().getDetailList().size(); i++) {
            this.workOrderService.getWorkOrder().getDetailList().get(i).setDetType("InvoiceDetail");
            this.workOrderService.getWorkOrder().getDetailList().get(i).setWorkOrder(null);
            this.workOrderService.getWorkOrder().getDetailList().get(i).setDetailId(null);
        }
    }
    
    private void invoiceGenerate(){
        
    }
    
    private void showWorkOrderViewMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showWorkOrderViewMenuItemActionPerformed
        // TODO add your handling code here:
        this.workOrderService.setInstance(this.workDiaryTableModel.getList().get(searchWorkOrderTable.getSelectedRow()));
        new WorkOrderView(null, true, workOrderService).setVisible(true);
    }//GEN-LAST:event_showWorkOrderViewMenuItemActionPerformed

    private void invoiceGenerateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceGenerateMenuItemActionPerformed
        // TODO add your handling code here:
        
        chargeInvoiceData();
        if(this.invoiceService.getInvoice().getInvoiceId() == null){
            this.invoiceService.saveInvoice();
            JOptionPane.showMessageDialog(null, "La factura ha sido generada correctamente");
        }
        
    }//GEN-LAST:event_invoiceGenerateMenuItemActionPerformed

     private void tableOptionsPopup(java.awt.event.MouseEvent evt){
        if(evt.getButton() == MouseEvent.BUTTON3){
            Point p = evt.getPoint();
            int rowNumber = searchWorkOrderTable.rowAtPoint(p);
            ListSelectionModel modelo = searchWorkOrderTable.getSelectionModel();
            modelo.setSelectionInterval(rowNumber, rowNumber);

            System.out.println("fila presionada " + searchWorkOrderTable.getSelectedRow());

            //removeTable.setEnabled(true);
            //addTable.setEnabled(false);
            //changeTableToAnother.setEnabled(true);
            searchWorkOrderTablePopupOptions.show(evt.getComponent(), evt.getX(), evt.getY());
            searchWorkOrderTablePopupOptions.setVisible(true);
        }
    }
    
    private void chargeWorkOrderTable() {
        if (allWorkOrderRb.isSelected()) {
            this.workDiaryTableModel.setList(this.workOrderService.getWorkOrderList());
        } else if (this.customerFilterRb.isSelected()) {
            this.workDiaryTableModel.setList(this.workOrderService.getWorkOrderListByCustomerCriteria(searchWorkOrderTxt.getText()));
        } else if (this.employeeFilterRb.isSelected()) {
            this.workDiaryTableModel.setList(this.workOrderService.getWorkOrderListByEmployeeCriteria(searchWorkOrderTxt.getText()));
        }

        this.searchWorkOrderTable.setModel(workDiaryTableModel);
        this.searchWorkOrderTable.updateUI();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton allWorkOrderRb;
    private javax.swing.JRadioButton customerFilterRb;
    private javax.swing.JRadioButton employeeFilterRb;
    private javax.swing.JMenuItem invoiceGenerateMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem proformGenerateMenuItem;
    private javax.swing.JButton searchWorkOrderBt;
    private javax.swing.ButtonGroup searchWorkOrderButtonGroup;
    private javax.swing.JTable searchWorkOrderTable;
    private javax.swing.JPopupMenu searchWorkOrderTablePopupOptions;
    private javax.swing.JTextField searchWorkOrderTxt;
    private javax.swing.JMenuItem showWorkOrderViewMenuItem;
    private javax.swing.JComboBox<String> workOrderPaymentStateCb;
    private javax.swing.JRadioButton workOrderPaymentStateRb;
    private javax.swing.JComboBox<String> workOrderStateCb;
    private javax.swing.JRadioButton workOrderStateRb;
    // End of variables declaration//GEN-END:variables
}
