/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import models.AuthenticatedUser;
import staticfiles.CalendarFormat;
import staticfiles.ColorScheme;

/**
 *
 * @author tron
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setComponents();
        setColorScheme();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoPanel = new javax.swing.JPanel();
        lblWelcomeUser = new javax.swing.JLabel();
        btnLogoff = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        mainMenuPanelBtn = new javax.swing.JPanel();
        txtMainMenu = new javax.swing.JLabel();
        currentMonthPanelBtn = new javax.swing.JPanel();
        txtCurrentMonth = new javax.swing.JLabel();
        pastMonthPanelBtn = new javax.swing.JPanel();
        txtPastMonth = new javax.swing.JLabel();
        analyticsPanelBtn = new javax.swing.JPanel();
        txtAnalytics = new javax.swing.JLabel();
        modifyExpensesPanelBtn = new javax.swing.JPanel();
        txtModifyExpenses = new javax.swing.JLabel();
        userProfilePanelBtn = new javax.swing.JPanel();
        txtuserProfile = new javax.swing.JLabel();
        settingsPanelBtn = new javax.swing.JPanel();
        txtSettings = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        mmPanel = new javax.swing.JPanel();
        mmHeaderPanel = new javax.swing.JPanel();
        lblCurrentDate = new javax.swing.JLabel();
        lblTotalBills = new javax.swing.JLabel();
        lblTotalBills1 = new javax.swing.JLabel();
        lblTotalBills2 = new javax.swing.JLabel();
        lblTotalBills3 = new javax.swing.JLabel();
        modifyExpensesPanel = new javax.swing.JPanel();
        modifyExpensesPanel1 = new panels.modifyExpensesPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1210, 670));
        setMinimumSize(new java.awt.Dimension(1210, 670));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1210, 670));

        infoPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblWelcomeUser.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblWelcomeUser.setText("Welcome, User!!");

        btnLogoff.setBackground(new java.awt.Color(255, 51, 51));
        btnLogoff.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLogoff.setForeground(new java.awt.Color(0, 255, 0));
        btnLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetts/icons/icons8-exit-40.png"))); // NOI18N
        btnLogoff.setText("Logoff");
        btnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(btnLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(btnLogoff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(lblWelcomeUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(51, 51, 255));

        mainMenuPanelBtn.setBackground(new java.awt.Color(102, 102, 255));
        mainMenuPanelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainMenuPanelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainMenuPanelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainMenuPanelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainMenuPanelBtnMouseExited(evt);
            }
        });

        txtMainMenu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        txtMainMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetts/icons/icons8-home-40.png"))); // NOI18N
        txtMainMenu.setText("Main Menu");

        javax.swing.GroupLayout mainMenuPanelBtnLayout = new javax.swing.GroupLayout(mainMenuPanelBtn);
        mainMenuPanelBtn.setLayout(mainMenuPanelBtnLayout);
        mainMenuPanelBtnLayout.setHorizontalGroup(
            mainMenuPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPanelBtnLayout.createSequentialGroup()
                .addComponent(txtMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuPanelBtnLayout.setVerticalGroup(
            mainMenuPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        currentMonthPanelBtn.setBackground(new java.awt.Color(102, 102, 255));
        currentMonthPanelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        currentMonthPanelBtn.setPreferredSize(new java.awt.Dimension(230, 50));
        currentMonthPanelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentMonthPanelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentMonthPanelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentMonthPanelBtnMouseExited(evt);
            }
        });

        txtCurrentMonth.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtCurrentMonth.setForeground(new java.awt.Color(255, 255, 255));
        txtCurrentMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCurrentMonth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetts/icons/icons8-cashbook-40.png"))); // NOI18N
        txtCurrentMonth.setText("Current Month");
        txtCurrentMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout currentMonthPanelBtnLayout = new javax.swing.GroupLayout(currentMonthPanelBtn);
        currentMonthPanelBtn.setLayout(currentMonthPanelBtnLayout);
        currentMonthPanelBtnLayout.setHorizontalGroup(
            currentMonthPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCurrentMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        currentMonthPanelBtnLayout.setVerticalGroup(
            currentMonthPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCurrentMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pastMonthPanelBtn.setBackground(new java.awt.Color(102, 102, 255));
        pastMonthPanelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pastMonthPanelBtn.setPreferredSize(new java.awt.Dimension(230, 50));
        pastMonthPanelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pastMonthPanelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pastMonthPanelBtnMouseExited(evt);
            }
        });

        txtPastMonth.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtPastMonth.setForeground(new java.awt.Color(255, 255, 255));
        txtPastMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPastMonth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetts/icons/icons8-time-machine-40.png"))); // NOI18N
        txtPastMonth.setText("Past Month");

        javax.swing.GroupLayout pastMonthPanelBtnLayout = new javax.swing.GroupLayout(pastMonthPanelBtn);
        pastMonthPanelBtn.setLayout(pastMonthPanelBtnLayout);
        pastMonthPanelBtnLayout.setHorizontalGroup(
            pastMonthPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPastMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pastMonthPanelBtnLayout.setVerticalGroup(
            pastMonthPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPastMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        analyticsPanelBtn.setBackground(new java.awt.Color(102, 102, 255));
        analyticsPanelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        analyticsPanelBtn.setPreferredSize(new java.awt.Dimension(230, 50));
        analyticsPanelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                analyticsPanelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                analyticsPanelBtnMouseExited(evt);
            }
        });

        txtAnalytics.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtAnalytics.setForeground(new java.awt.Color(255, 255, 255));
        txtAnalytics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAnalytics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetts/icons/icons8-combo-chart-40.png"))); // NOI18N
        txtAnalytics.setText("Analytics");

        javax.swing.GroupLayout analyticsPanelBtnLayout = new javax.swing.GroupLayout(analyticsPanelBtn);
        analyticsPanelBtn.setLayout(analyticsPanelBtnLayout);
        analyticsPanelBtnLayout.setHorizontalGroup(
            analyticsPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAnalytics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        analyticsPanelBtnLayout.setVerticalGroup(
            analyticsPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        modifyExpensesPanelBtn.setBackground(new java.awt.Color(102, 102, 255));
        modifyExpensesPanelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyExpensesPanelBtn.setPreferredSize(new java.awt.Dimension(230, 50));
        modifyExpensesPanelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyExpensesPanelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifyExpensesPanelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifyExpensesPanelBtnMouseExited(evt);
            }
        });

        txtModifyExpenses.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        txtModifyExpenses.setForeground(new java.awt.Color(255, 255, 255));
        txtModifyExpenses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModifyExpenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetts/icons/icons8-transaction-list-40(1).png"))); // NOI18N
        txtModifyExpenses.setText("Modify Expenses");
        txtModifyExpenses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout modifyExpensesPanelBtnLayout = new javax.swing.GroupLayout(modifyExpensesPanelBtn);
        modifyExpensesPanelBtn.setLayout(modifyExpensesPanelBtnLayout);
        modifyExpensesPanelBtnLayout.setHorizontalGroup(
            modifyExpensesPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModifyExpenses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        modifyExpensesPanelBtnLayout.setVerticalGroup(
            modifyExpensesPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModifyExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        userProfilePanelBtn.setBackground(new java.awt.Color(102, 102, 255));
        userProfilePanelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userProfilePanelBtn.setPreferredSize(new java.awt.Dimension(230, 50));
        userProfilePanelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userProfilePanelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userProfilePanelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userProfilePanelBtnMouseExited(evt);
            }
        });

        txtuserProfile.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtuserProfile.setForeground(new java.awt.Color(255, 255, 255));
        txtuserProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtuserProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetts/icons/icons8-account-40.png"))); // NOI18N
        txtuserProfile.setText("User Profile");

        javax.swing.GroupLayout userProfilePanelBtnLayout = new javax.swing.GroupLayout(userProfilePanelBtn);
        userProfilePanelBtn.setLayout(userProfilePanelBtnLayout);
        userProfilePanelBtnLayout.setHorizontalGroup(
            userProfilePanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtuserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        userProfilePanelBtnLayout.setVerticalGroup(
            userProfilePanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtuserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        settingsPanelBtn.setBackground(new java.awt.Color(102, 102, 255));
        settingsPanelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsPanelBtn.setPreferredSize(new java.awt.Dimension(230, 50));
        settingsPanelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsPanelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsPanelBtnMouseExited(evt);
            }
        });

        txtSettings.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtSettings.setForeground(new java.awt.Color(255, 255, 255));
        txtSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetts/icons/icons8-settings-40.png"))); // NOI18N
        txtSettings.setText("Settings");

        javax.swing.GroupLayout settingsPanelBtnLayout = new javax.swing.GroupLayout(settingsPanelBtn);
        settingsPanelBtn.setLayout(settingsPanelBtnLayout);
        settingsPanelBtnLayout.setHorizontalGroup(
            settingsPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        settingsPanelBtnLayout.setVerticalGroup(
            settingsPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentMonthPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addComponent(pastMonthPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addComponent(mainMenuPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(analyticsPanelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addComponent(modifyExpensesPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addComponent(userProfilePanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addComponent(settingsPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(mainMenuPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentMonthPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pastMonthPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(analyticsPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyExpensesPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userProfilePanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(settingsPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.setBackground(new java.awt.Color(153, 255, 255));
        mainPanel.setMinimumSize(new java.awt.Dimension(978, 570));
        mainPanel.setPreferredSize(new java.awt.Dimension(978, 570));
        mainPanel.setLayout(new java.awt.CardLayout());

        mmPanel.setBackground(new java.awt.Color(153, 153, 153));
        mmPanel.setLayout(null);

        lblCurrentDate.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblCurrentDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrentDate.setText("January 01, 2020");

        javax.swing.GroupLayout mmHeaderPanelLayout = new javax.swing.GroupLayout(mmHeaderPanel);
        mmHeaderPanel.setLayout(mmHeaderPanelLayout);
        mmHeaderPanelLayout.setHorizontalGroup(
            mmHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mmHeaderPanelLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        mmHeaderPanelLayout.setVerticalGroup(
            mmHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mmHeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurrentDate, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        mmPanel.add(mmHeaderPanel);
        mmHeaderPanel.setBounds(0, 0, 990, 110);

        lblTotalBills.setFont(new java.awt.Font("Ebrima", 1, 30)); // NOI18N
        lblTotalBills.setText("Paid:");
        mmPanel.add(lblTotalBills);
        lblTotalBills.setBounds(710, 240, 80, 60);

        lblTotalBills1.setFont(new java.awt.Font("Ebrima", 1, 30)); // NOI18N
        lblTotalBills1.setText("Total Bills for the Month:");
        mmPanel.add(lblTotalBills1);
        lblTotalBills1.setBounds(270, 170, 360, 60);

        lblTotalBills2.setFont(new java.awt.Font("Ebrima", 1, 30)); // NOI18N
        lblTotalBills2.setText("Paid:");
        mmPanel.add(lblTotalBills2);
        lblTotalBills2.setBounds(70, 240, 80, 60);

        lblTotalBills3.setFont(new java.awt.Font("Ebrima", 1, 30)); // NOI18N
        lblTotalBills3.setText("Paid:");
        mmPanel.add(lblTotalBills3);
        lblTotalBills3.setBounds(340, 240, 80, 60);

        mainPanel.add(mmPanel, "mainMenuPanel");

        modifyExpensesPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout modifyExpensesPanelLayout = new javax.swing.GroupLayout(modifyExpensesPanel);
        modifyExpensesPanel.setLayout(modifyExpensesPanelLayout);
        modifyExpensesPanelLayout.setHorizontalGroup(
            modifyExpensesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyExpensesPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modifyExpensesPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        modifyExpensesPanelLayout.setVerticalGroup(
            modifyExpensesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyExpensesPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modifyExpensesPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(modifyExpensesPanel, "modifyExpenses");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_btnLogoffActionPerformed

    private void mainMenuPanelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuPanelBtnMouseEntered
        mainMenuPanelBtn.setBackground(ColorScheme.secondaryColor);
    }//GEN-LAST:event_mainMenuPanelBtnMouseEntered

    private void mainMenuPanelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuPanelBtnMouseExited
        mainMenuPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
    }//GEN-LAST:event_mainMenuPanelBtnMouseExited

    private void currentMonthPanelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentMonthPanelBtnMouseEntered
        currentMonthPanelBtn.setBackground(ColorScheme.secondaryColor);
    }//GEN-LAST:event_currentMonthPanelBtnMouseEntered

    private void currentMonthPanelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentMonthPanelBtnMouseExited
        currentMonthPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
    }//GEN-LAST:event_currentMonthPanelBtnMouseExited

    private void pastMonthPanelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastMonthPanelBtnMouseEntered
        pastMonthPanelBtn.setBackground(ColorScheme.secondaryColor);
    }//GEN-LAST:event_pastMonthPanelBtnMouseEntered

    private void pastMonthPanelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastMonthPanelBtnMouseExited
        pastMonthPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
    }//GEN-LAST:event_pastMonthPanelBtnMouseExited

    private void analyticsPanelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analyticsPanelBtnMouseEntered
        analyticsPanelBtn.setBackground(ColorScheme.secondaryColor);
    }//GEN-LAST:event_analyticsPanelBtnMouseEntered

    private void analyticsPanelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analyticsPanelBtnMouseExited
        analyticsPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
    }//GEN-LAST:event_analyticsPanelBtnMouseExited

    private void modifyExpensesPanelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyExpensesPanelBtnMouseEntered
        modifyExpensesPanelBtn.setBackground(ColorScheme.secondaryColor);
    }//GEN-LAST:event_modifyExpensesPanelBtnMouseEntered

    private void modifyExpensesPanelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyExpensesPanelBtnMouseExited
        modifyExpensesPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
    }//GEN-LAST:event_modifyExpensesPanelBtnMouseExited

    private void userProfilePanelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userProfilePanelBtnMouseClicked
        //userProfilePanelBtn.setBackground(ColorScheme.secondaryColor);
    }//GEN-LAST:event_userProfilePanelBtnMouseClicked

    private void userProfilePanelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userProfilePanelBtnMouseExited
        userProfilePanelBtn.setBackground(ColorScheme.primaryHighlightColor);
    }//GEN-LAST:event_userProfilePanelBtnMouseExited

    private void userProfilePanelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userProfilePanelBtnMouseEntered
        userProfilePanelBtn.setBackground(ColorScheme.secondaryColor);
    }//GEN-LAST:event_userProfilePanelBtnMouseEntered

    private void settingsPanelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPanelBtnMouseEntered
        settingsPanelBtn.setBackground(ColorScheme.secondaryColor);
    }//GEN-LAST:event_settingsPanelBtnMouseEntered

    private void settingsPanelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPanelBtnMouseExited
        settingsPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
    }//GEN-LAST:event_settingsPanelBtnMouseExited

    private void mainMenuPanelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuPanelBtnMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "mainMenuPanel");
    }//GEN-LAST:event_mainMenuPanelBtnMouseClicked

    private void currentMonthPanelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentMonthPanelBtnMouseClicked
        /*CardLayout card = (CardLayout)currentMonthPanel.getLayout();
        card.show(currentMonthPanel, "currentMonthPanel");*/
    }//GEN-LAST:event_currentMonthPanelBtnMouseClicked

    private void modifyExpensesPanelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyExpensesPanelBtnMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "modifyExpenses");
    }//GEN-LAST:event_modifyExpensesPanelBtnMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    public void setColorScheme(){
        menuPanel.setBackground(ColorScheme.primaryColor);
        infoPanel.setBackground(ColorScheme.secondaryColor);
        
        mainMenuPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
        currentMonthPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
        pastMonthPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
        analyticsPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
        modifyExpensesPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
        userProfilePanelBtn.setBackground(ColorScheme.primaryHighlightColor);
        settingsPanelBtn.setBackground(ColorScheme.primaryHighlightColor);
        
        lblWelcomeUser.setForeground(ColorScheme.quaternaryColor);
        
        btnLogoff.setBackground(ColorScheme.primaryColor);
        btnLogoff.setForeground(ColorScheme.quaternaryColor);
        
        //mmPanel
        mmPanel.setBackground(ColorScheme.quaternaryColor);
        mmHeaderPanel.setBackground(ColorScheme.tertiaryColor);
        lblCurrentDate.setForeground(ColorScheme.quaternaryColor);
    }
    
    public void setComponents(){
        CalendarFormat cf = new CalendarFormat();
        
        lblWelcomeUser.setText("Welcome " + AuthenticatedUser.userName + "!");
        lblCurrentDate.setText(cf.GetCurrentDate());
        //lblCurrentMonth.setText(now.get(Calendar.DATE));
        //lblCurrentMonth.setText(now.get(Calendar.YEAR));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel analyticsPanelBtn;
    private javax.swing.JButton btnLogoff;
    private javax.swing.JPanel currentMonthPanelBtn;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel lblCurrentDate;
    private javax.swing.JLabel lblTotalBills;
    private javax.swing.JLabel lblTotalBills1;
    private javax.swing.JLabel lblTotalBills2;
    private javax.swing.JLabel lblTotalBills3;
    private javax.swing.JLabel lblWelcomeUser;
    private javax.swing.JPanel mainMenuPanelBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel mmHeaderPanel;
    private javax.swing.JPanel mmPanel;
    private javax.swing.JPanel modifyExpensesPanel;
    private panels.modifyExpensesPanel modifyExpensesPanel1;
    private javax.swing.JPanel modifyExpensesPanelBtn;
    private javax.swing.JPanel pastMonthPanelBtn;
    private javax.swing.JPanel settingsPanelBtn;
    private javax.swing.JLabel txtAnalytics;
    private javax.swing.JLabel txtCurrentMonth;
    private javax.swing.JLabel txtMainMenu;
    private javax.swing.JLabel txtModifyExpenses;
    private javax.swing.JLabel txtPastMonth;
    private javax.swing.JLabel txtSettings;
    private javax.swing.JLabel txtuserProfile;
    private javax.swing.JPanel userProfilePanelBtn;
    // End of variables declaration//GEN-END:variables
}
