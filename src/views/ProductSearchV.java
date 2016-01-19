package views;

import controller.resources.Operaciones;
import controller.service.ProductService;
import views.tableModel.ProductTableModel;

public class ProductSearchV extends javax.swing.JDialog {

    private final int productOption;
    private final ProductService ps;
    private final ProductTableModel ptm;

    public ProductSearchV(java.awt.Frame parent, boolean modal, int productOption) {
        super(parent, modal);
        this.ps = new ProductService();
        this.ptm = new ProductTableModel();
        this.productOption = productOption;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        productSearchtTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        productSearchTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Buscar Producto:");

        productSearchtTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productSearchtTxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productSearchtTxt)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productSearchtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        productSearchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productSearchTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productSearchTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productSearchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productSearchTableMouseClicked
        // TODO add your handling code here:
        
        if (evt.getClickCount() == 2) {
            this.ps.setInstance(this.ptm.getList().get(productSearchTable.getSelectedRow()));
            
            this.dispose();
            
            if(productOption == 2){
                new ProductView(null, true, this.productOption, this.ps).setVisible(true);
            }else if(productOption == 3){
                new ProductView(null, true, this.productOption, this.ps).setVisible(true);
            }           
        }
        
        
    }//GEN-LAST:event_productSearchTableMouseClicked

    private void productSearchtTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productSearchtTxtKeyReleased
        // TODO add your handling code here:
        this.ptm.setList(this.ps.list());
        this.productSearchTable.setModel(this.ptm);
        this.productSearchTable.getColumnModel().getColumn(1).setPreferredWidth(190);
        this.productSearchTable.getColumnModel().getColumn(2).setCellRenderer(Operaciones.getRenderCellToRigth());
        this.productSearchTable.updateUI();
    }//GEN-LAST:event_productSearchtTxtKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productSearchTable;
    private javax.swing.JTextField productSearchtTxt;
    // End of variables declaration//GEN-END:variables
}
