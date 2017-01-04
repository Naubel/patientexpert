
package gui;

import db.BCrypt;
import db.Login;
import db.Updater;
import export.Excel;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.DateFormatter;
import javax.swing.text.MaskFormatter;
import utils.ConsultationCellRenderer;
import utils.IntegerEditor;
import utils.NoteRenderer;
import utils.PatientCellRenderer;
import utils.SpecialistCellRenderer;
import utils.TaskCellRenderer;
import utils.TaskRenderer;

public class PatientExpert extends javax.swing.JFrame 
{
    public static String loggedInUser;
    public PatientExpert() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        patientexpertPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("patientexpertPU").createEntityManager();
        patientsQuery = java.beans.Beans.isDesignTime() ? null : patientexpertPUEntityManager.createQuery("SELECT p FROM Patients p");
        patientsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(patientsQuery.getResultList());
        consultationsQuery = java.beans.Beans.isDesignTime() ? null : patientexpertPUEntityManager.createQuery("SELECT c FROM Consultations c");
        consultationsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(new java.util.LinkedList(consultationsQuery.getResultList()));
        editPatientFrame = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        editPatientFnameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        editPatientLnameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        editPatientAgeField = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        editPatientCityField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        editPatientAddressField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        editPatientZIPField = new javax.swing.JFormattedTextField();
        jPanel10 = new javax.swing.JPanel();
        updatePersonalButton = new javax.swing.JButton();
        cancelPersonalButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        editPatientEmailField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        editPatientPhoneField = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        idLabelPersonalTab = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        updateMedicalButton = new javax.swing.JButton();
        cancelMedicalButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        editPatientConditionField = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        editPatientPerscriptionField = new javax.swing.JTextField();
        editPatientPerscriptionRate = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        editPatientDiagnosisField = new javax.swing.JTextField();
        addPatientFrame = new javax.swing.JDialog();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        addPatientFnameField2 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        addPatientLnameField2 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        addPatientAgeField2 = new javax.swing.JFormattedTextField();
        jLabel41 = new javax.swing.JLabel();
        addPatientCityField2 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        addPatientAddressField2 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        addPatientZIPField2 = new javax.swing.JFormattedTextField();
        jPanel23 = new javax.swing.JPanel();
        savePersonalButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        addPatientEmailField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        addPatientPhoneField = new javax.swing.JFormattedTextField();
        patientHistoryFrame = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        diagnosisField = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        patientHistoryTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        historyStatisticsTable = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        addConsultationFrame = new javax.swing.JDialog();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel25 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        saveConsultationButton = new javax.swing.JButton();
        consultationPatientBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        consultationConditionBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        consultationPerscriptionField = new javax.swing.JTextField();
        consultationRateBox = new javax.swing.JComboBox<>();
        consultationDiagnosisField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        consultationDateField = new javax.swing.JFormattedTextField();
        patientsQuery1 = java.beans.Beans.isDesignTime() ? null : patientexpertPUEntityManager.createQuery("SELECT p FROM Patients p");
        patientsList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : patientsQuery1.getResultList();
        patientsQuery2 = java.beans.Beans.isDesignTime() ? null : patientexpertPUEntityManager.createQuery("SELECT p FROM Patients p ORDER BY p");
        patientsList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : patientsQuery2.getResultList();
        consultationsQuery1 = java.beans.Beans.isDesignTime() ? null : patientexpertPUEntityManager.createQuery("SELECT c FROM Consultations c");
        consultationsList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(consultationsQuery1.getResultList());
        specialistsQuery = java.beans.Beans.isDesignTime() ? null : patientexpertPUEntityManager.createQuery("SELECT s FROM Specialists s");
        specialistsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(specialistsQuery.getResultList());
        addSpecialistFrame = new javax.swing.JDialog();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel27 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        saveSpecialistButton = new javax.swing.JButton();
        specialistFnameField = new javax.swing.JTextField();
        specialistLnameField = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        specialistProfessionField = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        specialistCityField = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        specialistEmailField = new javax.swing.JTextField();
        specialistZIPField = new javax.swing.JFormattedTextField();
        specialistPhoneField = new javax.swing.JFormattedTextField();
        tasksQuery = java.beans.Beans.isDesignTime() ? null : patientexpertPUEntityManager.createQuery("SELECT t FROM Tasks t");
        tasksList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(tasksQuery.getResultList());
        addTaskFrame = new javax.swing.JDialog();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel30 = new javax.swing.JPanel();
        saveTaskButton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        taskCategoryBox = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        taskDueDateField = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        taskDueTimeField = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        taskStatusField = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        taskMessageField = new javax.swing.JTextField();
        notesQuery = java.beans.Beans.isDesignTime() ? null : patientexpertPUEntityManager.createQuery("SELECT n FROM Notes n");
        notesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(notesQuery.getResultList());
        addNoteFrame = new javax.swing.JDialog();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel31 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel56 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        saveNoteButton = new javax.swing.JButton();
        noteTitleField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        noteMessageField = new javax.swing.JTextArea();
        exportFrame = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        exportSaveButton = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        exportTableNameField = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        exportDirSelectButton = new javax.swing.JButton();
        exportDirField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        exportFileNameField = new javax.swing.JTextField();
        manualFrame = new javax.swing.JDialog();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel35 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        loginFrame = new javax.swing.JDialog();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        printFrame = new javax.swing.JDialog();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jPanel34 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        printBox = new javax.swing.JComboBox<>();
        jPanel33 = new javax.swing.JPanel();
        printTableButton = new javax.swing.JButton();
        aboutFrame = new javax.swing.JDialog();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        patientsQuery3 = java.beans.Beans.isDesignTime() ? null : patientexpertPUEntityManager.createQuery("SELECT p FROM Patients p");
        patientsList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : patientsQuery3.getResultList();
        jPanel1 = new javax.swing.JPanel();
        addPatientButtonStart = new javax.swing.JButton();
        addConsultationButton = new javax.swing.JButton();
        addTaskButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        excelExportButton = new javax.swing.JButton();
        addNote = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        addPatientTabButton = new javax.swing.JButton();
        showHistoryButton = new javax.swing.JButton();
        searchPatientField = new javax.swing.JTextField();
        emailPatientButton = new javax.swing.JButton();
        deletePatientButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        consultationTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        addConsultationTabButton = new javax.swing.JButton();
        searchConsultationField = new javax.swing.JTextField();
        deleteConsultationButton = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        addSpecialistButton = new javax.swing.JButton();
        searchSpecialistField = new javax.swing.JTextField();
        deleteSpecialistButton = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        specialistTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        addTaskTabButton = new javax.swing.JButton();
        searchTaskField = new javax.swing.JTextField();
        deleteTaskButton = new javax.swing.JButton();
        taskScrollPane = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        addNoteButton = new javax.swing.JButton();
        searchNotesField = new javax.swing.JTextField();
        deleteNoteButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        notesField = new javax.swing.JTextArea();
        noteScroll = new javax.swing.JScrollPane();
        noteTable = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        dbItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        manualItem = new javax.swing.JMenuItem();
        aboutItem = new javax.swing.JMenuItem();

        editPatientFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        editPatientFrame.setTitle("Edit Patient");
        editPatientFrame.setMinimumSize(new java.awt.Dimension(360, 485));
        editPatientFrame.setResizable(false);

        jTabbedPane2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setText("Personal Information");

        jLabel2.setText("First name:");

        jLabel3.setText("Last name:");

        jLabel4.setText("Age:");

        editPatientAgeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jLabel5.setText("City:");

        jLabel6.setText("Address:");

        jLabel7.setText("ZIP:");

        try {
            editPatientZIPField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        updatePersonalButton.setText("Save");

        cancelPersonalButton.setText("Cancel");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelPersonalButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updatePersonalButton)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePersonalButton)
                    .addComponent(cancelPersonalButton))
                .addContainerGap())
        );

        jLabel8.setText("Email:");

        jLabel10.setText("Phone:");

        editPatientPhoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel12.setText("ID:");

        idLabelPersonalTab.setText("jLabel13");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editPatientFnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(idLabelPersonalTab))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editPatientLnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editPatientAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editPatientCityField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editPatientZIPField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editPatientEmailField)
                            .addComponent(editPatientAddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(editPatientPhoneField))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12)
                    .addComponent(idLabelPersonalTab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(editPatientFnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(editPatientLnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(editPatientAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(editPatientCityField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(editPatientAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPatientZIPField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPatientEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPatientPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Personal", jPanel8);

        jLabel9.setText("Medical Information");

        updateMedicalButton.setText("Save");

        cancelMedicalButton.setText("Cancel");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelMedicalButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(updateMedicalButton)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateMedicalButton)
                    .addComponent(cancelMedicalButton))
                .addContainerGap())
        );

        jLabel17.setText("Condition:");

        editPatientConditionField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setText("Perscription:");

        editPatientPerscriptionRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Diagnosis:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel11))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editPatientDiagnosisField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editPatientConditionField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editPatientPerscriptionField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editPatientPerscriptionRate, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(editPatientConditionField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPatientPerscriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editPatientPerscriptionRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPatientDiagnosisField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Medical", jPanel9);

        javax.swing.GroupLayout editPatientFrameLayout = new javax.swing.GroupLayout(editPatientFrame.getContentPane());
        editPatientFrame.getContentPane().setLayout(editPatientFrameLayout);
        editPatientFrameLayout.setHorizontalGroup(
            editPatientFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        editPatientFrameLayout.setVerticalGroup(
            editPatientFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        addPatientFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addPatientFrame.setTitle("Add Patient");
        addPatientFrame.setMinimumSize(new java.awt.Dimension(360, 460));
        addPatientFrame.setPreferredSize(new java.awt.Dimension(360, 460));
        addPatientFrame.setResizable(false);

        jTabbedPane3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel37.setText("Personal Information");

        jLabel38.setText("First name:");

        jLabel39.setText("Last name:");

        jLabel40.setText("Age:");

        try {
            addPatientAgeField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel41.setText("City:");

        jLabel42.setText("Address:");

        jLabel43.setText("ZIP:");

        try {
            addPatientZIPField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        savePersonalButton2.setText("Save");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(savePersonalButton2)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(savePersonalButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setText("Email:");

        addPatientEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientEmailFieldActionPerformed(evt);
            }
        });

        jLabel23.setText("Phone:");

        addPatientPhoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPatientFnameField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPatientLnameField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPatientAgeField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPatientCityField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPatientZIPField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addPatientEmailField)
                            .addComponent(addPatientAddressField2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(addPatientPhoneField))))
                .addContainerGap())
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(addPatientFnameField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(addPatientLnameField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(addPatientAgeField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(addPatientCityField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(addPatientAddressField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPatientZIPField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPatientEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(12, 12, 12)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPatientPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(0, 0, 0)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jTabbedPane3.addTab("Personal", jPanel24);

        javax.swing.GroupLayout addPatientFrameLayout = new javax.swing.GroupLayout(addPatientFrame.getContentPane());
        addPatientFrame.getContentPane().setLayout(addPatientFrameLayout);
        addPatientFrameLayout.setHorizontalGroup(
            addPatientFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        addPatientFrameLayout.setVerticalGroup(
            addPatientFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        patientHistoryFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        patientHistoryFrame.setMinimumSize(new java.awt.Dimension(562, 520));
        patientHistoryFrame.setResizable(false);

        diagnosisField.setColumns(20);
        diagnosisField.setRows(5);
        jScrollPane3.setViewportView(diagnosisField);

        jLabel24.setText("Diagnosis");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 572, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        patientHistoryTable.setAutoCreateRowSorter(true);
        patientHistoryTable.setGridColor(new java.awt.Color(229, 229, 229));
        patientHistoryTable.setRowHeight(25);
        patientHistoryTable.setSelectionBackground(new java.awt.Color(132, 194, 255));
        patientHistoryTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, consultationsList, patientHistoryTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fname}"));
        columnBinding.setColumnName("First Name");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lname}"));
        columnBinding.setColumnName("Last Name");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${condition}"));
        columnBinding.setColumnName("Condition");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${diagnosis}"));
        columnBinding.setColumnName("Diagnosis");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${perscription}"));
        columnBinding.setColumnName("Perscription");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane4.setViewportView(patientHistoryTable);
        if (patientHistoryTable.getColumnModel().getColumnCount() > 0) {
            patientHistoryTable.getColumnModel().getColumn(0).setMinWidth(20);
            patientHistoryTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            patientHistoryTable.getColumnModel().getColumn(0).setMaxWidth(20);
            patientHistoryTable.getColumnModel().getColumn(3).setMinWidth(60);
            patientHistoryTable.getColumnModel().getColumn(3).setPreferredWidth(60);
            patientHistoryTable.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        historyStatisticsTable.setAutoCreateRowSorter(true);
        historyStatisticsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Consultations"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historyStatisticsTable.setGridColor(new java.awt.Color(229, 229, 229));
        historyStatisticsTable.setRowHeight(25);
        historyStatisticsTable.setSelectionBackground(new java.awt.Color(132, 194, 255));
        jScrollPane5.setViewportView(historyStatisticsTable);

        jLabel29.setText("Statistics");

        javax.swing.GroupLayout patientHistoryFrameLayout = new javax.swing.GroupLayout(patientHistoryFrame.getContentPane());
        patientHistoryFrame.getContentPane().setLayout(patientHistoryFrameLayout);
        patientHistoryFrameLayout.setHorizontalGroup(
            patientHistoryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(patientHistoryFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientHistoryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(patientHistoryFrameLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        patientHistoryFrameLayout.setVerticalGroup(
            patientHistoryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientHistoryFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        addConsultationFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addConsultationFrame.setTitle("Add Consultation");
        addConsultationFrame.setMinimumSize(new java.awt.Dimension(360, 420));
        addConsultationFrame.setResizable(false);

        jTabbedPane4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel44.setText("Medical Information");

        jLabel45.setText("Patient:");

        saveConsultationButton.setText("Save");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(saveConsultationButton)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(saveConsultationButton)
                .addContainerGap())
        );

        consultationPatientBox.setMinimumSize(new java.awt.Dimension(63, 28));
        consultationPatientBox.setPreferredSize(new java.awt.Dimension(63, 28));

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, patientsList2, consultationPatientBox);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabel13.setText("Condition:");

        consultationConditionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excellent", "Good", "Acceptable", "Poor", "Critical"}));
        consultationConditionBox.setMinimumSize(new java.awt.Dimension(63, 28));
        consultationConditionBox.setPreferredSize(new java.awt.Dimension(63, 28));

        jLabel14.setText("Perscription:");

        consultationRateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Daily", "Weekly", "Monthly"}));
        consultationRateBox.setMinimumSize(new java.awt.Dimension(63, 28));
        consultationRateBox.setPreferredSize(new java.awt.Dimension(63, 28));

        jLabel15.setText("Diagnosis:");

        jLabel16.setText("Date:");

        consultationDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yy"))));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consultationPatientBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel44)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(consultationDateField)
                            .addComponent(consultationDiagnosisField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(consultationRateBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 150, Short.MAX_VALUE)
                            .addComponent(consultationPerscriptionField)
                            .addComponent(consultationConditionBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultationPatientBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultationConditionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(consultationPerscriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(consultationRateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultationDiagnosisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(consultationDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane4.addTab("Consultation", jPanel25);

        javax.swing.GroupLayout addConsultationFrameLayout = new javax.swing.GroupLayout(addConsultationFrame.getContentPane());
        addConsultationFrame.getContentPane().setLayout(addConsultationFrameLayout);
        addConsultationFrameLayout.setHorizontalGroup(
            addConsultationFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        addConsultationFrameLayout.setVerticalGroup(
            addConsultationFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        addSpecialistFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addSpecialistFrame.setTitle("Add Specialist");
        addSpecialistFrame.setMinimumSize(new java.awt.Dimension(360, 425));
        addSpecialistFrame.setResizable(false);

        jTabbedPane5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel46.setText("Specialist Information");

        jLabel47.setText("First Name:");

        saveSpecialistButton.setText("Save");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(saveSpecialistButton)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(saveSpecialistButton)
                .addContainerGap())
        );

        jLabel48.setText("Last Name:");

        jLabel49.setText("Profession:");

        jLabel50.setText("City:");

        jLabel51.setText("ZIP:");

        jLabel52.setText("Phone:");

        jLabel53.setText("Email:");

        specialistZIPField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
        specialistZIPField.setMinimumSize(new java.awt.Dimension(4, 28));
        specialistZIPField.setPreferredSize(new java.awt.Dimension(119, 28));

        specialistPhoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(specialistFnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(specialistLnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(specialistProfessionField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(specialistCityField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(specialistZIPField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(specialistPhoneField)
                            .addComponent(specialistEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialistFnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialistLnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialistProfessionField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialistCityField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(specialistZIPField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialistPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialistEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(12, 12, 12)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane5.addTab("Specialist", jPanel27);

        javax.swing.GroupLayout addSpecialistFrameLayout = new javax.swing.GroupLayout(addSpecialistFrame.getContentPane());
        addSpecialistFrame.getContentPane().setLayout(addSpecialistFrameLayout);
        addSpecialistFrameLayout.setHorizontalGroup(
            addSpecialistFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        addSpecialistFrameLayout.setVerticalGroup(
            addSpecialistFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        addTaskFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addTaskFrame.setTitle("Add Task");
        addTaskFrame.setMinimumSize(new java.awt.Dimension(360, 345));
        addTaskFrame.setResizable(false);

        jTabbedPane6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel54.setText("Task Information");

        saveTaskButton.setText("Save");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(saveTaskButton)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(saveTaskButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel26.setText("Category:");

        taskCategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal", "Work", "Patient", "Consultation", "Administrative" }));
        taskCategoryBox.setPreferredSize(new java.awt.Dimension(63, 28));

        jLabel27.setText("Due Date:");

        taskDueDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yy"))));

        jLabel28.setText("Due Time:");

        taskDueTimeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));

        jLabel30.setText("Status:");

        taskStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Not Done", "Done" }));

        jLabel31.setText("Message:");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taskMessageField)
                            .addComponent(taskStatusField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taskDueTimeField)
                            .addComponent(taskDueDateField)
                            .addComponent(taskCategoryBox, 0, 150, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskCategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskDueDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskDueTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskMessageField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane6.addTab("Task", jPanel29);

        javax.swing.GroupLayout addTaskFrameLayout = new javax.swing.GroupLayout(addTaskFrame.getContentPane());
        addTaskFrame.getContentPane().setLayout(addTaskFrameLayout);
        addTaskFrameLayout.setHorizontalGroup(
            addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );
        addTaskFrameLayout.setVerticalGroup(
            addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );

        addNoteFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addNoteFrame.setTitle("Add Note");
        addNoteFrame.setMinimumSize(new java.awt.Dimension(360, 320));
        addNoteFrame.setResizable(false);

        jTabbedPane7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel55.setText("Note Information");

        jLabel56.setText("Title:");

        saveNoteButton.setText("Save");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(saveNoteButton)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(saveNoteButton)
                .addContainerGap())
        );

        jLabel32.setText("Note:");

        noteMessageField.setColumns(20);
        noteMessageField.setRows(5);
        jScrollPane7.setViewportView(noteMessageField);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noteTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noteTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane7.addTab("Note", jPanel31);

        javax.swing.GroupLayout addNoteFrameLayout = new javax.swing.GroupLayout(addNoteFrame.getContentPane());
        addNoteFrame.getContentPane().setLayout(addNoteFrameLayout);
        addNoteFrameLayout.setHorizontalGroup(
            addNoteFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
        );
        addNoteFrameLayout.setVerticalGroup(
            addNoteFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
        );

        exportFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        exportFrame.setTitle("Export to Excel");
        exportFrame.setMinimumSize(new java.awt.Dimension(450, 270));
        exportFrame.setResizable(false);

        exportSaveButton.setText("Export");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addComponent(exportSaveButton)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(exportSaveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setText("Export to Excel");

        jLabel20.setText("Table:");

        exportTableNameField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Consultations", "Specialists", "Tasks", "Notes" }));

        jLabel21.setText("Directory:");

        exportDirSelectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file_chooser_icon.png"))); // NOI18N

        jLabel25.setText("File Name:");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exportFileNameField)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(exportDirField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exportDirSelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exportTableNameField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportTableNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(exportDirSelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportDirField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(exportFileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout exportFrameLayout = new javax.swing.GroupLayout(exportFrame.getContentPane());
        exportFrame.getContentPane().setLayout(exportFrameLayout);
        exportFrameLayout.setHorizontalGroup(
            exportFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        exportFrameLayout.setVerticalGroup(
            exportFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exportFrameLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        manualFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        manualFrame.setTitle("Manual");
        manualFrame.setMinimumSize(new java.awt.Dimension(565, 346));

        jLabel33.setText("Getting started");

        jTextPane1.setEditable(false);
        jTextPane1.setText("Add a patient\nAdding a new patient is simple. Simply click on the button with the green plus icon, and a new window should open. You will be asked to provide information such as first and last name, as well as city and ZIP code. \n\nAdd a consultation\nIn order to add a new consultation, simply click on the button with the blue information icon. Since a new consultation requires an existing patient, you will be asked to select the patient from the drop-down menu. In addition, information such as the perscription and physical state of the patient is also required.\n\nAdd a task\nKeeping track of a task can be tedious, but not anymore. The task manager allows you to add a task and keep track of your tasks in an organized fashion. It also allows you to sort through tasks, thus making it easier to organize and manage your tasks. In order to add a task, simply click on the button with the orange clock.\n\nAdd a note\nBesides being able to keep track of various tasks, simply taking notes and having them saved digitally can make a big difference. The notes manager allows you to do exactly that. Simply click on the button with the pen icon to add a note, and you will be asked to provide a title as well as message to add to your note.\n\nSearching\nPatient Expert allows you to search through each of your categories, namely patients, consultations, tasks as well as notes easily. By entering a search term, the specified table is sorted such as to meet your search criteria.\n\nPatient History\nKeeping track of your patients is a must, which led to the development of a section just for a patient's history. In order to view a patient's history, simply click on the button titled \"History\" in the patients section.\n\n");
        jScrollPane8.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(0, 452, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane8.addTab("Manual", jPanel18);

        jTextPane3.setEditable(false);
        jTextPane3.setText("Date fields\nAll text fields asking for a date are required to be entered in the format of \"12/12/16\", namely \"MM/dd/yy\".\n\nTime fields\nAll text fields asking for a time are to be entered in the format of \"11:23:00 PM\", etc. That is, the seconds are to be entered as well, or can be left at zero.\n\nZIP fields\nAll ZIP code text fields are only to be of length not greater than 5 characters, as usual, and require integer values.\n\nPhone fields\nAll phone number text fields are only to be of length not greater than 10 characters, and require integer values.\n\nUpdating tables\nUpon updating a table, make sure that all values are entered at their specified lengths, that is, a phone number cannot be greater than 10 characters, or a ZIP code longer than 5 characters, etc.\nEven though some values may be able to be updated, searching and sorting a table may not work out as desired.");
        jScrollPane11.setViewportView(jTextPane3);

        jLabel60.setText("Formatting text fields");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator13)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(0, 416, Short.MAX_VALUE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane8.addTab("Formatting", jPanel35);

        javax.swing.GroupLayout manualFrameLayout = new javax.swing.GroupLayout(manualFrame.getContentPane());
        manualFrame.getContentPane().setLayout(manualFrameLayout);
        manualFrameLayout.setHorizontalGroup(
            manualFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane8)
        );
        manualFrameLayout.setVerticalGroup(
            manualFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane8)
        );

        loginFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        loginFrame.setTitle("Patient Expert - Login");
        loginFrame.setMinimumSize(new java.awt.Dimension(400, 225));
        loginFrame.setResizable(false);

        jLabel34.setText("Username:");

        jLabel35.setText("Password:");

        loginButton.setText("Login");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel36.setText("Login");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(passwordField))))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane9.addTab("Login", jPanel19);

        javax.swing.GroupLayout loginFrameLayout = new javax.swing.GroupLayout(loginFrame.getContentPane());
        loginFrame.getContentPane().setLayout(loginFrameLayout);
        loginFrameLayout.setHorizontalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane9)
        );
        loginFrameLayout.setVerticalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane9)
        );

        printFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        printFrame.setTitle("Print");
        printFrame.setMinimumSize(new java.awt.Dimension(400, 200));

        jLabel57.setText("Print out a table");

        jLabel58.setText("Table:");

        printBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patients", "Consultations", "Specialists", "Tasks", "Notes" }));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator11)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(printBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane10.addTab("Print", jPanel34);

        printTableButton.setText("Print");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printTableButton)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printTableButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout printFrameLayout = new javax.swing.GroupLayout(printFrame.getContentPane());
        printFrame.getContentPane().setLayout(printFrameLayout);
        printFrameLayout.setHorizontalGroup(
            printFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane10)
        );
        printFrameLayout.setVerticalGroup(
            printFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printFrameLayout.createSequentialGroup()
                .addComponent(jTabbedPane10)
                .addGap(0, 0, 0)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        aboutFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        aboutFrame.setTitle("About");
        aboutFrame.setMinimumSize(new java.awt.Dimension(565, 346));

        jLabel59.setText("About Patient Expert");

        jTextPane2.setEditable(false);
        jTextPane2.setText("Background\nPatient Expert has been developed completely by Alexander Brunner, studying Computer Science at the University of La Verne, in La Verne, CA. \nThe project has been in development since October 2016, and has been officially been completed on December 10, 2016.\n\nPurpose\nThe purpose of this project is to make it easier for physicians to keep track of patients, consultations, specialists, their tasks and notes in an organized manner.\nSince there are so many ideas for applications, ranging from file compression, task managers, file managers, file duplicate finders, FTP clients and many more, I thought that\nPatient Expert, an application which would indefinitely improve the lives and daily routines of physicians, would make more sense, which then became my Senior Project.\n\nDesign\nThere are many ways to develop a user-friendly interface, but my main goal was to create an interface that's not too complicated at all. The color palette represents a typical\ndesktop application. I did, however, include icons I have designed using Adobe Photoshop CC 2015.\n\nDatabase\nFor the backend, the database is based on the Apache Derby client-network database.\n\nBugs\nIn case you find any unusual behavior or problems within the application, please feel free to email me at alexander.brunner@laverne.edu.\n\n\n\n\n");
        jScrollPane10.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator12)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(0, 420, Short.MAX_VALUE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane11.addTab("About", jPanel21);

        javax.swing.GroupLayout aboutFrameLayout = new javax.swing.GroupLayout(aboutFrame.getContentPane());
        aboutFrame.getContentPane().setLayout(aboutFrameLayout);
        aboutFrameLayout.setHorizontalGroup(
            aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane11)
        );
        aboutFrameLayout.setVerticalGroup(
            aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane11)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Expert");

        addPatientButtonStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/add_patient.png"))); // NOI18N

        addConsultationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/add_consultation.png"))); // NOI18N

        addTaskButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/add_task.png"))); // NOI18N

        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/print_image.png"))); // NOI18N
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        excelExportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/excel_icon.png"))); // NOI18N
        excelExportButton.setMaximumSize(new java.awt.Dimension(50, 33));
        excelExportButton.setMinimumSize(new java.awt.Dimension(50, 33));
        excelExportButton.setPreferredSize(new java.awt.Dimension(50, 33));

        addNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/add_note.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPatientButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addConsultationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addNote, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excelExportButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPatientButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addConsultationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(printButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excelExportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(598, 35));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        patientTable.setAutoCreateRowSorter(true);
        patientTable.setGridColor(new java.awt.Color(229, 229, 229));
        patientTable.setRowHeight(25);
        patientTable.setSelectionBackground(new java.awt.Color(132, 194, 255));
        patientTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, patientsList, patientTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fname}"));
        columnBinding.setColumnName("First Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lname}"));
        columnBinding.setColumnName("Last Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${age}"));
        columnBinding.setColumnName("Age");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${city}"));
        columnBinding.setColumnName("City");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${zip}"));
        columnBinding.setColumnName("ZIP");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(0).setMinWidth(20);
            patientTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            patientTable.getColumnModel().getColumn(0).setMaxWidth(20);
        }

        addPatientTabButton.setText("Add");

        showHistoryButton.setText("History");
        showHistoryButton.setEnabled(false);

        searchPatientField.setToolTipText("Search for a specific patient..");

        emailPatientButton.setText("Email");
        emailPatientButton.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addPatientTabButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showHistoryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailPatientButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchPatientField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addPatientTabButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(showHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(emailPatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(searchPatientField))
                .addGap(0, 0, 0))
        );

        deletePatientButton.setText("Delete");
        deletePatientButton.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deletePatientButton)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletePatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Patients", jPanel3);

        consultationTable.setAutoCreateRowSorter(true);
        consultationTable.setGridColor(new java.awt.Color(229, 229, 229));
        consultationTable.setRowHeight(25);
        consultationTable.setSelectionBackground(new java.awt.Color(132, 194, 255));
        consultationTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, consultationsList, consultationTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fname}"));
        columnBinding.setColumnName("First Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lname}"));
        columnBinding.setColumnName("Last Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${diagnosis}"));
        columnBinding.setColumnName("Diagnosis");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${condition}"));
        columnBinding.setColumnName("Condition");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${perscription}"));
        columnBinding.setColumnName("Perscription");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        consultationTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                consultationTablePropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(consultationTable);
        if (consultationTable.getColumnModel().getColumnCount() > 0) {
            consultationTable.getColumnModel().getColumn(0).setMinWidth(20);
            consultationTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            consultationTable.getColumnModel().getColumn(0).setMaxWidth(20);
            consultationTable.getColumnModel().getColumn(4).setMinWidth(60);
            consultationTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            consultationTable.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        addConsultationTabButton.setText("Add");

        searchConsultationField.setToolTipText("Search for a specific consultation..");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addConsultationTabButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchConsultationField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addConsultationTabButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(searchConsultationField))
                .addGap(0, 0, 0))
        );

        deleteConsultationButton.setText("Delete");
        deleteConsultationButton.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteConsultationButton)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteConsultationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("  Consultations   ", jPanel4);

        addSpecialistButton.setText("Add");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addSpecialistButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchSpecialistField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addSpecialistButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(searchSpecialistField))
                .addGap(0, 0, 0))
        );

        deleteSpecialistButton.setText("Delete");
        deleteSpecialistButton.setEnabled(false);

        specialistTable.setAutoCreateRowSorter(true);
        specialistTable.setGridColor(new java.awt.Color(229, 229, 229));
        specialistTable.setRowHeight(25);
        specialistTable.setSelectionBackground(new java.awt.Color(132, 194, 255));
        specialistTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, specialistsList, specialistTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fname}"));
        columnBinding.setColumnName("First Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lname}"));
        columnBinding.setColumnName("Last Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${field}"));
        columnBinding.setColumnName("Profession");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane9.setViewportView(specialistTable);
        if (specialistTable.getColumnModel().getColumnCount() > 0) {
            specialistTable.getColumnModel().getColumn(0).setMinWidth(20);
            specialistTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            specialistTable.getColumnModel().getColumn(0).setMaxWidth(20);
        }

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteSpecialistButton))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteSpecialistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Specialists", jPanel12);

        addTaskTabButton.setText("Add");

        searchTaskField.setToolTipText("Search for a specific task..");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addTaskTabButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchTaskField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addTaskTabButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(searchTaskField))
                .addGap(0, 0, 0))
        );

        deleteTaskButton.setText("Delete");
        deleteTaskButton.setEnabled(false);

        taskTable.setAutoCreateRowSorter(true);
        taskTable.setGridColor(new java.awt.Color(229, 229, 229));
        taskTable.setRowHeight(25);
        taskTable.setSelectionBackground(new java.awt.Color(132, 194, 255));
        taskTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tasksList, taskTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tstatus}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tname}"));
        columnBinding.setColumnName("Category");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tmessage}"));
        columnBinding.setColumnName("Message");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tduedate}"));
        columnBinding.setColumnName("Due on");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tduetime}"));
        columnBinding.setColumnName("Due at");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        taskScrollPane.setViewportView(taskTable);
        if (taskTable.getColumnModel().getColumnCount() > 0) {
            taskTable.getColumnModel().getColumn(0).setMinWidth(20);
            taskTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            taskTable.getColumnModel().getColumn(0).setMaxWidth(20);
            taskTable.getColumnModel().getColumn(1).setMinWidth(20);
            taskTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            taskTable.getColumnModel().getColumn(1).setMaxWidth(20);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteTaskButton))
                    .addComponent(taskScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(taskScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tasks", jPanel6);

        addNoteButton.setText("Add");

        searchNotesField.setToolTipText("Search for a specific note..");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addNoteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchNotesField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNoteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(searchNotesField))
                .addGap(0, 0, 0))
        );

        deleteNoteButton.setText("Delete");
        deleteNoteButton.setEnabled(false);

        notesField.setColumns(10);
        notesField.setLineWrap(true);
        notesField.setRows(20);
        notesField.setWrapStyleWord(true);
        jScrollPane6.setViewportView(notesField);

        noteTable.setAutoCreateRowSorter(true);
        noteTable.setGridColor(new java.awt.Color(229, 229, 229));
        noteTable.setRowHeight(25);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, notesList, noteTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nname}"));
        columnBinding.setColumnName("Title");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nmessage}"));
        columnBinding.setColumnName("Note");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ndate}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ntime}"));
        columnBinding.setColumnName("Time");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        noteScroll.setViewportView(noteTable);
        if (noteTable.getColumnModel().getColumnCount() > 0) {
            noteTable.getColumnModel().getColumn(0).setMinWidth(20);
            noteTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            noteTable.getColumnModel().getColumn(0).setMaxWidth(20);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteNoteButton))
                    .addComponent(noteScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(noteScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Notes", jPanel7);

        jMenu1.setText("New");

        dbItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        dbItem.setText("New Database");
        jMenu1.add(dbItem);

        menuBar.add(jMenu1);

        jMenu2.setText("Help");

        manualItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        manualItem.setText("Manual");
        jMenu2.add(manualItem);

        aboutItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aboutItem.setText("About");
        jMenu2.add(aboutItem);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printButtonActionPerformed

    private void consultationTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_consultationTablePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_consultationTablePropertyChange

    private void addPatientEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPatientEmailFieldActionPerformed

    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientExpert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                // Request login before anything is done
                final PatientExpert pe = new PatientExpert();
                loginFrame.setVisible(true);
                loginFrame.setAutoRequestFocus(true);
                loginFrame.setAlwaysOnTop(true); 

                usernameField.requestFocus();

                loginButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        String username = usernameField.getText();
                        String password = String.valueOf(passwordField.getPassword());
                        if (!usernameField.getText().isEmpty() && !String.valueOf(passwordField.getPassword()).isEmpty())
                        {
                            try {
                                if (Login.checkCredentials(username, password) == true)
                                {
                                    pe.setVisible(true);
                                    loginFrame.dispose();
                                    loggedInUser = username;
                                }

                            } catch (UnknownHostException | SQLException ex) {
                                Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Please fill out all fields.");
                        }

                    }
                    
                });

                // Enable Table renderers
                // Patient table
                patientTable.getColumnModel().getColumn(0).setCellRenderer(new PatientCellRenderer());
                patientTable.getColumnModel().getColumn(3).setCellEditor(new IntegerEditor(1,3));
                JFormattedTextField ftext8 = new JFormattedTextField();
                MaskFormatter mask8;
                try {
                    mask8 = new MaskFormatter("##########");
                    mask8.install(ftext8);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                JFormattedTextField ftext9 = new JFormattedTextField();
                MaskFormatter mask9;
                try {
                    mask9 = new MaskFormatter("#####");
                    mask9.install(ftext9);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                patientTable.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(ftext8));
                patientTable.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(ftext9));
                
                // Patient history table
                patientHistoryTable.getColumnModel().getColumn(0).setCellRenderer(new PatientCellRenderer());
                patientHistoryTable.getColumnModel().getColumn(3).setCellRenderer(new ConsultationCellRenderer());
                
                // Consultation table
                consultationTable.getColumnModel().getColumn(4).setCellRenderer(new ConsultationCellRenderer());
                consultationTable.getColumnModel().getColumn(0).setCellRenderer(new PatientCellRenderer());
                DateFormat df = new SimpleDateFormat("MM/dd/yy");
                DateFormatter dformat = new DateFormatter(df);
                JFormattedTextField ftext2 = new JFormattedTextField(dformat);
                MaskFormatter mask2;
                try {
                    mask2 = new MaskFormatter("##/##/##");
                    mask2.setValidCharacters("0123456789");
                    mask2.install(ftext2);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                consultationTable.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(ftext2));
                
                // Specialist table
                specialistTable.getColumnModel().getColumn(0).setCellRenderer(new SpecialistCellRenderer());
                JFormattedTextField ftext3 = new JFormattedTextField();
                MaskFormatter mask3;
                try {
                    mask3 = new MaskFormatter("##########");
                    mask3.install(ftext3);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                specialistTable.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(ftext3));
                
                // Taks table
                taskTable.getColumnModel().getColumn(1).setCellRenderer(new TaskCellRenderer());
                taskTable.getColumnModel().getColumn(0).setCellRenderer(new TaskRenderer());
                taskTable.getColumnModel().getColumn(0).setCellRenderer(new SpecialistCellRenderer());
                DateFormat df2 = new SimpleDateFormat("MM/dd/yy");
                DateFormat t2 = new SimpleDateFormat("h:mm:ss a");
                JFormattedTextField ftext4 = new JFormattedTextField();
                MaskFormatter mask4;
                try {
                    mask4 = new MaskFormatter("##/##/##");
                    mask4.setValidCharacters("0123456789");
                    mask4.install(ftext4);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                JFormattedTextField ftext5 = new JFormattedTextField();
                MaskFormatter mask5;
                try {
                    mask5 = new MaskFormatter("##:##:## UM");
                    mask5.install(ftext5);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                taskTable.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(ftext4));
                taskTable.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(ftext5));
                
                // Note table
                noteTable.getColumnModel().getColumn(0).setCellRenderer(new NoteRenderer());
                DateFormat df3 = new SimpleDateFormat("MM/dd/yy");
                DateFormat t3 = new SimpleDateFormat("h:mm:ss a");
                JFormattedTextField ftext6 = new JFormattedTextField();
                MaskFormatter mask6;
                try {
                    mask6 = new MaskFormatter("##/##/##");
                    mask6.setValidCharacters("0123456789");
                    mask6.install(ftext6);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                JFormattedTextField ftext7 = new JFormattedTextField();
                MaskFormatter mask7;
                try {
                    mask7 = new MaskFormatter("##:##:## UM");
                    mask7.install(ftext7);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                noteTable.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(ftext6));
                noteTable.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(ftext7));

                // Align integers to the left for history of patient statistics table
                DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
                rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
                historyStatisticsTable.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
                
                // Action listeners
                
                // -- Menu bar --
                
                // -- MENU: Manual selection
                manualItem.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        manualFrame.setVisible(true);
                    }
                    
                });
                
                // -- MENU: About selection
                aboutItem.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        aboutFrame.setVisible(true);
                    }
                    
                });
                
                
                // -- MENU: New database selection
                dbItem.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete all tables and create a new database?", "Create a new database", 
                                    JOptionPane.YES_NO_OPTION
                                   );

                        if(input == JOptionPane.YES_OPTION)
                        {
                            try {
                                Updater.newDatabase();
                                // Update all tables
                                patientsList.clear();
                                patientsList.addAll( patientsQuery.getResultList());
                                consultationsList.clear();
                                consultationsList.addAll(consultationsQuery.getResultList());
                                notesList.clear();
                                notesList.addAll(notesQuery.getResultList());
                                specialistsList.clear();
                                specialistsList.addAll(specialistsQuery.getResultList());
                                tasksList.clear();
                                tasksList.addAll(tasksQuery.getResultList());
                                
                            } catch (SQLException | UnknownHostException ex) {
                                Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    
                });
                
                // -- Top nav bar --
                
                // -- NAV: Add task button --
                addPatientButtonStart.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       addPatientFrame.setVisible(true);
                    }
                    
                });
                
                // -- NAV: Add consultation button --
                addConsultationButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       addConsultationFrame.setVisible(true);
                    }
                    
                });
                
                // -- NAV: Add task button --
                addTaskButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        addTaskFrame.setVisible(true);
                    }
                    
                });
                
                // -- NAV: Add note button --
                addNote.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       addNoteFrame.setVisible(true);
                    }
                    
                });
                
                // Export dir Excel button
                exportDirSelectButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        JFileChooser fileChooser = new JFileChooser( "." );
                        fileChooser.setControlButtonsAreShown( true );
                        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                        int returnVal = fileChooser.showOpenDialog(null);
                        if (returnVal == JFileChooser.APPROVE_OPTION)
                            exportDirField.setText(fileChooser.getSelectedFile().getAbsolutePath());
                    }
                    
                });
                
                // -- NAV: Add Excel export button --
                excelExportButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        
                       exportFrame.setVisible(true);
                       
                    }
                    
                });
                
                // -- NAV: Print table button --
                printButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        printFrame.setVisible(true);
                    }
                    
                });
                
                // -- Print table button --
                printTableButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        try {
                            String table = printBox.getSelectedItem().toString();
                            switch (table)
                            {
                                case "Patients": patientTable.print(); break;
                                case "Consultations": consultationTable.print(); break;
                                case "Tasks": taskTable.print(); break;
                                case "Notes": noteTable.print(); break;
                                case "Specialists": specialistTable.print(); break;
                            }
                        } catch (PrinterException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                    
                });
                
                // -- Export save button --
                exportSaveButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       if (exportTableNameField.getSelectedItem().toString().isEmpty() ||
                           exportDirField.getText().isEmpty() ||
                           exportFileNameField.getText().isEmpty())
                       {
                           JOptionPane.showMessageDialog(null, "Please fill out all fields.");
                       }
                       else
                       {
                            JTable temp = null;
                            String exportTable       = exportTableNameField.getSelectedItem().toString();
                            String exportDir         = exportDirField.getText();
                            String exportFileName    = exportFileNameField.getText();
                            String extension         = ".xls";
                            String fullFilePath      = exportDir + "\\"+exportFileName + extension;
                            
                            // Check which table it is..
                            switch(exportTable)
                            {
                                case "Patient": temp = patientTable; break;
                                case "Consultations": temp = consultationTable; break;
                                case "Specialists": temp = specialistTable; break;
                                case "Tasks": temp = taskTable; break;
                                case "Notes": temp = noteTable; break;
                            }
                            
                             try {
                                 Excel.Writer(temp, fullFilePath);
                                 JOptionPane.showMessageDialog(null, "Your spreadsheet " + exportFileName +extension+" has been created.");
                             } catch (IOException ex) {
                                 Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                             }
                       }
                    }
                    
                });
                
                // -- Add Consultation Button --
                addConsultationTabButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       addConsultationFrame.setVisible(true);
                    }
                    
                });
                
                
                // -- Email patient button --
                emailPatientButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        int selectedRow     = patientTable.getSelectedRow();
                        String emailPatient = patientTable.getValueAt(selectedRow, 4).toString();
                        
                        Desktop desktop;
                        if (Desktop.isDesktopSupported() 
                            && (desktop = Desktop.getDesktop()).isSupported(Desktop.Action.MAIL)) {
                           
                            URI mailto = null;
                            try {
                                mailto = new URI("mailto:"+emailPatient+"?subject=Doctor%20Office");
                            } catch (URISyntaxException ex) {
                                ex.printStackTrace();
                            }
                            try {
                                desktop.mail(mailto);
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                         } 
                        
                        else 
                        {
                           // TODO fallback to some Runtime.exec(..) voodoo?
                           throw new RuntimeException("desktop doesn't support mailto; mail is dead anyway ;)");
                         }
                    }
                    
                });
                
                // -- Show History Button --
                showHistoryButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        String patientName = patientTable.getValueAt(patientTable.getSelectedRow(), 1).toString();
                        String patientLName = patientTable.getValueAt(patientTable.getSelectedRow(), 2).toString();
                        int patientID = (int) patientTable.getValueAt(patientTable.getSelectedRow(),0);
                        try {
                            if (!Updater.patientHistoryFound(patientID))
                            {
                                JOptionPane.showMessageDialog(null, "No history found.");
                            } else {
                                List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(2);
                                filters.add(RowFilter.regexFilter("(?i)" + patientName));
                                filters.add(RowFilter.regexFilter("(?i)" + patientLName));
                                TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(patientHistoryTable.getModel());
                                RowFilter<Object,Object> serviceFilter = RowFilter.andFilter(filters);
                                String regex1 = String.format("^%s$", patientLName);
                                //String regex2 = String.format("^%s$", patientLName);
                                rowSorter.setRowFilter(serviceFilter);
                                //rowSorter.setRowFilter(RowFilter.regexFilter(regex2));
                                patientHistoryTable.setRowSorter(rowSorter);
                                patientHistoryFrame.setVisible(true);
                                patientHistoryFrame.setTitle(patientName + " " + patientLName + "'s History (ID: " + patientID +" )");
                                // Get statistics from table
                                int numConsultations = patientHistoryTable.getRowCount();
                                String commonCondition;
                                historyStatisticsTable.setValueAt(numConsultations, 0, 0);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnknownHostException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                });
                
                // -- Delete Patient Button --
                deletePatientButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       int    id               = Integer.parseInt(patientTable.getValueAt(patientTable.getSelectedRow(), 0).toString());
                       
                        // Update the table
                        try {
                            Updater.deletePatient(id);
                        } catch (SQLException | ParseException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnknownHostException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        // Call table update method
                        patientsList.clear();
                        patientsList.addAll( patientsQuery.getResultList());
                        
                        consultationsList.clear();
                        consultationsList.addAll(consultationsQuery.getResultList());
                       
                    }
                    
                });
                
                // -- Delete Consultation Button --
                deleteConsultationButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       int    id               = Integer.parseInt(consultationTable.getValueAt(consultationTable.getSelectedRow(), 0).toString());
                       
                        // Update the table
                        try {
                            Updater.deleteConsultation(id);
                        } catch (SQLException | ParseException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnknownHostException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        // Call table update method
                        consultationsList.clear();
                        consultationsList.addAll( consultationsQuery.getResultList());
                    }
                    
                });
                
                // -- Delete Consultation Button --
                deleteSpecialistButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       int    id               = Integer.parseInt(specialistTable.getValueAt(specialistTable.getSelectedRow(), 0).toString());
                       
                        // Update the table
                        try {
                            Updater.deleteSpecialist(id);
                        } catch (SQLException | ParseException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnknownHostException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        // Call table update method
                        specialistsList.clear();
                        specialistsList.addAll( specialistsQuery.getResultList());
                       
                    }
                    
                });
                
                // -- Delete Task Button --
                deleteTaskButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       int    id               = Integer.parseInt(taskTable.getValueAt(taskTable.getSelectedRow(), 0).toString());
                       
                        // Update the table
                        try {
                            Updater.deleteTask(id);
                        } catch (SQLException | ParseException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnknownHostException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        // Call table update method
                        tasksList.clear();
                        tasksList.addAll( tasksQuery.getResultList());
                       
                    }
                    
                });
                
                // -- Delete Task Button --
                deleteNoteButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       if (!notesField.getText().isEmpty())
                           notesField.setText("");
                       int    id               = Integer.parseInt(noteTable.getValueAt(noteTable.getSelectedRow(), 0).toString());
                       
                        // Update the table
                        try {
                            Updater.deleteNote(id);
                        } catch (SQLException | ParseException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnknownHostException ex) {
                            Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        // Call table update method
                        notesList.clear();
                        notesList.addAll( notesQuery.getResultList());
                       
                    }
                    
                });
               
                // -- Add button for Patient Person frame --
                addPatientTabButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       addPatientFrame.setVisible(true);
                    }
                    
                });
                
                // -- Add button for Task --
                addTaskTabButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        addTaskFrame.setVisible(true);
                    }
                    
                });
                
                // -- Add button for Specialist frame --
                addSpecialistButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       addSpecialistFrame.setVisible(true);
                    }
                    
                });
                
                // -- Add button for Specialist frame --
                addNoteButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       addNoteFrame.setVisible(true);
                    }
                    
                });
                
                // Save button for Add patient frame
                savePersonalButton2.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        
                       if (addPatientFnameField2.getText().isEmpty()     || 
                           addPatientLnameField2.getText().isEmpty()     || 
                           addPatientAgeField2.getText().isEmpty()       ||
                           addPatientEmailField.getText().isEmpty()     || 
                           addPatientPhoneField.getText().isEmpty()     ||
                           addPatientCityField2.getText().isEmpty()      || 
                           addPatientAddressField2.getText().isEmpty()   || 
                           addPatientZIPField2.getText().isEmpty())
                       {
                           // Some fields are not filled, display option pane
                           JOptionPane.showMessageDialog(null, "Please fill out all fields.");
                       }
                       
                       else
                       {
                            String fname         = addPatientFnameField2.getText();
                            String lname         = addPatientLnameField2.getText();
                            int    age           = Integer.parseInt(addPatientAgeField2.getText());
                            String email         = addPatientEmailField.getText();
                            long   phone         = Long.parseLong(addPatientPhoneField.getText());
                            String city          = addPatientCityField2.getText();
                            String address       = addPatientAddressField2.getText();
                            int    zip           = Integer.parseInt(addPatientZIPField2.getText());
                            
                            // Update the table
                            try {
                                Updater.addPatient(fname, lname, age, address, city, zip, phone, email, loggedInUser);
                            } catch (SQLException | ParseException ex) {
                                Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (UnknownHostException ex) {
                               Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                           }
                            
                            patientsList.clear();
                            patientsList.addAll( patientsQuery.getResultList());
                            patientsList2.clear();
                            patientsList2.addAll( patientsQuery2.getResultList());
                            
                       }
                        
                    }
                    
                });
                
                // -- Save Consultation Button --
                saveConsultationButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        
                       if (consultationPatientBox.getSelectedItem().toString().isEmpty()       || 
                           consultationConditionBox.getSelectedItem().toString().isEmpty()     || 
                           consultationPerscriptionField.getText().isEmpty()                   ||
                           consultationRateBox.getSelectedItem().toString().isEmpty()          ||
                           consultationDiagnosisField.getText().isEmpty()                      ||
                           consultationDateField.getText().isEmpty()                           )
                       {
                           // Some fields are not filled, display option pane
                           JOptionPane.showMessageDialog(null, "Please fill out all fields.");
                       }
                       
                       else
                       {
                           
                            String patientName        = consultationPatientBox.getSelectedItem().toString();
                            String conditionName      = consultationConditionBox.getSelectedItem().toString();
                            String perscriptionName   = consultationPerscriptionField.getText();
                            String perscriptionRate   = consultationRateBox.getSelectedItem().toString();
                            String diagnosis          = consultationDiagnosisField.getText();
                            String consultationDate   = consultationDateField.getText();
                              
                           try {
                               // Update the table
                               Updater.addConsultation(patientName, conditionName, perscriptionName, perscriptionRate, diagnosis, consultationDate,loggedInUser);
                               Updater.getUserID(patientName, patientName);
                           } catch (SQLException | ParseException | UnknownHostException ex) {
                               Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                           }
                           
                            consultationsList.clear();
                            consultationsList.addAll( consultationsQuery.getResultList());
                       }
                    }
                    
                });
                
                // -- Save Task Button --
                saveTaskButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       if (
                           taskCategoryBox.getSelectedItem().toString().isEmpty()   ||
                           taskDueDateField.getText().isEmpty()                     ||
                           taskDueTimeField.getText().isEmpty()                     ||
                           taskStatusField.getSelectedItem().toString().isEmpty()   ||
                           taskMessageField.getText().isEmpty())
                       {
                           // Some fields are not filled, display option pane
                           JOptionPane.showMessageDialog(null, "Please fill out all fields.");
                       }
                       
                       else
                       {
                           String taskName      = taskCategoryBox.getSelectedItem().toString();
                           String taskMessage   = taskMessageField.getText();
                           String taskStatus    = taskStatusField.getSelectedItem().toString();
                           String taskDate      = taskDueDateField.getText();
                           String taskTime      = taskDueTimeField.getText();
                           
                           try {
                               // Update the table
                               Updater.addTask(taskName, taskMessage, taskDate, taskTime, taskStatus,loggedInUser);
                           } catch (SQLException | ParseException ex) {
                               Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (UnknownHostException ex) {
                               Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                           }
                           
                            tasksList.clear();
                            tasksList.addAll( tasksQuery.getResultList());
                       }
                    }
                    
                });
                
                // -- Save Note Button --
                saveNoteButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       if (
                           noteTitleField.getText().isEmpty()   ||
                           noteMessageField.getText().isEmpty())
                       {
                           // Some fields are not filled, display option pane
                           JOptionPane.showMessageDialog(null, "Please fill out all fields.");
                       }
                       
                       else
                       {
                           // Get current date and time
                           DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
                           DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
                           Date dated = new Date();
                           
                           String title = noteTitleField.getText();
                           String message = noteMessageField.getText();
                           String date = dateFormat.format(dated);
                           String time = timeFormat.format(dated);
                           
                           try {
                               // Update the table
                               Updater.addNote(title, message, date, time,loggedInUser);
                           } catch (SQLException | ParseException ex) {
                               Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (UnknownHostException ex) {
                               Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                           }
                           
                            notesList.clear();
                            notesList.addAll( notesQuery.getResultList());
                       }
                    }
                    
                });
                
                
                // -- Save Specialist Button --
                saveSpecialistButton.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       if (specialistFnameField.getText().isEmpty()         ||
                           specialistLnameField.getText().isEmpty()         ||
                           specialistProfessionField.getText().isEmpty()    ||
                           specialistCityField.getText().isEmpty()          ||
                           specialistZIPField.getText().isEmpty()           ||
                           specialistPhoneField.getText().isEmpty()         ||
                           specialistEmailField.getText().isEmpty())
                       {
                           // Some fields are not filled, display option pane
                           JOptionPane.showMessageDialog(null, "Please fill out all fields.");
                       }
                       
                       else
                       {
                           String specialistFName = specialistFnameField.getText();
                           String specialistLName = specialistLnameField.getText();
                           String specialistProf  = specialistProfessionField.getText();
                           String specialistCity  = specialistCityField.getText();
                           int    specialistZIP   = Integer.parseInt(specialistZIPField.getText());
                           long   specialistPhone = Long.parseLong(specialistPhoneField.getText());
                           String specialistEmail = specialistEmailField.getText();
                           
                           try {
                               // Update the table
                               Updater.addSpecialist(specialistFName, specialistLName, specialistProf, specialistCity, specialistZIP, specialistPhone, specialistEmail,loggedInUser);
                           } catch (SQLException | ParseException ex) {
                               Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (UnknownHostException ex) {
                               Logger.getLogger(PatientExpert.class.getName()).log(Level.SEVERE, null, ex);
                           }
                           
                            specialistsList.clear();
                            specialistsList.addAll( specialistsQuery.getResultList());
                       }
                    }
                    
                });
                
                // Search document listeners
                
                searchPatientField.getDocument().addDocumentListener(new DocumentListener()
                {
                    @Override
                    public void insertUpdate(DocumentEvent e)
                    {
                        String search = searchPatientField.getText().trim();
                        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(patientTable.getModel());
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                        patientTable.setRowSorter(rowSorter);
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) 
                    {
                        String search = searchPatientField.getText().trim();
                        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(patientTable.getModel());
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                        patientTable.setRowSorter(rowSorter);
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) 
                    {
                       
                    }
                    
                });
                
                searchConsultationField.getDocument().addDocumentListener(new DocumentListener()
                {
                    @Override
                    public void insertUpdate(DocumentEvent e)
                    {
                        String search = searchConsultationField.getText().trim();
                        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(consultationTable.getModel());
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                        consultationTable.setRowSorter(rowSorter);
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) 
                    {
                        String search = searchConsultationField.getText().trim();
                        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(consultationTable.getModel());
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                        consultationTable.setRowSorter(rowSorter);
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) 
                    {
                       
                    }
                    
                });
                
                searchSpecialistField.getDocument().addDocumentListener(new DocumentListener()
                {
                    @Override
                    public void insertUpdate(DocumentEvent e)
                    {
                        String search = searchSpecialistField.getText().trim();
                        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(specialistTable.getModel());
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                        specialistTable.setRowSorter(rowSorter);
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) 
                    {
                        String search = searchSpecialistField.getText().trim();
                        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(specialistTable.getModel());
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                        specialistTable.setRowSorter(rowSorter);
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) 
                    {
                       
                    }
                    
                });
                
                searchTaskField.getDocument().addDocumentListener(new DocumentListener()
                {
                    @Override
                    public void insertUpdate(DocumentEvent e)
                    {
                        String search = searchTaskField.getText().trim();
                        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(taskTable.getModel());
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                        taskTable.setRowSorter(rowSorter);
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) 
                    {
                        String search = searchTaskField.getText().trim();
                        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(taskTable.getModel());
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                        taskTable.setRowSorter(rowSorter);
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) 
                    {
                       
                    }
                    
                });
                
                searchNotesField.getDocument().addDocumentListener(new DocumentListener()
                {
                    @Override
                    public void insertUpdate(DocumentEvent e)
                    {
                        String search = searchNotesField.getText().trim();
                        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(noteTable.getModel());
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                        noteTable.setRowSorter(rowSorter);
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) 
                    {
                        String search = searchNotesField.getText().trim();
                        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(noteTable.getModel());
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                        noteTable.setRowSorter(rowSorter);
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) 
                    {
                       
                    }
                    
                });
                
                
                // Table listeners
                
                // -- Patient table --
                patientTable.getSelectionModel().addListSelectionListener(new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        showHistoryButton.setEnabled(true);
                        emailPatientButton.setEnabled(true);
                        deletePatientButton.setEnabled(true);
                        
                        // COMMIT LIVE CHANGES TO TABLE !!!
                        patientexpertPUEntityManager.getTransaction().begin();
                        patientexpertPUEntityManager.getTransaction().commit();  
     
                    }
                    
                });
                
                // -- Consultation table --
                consultationTable.getSelectionModel().addListSelectionListener(new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        deleteConsultationButton.setEnabled(true);
                        
                        // COMMIT LIVE CHANGES TO TABLE !!!
                        patientexpertPUEntityManager.getTransaction().begin();
                        patientexpertPUEntityManager.getTransaction().commit();
                        
                    }
                    
                });
                
                // -- Specialists table --
                specialistTable.getSelectionModel().addListSelectionListener(new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        deleteSpecialistButton.setEnabled(true);
                        
                        // COMMIT LIVE CHANGES TO TABLE !!!
                        patientexpertPUEntityManager.getTransaction().begin();
                        patientexpertPUEntityManager.getTransaction().commit();
                        
                    }
                    
                });
                
                // -- Note table --
                noteTable.getSelectionModel().addListSelectionListener(new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        deleteNoteButton.setEnabled(true);
                        
                        try{
                            int selectedRow = noteTable.getSelectedRow();
                        
                            String notesMessage = noteTable.getValueAt(selectedRow, 2).toString();
                            notesField.setText(notesMessage);
                        }
                        catch(ArrayIndexOutOfBoundsException w) {}
                        catch (IndexOutOfBoundsException x) {}
                        
                        // COMMIT LIVE CHANGES TO TABLE !!!
                        patientexpertPUEntityManager.getTransaction().begin();
                        patientexpertPUEntityManager.getTransaction().commit();
                        
                    }
                    
                });
                
                // -- Task table --
                taskTable.getSelectionModel().addListSelectionListener(new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        deleteTaskButton.setEnabled(true);
                        
                        // COMMIT LIVE CHANGES TO TABLE !!!
                        patientexpertPUEntityManager.getTransaction().begin();
                        patientexpertPUEntityManager.getTransaction().commit();
                        
                    }
                    
                });
                
                // -- Patient History table --
                patientHistoryTable.getSelectionModel().addListSelectionListener(new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        
                        // COMMIT LIVE CHANGES TO TABLE !!!
                        try{
                            int selectedRow = patientHistoryTable.getSelectedRow();
                        
                        String diagnosisMessage = patientHistoryTable.getValueAt(selectedRow, 4).toString();
                        diagnosisField.setText(diagnosisMessage);
                        }
                        catch(ArrayIndexOutOfBoundsException w) {}
                        
                    }
                    
                });

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JDialog aboutFrame;
    private static javax.swing.JMenuItem aboutItem;
    private static javax.swing.JButton addConsultationButton;
    public static javax.swing.JDialog addConsultationFrame;
    private static javax.swing.JButton addConsultationTabButton;
    private static javax.swing.JButton addNote;
    private static javax.swing.JButton addNoteButton;
    public static javax.swing.JDialog addNoteFrame;
    private static javax.swing.JTextField addPatientAddressField2;
    private static javax.swing.JFormattedTextField addPatientAgeField2;
    private static javax.swing.JButton addPatientButtonStart;
    private static javax.swing.JTextField addPatientCityField2;
    private static javax.swing.JTextField addPatientEmailField;
    private static javax.swing.JTextField addPatientFnameField2;
    public static javax.swing.JDialog addPatientFrame;
    private static javax.swing.JTextField addPatientLnameField2;
    private static javax.swing.JFormattedTextField addPatientPhoneField;
    private static javax.swing.JButton addPatientTabButton;
    private static javax.swing.JFormattedTextField addPatientZIPField2;
    private static javax.swing.JButton addSpecialistButton;
    public static javax.swing.JDialog addSpecialistFrame;
    private static javax.swing.JButton addTaskButton;
    public static javax.swing.JDialog addTaskFrame;
    private static javax.swing.JButton addTaskTabButton;
    private static javax.swing.JButton cancelMedicalButton;
    private static javax.swing.JButton cancelPersonalButton;
    private static javax.swing.JComboBox<String> consultationConditionBox;
    private static javax.swing.JFormattedTextField consultationDateField;
    private static javax.swing.JTextField consultationDiagnosisField;
    private static javax.swing.JComboBox<String> consultationPatientBox;
    private static javax.swing.JTextField consultationPerscriptionField;
    private static javax.swing.JComboBox<String> consultationRateBox;
    private static javax.swing.JTable consultationTable;
    private static java.util.List<gui.Consultations> consultationsList;
    private java.util.List<gui.Consultations> consultationsList1;
    private static javax.persistence.Query consultationsQuery;
    private javax.persistence.Query consultationsQuery1;
    private static javax.swing.JMenuItem dbItem;
    private static javax.swing.JButton deleteConsultationButton;
    private static javax.swing.JButton deleteNoteButton;
    private static javax.swing.JButton deletePatientButton;
    private static javax.swing.JButton deleteSpecialistButton;
    private static javax.swing.JButton deleteTaskButton;
    private static javax.swing.JTextArea diagnosisField;
    private static javax.swing.JTextField editPatientAddressField;
    private static javax.swing.JFormattedTextField editPatientAgeField;
    private static javax.swing.JTextField editPatientCityField;
    private static javax.swing.JComboBox<String> editPatientConditionField;
    private javax.swing.JTextField editPatientDiagnosisField;
    private static javax.swing.JTextField editPatientEmailField;
    private static javax.swing.JTextField editPatientFnameField;
    public static javax.swing.JDialog editPatientFrame;
    private static javax.swing.JTextField editPatientLnameField;
    private static javax.swing.JTextField editPatientPerscriptionField;
    private static javax.swing.JComboBox<String> editPatientPerscriptionRate;
    private static javax.swing.JFormattedTextField editPatientPhoneField;
    private static javax.swing.JFormattedTextField editPatientZIPField;
    private static javax.swing.JButton emailPatientButton;
    private static javax.swing.JButton excelExportButton;
    private static javax.swing.JTextField exportDirField;
    private static javax.swing.JButton exportDirSelectButton;
    private static javax.swing.JTextField exportFileNameField;
    private static javax.swing.JDialog exportFrame;
    private static javax.swing.JButton exportSaveButton;
    private static javax.swing.JComboBox<String> exportTableNameField;
    private static javax.swing.JTable historyStatisticsTable;
    private static javax.swing.JLabel idLabelPersonalTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private static javax.swing.JButton loginButton;
    private static javax.swing.JDialog loginFrame;
    private static javax.swing.JDialog manualFrame;
    private static javax.swing.JMenuItem manualItem;
    private javax.swing.JMenuBar menuBar;
    private static javax.swing.JTextArea noteMessageField;
    private javax.swing.JScrollPane noteScroll;
    private static javax.swing.JTable noteTable;
    private static javax.swing.JTextField noteTitleField;
    private static javax.swing.JTextArea notesField;
    private static java.util.List<gui.Notes> notesList;
    private static javax.persistence.Query notesQuery;
    private static javax.swing.JPasswordField passwordField;
    public static javax.swing.JDialog patientHistoryFrame;
    private static javax.swing.JTable patientHistoryTable;
    private static javax.swing.JTable patientTable;
    private static javax.persistence.EntityManager patientexpertPUEntityManager;
    private static java.util.List<gui.Patients> patientsList;
    private java.util.List<gui.Patients> patientsList1;
    private static java.util.List<gui.Patients> patientsList2;
    private java.util.List<gui.Patients> patientsList3;
    private static javax.persistence.Query patientsQuery;
    private javax.persistence.Query patientsQuery1;
    private static javax.persistence.Query patientsQuery2;
    private javax.persistence.Query patientsQuery3;
    private static javax.swing.JComboBox<String> printBox;
    private static javax.swing.JButton printButton;
    private static javax.swing.JDialog printFrame;
    private static javax.swing.JButton printTableButton;
    private static javax.swing.JButton saveConsultationButton;
    private static javax.swing.JButton saveNoteButton;
    private static javax.swing.JButton savePersonalButton2;
    private static javax.swing.JButton saveSpecialistButton;
    private static javax.swing.JButton saveTaskButton;
    private static javax.swing.JTextField searchConsultationField;
    private static javax.swing.JTextField searchNotesField;
    private static javax.swing.JTextField searchPatientField;
    private static javax.swing.JTextField searchSpecialistField;
    private static javax.swing.JTextField searchTaskField;
    private static javax.swing.JButton showHistoryButton;
    private static javax.swing.JTextField specialistCityField;
    private static javax.swing.JTextField specialistEmailField;
    private static javax.swing.JTextField specialistFnameField;
    private static javax.swing.JTextField specialistLnameField;
    private static javax.swing.JFormattedTextField specialistPhoneField;
    private static javax.swing.JTextField specialistProfessionField;
    private static javax.swing.JTable specialistTable;
    private static javax.swing.JFormattedTextField specialistZIPField;
    private static java.util.List<gui.Specialists> specialistsList;
    private static javax.persistence.Query specialistsQuery;
    private static javax.swing.JComboBox<String> taskCategoryBox;
    private static javax.swing.JFormattedTextField taskDueDateField;
    private static javax.swing.JFormattedTextField taskDueTimeField;
    private static javax.swing.JTextField taskMessageField;
    private static javax.swing.JScrollPane taskScrollPane;
    private static javax.swing.JComboBox<String> taskStatusField;
    private static javax.swing.JTable taskTable;
    private static java.util.List<gui.Tasks> tasksList;
    private static javax.persistence.Query tasksQuery;
    private static javax.swing.JButton updateMedicalButton;
    private static javax.swing.JButton updatePersonalButton;
    private static javax.swing.JTextField usernameField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
