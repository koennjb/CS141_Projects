/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.awt.Color;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JColorChooser;


/**
 *  ADD
 *  <p>
 *  Environment:    PC, Windows 10, JDK 1.8.0_151, NetBeans 8.2
 *  <p>
 *  Date:           1/15/2018 
 *  <p>
 *  History Log:    1/5/2018
 *  <p>
 *  @author         Koenn Becker
 *  @version        1.0.0
 */
public class FutureAnnuity extends javax.swing.JFrame {


    /**
     * Creates new form FutureAnnuity
     */
    public FutureAnnuity() {
        initComponents();
        
        this.setLocationRelativeTo(null);       // Centers forms
        aboutJDialog.setLocationRelativeTo(null);       // Centers JDialog
        settingsJDialog.setLocationRelativeTo(null);       // Centers settings JDialog
        aboutJDialog.getRootPane().setDefaultButton(closeJButton);
        this.getRootPane().setDefaultButton(calculateJButton); // Sets default button to calculate
        
        // Set icon for form
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/project1/Icon.png"));
        
        // Sets focused field
        paymentJTextField.requestFocus();
        
        // Sets current date and adds it to form title
        setDate();

    }
    
    /**        
     *  Method          setDate()     
     *  Description:    Creates new SimpleDateFormat<br>
     *                  Sets date and then adds it to form title<br>
     *  Date Created:   1/10/2018  
     *  @author         Koenn Becker
     *  @see            java.text.DateFormat
     *  @see            java.text.SimpleDateFormat
     *  @see            java.util.Date 
     */ 
    private void setDate() {
        
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        this.setTitle("Future Annuity -- " + dateFormat.format(date));
    
    }
    
    private void clearFields(){
        // Clears all text fields
        paymentJTextField.setText("");
        interestJSpinner.setValue(0.00);
        compoundsJTextField.setText("");
        yearsJTextField.setText("");
        annuityJTextField.setText("");
        paymentTotalJTextField.setText("");
        interestTotalJTextField.setText("");
        errorJLabel.setText("");
        
        // Resets focus to payment field
        paymentJTextField.requestFocus();
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutJDialog = new javax.swing.JDialog();
        aboutJLabel = new javax.swing.JLabel();
        descriptionJLabel = new javax.swing.JLabel();
        detailsJLabel = new javax.swing.JLabel();
        formulaPicJLabel = new javax.swing.JLabel();
        closeJButton = new javax.swing.JButton();
        settingsJDialog = new javax.swing.JDialog();
        settingsJLabel = new javax.swing.JLabel();
        closeSettingsJButton = new javax.swing.JButton();
        colorJButton = new javax.swing.JButton();
        logoJLabel = new javax.swing.JLabel();
        inputJPanel = new javax.swing.JPanel();
        paymentJLabel = new javax.swing.JLabel();
        paymentJTextField = new javax.swing.JTextField();
        interestJLabel = new javax.swing.JLabel();
        interestJSpinner = new javax.swing.JSpinner();
        compoundsJLabel = new javax.swing.JLabel();
        compoundsJTextField = new javax.swing.JTextField();
        yearsJLabel = new javax.swing.JLabel();
        yearsJTextField = new javax.swing.JTextField();
        outputJPanel = new javax.swing.JPanel();
        annuityJLabel = new javax.swing.JLabel();
        annuityJTextField = new javax.swing.JTextField();
        paymentTotalJLabel = new javax.swing.JLabel();
        paymentTotalJTextField = new javax.swing.JTextField();
        interestTotalJLabel = new javax.swing.JLabel();
        interestTotalJTextField = new javax.swing.JTextField();
        errorJLabel = new javax.swing.JLabel();
        calculateJButton = new javax.swing.JButton();
        buttonsJPanel = new javax.swing.JPanel();
        clearJButton = new javax.swing.JButton();
        printJButton = new javax.swing.JButton();
        quitJButton = new javax.swing.JButton();
        JMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        clearJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        quitJMenuItem = new javax.swing.JMenuItem();
        settingsJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        aboutJDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        aboutJDialog.setTitle("About -- Annuity Calculator");
        aboutJDialog.setBackground(new java.awt.Color(255, 255, 255));
        aboutJDialog.setIconImage(null);
        aboutJDialog.setResizable(false);
        aboutJDialog.setSize(new java.awt.Dimension(416, 510));
        aboutJDialog.setType(java.awt.Window.Type.UTILITY);

        aboutJLabel.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        aboutJLabel.setForeground(new java.awt.Color(229, 152, 88));
        aboutJLabel.setText("About");

        descriptionJLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        descriptionJLabel.setText("<html>This program calculates the annuity of an account that has a fixed interest rate. You can enter the payment you will deposit each compound, the interest rate of your account, the number of compounds a year, and the number of years you plan on continuing this plan. Below is the formula used in this calculation:</html>");

        detailsJLabel.setText("<html><h3>Version: 1.0.0</h3><h3>Developed by: Koenn Becker - 2018</h3></html>");

        formulaPicJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/formula1.png"))); // NOI18N
        formulaPicJLabel.setPreferredSize(new java.awt.Dimension(272, 189));
        formulaPicJLabel.setRequestFocusEnabled(false);

        closeJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        closeJButton.setMnemonic('R');
        closeJButton.setText("Close");
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aboutJDialogLayout = new javax.swing.GroupLayout(aboutJDialog.getContentPane());
        aboutJDialog.getContentPane().setLayout(aboutJDialogLayout);
        aboutJDialogLayout.setHorizontalGroup(
            aboutJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutJDialogLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(aboutJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(166, 166, 166))
            .addGroup(aboutJDialogLayout.createSequentialGroup()
                .addGroup(aboutJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutJDialogLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(aboutJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aboutJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(descriptionJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(detailsJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                            .addComponent(formulaPicJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(aboutJDialogLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aboutJDialogLayout.setVerticalGroup(
            aboutJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutJDialogLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(aboutJLabel)
                .addGap(18, 18, 18)
                .addComponent(descriptionJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formulaPicJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(detailsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        settingsJDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        settingsJDialog.setTitle("About -- Annuity Calculator");
        settingsJDialog.setBackground(new java.awt.Color(255, 255, 255));
        settingsJDialog.setIconImage(null);
        settingsJDialog.setResizable(false);
        settingsJDialog.setSize(new java.awt.Dimension(416, 510));
        settingsJDialog.setType(java.awt.Window.Type.UTILITY);

        settingsJLabel.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        settingsJLabel.setForeground(new java.awt.Color(229, 152, 88));
        settingsJLabel.setText("Settings");

        closeSettingsJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        closeSettingsJButton.setMnemonic('R');
        closeSettingsJButton.setText("Close");
        closeSettingsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeSettingsJButtonActionPerformed(evt);
            }
        });

        colorJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        colorJButton.setText("Change Color Scheme");
        colorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsJDialogLayout = new javax.swing.GroupLayout(settingsJDialog.getContentPane());
        settingsJDialog.getContentPane().setLayout(settingsJDialogLayout);
        settingsJDialogLayout.setHorizontalGroup(
            settingsJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsJDialogLayout.createSequentialGroup()
                .addGroup(settingsJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsJDialogLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(closeSettingsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsJDialogLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(settingsJLabel))
                    .addGroup(settingsJDialogLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(colorJButton)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        settingsJDialogLayout.setVerticalGroup(
            settingsJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsJDialogLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(settingsJLabel)
                .addGap(43, 43, 43)
                .addComponent(colorJButton)
                .addGap(301, 301, 301)
                .addComponent(closeSettingsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Future Annuity");
        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        setResizable(false);

        logoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/AnnuityLogo.png"))); // NOI18N

        inputJPanel.setBackground(new java.awt.Color(229, 152, 88));
        inputJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        inputJPanel.setLayout(new java.awt.GridLayout(4, 3, 10, 17));

        paymentJLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        paymentJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        paymentJLabel.setText("Periodic Payment:");
        inputJPanel.add(paymentJLabel);

        paymentJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        paymentJTextField.setToolTipText("Must be greater than 0 ");
        inputJPanel.add(paymentJTextField);

        interestJLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        interestJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        interestJLabel.setText("Interest (as a %):");
        inputJPanel.add(interestJLabel);

        interestJSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 1.0d));
        interestJSpinner.setToolTipText("Enter interest rate as percent (no % symbol)");
        interestJSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(interestJSpinner, "0.00"));
        inputJPanel.add(interestJSpinner);

        compoundsJLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        compoundsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        compoundsJLabel.setText("Compunds per year:");
        inputJPanel.add(compoundsJLabel);

        compoundsJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        compoundsJTextField.setToolTipText("Must be between 1 and " + Validation.MAX_COMPOUNDINGS);
        inputJPanel.add(compoundsJTextField);

        yearsJLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        yearsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yearsJLabel.setText("Years:");
        inputJPanel.add(yearsJLabel);

        yearsJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        yearsJTextField.setToolTipText("How many years the annuity will accumulate");
        inputJPanel.add(yearsJTextField);

        outputJPanel.setLayout(new java.awt.GridLayout(3, 2, 10, 15));

        annuityJLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        annuityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        annuityJLabel.setText("Future Annuity Balance:");
        outputJPanel.add(annuityJLabel);

        annuityJTextField.setEditable(false);
        annuityJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        outputJPanel.add(annuityJTextField);

        paymentTotalJLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        paymentTotalJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        paymentTotalJLabel.setText("Total Payments:");
        outputJPanel.add(paymentTotalJLabel);

        paymentTotalJTextField.setEditable(false);
        paymentTotalJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        outputJPanel.add(paymentTotalJTextField);

        interestTotalJLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        interestTotalJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        interestTotalJLabel.setText("Interest Earned:");
        outputJPanel.add(interestTotalJLabel);

        interestTotalJTextField.setEditable(false);
        interestTotalJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        outputJPanel.add(interestTotalJTextField);

        errorJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorJLabel.setForeground(new java.awt.Color(255, 51, 51));
        errorJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        calculateJButton.setBackground(new java.awt.Color(232, 104, 0));
        calculateJButton.setFont(new java.awt.Font("Alcubierre", 0, 18)); // NOI18N
        calculateJButton.setMnemonic('C');
        calculateJButton.setText("Calculate");
        calculateJButton.setToolTipText("Calculates total annuity");
        calculateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateJButtonActionPerformed(evt);
            }
        });

        buttonsJPanel.setLayout(new java.awt.GridLayout(1, 3, 20, 0));

        clearJButton.setBackground(new java.awt.Color(239, 197, 162));
        clearJButton.setFont(new java.awt.Font("Alcubierre", 0, 18)); // NOI18N
        clearJButton.setMnemonic('R');
        clearJButton.setText("Clear");
        clearJButton.setToolTipText("Clear all text fields");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        buttonsJPanel.add(clearJButton);

        printJButton.setFont(new java.awt.Font("Alcubierre", 0, 18)); // NOI18N
        printJButton.setMnemonic('P');
        printJButton.setText("Print");
        printJButton.setEnabled(false);
        buttonsJPanel.add(printJButton);

        quitJButton.setBackground(new java.awt.Color(239, 197, 162));
        quitJButton.setFont(new java.awt.Font("Alcubierre", 0, 18)); // NOI18N
        quitJButton.setMnemonic('Q');
        quitJButton.setText("Quit");
        quitJButton.setToolTipText("Quit the application");
        quitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJButtonActionPerformed(evt);
            }
        });
        buttonsJPanel.add(quitJButton);

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");
        fileJMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        clearJMenuItem.setMnemonic('C');
        clearJMenuItem.setText("Clear");
        clearJMenuItem.setToolTipText("Clears all text fields");
        clearJMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);

        printJMenuItem.setMnemonic('P');
        printJMenuItem.setText("Print");
        printJMenuItem.setEnabled(false);
        printJMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fileJMenu.add(printJMenuItem);

        quitJMenuItem.setMnemonic('Q');
        quitJMenuItem.setText("Quit");
        quitJMenuItem.setToolTipText("Quit the application");
        quitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(quitJMenuItem);

        settingsJMenuItem.setMnemonic('C');
        settingsJMenuItem.setText("Settings");
        settingsJMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settingsJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(settingsJMenuItem);

        JMenuBar.add(fileJMenu);

        helpJMenu.setMnemonic('H');
        helpJMenu.setText("Help");
        helpJMenu.setToolTipText("Need some help?");
        helpJMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        aboutJMenuItem.setMnemonic('A');
        aboutJMenuItem.setText("About");
        aboutJMenuItem.setToolTipText("About me!!");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        JMenuBar.add(helpJMenu);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(outputJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculateJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonsJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inputJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJMenuItemActionPerformed
        // Clears all text fields
        clearFields();
    }//GEN-LAST:event_clearJMenuItemActionPerformed

    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        aboutJDialog.setVisible(true);
        
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    private void calculateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateJButtonActionPerformed
        // Reads inputs and stores them in variables, then applies the future annuity formula and displays the results
        
        // Creates decimal format for money
        DecimalFormat moneyFormat = new DecimalFormat("$#,##0.00"); 
        
        // Initializes ValidationResult objects
        ValidationResult payment, interest, compounds, years;
        
        // Validates the following input fields by calling the Validation class which then returns the value into the objects below.
        payment = Validation.validatePayment(paymentJTextField, errorJLabel);
        interest = Validation.validateInterest(interestJSpinner, errorJLabel);
        compounds = Validation.validateCompound(compoundsJTextField, errorJLabel);
        years = Validation.validateYear(yearsJTextField, errorJLabel);
        
        // Creates new Annuity object for the calculation
        Annuity calculate = new Annuity(payment.value, interest.value, compounds.shrtValue, years.value);
        
        if (!payment.notValid && !interest.notValid && !compounds.notValid && !years.notValid){
            // Display annuity in output fields
            annuityJTextField.setText(moneyFormat.format(calculate.calculateAnnuity()));
            paymentTotalJTextField.setText(moneyFormat.format(calculate.getPayments()));
            interestTotalJTextField.setText(moneyFormat.format(calculate.getInterest()));
            
            errorJLabel.setText("");
        }
        else {
            annuityJTextField.setText("");
            paymentTotalJTextField.setText("");
            interestTotalJTextField.setText("");
            
        }
 
    }//GEN-LAST:event_calculateJButtonActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        // Clears all text fields
       clearFields();
    }//GEN-LAST:event_clearJButtonActionPerformed

    private void quitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJButtonActionPerformed
        // Quits the application
        System.exit(0);
    }//GEN-LAST:event_quitJButtonActionPerformed

    private void quitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJMenuItemActionPerformed
         // Quits the application
        System.exit(0);
    }//GEN-LAST:event_quitJMenuItemActionPerformed

    private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeJButtonActionPerformed
        // Closes About dialog box
        aboutJDialog.dispose();
    }//GEN-LAST:event_closeJButtonActionPerformed

    private void settingsJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsJMenuItemActionPerformed
        settingsJDialog.setVisible(true);
    }//GEN-LAST:event_settingsJMenuItemActionPerformed

    private void closeSettingsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeSettingsJButtonActionPerformed
        settingsJDialog.dispose();
    }//GEN-LAST:event_closeSettingsJButtonActionPerformed

    private void colorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorJButtonActionPerformed
        Color newColor = JColorChooser.showDialog(settingsJDialog, "Choose a color", inputJPanel.getBackground());
        if (newColor != null){
            inputJPanel.setBackground(newColor);
            calculateJButton.setBackground(newColor);
            clearJButton.setBackground(newColor);
            quitJButton.setBackground(newColor);    
        }
    }//GEN-LAST:event_colorJButtonActionPerformed

    /**        
     *  Method         main()    
     *  Description:   Creates new {@link #loanGUI()} object and sets it to visible.
     *  @param         args Unused.     
     *  @author        Koenn Becker   
     *  Date Created:  1/10/2018  
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
            java.util.logging.Logger.getLogger(FutureAnnuity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FutureAnnuity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FutureAnnuity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FutureAnnuity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                // Halts the running thread for length of splash screen gif in milliseconds
                try {
                    Thread.sleep(1400);
                }
                catch(InterruptedException e) {
                }
                
                new FutureAnnuity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JDialog aboutJDialog;
    private javax.swing.JLabel aboutJLabel;
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JLabel annuityJLabel;
    private javax.swing.JTextField annuityJTextField;
    private javax.swing.JPanel buttonsJPanel;
    private javax.swing.JButton calculateJButton;
    private javax.swing.JButton clearJButton;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JButton closeJButton;
    private javax.swing.JButton closeSettingsJButton;
    private javax.swing.JButton colorJButton;
    private javax.swing.JLabel compoundsJLabel;
    private javax.swing.JTextField compoundsJTextField;
    private javax.swing.JLabel descriptionJLabel;
    private javax.swing.JLabel detailsJLabel;
    private javax.swing.JLabel errorJLabel;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JLabel formulaPicJLabel;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JPanel inputJPanel;
    private javax.swing.JLabel interestJLabel;
    private javax.swing.JSpinner interestJSpinner;
    private javax.swing.JLabel interestTotalJLabel;
    private javax.swing.JTextField interestTotalJTextField;
    private javax.swing.JLabel logoJLabel;
    private javax.swing.JPanel outputJPanel;
    private javax.swing.JLabel paymentJLabel;
    private javax.swing.JTextField paymentJTextField;
    private javax.swing.JLabel paymentTotalJLabel;
    private javax.swing.JTextField paymentTotalJTextField;
    private javax.swing.JButton printJButton;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JButton quitJButton;
    private javax.swing.JMenuItem quitJMenuItem;
    private javax.swing.JDialog settingsJDialog;
    private javax.swing.JLabel settingsJLabel;
    private javax.swing.JMenuItem settingsJMenuItem;
    private javax.swing.JLabel yearsJLabel;
    private javax.swing.JTextField yearsJTextField;
    // End of variables declaration//GEN-END:variables
}
