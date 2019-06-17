package com.github.krr.openapi.dev.platform.intellij.plugin.steps;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

@Slf4j
public class NewModuleWizard extends ModuleBuilder {

  @Override
  public ModuleType getModuleType() {
    return ModuleType.EMPTY;
  }

  @Override
  public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
    return new ModuleWizardStep[]{new ModuleWizardStep() {
      @Override
      public JComponent getComponent() {
        return new JLabel("Put your content here");
      }

      @Override
      public void updateDataModel() {

      }
    }};
  }
}
