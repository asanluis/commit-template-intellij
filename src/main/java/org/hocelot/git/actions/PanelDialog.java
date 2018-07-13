package org.hocelot.git.actions;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;
import javax.swing.*;

public class PanelDialog extends DialogWrapper {

    private final Panel panel;

    PanelDialog(@Nullable Project project) {
        super(project);
        panel = new Panel(project);
        setTitle("Git Hocelot Commit Message");
        setOKButtonText("OK");
        setSize(300, 200);
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return panel.getMainPanel();
    }

    String getCommitMessage() {
        return panel.getTicket() + ": " + panel.getShortDescription() + "\n" + panel.getLongDescription();
    }

}