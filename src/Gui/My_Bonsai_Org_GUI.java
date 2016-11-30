package Gui;

import mybonsaiorg.Tractament;
import mybonsaiorg.Bonsai;
import java.awt.event.WindowEvent;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;


public class My_Bonsai_Org_GUI extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form JFramePrincipal
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public My_Bonsai_Org_GUI() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        inicialitzarComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SideBarPanel = new javax.swing.JPanel();
        ShowBonsais = new javax.swing.JButton();
        AddTractament = new javax.swing.JButton();
        Addbonsai = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        TheXixaPanel = new javax.swing.JPanel();
        SreenX = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TotBonsai = new javax.swing.JTable();
        AddBonsai = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CreaBonsai = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        IDBonsai = new javax.swing.JTextField();
        estilBonsai = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        NomBotanic = new javax.swing.JTextField();
        familiaBonsai = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NomBonsai = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        WellcomeScreen = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CRUDTractaments = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipusTractament = new javax.swing.JTextField();
        MotiuTractament = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaulaTractaments = new javax.swing.JTable();
        CreaTractament = new javax.swing.JButton();
        EditaTractament = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tractaments = new javax.swing.JTable();
        esborraTractament = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        SideBarPanel.setBackground(java.awt.SystemColor.desktop);

        ShowBonsais.setText("Mostra bonsais");
        ShowBonsais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBonsaisActionPerformed(evt);
            }
        });

        AddTractament.setText("Afetgir Tractaments");
        AddTractament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTractamentActionPerformed(evt);
            }
        });

        Addbonsai.setText("Afetgir Bonsai");
        Addbonsai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbonsaiActionPerformed(evt);
            }
        });

        Exit.setText("Sortir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideBarPanelLayout = new javax.swing.GroupLayout(SideBarPanel);
        SideBarPanel.setLayout(SideBarPanelLayout);
        SideBarPanelLayout.setHorizontalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Addbonsai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddTractament, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShowBonsais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        SideBarPanelLayout.setVerticalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Addbonsai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddTractament)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowBonsais)
                .addGap(419, 419, 419)
                .addComponent(Exit))
        );

        TheXixaPanel.setBackground(java.awt.Color.green);
        TheXixaPanel.setLayout(new java.awt.CardLayout());

        SreenX.setBackground(java.awt.Color.orange);
        SreenX.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SreenXComponentShown(evt);
            }
        });

        TotBonsai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Bonsai", "Nom", "Nom Botanic", "Familia", "Estil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TotBonsai.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(TotBonsai);

        javax.swing.GroupLayout SreenXLayout = new javax.swing.GroupLayout(SreenX);
        SreenX.setLayout(SreenXLayout);
        SreenXLayout.setHorizontalGroup(
            SreenXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SreenXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SreenXLayout.setVerticalGroup(
            SreenXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SreenXLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        TheXixaPanel.add(SreenX, "card3");

        AddBonsai.setBackground(java.awt.Color.orange);

        jLabel6.setText("Afetgir bonsai");

        CreaBonsai.setText("Crear Bonsai");
        CreaBonsai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreaBonsaiMouseClicked(evt);
            }
        });
        CreaBonsai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaBonsaiActionPerformed(evt);
            }
        });

        jLabel9.setText("ID bonsai:");

        estilBonsai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vertical formal","vertical informal","cascada","semi-cascada", "literati" }));
        estilBonsai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estilBonsaiActionPerformed(evt);
            }
        });

        jLabel11.setText("Nom botanic:");

        jLabel12.setText("Familia:");

        jLabel13.setText("Estil:");

        NomBonsai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomBonsaiActionPerformed(evt);
            }
        });

        jLabel10.setText("Nom bonsai:");

        javax.swing.GroupLayout AddBonsaiLayout = new javax.swing.GroupLayout(AddBonsai);
        AddBonsai.setLayout(AddBonsaiLayout);
        AddBonsaiLayout.setHorizontalGroup(
            AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddBonsaiLayout.createSequentialGroup()
                .addGap(0, 386, Short.MAX_VALUE)
                .addComponent(CreaBonsai)
                .addGap(269, 269, 269))
            .addGroup(AddBonsaiLayout.createSequentialGroup()
                .addGroup(AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddBonsaiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(AddBonsaiLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomBotanic, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(familiaBonsai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estilBonsai, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomBonsai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDBonsai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddBonsaiLayout.setVerticalGroup(
            AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBonsaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddBonsaiLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(126, 126, 126))
                    .addGroup(AddBonsaiLayout.createSequentialGroup()
                        .addGroup(AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDBonsai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomBonsai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGroup(AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomBotanic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familiaBonsai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(8, 8, 8)
                .addGroup(AddBonsaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estilBonsai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(CreaBonsai)
                .addGap(176, 176, 176))
        );

        TheXixaPanel.add(AddBonsai, "card4");

        WellcomeScreen.setBackground(java.awt.Color.orange);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("My Bonsai Org ");

        jLabel7.setText("The java version");

        javax.swing.GroupLayout WellcomeScreenLayout = new javax.swing.GroupLayout(WellcomeScreen);
        WellcomeScreen.setLayout(WellcomeScreenLayout);
        WellcomeScreenLayout.setHorizontalGroup(
            WellcomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WellcomeScreenLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel5)
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WellcomeScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(270, 270, 270))
        );
        WellcomeScreenLayout.setVerticalGroup(
            WellcomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WellcomeScreenLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        TheXixaPanel.add(WellcomeScreen, "card5");

        CRUDTractaments.setBackground(java.awt.Color.orange);
        CRUDTractaments.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CRUDTractamentsComponentShown(evt);
            }
        });

        jPanel7.setBackground(java.awt.Color.orange);
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("Nou Tractament");

        jLabel2.setText("Tipus :");

        tipusTractament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipusTractamentActionPerformed(evt);
            }
        });

        MotiuTractament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotiuTractamentActionPerformed(evt);
            }
        });

        jLabel3.setText("Motiu:");

        jLabel4.setText("Bonsai:");

        TaulaTractaments.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TaulaTractaments);

        CreaTractament.setText("Afetgir Tractament");
        CreaTractament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreaTractamentMouseClicked(evt);
            }
        });
        CreaTractament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaTractamentActionPerformed(evt);
            }
        });

        EditaTractament.setText("Editar Tractament");
        EditaTractament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditaTractamentMouseClicked(evt);
            }
        });
        EditaTractament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditaTractamentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(CreaTractament)
                        .addGap(227, 227, 227)
                        .addComponent(EditaTractament)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MotiuTractament, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipusTractament, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(161, 161, 161))))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(199, 199, 199)
                            .addComponent(jLabel1)))
                    .addContainerGap(306, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(tipusTractament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MotiuTractament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreaTractament)
                    .addComponent(EditaTractament))
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        Tractaments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom", "Cognoms", "Telèfons"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tractaments.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tractaments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TractamentsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tractaments);

        esborraTractament.setText("Borrar");
        esborraTractament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esborraTractamentMouseClicked(evt);
            }
        });
        esborraTractament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esborraTractamentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CRUDTractamentsLayout = new javax.swing.GroupLayout(CRUDTractaments);
        CRUDTractaments.setLayout(CRUDTractamentsLayout);
        CRUDTractamentsLayout.setHorizontalGroup(
            CRUDTractamentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUDTractamentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(CRUDTractamentsLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CRUDTractamentsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(esborraTractament)
                .addGap(342, 342, 342))
        );
        CRUDTractamentsLayout.setVerticalGroup(
            CRUDTractamentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUDTractamentsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(esborraTractament)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        TheXixaPanel.add(CRUDTractaments, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TheXixaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TheXixaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowBonsaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBonsaisActionPerformed
        
       // Taula<Tractament> taubon = new Taula(new String[]{"ID","Nom", "Nom Botanic", "Familia", "Estil"}, My_Bonsai_Org_GUI.coleccio, Bonsai.class);
        
       // TotBonsai.setModel(taubon
       Taula<Bonsai> bonTaula = new Taula<>(new String[]{"ID", "Nom Bonsai"}, new ArrayList(My_Bonsai_Org_GUI.tractaments), Bonsai.class);
        TaulaTractaments.setModel(bonTaula);

        TheXixaPanel.removeAll();
        TheXixaPanel.revalidate();
        TheXixaPanel.add(SreenX);
        TheXixaPanel.revalidate();
        TheXixaPanel.repaint();
    }//GEN-LAST:event_ShowBonsaisActionPerformed

    private void AddTractamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTractamentActionPerformed
        tipusTractament.setText("");
        MotiuTractament.setText("");

        //taula de seleccionar el bonsai
        Taula<Bonsai> bonTaula = new Taula<>(new String[]{"ID", "Nom Bonsai"}, new ArrayList(My_Bonsai_Org_GUI.tractaments), Bonsai.class);
        TaulaTractaments.setModel(bonTaula);
        
       
        //tula de tractaments creats
        Taula<Tractament> tracTaula = new Taula<>(new String[]{"IDBonsai", "Tipus", "Motiu"}, My_Bonsai_Org_GUI.coleccio, Tractament.class);
        
        
        Tractaments.setModel(tracTaula);
        
        EditaTractament.setEnabled(false);
        esborraTractament.setEnabled(false);
        

        TheXixaPanel.removeAll();
        TheXixaPanel.revalidate();
        TheXixaPanel.add(CRUDTractaments);
        TheXixaPanel.revalidate();
        TheXixaPanel.repaint();
    }//GEN-LAST:event_AddTractamentActionPerformed

    private void AddbonsaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbonsaiActionPerformed
        // TODO add your handling code here:
        IDBonsai.setText("");
        estilBonsai.setSelectedIndex(0);
        
        TheXixaPanel.removeAll();
        TheXixaPanel.revalidate();
        TheXixaPanel.add(AddBonsai);
        TheXixaPanel.revalidate();
        TheXixaPanel.repaint();
    }//GEN-LAST:event_AddbonsaiActionPerformed

    private void CreaTractamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreaTractamentMouseClicked
        
        //Tractament tract = new Tractament(Integer.parseInt(IDBonsai.getText()), tipusTractament.getText(),MotiuTractament.getText())
        Tractament tract = new Tractament(IDBonsai.getText(), tipusTractament.getText(),MotiuTractament.getText());
        ArrayList<Bonsai> a=new ArrayList<>();
        
        
        ListSelectionModel lsm=TaulaTractaments.getSelectionModel();
        for(int i=lsm.getMinSelectionIndex();i<=lsm.getMaxSelectionIndex();i++)
            if(lsm.isSelectedIndex(i)) a.add((Bonsai)TaulaTractaments.getModel().getValueAt(i, -1));

        tract.set4Tractaments(a);
        My_Bonsai_Org_GUI.coleccio.add(tract);
        
        Taula<Tractament> tracTaula = new Taula<>(new String[]{"ID", "Tipus", "Motiu"}, My_Bonsai_Org_GUI.coleccio, Tractament.class);
        
        Tractaments.setModel(tracTaula);

    }//GEN-LAST:event_CreaTractamentMouseClicked

    private void CreaTractamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaTractamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreaTractamentActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
            try {                                   
                // TODO add your handling code here:
                ObjectOutputStream sortida = null;
                sortida = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("MyBonsaiOrg.dat")));
                for(int i=0;i<coleccio.size();i++)
                {
                    try{
                        Tractament c=(Tractament)coleccio.get(i);
                        sortida.writeObject(c);
                    }
                    catch(Exception ex){
                        break;
                    }
                }
                sortida.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(My_Bonsai_Org_GUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(My_Bonsai_Org_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        


    }//GEN-LAST:event_formWindowClosing

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_ExitActionPerformed

    private void SreenXComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SreenXComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_SreenXComponentShown

    private void CRUDTractamentsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CRUDTractamentsComponentShown
        // TODO add your handling code here:
        

    }//GEN-LAST:event_CRUDTractamentsComponentShown

    private void CreaBonsaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreaBonsaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreaBonsaiMouseClicked

    private void CreaBonsaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaBonsaiActionPerformed
        // TODO add your handling code here:
        if(IDBonsai.getText().matches("\\d")) {
            Bonsai t=new Bonsai(Integer.parseInt(IDBonsai.getText()), (String)NomBonsai.getText(),(String)NomBotanic.getText(), (String)familiaBonsai.getText(), (String)estilBonsai.getSelectedItem());
            tractaments.add(t);
            JOptionPane.showMessageDialog(this, NomBonsai.getText(), "Bonsai creat correctament", JOptionPane.INFORMATION_MESSAGE);
            IDBonsai.setText("");
            estilBonsai.setSelectedIndex(0);
        } else{
            JOptionPane.showMessageDialog(this, IDBonsai.getText(), "ID no valid", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CreaBonsaiActionPerformed

    private void TractamentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TractamentsMouseClicked
        // TODO add your handling code here:
        int i=Tractaments.getSelectedRow();
        if(i!=-1){
            EditaTractament.setEnabled(true);
            esborraTractament.setEnabled(true);


            Taula<Tractament> mt=(Taula<Tractament>)Tractaments.getModel();
            tipusTractament.setText((String)mt.getValueAt(i, 0));
            MotiuTractament.setText((String)mt.getValueAt(i, 1));
            
            ArrayList<Bonsai> llistaBonsais=(ArrayList<Bonsai>)mt.getValueAt(i, 2);
            TaulaTractaments.getSelectionModel().clearSelection();
            if(!llistaBonsais.isEmpty()){
                Taula<Bonsai> model2=(Taula<Bonsai>)TaulaTractaments.getModel();
                for (int j = 0; j < model2.getRowCount(); j++) {
                    if(llistaBonsais.contains(model2.getValueAt(j, -1)))
                        TaulaTractaments.getSelectionModel().addSelectionInterval(j, j);

                }
            }
        }else{
            tipusTractament.setText("");
            MotiuTractament.setText("");
            TaulaTractaments.getSelectionModel().clearSelection();  
            EditaTractament.setEnabled(false);
            esborraTractament.setEnabled(false);

        }
    }//GEN-LAST:event_TractamentsMouseClicked

    private void EditaTractamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditaTractamentMouseClicked
    }//GEN-LAST:event_EditaTractamentMouseClicked

    private void EditaTractamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditaTractamentActionPerformed
        Tractament tract=(Tractament)Tractaments.getModel().getValueAt(Tractaments.getSelectedRow(),-1);
      //  tract.set1IDBonsai(IDBonsai.getText());
        tract.set2tipustractaments(tipusTractament.getText());
        tract.set3motiutractament(MotiuTractament.getText());
        int[] selecs=TaulaTractaments.getSelectedRows();
        ArrayList<Bonsai> tractamentsAL=new ArrayList<>();
        for (int i = 0; i < selecs.length; i++) {
            tractamentsAL.add((Bonsai)TaulaTractaments.getModel().getValueAt(selecs[i],-1));
        }

        tract.set4Tractaments(tractamentsAL);
        
        Taula<Tractament> taulatract = new Taula<>(new String[]{"ID bonsai", "Tipus", "Motiu"}, My_Bonsai_Org_GUI.coleccio, Tractament.class);
        Tractaments.setModel(taulatract);
    }//GEN-LAST:event_EditaTractamentActionPerformed

    private void esborraTractamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esborraTractamentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_esborraTractamentMouseClicked

    private void esborraTractamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esborraTractamentActionPerformed
        // TODO add your handling code here:
        Tractament c=(Tractament)Tractaments.getModel().getValueAt(Tractaments.getSelectedRow(),-1);
        coleccio.remove(c);
        
        Taula<Tractament> mt2 = new Taula<>(new String[]{"ID Bonsai", "Tiups", "Motiu"}, My_Bonsai_Org_GUI.coleccio, Tractament.class);
        //mt2 = new Taula<>(My_Bonsai_Org_GUI.coleccio, Tractament.class);
        
        Tractaments.setModel(mt2);
        
        EditaTractament.setEnabled(false);
        esborraTractament.setEnabled(false);
    }//GEN-LAST:event_esborraTractamentActionPerformed

    private void tipusTractamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipusTractamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipusTractamentActionPerformed

    private void MotiuTractamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotiuTractamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotiuTractamentActionPerformed

    private void estilBonsaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estilBonsaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estilBonsaiActionPerformed

    private void NomBonsaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomBonsaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomBonsaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(My_Bonsai_Org_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(My_Bonsai_Org_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(My_Bonsai_Org_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(My_Bonsai_Org_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    My_Bonsai_Org_GUI frame=new My_Bonsai_Org_GUI();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(My_Bonsai_Org_GUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(My_Bonsai_Org_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void inicialitzarComponents() throws FileNotFoundException, IOException, ClassNotFoundException {
             coleccio =new ArrayList<>(); 
             tractaments= new TreeSet<>();
             
             File f= new File("MyBonsaiOrg.dat");
             if(f.exists()){
                ObjectInputStream entrada=new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
               
                while(true)
                {
                    try{
                        Tractament c=(Tractament)entrada.readObject();
                        coleccio.add(c);
                        ArrayList<Bonsai> lt=c.get4Tractaments();
                        tractaments.addAll(lt);
                    }
                    catch(Exception ex){
                        break;
                    }
                }
                entrada.close();      
             }
             
            TheXixaPanel.removeAll();
            TheXixaPanel.revalidate();
            TheXixaPanel.add(WellcomeScreen);
            TheXixaPanel.revalidate();
            TheXixaPanel.repaint();
    }

    
    //Col·leccions on guardem la informació obtinguda del fitxer d'coleccio
    public static ArrayList<Tractament> coleccio;
    public static TreeSet<Bonsai> tractaments;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddBonsai;
    private javax.swing.JButton AddTractament;
    private javax.swing.JButton Addbonsai;
    private javax.swing.JPanel CRUDTractaments;
    private javax.swing.JButton CreaBonsai;
    private javax.swing.JButton CreaTractament;
    private javax.swing.JButton EditaTractament;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField IDBonsai;
    private javax.swing.JTextField MotiuTractament;
    private javax.swing.JTextField NomBonsai;
    private javax.swing.JTextField NomBotanic;
    private javax.swing.JButton ShowBonsais;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JPanel SreenX;
    private javax.swing.JTable TaulaTractaments;
    private javax.swing.JPanel TheXixaPanel;
    private javax.swing.JTable TotBonsai;
    private javax.swing.JTable Tractaments;
    private javax.swing.JPanel WellcomeScreen;
    private javax.swing.JButton esborraTractament;
    private javax.swing.JComboBox<String> estilBonsai;
    private javax.swing.JTextField familiaBonsai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField tipusTractament;
    // End of variables declaration//GEN-END:variables
}

class Taula<T> extends AbstractTableModel {
    
    final Class<T> typeParameterClass;

    private String[] nomCols;
    private List<T> dades;

    //model de les taules
    public Taula(String[] nomColumnes, ArrayList<T> dades, Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
        
        this.nomCols = nomColumnes;
        this.dades = dades;
    }

    public Taula(ArrayList<T> dades, Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
        if(dades!=null && !dades.isEmpty()){
            
            Class<?> classe = this.typeParameterClass;

           
            int numCols = classe.getDeclaredFields().length;
            this.nomCols=new String[numCols];

            for(int i=0;i<numCols;i++){
                Matcher matcher = Pattern.compile("_\\d+").matcher(classe.getDeclaredFields()[i].getName());
                matcher.find();
                this.nomCols[i]=classe.getDeclaredFields()[i].getName().substring(matcher.group().length()).toUpperCase();
            }
        }
        this.dades = dades;
    }

    @Override
    public String getColumnName(int column) {
        return nomCols[column];
    }
    
    @Override
    public int getRowCount() {
        int cont=0;
        
        if(dades!=null) cont=dades.size();
        
        return cont;
    }

    @Override
    public int getColumnCount() {
        int cont=0;
        
        if(nomCols!=null) cont=nomCols.length;
        return cont;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex==-1) return dades.get(rowIndex);
        Class<?> classe = this.typeParameterClass;
        int ncamps = classe.getDeclaredFields().length;

        Method[] methods = new Method[ncamps];
        int i = 0;
        try {
            for (PropertyDescriptor pD : Introspector.getBeanInfo(classe).getPropertyDescriptors()) {
                Method m = pD.getReadMethod();
                if (m != null & !m.getName().equals("getClass")) {
                    methods[i++] = m;
                }
            }
        } catch (java.beans.IntrospectionException ex){};

        try {
            return methods[columnIndex].invoke(dades.get(rowIndex));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Taula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
