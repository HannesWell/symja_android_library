package org.matheclipse.io.system.archunit;

import com.tngtech.archunit.base.DescribedPredicate;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.dependencies.SliceAssignment;
import com.tngtech.archunit.library.dependencies.SliceIdentifier;
import org.junit.runner.RunWith;

import static com.tngtech.archunit.core.domain.JavaClass.Predicates.resideInAPackage;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "org.matheclipse")
public class CyclicDependencyRulesTest {

//    @ArchTest
//    public static final ArchRule no_cycles_by_method_calls_between_slices =
//            slices().matching("..(org.matheclipse).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();
//
//    @ArchTest
//    public static final ArchRule no_cycles_by_constructor_calls_between_slices =
//            slices().matching("..(org.matheclipse).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();
//
//    @ArchTest
//    public static final ArchRule no_cycles_by_inheritance_between_slices =
//            slices().matching("..(org.matheclipse).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();
//
//    @ArchTest
//    public static final ArchRule no_cycles_by_field_access_between_slices =
//            slices().matching("..(org.matheclipse).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();
//
//    @ArchTest
//    public static final ArchRule no_cycles_by_member_dependencies_between_slices =
//            slices().matching("..(org.matheclipse).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();
//
//    @ArchTest
//    public static final ArchRule no_cycles_in_simple_scenario =
//            slices().matching("..org.matheclipse.(*)..").namingSlices("$1").should().beFreeOfCycles();
//
//    @ArchTest
//    public static final ArchRule no_cycles_in_complex_scenario =
//            slices().matching("..(org.matheclipse).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();

//    @ArchTest
//    public static final ArchRule no_cycles_in_freely_customized_slices =
//            slices().assignedFrom(inComplexSliceOneOrTwo())
//                    .namingSlices("$1[$2]")
//                    .should().beFreeOfCycles();
//
//    private static SliceAssignment inComplexSliceOneOrTwo() {
//        return new SliceAssignment() {
//            @Override
//            public String getDescription() {
//                return "complex slice one or two";
//            }
//
//            @Override
//            public SliceIdentifier getIdentifierOf(JavaClass javaClass) {
//                if (javaClass.getPackageName().contains("complexcycles.slice1")) {
//                    return SliceIdentifier.of("Complex-Cycle", "One");
//                }
//                if (javaClass.getPackageName().contains("complexcycles.slice2")) {
//                    return SliceIdentifier.of("Complex-Cycle", "Two");
//                }
//                return SliceIdentifier.ignore();
//            }
//        };
//    }
}