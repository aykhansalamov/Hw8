//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.*;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class TestClass {
//
//
//
//
//        Map<DayOfWeek, String> fatherSchedule = new HashMap<>();
//        fatherSchedule.put(DayOfWeek.TUESDAY, "earn money");
//        Map<DayOfWeek, String> motherSchedule = new HashMap<>();
//        motherSchedule.put(DayOfWeek.TUESDAY, "cook meal");
//        Map<DayOfWeek, String> childTestSchedule = new HashMap<>();
//        childTestSchedule.put(DayOfWeek.SUNDAY, "sleep");
//        Map<DayOfWeek, String> childTest2Schedule = new HashMap<>();
//        childTest2Schedule.put(DayOfWeek.SATURDAY, "run");
//
//        Human father = new Man("Vito", "Karleone", 1955,
//                95,
//                fatherSchedule);
//
//        Human mother = new Woman("Jane", "Karleone", 1956,
//                85,
//                motherSchedule);
//
//        Human childTest = new Human("Michael", "Karleone", 1977,
//                90,
//                childTestSchedule);
//        Human childTest2 = new Human("Nika", "Karleone", 1995,
//                85,
//                childTest2Schedule);
//
//
//        Family family = new Family(mother, father, new HashMap<>());
//
//
//        public static void addingChild () {
//            family.addChild(childTest);
//            return family.getChildren();
//        }
//
//        @Test
//        public void testCounFamily () {
//
//
//            assertEquals(family.countFamily(), 2);
//        }
//
//        @Test
//        public void testAddChild () {
//            addingChild();
//
//            assertEquals(family.countFamily(), 3);
//        }
//
//        @Test
//        public void testDeleteChild () { // Delete the child object by index that located into children
//            addingChild();
//            family.deleteChild(0);
//
//            assertEquals(family.countFamily(), 2);
//        }
//
//        @Test
//        public void testDeleteChild2 () { // Delete the child object by reference that located into children
//            addingChild();
//            family.deleteChildByName(childTest);
//
//            assertEquals(0, family.getChildren().size());
//        }
//
//        @Test
//        public void testDeleteChild3 () { // Delete the child object that not located into children
//            addingChild();
//            family.deleteChildByName(childTest2);
//
//            assertEquals(1, family.getChildren().size());
//        }
//}
//    }
