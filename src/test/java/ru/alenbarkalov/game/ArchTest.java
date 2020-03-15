package ru.alenbarkalov.game;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("ru.alenbarkalov.game");

        noClasses()
            .that()
            .resideInAnyPackage("ru.alenbarkalov.game.service..")
            .or()
            .resideInAnyPackage("ru.alenbarkalov.game.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..ru.alenbarkalov.game.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
