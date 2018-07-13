package org.hocelot.git.actions;

import com.intellij.openapi.project.Project;
import org.apache.commons.lang3.StringUtils;
import javax.swing.*;

public class Panel {
    private JPanel mainPanel;
    private JComboBox<String> ticket;
    private JTextField shortDescription;
    private JTextArea longDescription;

    Panel(Project project) {

        String branch = CommitMessage.extractBranchName(project);
        if (branch != null) {
            shortDescription.setText("JIRA issue " + branch);
        }
    }

    JPanel getMainPanel() {
        return mainPanel;
    }

    public String getTicket() {
        return StringUtils.trim(StringUtils.substringBefore(this.ticket.getSelectedItem().toString(),"-"));
    }

    public String getShortDescription() {
        return shortDescription.getText().trim();
    }

    public String getLongDescription() {
        return longDescription.getText().trim();
    }



}