package support;

import org.junit.jupiter.api.Assertions;
import topic02_linked_lists.ListNode;
import topic09_trees.TreeNode;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/** Shared representative examples used by the generated practice test classes. */
public final class PracticeAssertions {
    private PracticeAssertions() {}

    public static void verify(Object solver) {
        String name = solver.getClass().getName();
        switch (name) {
            // topic 01 - arrays and strings
            case "topic01_arrays_strings.practice.Easy_02_PlusOne" ->
                    eq(a(1, 2, 4), call(solver, "plusOne", a(1, 2, 3)));
            case "topic01_arrays_strings.practice.Easy_03_EvenNumberOfDigits" ->
                    eq(2, call(solver, "findNumbers", a(12, 345, 2, 6, 7896)));
            case "topic01_arrays_strings.practice.Easy_04_DefangIPAddress" ->
                    eq("1[.]1[.]1[.]1", call(solver, "defangIPaddr", "1.1.1.1"));
            case "topic01_arrays_strings.practice.Easy_05_ReplaceElements" ->
                    eq(a(18, 6, 6, 6, 1, -1), call(solver, "replaceElements", a(17, 18, 5, 4, 6, 1)));
            case "topic01_arrays_strings.practice.Easy_06_LengthOfLastWord" ->
                    eq(4, call(solver, "lengthOfLastWord", "   fly me   to   the moon  "));
            case "topic01_arrays_strings.practice.Easy_07_MonotonicArray" -> {
                eq(true, call(solver, "isMonotonic", a(1, 2, 2, 3)));
                eq(false, call(solver, "isMonotonic", a(1, 3, 2)));
            }
            case "topic01_arrays_strings.practice.Easy_08_LargestNumberTwice" ->
                    eq(1, call(solver, "dominantIndex", a(3, 6, 1, 0)));
            case "topic01_arrays_strings.practice.Easy_09_MatrixDiagonalSum" ->
                    eq(25, call(solver, "diagonalSum", (Object) m(a(1, 2, 3), a(4, 5, 6), a(7, 8, 9))));
            case "topic01_arrays_strings.practice.Easy_10_FizzBuzz" ->
                    eq(List.of("1", "2", "Fizz", "4", "Buzz"), call(solver, "fizzBuzz", 5));
            case "topic01_arrays_strings.practice.Medium_01_RotateImage" -> {
                int[][] matrix = m(a(1, 2, 3), a(4, 5, 6), a(7, 8, 9));
                call(solver, "rotate", (Object) matrix);
                eq(m(a(7, 4, 1), a(8, 5, 2), a(9, 6, 3)), matrix);
            }
            case "topic01_arrays_strings.practice.Medium_02_SpiralMatrix" ->
                    eq(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5),
                            call(solver, "spiralOrder", (Object) m(a(1, 2, 3), a(4, 5, 6), a(7, 8, 9))));
            case "topic01_arrays_strings.practice.Medium_03_DiagonalTraverse" ->
                    eq(a(1, 2, 4, 7, 5, 3, 6, 8, 9),
                            call(solver, "findDiagonalOrder", (Object) m(a(1, 2, 3), a(4, 5, 6), a(7, 8, 9))));
            case "topic01_arrays_strings.practice.Medium_04_ProductExceptSelf" ->
                    eq(a(24, 12, 8, 6), call(solver, "productExceptSelf", a(1, 2, 3, 4)));
            case "topic01_arrays_strings.practice.Medium_05_StringIntegerAtoi" -> {
                eq(-42, call(solver, "myAtoi", "   -42"));
                eq(4193, call(solver, "myAtoi", "4193 with words"));
            }
            case "topic01_arrays_strings.practice.Hard_01_FirstMissingPositive" ->
                    eq(2, call(solver, "firstMissingPositive", a(3, 4, -1, 1)));
            case "topic01_arrays_strings.practice.Hard_02_Read4" -> verifyRead4(solver);
            case "topic01_arrays_strings.practice.Hard_03_TextJustification" ->
                    eq(List.of("This    is    an", "example  of text", "justification.  "),
                            call(solver, "fullJustify",
                                    new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));

            // topic 02 - linked lists
            case "topic02_linked_lists.practice.Easy_01_RemoveElements" ->
                    eq(a(1, 2, 3, 4, 5), listValues(call(solver, "removeElements", list(1, 2, 6, 3, 4, 5, 6), 6)));
            case "topic02_linked_lists.practice.Easy_02_MergeTwoSortedLists" ->
                    eq(a(1, 1, 2, 3, 4, 4), listValues(call(solver, "mergeTwoLists", list(1, 2, 4), list(1, 3, 4))));
            case "topic02_linked_lists.practice.Easy_03_LinkedListCycle" -> {
                ListNode head = list(3, 2, 0, -4);
                head.next.next.next.next = head.next;
                eq(true, call(solver, "hasCycle", head));
            }
            case "topic02_linked_lists.practice.Easy_04_MiddleOfLinkedList" ->
                    eq(a(3, 4, 5), listValues(call(solver, "middleNode", list(1, 2, 3, 4, 5))));
            case "topic02_linked_lists.practice.Easy_05_DeleteNode" -> {
                ListNode head = list(4, 5, 1, 9);
                call(solver, "deleteNode", head.next);
                eq(a(4, 1, 9), listValues(head));
            }
            case "topic02_linked_lists.practice.Easy_06_RemoveDuplicates" ->
                    eq(a(1, 2, 3), listValues(call(solver, "deleteDuplicates", list(1, 1, 2, 3, 3))));
            case "topic02_linked_lists.practice.Easy_07_PalindromeLinkedList" -> {
                eq(true, call(solver, "isPalindrome", list(1, 2, 2, 1)));
                eq(false, call(solver, "isPalindrome", list(1, 2)));
            }
            case "topic02_linked_lists.practice.Easy_08_IntersectionOfTwoLists" -> {
                ListNode common = list(8, 4, 5);
                ListNode a = list(4, 1); tail(a).next = common;
                ListNode b = list(5, 6, 1); tail(b).next = common;
                Assertions.assertSame(common, call(solver, "getIntersectionNode", a, b));
            }
            case "topic02_linked_lists.practice.Easy_09_BinaryToInteger" ->
                    eq(5, call(solver, "getDecimalValue", list(1, 0, 1)));
            case "topic02_linked_lists.practice.Easy_10_MergeNodes" ->
                    eq(a(4, 11), listValues(call(solver, "mergeNodes", list(0, 3, 1, 0, 4, 5, 2, 0))));
            case "topic02_linked_lists.practice.Medium_01_RemoveNthFromEnd" ->
                    eq(a(1, 2, 3, 5), listValues(call(solver, "removeNthFromEnd", list(1, 2, 3, 4, 5), 2)));
            case "topic02_linked_lists.practice.Medium_02_ReorderList" -> {
                ListNode head = list(1, 2, 3, 4);
                call(solver, "reorderList", head);
                eq(a(1, 4, 2, 3), listValues(head));
            }
            case "topic02_linked_lists.practice.Medium_03_AddTwoNumbers" ->
                    eq(a(7, 0, 8), listValues(call(solver, "addTwoNumbers", list(2, 4, 3), list(5, 6, 4))));
            case "topic02_linked_lists.practice.Medium_04_SwapNodesInPairs" ->
                    eq(a(2, 1, 4, 3), listValues(call(solver, "swapPairs", list(1, 2, 3, 4))));
            case "topic02_linked_lists.practice.Medium_05_OddEvenLinkedList" ->
                    eq(a(1, 3, 5, 2, 4), listValues(call(solver, "oddEvenList", list(1, 2, 3, 4, 5))));
            case "topic02_linked_lists.practice.Hard_01_MergeKSortedLists" ->
                    eq(a(1, 1, 2, 3, 4, 4, 5, 6), listValues(call(solver, "mergeKLists",
                            (Object) new ListNode[]{list(1, 4, 5), list(1, 3, 4), list(2, 6)})));
            case "topic02_linked_lists.practice.Hard_02_ReverseNodesInKGroup" ->
                    eq(a(2, 1, 4, 3, 5), listValues(call(solver, "reverseKGroup", list(1, 2, 3, 4, 5), 2)));
            case "topic02_linked_lists.practice.Hard_03_CopyListWithRandomPointer" -> verifyRandomListCopy(solver);

            // topic 03 - stacks and queues
            case "topic03_stacks_queues.practice.Easy_01_ImplementStackUsingQueues" -> verifyStack(solver);
            case "topic03_stacks_queues.practice.Easy_02_ImplementQueueUsingStacks" -> verifyQueue(solver);
            case "topic03_stacks_queues.practice.Easy_03_MakeStringGreat" ->
                    eq("leetcode", call(solver, "makeGood", "leEeetcode"));
            case "topic03_stacks_queues.practice.Easy_04_MinStack" -> verifyMinStack(solver);
            case "topic03_stacks_queues.practice.Easy_05_BackspaceStringCompare" ->
                    eq(true, call(solver, "backspaceCompare", "ab#c", "ad#c"));
            case "topic03_stacks_queues.practice.Easy_06_RemoveAdjacentDuplicates" ->
                    eq("ca", call(solver, "removeDuplicates", "abbaca"));
            case "topic03_stacks_queues.practice.Easy_07_CrawlerLogFolder" ->
                    eq(2, call(solver, "minOperations", (Object) new String[]{"d1/", "d2/", "../", "d21/", "./"}));
            case "topic03_stacks_queues.practice.Easy_08_TimeNeededToBuyTickets" ->
                    eq(6, call(solver, "timeRequiredToBuy", a(2, 3, 2), 2));
            case "topic03_stacks_queues.practice.Easy_09_FinalPrices" ->
                    eq(a(4, 2, 4, 2, 3), call(solver, "finalPrices", a(8, 4, 6, 2, 3)));
            case "topic03_stacks_queues.practice.Easy_10_NextGreaterElementI" ->
                    eq(a(-1, 3, -1), call(solver, "nextGreaterElement", a(4, 1, 2), a(1, 3, 4, 2)));
            case "topic03_stacks_queues.practice.Medium_01_EvaluateRPN" ->
                    eq(9, call(solver, "evalRPN", (Object) new String[]{"2", "1", "+", "3", "*"}));
            case "topic03_stacks_queues.practice.Medium_02_DailyTemperatures" ->
                    eq(a(1, 1, 4, 2, 1, 1, 0, 0), call(solver, "dailyTemperatures", a(73, 74, 75, 71, 69, 72, 76, 73)));
            case "topic03_stacks_queues.practice.Medium_03_SimplifyPath" ->
                    eq("/home/foo", call(solver, "simplifyPath", "/home//foo/"));
            case "topic03_stacks_queues.practice.Medium_04_DesignCircularQueue" -> verifyCircularQueue(solver);
            case "topic03_stacks_queues.practice.Medium_05_AsteroidCollision" ->
                    eq(a(5, 10), call(solver, "asteroidCollision", a(5, 10, -5)));
            case "topic03_stacks_queues.practice.Hard_01_LargestRectangleInHistogram" ->
                    eq(10, call(solver, "largestRectangleArea", a(2, 1, 5, 6, 2, 3)));
            case "topic03_stacks_queues.practice.Hard_02_SlidingWindowMaximum" ->
                    eq(a(3, 3, 5, 5, 6, 7), call(solver, "maxSlidingWindow", a(1, 3, -1, -3, 5, 3, 6, 7), 3));
            case "topic03_stacks_queues.practice.Hard_03_BasicCalculator" ->
                    eq(23, call(solver, "calculate", "(1+(4+5+2)-3)+(6+8)"));

            // topic 04 - hash tables
            case "topic04_hash_tables.practice.Easy_01_ContainsDuplicateII" ->
                    eq(true, call(solver, "containsNearbyDuplicate", a(1, 2, 3, 1), 3));
            case "topic04_hash_tables.practice.Easy_02_ContainsDuplicate" ->
                    eq(true, call(solver, "containsDuplicate", a(1, 2, 3, 1)));
            case "topic04_hash_tables.practice.Easy_03_ValidAnagram" ->
                    eq(true, call(solver, "isAnagram", "anagram", "nagaram"));
            case "topic04_hash_tables.practice.Easy_04_IntersectionTwoArrays" ->
                    eq(a(2), call(solver, "intersection", a(1, 2, 2, 1), a(2, 2)));
            case "topic04_hash_tables.practice.Easy_05_HappyNumber" ->
                    eq(true, call(solver, "isHappy", 19));
            case "topic04_hash_tables.practice.Easy_06_FirstUniqueChar" ->
                    eq(2, call(solver, "firstUniqChar", "loveleetcode"));
            case "topic04_hash_tables.practice.Easy_07_IsomorphicStrings" ->
                    eq(true, call(solver, "isIsomorphic", "egg", "add"));
            case "topic04_hash_tables.practice.Easy_08_WordPattern" ->
                    eq(true, call(solver, "wordPattern", "abba", "dog cat cat dog"));
            case "topic04_hash_tables.practice.Easy_09_DesignHashSet" -> verifyHashSet(solver);
            case "topic04_hash_tables.practice.Easy_10_DesignHashMap" -> verifyHashMap(solver);
            case "topic04_hash_tables.practice.Medium_01_GroupAnagrams" -> {
                Object result = call(solver, "groupAnagrams", (Object) new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
                eqCanonical(List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea")), result);
            }
            case "topic04_hash_tables.practice.Medium_02_SubarraySumEqualsK" ->
                    eq(2, call(solver, "subarraySum", a(1, 1, 1), 2));
            case "topic04_hash_tables.practice.Medium_03_LongestConsecutiveSequence" ->
                    eq(4, call(solver, "longestConsecutive", a(100, 4, 200, 1, 3, 2)));
            case "topic04_hash_tables.practice.Medium_04_DesignTwitter" -> verifyTwitter(solver);
            case "topic04_hash_tables.practice.Medium_05_InsertDeleteGetRandom" -> verifyRandomizedSet(solver);
            case "topic04_hash_tables.practice.Hard_01_MaxPointsOnLine" ->
                    eq(3, call(solver, "maxPoints", (Object) m(a(1, 1), a(2, 2), a(3, 3))));
            case "topic04_hash_tables.practice.Hard_02_SubarraysWithKDifferent" ->
                    eq(7, call(solver, "subarraysWithKDistinct", a(1, 2, 1, 2, 3), 2));
            case "topic04_hash_tables.practice.Hard_03_LRUCache" -> verifyLruCache(solver);

            // topic 05 - two pointers
            case "topic05_two_pointers.practice.Easy_01_ValidPalindrome" ->
                    eq(true, call(solver, "isPalindrome", "A man, a plan, a canal: Panama"));
            case "topic05_two_pointers.practice.Easy_02_ReverseString" -> {
                char[] value = "hello".toCharArray(); call(solver, "reverseString", value); eq("olleh".toCharArray(), value);
            }
            case "topic05_two_pointers.practice.Easy_03_TwoSumSorted" ->
                    eq(a(1, 2), call(solver, "twoSum", a(2, 7, 11, 15), 9));
            case "topic05_two_pointers.practice.Easy_04_RemoveDuplicates" -> {
                int[] nums = a(1, 1, 2); eq(2, call(solver, "removeDuplicates", nums)); eq(a(1, 2), Arrays.copyOf(nums, 2));
            }
            case "topic05_two_pointers.practice.Easy_05_MoveZeroes" -> {
                int[] nums = a(0, 1, 0, 3, 12); call(solver, "moveZeroes", nums); eq(a(1, 3, 12, 0, 0), nums);
            }
            case "topic05_two_pointers.practice.Easy_06_MergeSortedArray" -> {
                int[] nums = a(1, 2, 3, 0, 0, 0); call(solver, "merge", nums, 3, a(2, 5, 6), 3); eq(a(1, 2, 2, 3, 5, 6), nums);
            }
            case "topic05_two_pointers.practice.Easy_07_RemoveElement" -> {
                int[] nums = a(3, 2, 2, 3); eq(2, call(solver, "removeElement", nums, 3));
                Arrays.sort(nums, 0, 2); eq(a(2, 2), Arrays.copyOf(nums, 2));
            }
            case "topic05_two_pointers.practice.Easy_08_SquaresOfSortedArray" ->
                    eq(a(0, 1, 9, 16, 100), call(solver, "sortedSquares", a(-4, -1, 0, 3, 10)));
            case "topic05_two_pointers.practice.Easy_09_IntersectionTwoArrays" ->
                    eq(a(2, 2), call(solver, "intersect", a(1, 2, 2, 1), a(2, 2)));
            case "topic05_two_pointers.practice.Easy_10_ValidPalindromeII" ->
                    eq(true, call(solver, "validPalindrome", "abca"));
            case "topic05_two_pointers.practice.Medium_01_ThreeSum" ->
                    eqCanonical(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), call(solver, "threeSum", a(-1, 0, 1, 2, -1, -4)));
            case "topic05_two_pointers.practice.Medium_02_ContainerWithMostWater" ->
                    eq(49, call(solver, "maxArea", a(1, 8, 6, 2, 5, 4, 8, 3, 7)));
            case "topic05_two_pointers.practice.Medium_03_IntervalListIntersections" ->
                    eq(m(a(1, 2), a(5, 5), a(8, 10), a(15, 23), a(24, 24), a(25, 25)), call(solver,
                            "intervalIntersection", m(a(0, 2), a(5, 10), a(13, 23), a(24, 25)), m(a(1, 5), a(8, 12), a(15, 24), a(25, 26))));
            case "topic05_two_pointers.practice.Medium_04_BoatsToSavePeople" ->
                    eq(3, call(solver, "numRescueBoats", a(3, 2, 2, 1), 3));
            case "topic05_two_pointers.practice.Medium_05_CompareVersionNumbers" ->
                    eq(1, call(solver, "compareVersion", "1.0.1", "1"));
            case "topic05_two_pointers.practice.Hard_01_TrappingRainWater" ->
                    eq(6, call(solver, "trap", a(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)));
            case "topic05_two_pointers.practice.Hard_02_FindDuplicateNumber" ->
                    eq(2, call(solver, "findDuplicate", a(1, 3, 4, 2, 2)));
            case "topic05_two_pointers.practice.Hard_03_MinimumWindowSubstring" ->
                    eq("BANC", call(solver, "minWindow", "ADOBECODEBANC", "ABC"));

            // topic 06 - sliding window
            case "topic06_sliding_window.practice.Easy_01_MaxAverageSubarray" ->
                    eqDouble(12.75, call(solver, "findMaxAverage", a(1, 12, -5, -6, 50, 3), 4));
            case "topic06_sliding_window.practice.Easy_02_DefuseBomb" ->
                    eq(a(12, 10, 16, 13), call(solver, "decrypt", a(5, 7, 1, 4), 3));
            case "topic06_sliding_window.practice.Easy_03_MinDifference" ->
                    eq(2, call(solver, "minimumDifference", a(9, 4, 1, 7), 2));
            case "topic06_sliding_window.practice.Easy_04_KBeautyOfNumber" ->
                    eq(2, call(solver, "divisorSubstrings", 240, 2));
            case "topic06_sliding_window.practice.Easy_05_MaxVowels" ->
                    eq(3, call(solver, "maxVowels", "abciiidef", 3));
            case "topic06_sliding_window.practice.Easy_06_LongestNiceSubstring" ->
                    eq("aAa", call(solver, "longestNiceSubstring", "YazaAay"));
            case "topic06_sliding_window.practice.Easy_07_ContainsDuplicateII" ->
                    eq(true, call(solver, "containsNearbyDuplicate", a(1, 2, 3, 1), 3));
            case "topic06_sliding_window.practice.Easy_08_SubstringSizeThree" ->
                    eq(1, call(solver, "countGoodSubstrings", "xyzzaz"));
            case "topic06_sliding_window.practice.Easy_09_MaxConsecutiveOnes" ->
                    eq(3, call(solver, "findMaxConsecutiveOnes", a(1, 1, 0, 1, 1, 1)));
            case "topic06_sliding_window.practice.Easy_10_DietPlanPerformance" ->
                    eq(1, call(solver, "dietPlanPerformance", a(1, 2, 3, 4, 5), 1, 3, 3));
            case "topic06_sliding_window.practice.Medium_01_CharacterReplacement" ->
                    eq(4, call(solver, "characterReplacement", "AABABBA", 1));
            case "topic06_sliding_window.practice.Medium_02_MaxConsecutiveOnesIII" ->
                    eq(6, call(solver, "longestOnes", a(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0), 2));
            case "topic06_sliding_window.practice.Medium_03_FruitIntoBaskets" ->
                    eq(4, call(solver, "totalFruit", a(1, 2, 3, 2, 2)));
            case "topic06_sliding_window.practice.Medium_04_MinSizeSubarraySum" ->
                    eq(2, call(solver, "minSubArrayLen", 7, a(2, 3, 1, 2, 4, 3)));
            case "topic06_sliding_window.practice.Medium_05_LongestSubstringKDistinct" ->
                    eq(3, call(solver, "lengthOfLongestSubstringKDistinct", "eceba", 2));
            case "topic06_sliding_window.practice.Hard_01_MinWindowSubstring" ->
                    eq("BANC", call(solver, "minWindow", "ADOBECODEBANC", "ABC"));
            case "topic06_sliding_window.practice.Hard_02_SubarraysKDifferent" ->
                    eq(7, call(solver, "subarraysWithKDistinct", a(1, 2, 1, 2, 3), 2));
            case "topic06_sliding_window.practice.Hard_03_SlidingWindowMaximum" ->
                    eq(a(3, 3, 5, 5, 6, 7), call(solver, "maxSlidingWindow", a(1, 3, -1, -3, 5, 3, 6, 7), 3));

            // topic 07 - prefix sums
            case "topic07_prefix_sums.practice.Easy_01_RunningSum" ->
                    eq(a(1, 3, 6, 10), call(solver, "runningSum", a(1, 2, 3, 4)));
            case "topic07_prefix_sums.practice.Easy_02_FindMiddleIndex" ->
                    eq(3, call(solver, "findMiddleIndex", a(2, 3, -1, 8, 4)));
            case "topic07_prefix_sums.practice.Easy_03_HighestAltitude" ->
                    eq(1, call(solver, "largestAltitude", a(-5, 1, 5, 0, -7)));
            case "topic07_prefix_sums.practice.Easy_04_RangeSumQuery" -> verifyRangeSum(solver);
            case "topic07_prefix_sums.practice.Easy_05_LeftRightSumDifference" ->
                    eq(a(15, 1, 11, 22), call(solver, "leftRightDifference", a(10, 4, 8, 3)));
            case "topic07_prefix_sums.practice.Easy_06_FindPivotIndex" ->
                    eq(3, call(solver, "pivotIndex", a(1, 7, 3, 6, 5, 6)));
            case "topic07_prefix_sums.practice.Easy_07_MinValuePositiveStep" ->
                    eq(5, call(solver, "minStartValue", a(-3, 2, -3, 4, 2)));
            case "topic07_prefix_sums.practice.Easy_08_MatrixBlockSum" ->
                    eq(m(a(12, 21, 16), a(27, 45, 33), a(24, 39, 28)),
                            call(solver, "matrixBlockSum", m(a(1, 2, 3), a(4, 5, 6), a(7, 8, 9)), 1));
            case "topic07_prefix_sums.practice.Easy_09_SubarraySumDivisibleByK" ->
                    eq(7, call(solver, "subarraysDivByK", a(4, 5, 0, -2, -3, 1), 5));
            case "topic07_prefix_sums.practice.Easy_10_CheckIfSubarraySumExist" ->
                    eq(true, call(solver, "checkSubarraySum", a(23, 2, 4, 6, 7), 6));
            case "topic07_prefix_sums.practice.Medium_01_SubarraySumEqualsK" ->
                    eq(2, call(solver, "subarraySum", a(1, 1, 1), 2));
            case "topic07_prefix_sums.practice.Medium_02_SubarraySumDivisibleByK" ->
                    eq(7, call(solver, "subarraysDivByK", a(4, 5, 0, -2, -3, 1), 5));
            case "topic07_prefix_sums.practice.Medium_03_ContiguousArray" ->
                    eq(2, call(solver, "findMaxLength", a(0, 1)));
            case "topic07_prefix_sums.practice.Medium_04_RangeSumQuery2D" -> verifyRangeSum2d(solver);
            case "topic07_prefix_sums.practice.Medium_05_CarPooling" ->
            {
                eq(false, call(solver, "carPooling", m(a(2, 1, 5), a(3, 3, 7)), 4));
                eq(true, call(solver, "carPooling", m(a(2, 1, 5), a(3, 3, 7)), 5));
            }
            case "topic07_prefix_sums.practice.Hard_01_MaxSumRectangle" ->
                    eq(2, call(solver, "maxSumSubmatrix", m(a(1, 0, 1), a(0, -2, 3)), 2));
            case "topic07_prefix_sums.practice.Hard_02_SubarraysKDifferentSums" ->
                    eq(7, call(solver, "subarraysWithKDifferentSums", a(1, 2, 1, 2, 3), 2));
            case "topic07_prefix_sums.practice.Hard_03_CorporateFlightBookings" ->
                    eq(a(10, 55, 45, 25, 25), call(solver, "corpFlightBookings", m(a(1, 2, 10), a(2, 3, 20), a(2, 5, 25)), 5));

            // topic 08 - binary search
            case "topic08_binary_search.practice.Easy_01_BinarySearch" ->
                    eq(4, call(solver, "search", a(-1, 0, 3, 5, 9, 12), 9));
            case "topic08_binary_search.practice.Easy_02_SearchInsert" ->
                    eq(1, call(solver, "searchInsert", a(1, 3, 5, 6), 2));
            case "topic08_binary_search.practice.Easy_03_FirstBadVersion" -> verifyFirstBadVersion(solver);
            case "topic08_binary_search.practice.Easy_04_ValidPerfectSquare" ->
                    eq(true, call(solver, "isPerfectSquare", 16));
            case "topic08_binary_search.practice.Easy_05_Sqrt" ->
                    eq(2, call(solver, "mySqrt", 8));
            case "topic08_binary_search.practice.Easy_06_PeakIndexInMountain" ->
                    eq(1, call(solver, "peakIndexInMountainArray", a(0, 2, 1, 0)));
            case "topic08_binary_search.practice.Easy_07_CountNegatives" ->
                    eq(8, call(solver, "countNegatives", (Object) m(a(4, 3, 2, -1), a(3, 2, 1, -1), a(1, 1, -1, -2), a(-1, -1, -2, -3))));
            case "topic08_binary_search.practice.Easy_08_CheckIfExist" ->
                    eq(true, call(solver, "checkIfExist", a(10, 2, 5, 3)));
            case "topic08_binary_search.practice.Easy_09_FindTargetIndices" ->
                    eq(List.of(1, 2), call(solver, "targetIndices", a(1, 2, 5, 2, 3), 2));
            case "topic08_binary_search.practice.Easy_10_GuessNumber" -> verifyGuessNumber(solver);
            case "topic08_binary_search.practice.Medium_01_FindFirstLast" ->
                    eq(a(3, 4), call(solver, "searchRange", a(5, 7, 7, 8, 8, 10), 8));
            case "topic08_binary_search.practice.Medium_02_SearchRotatedArray" ->
                    eq(4, call(solver, "search", a(4, 5, 6, 7, 0, 1, 2), 0));
            case "topic08_binary_search.practice.Medium_03_FindPeakElement" ->
                    eq(2, call(solver, "findPeakElement", a(1, 2, 3, 1)));
            case "topic08_binary_search.practice.Medium_04_KokoEatingBananas" ->
                    eq(4, call(solver, "minEatingSpeed", a(3, 6, 7, 11), 8));
            case "topic08_binary_search.practice.Medium_05_FindMinRotatedArray" ->
                    eq(1, call(solver, "findMin", a(3, 4, 5, 1, 2)));
            case "topic08_binary_search.practice.Hard_01_MedianTwoSortedArrays" ->
                    eqDouble(2.5, call(solver, "findMedianSortedArrays", a(1, 2), a(3, 4)));
            case "topic08_binary_search.practice.Hard_02_SplitArrayLargestSum" ->
                    eq(18, call(solver, "splitArray", a(7, 2, 5, 10, 8), 2));
            case "topic08_binary_search.practice.Hard_03_FindMinRotatedArrayII" ->
                    eq(1, call(solver, "findMin", a(2, 2, 2, 1, 2)));

            default -> verifyTopics09To16(solver, name);
        }
    }

    private static void verifyTopics09To16(Object solver, String name) {
        switch (name) {
            // topic 09 - trees
            case "topic09_trees.practice.Easy_01_InorderTraversal" ->
                    eq(List.of(1, 3, 2), call(solver, "inorderTraversal", tree(1, null, 2, 3)));
            case "topic09_trees.practice.Easy_02_SameTree" -> {
                eq(true, call(solver, "isSameTree", tree(1, 2, 3), tree(1, 2, 3)));
                eq(false, call(solver, "isSameTree", tree(1, 2), tree(1, null, 2)));
            }
            case "topic09_trees.practice.Easy_03_SymmetricTree" ->
                    eq(true, call(solver, "isSymmetric", tree(1, 2, 2, 3, 4, 4, 3)));
            case "topic09_trees.practice.Easy_04_SubtreeOfAnother" ->
                    eq(true, call(solver, "isSubtree", tree(3, 4, 5, 1, 2), tree(4, 1, 2)));
            case "topic09_trees.practice.Easy_05_InvertTree" ->
                    eq(treeSignature(tree(4, 7, 2, 9, 6, 3, 1)), treeSignature(call(solver, "invertTree", tree(4, 2, 7, 1, 3, 6, 9))));
            case "topic09_trees.practice.Easy_06_DiameterOfTree" ->
                    eq(3, call(solver, "diameterOfBinaryTree", tree(1, 2, 3, 4, 5)));
            case "topic09_trees.practice.Easy_07_BalancedTree" ->
                    eq(true, call(solver, "isBalanced", tree(3, 9, 20, null, null, 15, 7)));
            case "topic09_trees.practice.Easy_08_PathSum" ->
                    eq(true, call(solver, "hasPathSum", tree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 22));
            case "topic09_trees.practice.Easy_09_MergeTrees" ->
                    eq(treeSignature(tree(3, 4, 5, 5, 4, null, 7)), treeSignature(call(solver, "mergeTrees", tree(1, 3, 2, 5), tree(2, 1, 3, null, 4, null, 7))));
            case "topic09_trees.practice.Easy_10_LowestCommonAncestorBST" -> {
                TreeNode root = tree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
                eq(6, ((TreeNode) call(solver, "lowestCommonAncestor", root, root.left, root.right)).val);
            }
            case "topic09_trees.practice.Medium_01_LevelOrderTraversal" ->
                    eq(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), call(solver, "levelOrder", tree(3, 9, 20, null, null, 15, 7)));
            case "topic09_trees.practice.Medium_02_LowestCommonAncestorBT" -> {
                TreeNode root = tree(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
                eq(3, ((TreeNode) call(solver, "lowestCommonAncestor", root, root.left, root.right)).val);
            }
            case "topic09_trees.practice.Medium_03_BuildTreeFromPreIn" ->
                    eq(treeSignature(tree(3, 9, 20, null, null, 15, 7)), treeSignature(call(solver, "buildTree", a(3, 9, 20, 15, 7), a(9, 3, 15, 20, 7))));
            case "topic09_trees.practice.Medium_04_ValidateBST" -> {
                eq(true, call(solver, "isValidBST", tree(2, 1, 3)));
                eq(false, call(solver, "isValidBST", tree(5, 1, 4, null, null, 3, 6)));
            }
            case "topic09_trees.practice.Medium_05_KthSmallestBST" ->
                    eq(1, call(solver, "kthSmallest", tree(3, 1, 4, null, 2), 1));
            case "topic09_trees.practice.Hard_01_SerializeDeserialize" -> verifyTreeCodec(solver);
            case "topic09_trees.practice.Hard_02_BinaryTreeMaxPathSum" ->
                    eq(42, call(solver, "maxPathSum", tree(-10, 9, 20, null, null, 15, 7)));
            case "topic09_trees.practice.Hard_03_AllPossibleFBT" ->
                    eq(5, ((Collection<?>) call(solver, "allPossibleFBT", 7)).size());

            // topic 10 - DFS/BFS
            case "topic10_dfs_bfs.practice.Easy_01_FloodFill" ->
                    eq(m(a(2, 2, 2), a(2, 2, 0), a(2, 0, 1)), call(solver, "floodFill", m(a(1, 1, 1), a(1, 1, 0), a(1, 0, 1)), 1, 1, 2));
            case "topic10_dfs_bfs.practice.Easy_02_IslandPerimeter" ->
                    eq(16, call(solver, "islandPerimeter", (Object) m(a(0, 1, 0, 0), a(1, 1, 1, 0), a(0, 1, 0, 0), a(1, 1, 0, 0))));
            case "topic10_dfs_bfs.practice.Easy_03_EmployeeImportance" -> verifyEmployeeImportance(solver);
            case "topic10_dfs_bfs.practice.Easy_04_MaxDepthNaryTree" ->
                    eq(3, call(solver, "maxDepth", tree(1, 3, 2, 5, 4)));
            case "topic10_dfs_bfs.practice.Easy_05_FindIfPathExists" ->
                    eq(true, call(solver, "validPath", 3, m(a(0, 1), a(1, 2), a(2, 0)), 0, 2));
            case "topic10_dfs_bfs.practice.Easy_06_CousinsInBinaryTree" ->
                    eq(true, call(solver, "isCousins", tree(1, 2, 3, 4, null, null, 5), 4, 5));
            case "topic10_dfs_bfs.practice.Easy_07_MinimumDepthOfTree" ->
                    eq(2, call(solver, "minDepth", tree(3, 9, 20, null, null, 15, 7)));
            case "topic10_dfs_bfs.practice.Easy_08_LeafSimilarTrees" ->
                    eq(true, call(solver, "leafSimilar", tree(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4), tree(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8)));
            case "topic10_dfs_bfs.practice.Easy_09_BinaryTreePaths" ->
                    eqCanonical(List.of("1->2->5", "1->3"), call(solver, "binaryTreePaths", tree(1, 2, 3, null, 5)));
            case "topic10_dfs_bfs.practice.Easy_10_SumOfLeftLeaves" ->
                    eq(24, call(solver, "sumOfLeftLeaves", tree(3, 9, 20, null, null, 15, 7)));
            case "topic10_dfs_bfs.practice.Medium_01_CloneGraph" -> verifyCloneGraph(solver);
            case "topic10_dfs_bfs.practice.Medium_02_RottingOranges" ->
                    eq(4, call(solver, "orangesRotting", (Object) m(a(2, 1, 1), a(1, 1, 0), a(0, 1, 1))));
            case "topic10_dfs_bfs.practice.Medium_03_PacificAtlantic" ->
                    eqCanonical(List.of(List.of(0, 4), List.of(1, 3), List.of(1, 4), List.of(2, 2), List.of(3, 0), List.of(3, 1), List.of(4, 0)),
                            call(solver, "pacificAtlantic", (Object) m(a(1, 2, 2, 3, 5), a(3, 2, 3, 4, 4), a(2, 4, 5, 3, 1), a(6, 7, 1, 4, 5), a(5, 1, 1, 2, 4))));
            case "topic10_dfs_bfs.practice.Medium_04_CourseSchedule" ->
                    eq(true, call(solver, "canFinish", 2, m(a(1, 0))));
            case "topic10_dfs_bfs.practice.Medium_05_SurroundedRegions" -> {
                char[][] board = cm("XXXX", "XOOX", "XXOX", "XOXX"); call(solver, "solve", (Object) board);
                eq(cm("XXXX", "XXXX", "XXXX", "XOXX"), board);
            }
            case "topic10_dfs_bfs.practice.Hard_01_WordLadder" ->
                    eq(5, call(solver, "ladderLength", "hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
            case "topic10_dfs_bfs.practice.Hard_02_LongestIncreasingPath" ->
                    eq(4, call(solver, "longestIncreasingPath", (Object) m(a(9, 9, 4), a(6, 6, 8), a(2, 1, 1))));
            case "topic10_dfs_bfs.practice.Hard_03_ShortestPathAllKeys" ->
                    eq(8, call(solver, "shortestPathAllKeys", (Object) new String[]{"@.a..", "###.#", "b.A.B"}));

            // topic 11 - recursion and backtracking
            case "topic11_recursion_backtracking.practice.Easy_01_Fibonacci" -> eq(55, call(solver, "fib", 10));
            case "topic11_recursion_backtracking.practice.Easy_02_ClimbingStairs" -> eq(8, call(solver, "climbStairs", 5));
            case "topic11_recursion_backtracking.practice.Easy_03_PowerOfTwo" -> eq(true, call(solver, "isPowerOfTwo", 16));
            case "topic11_recursion_backtracking.practice.Easy_04_ReverseStringRecursive" -> {
                char[] value = "hello".toCharArray(); call(solver, "reverseString", value); eq("olleh".toCharArray(), value);
            }
            case "topic11_recursion_backtracking.practice.Easy_05_MergeTwoListsRecursive" ->
                    eq(a(1, 1, 2, 3, 4, 4), listValues(call(solver, "mergeTwoLists", list(1, 2, 4), list(1, 3, 4))));
            case "topic11_recursion_backtracking.practice.Easy_06_RangeSumBST" ->
                    eq(32, call(solver, "rangeSumBST", tree(10, 5, 15, 3, 7, null, 18), 7, 15));
            case "topic11_recursion_backtracking.practice.Easy_07_PowerOfThree" -> eq(true, call(solver, "isPowerOfThree", 27));
            case "topic11_recursion_backtracking.practice.Easy_08_BinaryTreeTilt" -> eq(1, call(solver, "findTilt", tree(1, 2, 3)));
            case "topic11_recursion_backtracking.practice.Easy_09_SumOfAllSubsetXORTotals" -> eq(6, call(solver, "subsetXORSum", a(1, 3)));
            case "topic11_recursion_backtracking.practice.Easy_10_CalculatePower" -> eqDouble(1024.0, call(solver, "myPow", 2.0, 10));
            case "topic11_recursion_backtracking.practice.Medium_01_Subsets" ->
                    eq(8, ((Collection<?>) call(solver, "subsets", a(1, 2, 3))).size());
            case "topic11_recursion_backtracking.practice.Medium_02_CombinationSum" ->
                    eqCanonical(List.of(List.of(2, 2, 3), List.of(7)), call(solver, "combinationSum", a(2, 3, 6, 7), 7));
            case "topic11_recursion_backtracking.practice.Medium_03_WordSearch" ->
                    eq(true, call(solver, "exist", cm("ABCE", "SFCS", "ADEE"), "ABCCED"));
            case "topic11_recursion_backtracking.practice.Medium_04_LetterCombinations" ->
                    eqCanonical(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), call(solver, "letterCombinations", "23"));
            case "topic11_recursion_backtracking.practice.Medium_05_PalindromePartitioning" ->
                    eqCanonical(List.of(List.of("a", "a", "b"), List.of("aa", "b")), call(solver, "partition", "aab"));
            case "topic11_recursion_backtracking.practice.Hard_01_NQueens" -> eq(2, ((Collection<?>) call(solver, "solveNQueens", 4)).size());
            case "topic11_recursion_backtracking.practice.Hard_02_SudokuSolver" -> verifySudoku(solver);
            case "topic11_recursion_backtracking.practice.Hard_03_WordSearchII" ->
                    eqCanonical(List.of("eat", "oath"), call(solver, "findWords", cm("oaan", "etae", "ihkr", "iflv"), new String[]{"oath", "pea", "eat", "rain"}));

            // topic 12 - heaps and sorting
            case "topic12_heaps_sorting.practice.Easy_01_KthLargest" -> verifyKthLargest(solver);
            case "topic12_heaps_sorting.practice.Easy_02_LastStoneWeight" -> eq(1, call(solver, "lastStoneWeight", a(2, 7, 4, 1, 8, 1)));
            case "topic12_heaps_sorting.practice.Easy_03_RelativeRanks" ->
                    eq(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, call(solver, "findRelativeRanks", a(5, 4, 3, 2, 1)));
            case "topic12_heaps_sorting.practice.Easy_04_MakeArrayZero" -> eq(3, call(solver, "minimumOperations", a(1, 5, 0, 3, 5)));
            case "topic12_heaps_sorting.practice.Easy_05_MinOperationsHalveSum" -> eq(3, call(solver, "halveArray", a(5, 19, 8, 1)));
            case "topic12_heaps_sorting.practice.Easy_06_DeleteGreatestValue" -> eq(8, call(solver, "deleteGreatestValue", (Object) m(a(1, 2, 4), a(3, 3, 1))));
            case "topic12_heaps_sorting.practice.Easy_07_MaxProductTwoElements" -> eq(12, call(solver, "maxProduct", a(3, 4, 5, 2)));
            case "topic12_heaps_sorting.practice.Easy_08_MinAmountTimeFillCups" -> eq(4, call(solver, "fillCups", a(1, 4, 2)));
            case "topic12_heaps_sorting.practice.Easy_09_TakeGiftsFromRichest" -> eq(29L, call(solver, "pickGifts", a(25, 64, 9, 4, 100), 4));
            case "topic12_heaps_sorting.practice.Easy_10_SortAnArray" -> eq(a(1, 2, 3, 5), call(solver, "sortArray", a(5, 2, 3, 1)));
            case "topic12_heaps_sorting.practice.Medium_01_KthLargestElement" -> eq(5, call(solver, "findKthLargest", a(3, 2, 1, 5, 6, 4), 2));
            case "topic12_heaps_sorting.practice.Medium_02_TopKFrequentElements" -> eqCanonical(a(1, 2), call(solver, "topKFrequent", a(1, 1, 1, 2, 2, 3), 2));
            case "topic12_heaps_sorting.practice.Medium_03_KClosestPointsToOrigin" -> eq(m(a(-2, 2)), call(solver, "kClosest", m(a(1, 3), a(-2, 2)), 1));
            case "topic12_heaps_sorting.practice.Medium_04_MergeIntervals" -> eq(m(a(1, 6), a(8, 10), a(15, 18)), call(solver, "merge", (Object) m(a(1, 3), a(2, 6), a(8, 10), a(15, 18))));
            case "topic12_heaps_sorting.practice.Medium_05_TaskScheduler" -> eq(8, call(solver, "leastInterval", "AAABBB".toCharArray(), 2));
            case "topic12_heaps_sorting.practice.Hard_01_SmallestRange" ->
                    eq(a(20, 24), call(solver, "findSmallestRange", List.of(List.of(4, 10, 15, 24, 26), List.of(0, 9, 12, 20), List.of(5, 18, 22, 30))));
            case "topic12_heaps_sorting.practice.Hard_02_FindMedianFromDataStream" -> verifyMedianFinder(solver);
            case "topic12_heaps_sorting.practice.Hard_03_IPO" -> eq(4, call(solver, "findMaximizedCapital", 2, 0, a(1, 2, 3), a(0, 1, 1)));

            // topic 13 - advanced graphs
            case "topic13_advanced_graphs.practice.Easy_01_FindCenterStarGraph" -> eq(2, call(solver, "findCenter", (Object) m(a(1, 2), a(2, 3), a(4, 2))));
            case "topic13_advanced_graphs.practice.Easy_02_FindJudge" -> eq(2, call(solver, "findJudge", 2, m(a(1, 2))));
            case "topic13_advanced_graphs.practice.Easy_03_MinVerticesReachAll" ->
                    eq(List.of(0, 3), call(solver, "findSmallestSetOfVertices", 6, List.of(List.of(0, 1), List.of(0, 2), List.of(2, 5), List.of(3, 4), List.of(4, 2))));
            case "topic13_advanced_graphs.practice.Easy_04_VerifyPreorderSerialization" -> eq(true, call(solver, "isValidSerialization", "9,3,4,#,#,1,#,#,2,#,6,#,#"));
            case "topic13_advanced_graphs.practice.Easy_05_DestinationCity" -> eq("Sao Paulo", call(solver, "destCity", List.of(List.of("London", "New York"), List.of("New York", "Lima"), List.of("Lima", "Sao Paulo"))));
            case "topic13_advanced_graphs.practice.Easy_06_ProvincesIntro" -> eq(2, call(solver, "findCircleNum", (Object) m(a(1, 1, 0), a(1, 1, 0), a(0, 0, 1))));
            case "topic13_advanced_graphs.practice.Easy_07_BipartiteCheck" -> eq(true, call(solver, "isBipartite", (Object) m(a(1, 3), a(0, 2), a(1, 3), a(0, 2))));
            case "topic13_advanced_graphs.practice.Easy_08_CommonAncestors" -> eq(true, call(solver, "hasCommonAncestor", m(a(1, 3), a(2, 3), a(3, 6), a(5, 6)), 3, 6));
            case "topic13_advanced_graphs.practice.Easy_09_CountUnreachablePairs" -> eq(14L, call(solver, "countPairs", 7, m(a(0, 2), a(0, 5), a(2, 4), a(1, 6), a(5, 4))));
            case "topic13_advanced_graphs.practice.Easy_10_PathMaxProbEasy" -> eqDouble(0.25, call(solver, "maxProbability", 3, m(a(0, 1), a(1, 2), a(0, 2)), new double[]{0.5, 0.5, 0.2}, 0, 2));
            case "topic13_advanced_graphs.practice.Medium_01_NetworkDelayTime" -> eq(2, call(solver, "networkDelayTime", m(a(2, 1, 1), a(2, 3, 1), a(3, 4, 1)), 4, 2));
            case "topic13_advanced_graphs.practice.Medium_02_CourseScheduleII" -> eq(a(0, 1), call(solver, "findOrder", 2, m(a(1, 0))));
            case "topic13_advanced_graphs.practice.Medium_03_NumberOfProvinces" -> eq(2, call(solver, "findCircleNum", (Object) m(a(1, 1, 0), a(1, 1, 0), a(0, 0, 1))));
            case "topic13_advanced_graphs.practice.Medium_04_RedundantConnection" -> eq(a(2, 3), call(solver, "findRedundantConnection", (Object) m(a(1, 2), a(1, 3), a(2, 3))));
            case "topic13_advanced_graphs.practice.Medium_05_MinCostConnectPoints" -> eq(20, call(solver, "minCostConnectPoints", (Object) m(a(0, 0), a(2, 2), a(3, 10), a(5, 2), a(7, 0))));
            case "topic13_advanced_graphs.practice.Hard_01_PathMinEffort" -> eq(2, call(solver, "minimumEffortPath", (Object) m(a(1, 2, 2), a(3, 8, 2), a(5, 3, 5))));
            case "topic13_advanced_graphs.practice.Hard_02_AlienDictionary" -> eq("wertf", call(solver, "alienOrder", (Object) new String[]{"wrt", "wrf", "er", "ett", "rftt"}));
            case "topic13_advanced_graphs.practice.Hard_03_SwimInRisingWater" -> eq(3, call(solver, "swimInWater", (Object) m(a(0, 2), a(1, 3))));

            // topic 14 - dynamic programming
            case "topic14_dynamic_programming.practice.Easy_01_FibonacciNumber" -> eq(55, call(solver, "fib", 10));
            case "topic14_dynamic_programming.practice.Easy_02_ClimbingStairs" -> eq(8, call(solver, "climbStairs", 5));
            case "topic14_dynamic_programming.practice.Easy_03_MinCostClimbingStairs" -> eq(15, call(solver, "minCostClimbingStairs", a(10, 15, 20)));
            case "topic14_dynamic_programming.practice.Easy_04_DivisorGame" -> eq(true, call(solver, "divisorGame", 2));
            case "topic14_dynamic_programming.practice.Easy_05_NthTribonacciNumber" -> eq(4, call(solver, "tribonacci", 4));
            case "topic14_dynamic_programming.practice.Easy_06_CountingBits" -> eq(a(0, 1, 1, 2, 1, 2), call(solver, "countBits", 5));
            case "topic14_dynamic_programming.practice.Easy_07_BestTimeStock" -> eq(5, call(solver, "maxProfit", a(7, 1, 5, 3, 6, 4)));
            case "topic14_dynamic_programming.practice.Easy_08_PascalTriangle" -> eq(List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1)), call(solver, "generate", 5));
            case "topic14_dynamic_programming.practice.Easy_09_IsSubsequence" -> eq(true, call(solver, "isSubsequence", "abc", "ahbgdc"));
            case "topic14_dynamic_programming.practice.Easy_10_HouseRobberEasy" -> eq(4, call(solver, "rob", a(1, 2, 3, 1)));
            case "topic14_dynamic_programming.practice.Medium_01_HouseRobber" -> eq(12, call(solver, "rob", a(2, 7, 9, 3, 1)));
            case "topic14_dynamic_programming.practice.Medium_02_LongestIncreasingSubsequence" -> eq(4, call(solver, "lengthOfLIS", a(10, 9, 2, 5, 3, 7, 101, 18)));
            case "topic14_dynamic_programming.practice.Medium_03_LongestCommonSubsequence" -> eq(3, call(solver, "longestCommonSubsequence", "abcde", "ace"));
            case "topic14_dynamic_programming.practice.Medium_04_PartitionEqualSubsetSum" -> eq(true, call(solver, "canPartition", a(1, 5, 11, 5)));
            case "topic14_dynamic_programming.practice.Medium_05_CoinChange" -> eq(3, call(solver, "coinChange", a(1, 2, 5), 11));
            case "topic14_dynamic_programming.practice.Hard_01_EditDistance" -> eq(3, call(solver, "minDistance", "horse", "ros"));
            case "topic14_dynamic_programming.practice.Hard_02_DistinctSubsequences" -> eq(3, call(solver, "numDistinct", "rabbbit", "rabbit"));
            case "topic14_dynamic_programming.practice.Hard_03_SuperEggDrop" -> eq(3, call(solver, "superEggDrop", 2, 6));

            // topic 15 - advanced data structures
            case "topic15_advanced_data_structures.practice.Easy_01_RangeSumQuery" -> verifyRangeSum(solver);
            case "topic15_advanced_data_structures.practice.Easy_02_MonotonicArray" -> eq(true, call(solver, "isMonotonic", a(1, 2, 2, 3)));
            case "topic15_advanced_data_structures.practice.Easy_03_CountPrefixes" -> eq(3, call(solver, "countPrefixes", new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc"));
            case "topic15_advanced_data_structures.practice.Easy_04_LongestCommonPrefix" -> eq("fl", call(solver, "longestCommonPrefix", (Object) new String[]{"flower", "flow", "flight"}));
            case "topic15_advanced_data_structures.practice.Easy_05_RangeSumMutableEasy" -> verifyMutableRangeSum(solver);
            case "topic15_advanced_data_structures.practice.Easy_06_ImplementTrieEasy" -> verifyTrie(solver);
            case "topic15_advanced_data_structures.practice.Easy_07_FinalPrices" -> eq(a(4, 2, 4, 2, 3), call(solver, "finalPrices", a(8, 4, 6, 2, 3)));
            case "topic15_advanced_data_structures.practice.Easy_08_NextGreaterElementI" -> eq(a(-1, 3, -1), call(solver, "nextGreaterElement", a(4, 1, 2), a(1, 3, 4, 2)));
            case "topic15_advanced_data_structures.practice.Easy_09_DailyTemperaturesEasy" -> eq(a(1, 1, 4, 2, 1, 1, 0, 0), call(solver, "dailyTemperatures", a(73, 74, 75, 71, 69, 72, 76, 73)));
            case "topic15_advanced_data_structures.practice.Easy_10_MonotonicQueueIntro" -> eq(a(3, 3, 5, 5, 6, 7), call(solver, "maxSlidingWindowIntro", a(1, 3, -1, -3, 5, 3, 6, 7), 3));
            case "topic15_advanced_data_structures.practice.Medium_01_ImplementTrie" -> verifyTrie(solver);
            case "topic15_advanced_data_structures.practice.Medium_02_RangeSumQueryMutable" -> verifyMutableRangeSum(solver);
            case "topic15_advanced_data_structures.practice.Medium_03_DailyTemperatures" -> eq(a(1, 1, 4, 2, 1, 1, 0, 0), call(solver, "dailyTemperatures", a(73, 74, 75, 71, 69, 72, 76, 73)));
            case "topic15_advanced_data_structures.practice.Medium_04_DesignAddSearchWords" -> verifyWordDictionary(solver);
            case "topic15_advanced_data_structures.practice.Medium_05_OnlineStockSpan" -> verifyStockSpanner(solver);
            case "topic15_advanced_data_structures.practice.Hard_01_RangeSumQuery2DMutable" -> verifyMutableRangeSum2d(solver);
            case "topic15_advanced_data_structures.practice.Hard_02_MaxSlidingWindow" -> eq(a(3, 3, 5, 5, 6, 7), call(solver, "maxSlidingWindow", a(1, 3, -1, -3, 5, 3, 6, 7), 3));
            case "topic15_advanced_data_structures.practice.Hard_03_WordSearchII" -> eqCanonical(List.of("eat", "oath"), call(solver, "findWords", cm("oaan", "etae", "ihkr", "iflv"), new String[]{"oath", "pea", "eat", "rain"}));

            // topic 16 - bit manipulation and math
            case "topic16_bit_manipulation_math.practice.Easy_01_NumberOfOneBits" -> eq(3, call(solver, "hammingWeight", 11));
            case "topic16_bit_manipulation_math.practice.Easy_02_CountingBitsIntro" -> eq(a(0, 1, 1, 2, 1, 2), call(solver, "countBits", 5));
            case "topic16_bit_manipulation_math.practice.Easy_03_ReverseBits" -> eq(964176192, call(solver, "reverseBits", 43261596));
            case "topic16_bit_manipulation_math.practice.Easy_04_SingleNumber" -> eq(4, call(solver, "singleNumber", a(4, 1, 2, 1, 2)));
            case "topic16_bit_manipulation_math.practice.Easy_05_MissingNumber" -> eq(2, call(solver, "missingNumber", a(3, 0, 1)));
            case "topic16_bit_manipulation_math.practice.Easy_06_PowerOfTwo" -> eq(true, call(solver, "isPowerOfTwo", 16));
            case "topic16_bit_manipulation_math.practice.Easy_07_HammingDistance" -> eq(2, call(solver, "hammingDistance", 1, 4));
            case "topic16_bit_manipulation_math.practice.Easy_08_AddBinary" -> eq("10101", call(solver, "addBinary", "1010", "1011"));
            case "topic16_bit_manipulation_math.practice.Easy_09_SieveOfEratosthenesEasy" -> eq(4, call(solver, "countPrimes", 10));
            case "topic16_bit_manipulation_math.practice.Easy_10_Base7" -> eq("202", call(solver, "convertToBase7", 100));
            case "topic16_bit_manipulation_math.practice.Medium_01_SingleNumberII" -> eq(3, call(solver, "singleNumber", a(2, 2, 3, 2)));
            case "topic16_bit_manipulation_math.practice.Medium_02_SubsetsBitmask" -> eq(8, ((Collection<?>) call(solver, "subsets", a(1, 2, 3))).size());
            case "topic16_bit_manipulation_math.practice.Medium_03_PowXN" -> eqDouble(1024.0, call(solver, "myPow", 2.0, 10));
            case "topic16_bit_manipulation_math.practice.Medium_04_SumOfTwoIntegers" -> eq(3, call(solver, "getSum", 1, 2));
            case "topic16_bit_manipulation_math.practice.Medium_05_CountPrimes" -> eq(4, call(solver, "countPrimes", 10));
            case "topic16_bit_manipulation_math.practice.Hard_01_MaxProductOfWordLengths" -> eq(16, call(solver, "maxProduct", (Object) new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
            case "topic16_bit_manipulation_math.practice.Hard_02_IntegerToEnglishWords" -> eq("One Hundred Twenty Three", call(solver, "numberToWords", 123));
            case "topic16_bit_manipulation_math.practice.Hard_03_NumberOfDigitOne" -> eq(6, call(solver, "countDigitOne", 13));
            default -> throw new AssertionError("No representative test registered for " + name);
        }
    }

    private static int[] a(int... values) { return values; }
    private static int[][] m(int[]... rows) { return rows; }

    private static Object call(Object target, String methodName, Object... args) {
        try {
            Method method = findMethod(target.getClass(), methodName, args);
            method.setAccessible(true);
            return method.invoke(target, args);
        } catch (ReflectiveOperationException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException runtime) throw runtime;
            if (cause instanceof Error error) throw error;
            throw new AssertionError("Could not call " + target.getClass().getName() + "." + methodName, e);
        }
    }

    private static Method findMethod(Class<?> type, String name, Object... args) {
        for (Method method : type.getDeclaredMethods()) {
            if (!method.getName().equals(name) || method.getParameterCount() != args.length) continue;
            Class<?>[] parameterTypes = method.getParameterTypes();
            boolean compatible = true;
            for (int i = 0; i < args.length; i++) {
                if (args[i] != null && !boxed(parameterTypes[i]).isInstance(args[i])) { compatible = false; break; }
            }
            if (compatible) return method;
        }
        throw new AssertionError("Compatible method " + name + " with " + args.length + " parameters is missing in " + type.getName());
    }

    private static Class<?> boxed(Class<?> type) {
        if (!type.isPrimitive()) return type;
        if (type == int.class) return Integer.class;
        if (type == long.class) return Long.class;
        if (type == double.class) return Double.class;
        if (type == boolean.class) return Boolean.class;
        if (type == char.class) return Character.class;
        if (type == byte.class) return Byte.class;
        if (type == short.class) return Short.class;
        if (type == float.class) return Float.class;
        return Void.class;
    }

    private static void eq(Object expected, Object actual) {
        if (expected instanceof int[] e) Assertions.assertArrayEquals(e, (int[]) actual);
        else if (expected instanceof int[][] e) Assertions.assertTrue(Arrays.deepEquals(e, (int[][]) actual),
                () -> "expected: " + Arrays.deepToString(e) + " but was: " + Arrays.deepToString((int[][]) actual));
        else if (expected instanceof char[][] e) Assertions.assertTrue(Arrays.deepEquals(e, (char[][]) actual),
                () -> "expected: " + Arrays.deepToString(e) + " but was: " + Arrays.deepToString((char[][]) actual));
        else if (expected instanceof char[] e) Assertions.assertArrayEquals(e, (char[]) actual);
        else if (expected instanceof Object[] e) Assertions.assertArrayEquals(e, (Object[]) actual);
        else Assertions.assertEquals(expected, actual);
    }

    private static void eqDouble(double expected, Object actual) {
        Assertions.assertEquals(expected, ((Number) actual).doubleValue(), 1.0e-5);
    }

    private static void eqCanonical(Object expected, Object actual) {
        Assertions.assertEquals(canonical(expected), canonical(actual));
    }

    private static String canonical(Object value) {
        if (value instanceof Collection<?> collection) {
            List<String> parts = collection.stream().map(PracticeAssertions::canonical).sorted().toList();
            return parts.toString();
        }
        if (value instanceof int[] array) {
            int[] copy = array.clone(); Arrays.sort(copy); return Arrays.toString(copy);
        }
        if (value instanceof Object[] array) return canonical(Arrays.asList(array));
        return String.valueOf(value);
    }

    private static ListNode list(int... values) {
        ListNode dummy = new ListNode(); ListNode tail = dummy;
        for (int value : values) { tail.next = new ListNode(value); tail = tail.next; }
        return dummy.next;
    }

    private static ListNode tail(ListNode head) { while (head.next != null) head = head.next; return head; }

    private static int[] listValues(Object value) {
        List<Integer> values = new ArrayList<>(); ListNode node = (ListNode) value;
        int guard = 0;
        while (node != null && guard++ < 10_000) { values.add(node.val); node = node.next; }
        Assertions.assertTrue(guard < 10_000, "The returned linked list contains a cycle");
        return values.stream().mapToInt(Integer::intValue).toArray();
    }

    private static TreeNode tree(Integer... values) {
        if (values.length == 0 || values[0] == null) return null;
        TreeNode root = new TreeNode(values[0]); Deque<TreeNode> queue = new ArrayDeque<>(); queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < values.length) {
            TreeNode node = queue.remove();
            if (index < values.length && values[index] != null) { node.left = new TreeNode(values[index]); queue.add(node.left); }
            index++;
            if (index < values.length && values[index] != null) { node.right = new TreeNode(values[index]); queue.add(node.right); }
            index++;
        }
        return root;
    }

    private static String treeSignature(Object value) {
        TreeNode node = (TreeNode) value;
        if (node == null) return "#";
        return node.val + "," + treeSignature(node.left) + "," + treeSignature(node.right);
    }

    private static char[][] cm(String... rows) {
        char[][] result = new char[rows.length][];
        for (int i = 0; i < rows.length; i++) result[i] = rows[i].toCharArray();
        return result;
    }

    private static Object construct(Class<?> type, Object... args) {
        try {
            for (Constructor<?> constructor : type.getDeclaredConstructors()) {
                if (constructor.getParameterCount() == args.length) {
                    constructor.setAccessible(true); return constructor.newInstance(args);
                }
            }
            throw new AssertionError("Constructor with " + args.length + " parameters is missing in " + type.getName());
        } catch (ReflectiveOperationException e) { throw new AssertionError(e); }
    }

    private static Object nested(Object outer, String simpleName, Object... constructorArgs) {
        try {
            for (Class<?> type : outer.getClass().getDeclaredClasses()) {
                if (!type.getSimpleName().equals(simpleName)) continue;
                for (Constructor<?> constructor : type.getDeclaredConstructors()) {
                    if (constructor.getParameterCount() == constructorArgs.length) {
                        constructor.setAccessible(true); return constructor.newInstance(constructorArgs);
                    }
                }
            }
            throw new AssertionError("Nested class " + simpleName + " is missing in " + outer.getClass().getName());
        } catch (ReflectiveOperationException e) { throw new AssertionError(e); }
    }

    private static void verifyStack(Object outer) {
        Object stack = nested(outer, "MyStack"); call(stack, "push", 1); call(stack, "push", 2);
        eq(2, call(stack, "top")); eq(2, call(stack, "pop")); eq(false, call(stack, "empty"));
    }
    private static void verifyQueue(Object outer) {
        Object queue = nested(outer, "MyQueue"); call(queue, "push", 1); call(queue, "push", 2);
        eq(1, call(queue, "peek")); eq(1, call(queue, "pop")); eq(false, call(queue, "empty"));
    }
    private static void verifyMinStack(Object outer) {
        Object stack = nested(outer, "MinStack"); call(stack, "push", -2); call(stack, "push", 0); call(stack, "push", -3);
        eq(-3, call(stack, "getMin")); call(stack, "pop"); eq(0, call(stack, "top")); eq(-2, call(stack, "getMin"));
    }
    private static void verifyCircularQueue(Object outer) {
        Object queue = nested(outer, "MyCircularQueue", 3); eq(true, call(queue, "enQueue", 1)); eq(true, call(queue, "enQueue", 2));
        eq(true, call(queue, "enQueue", 3)); eq(false, call(queue, "enQueue", 4)); eq(3, call(queue, "Rear"));
        eq(true, call(queue, "isFull")); eq(true, call(queue, "deQueue")); eq(true, call(queue, "enQueue", 4)); eq(4, call(queue, "Rear"));
    }
    private static void verifyHashSet(Object outer) {
        Object set = nested(outer, "MyHashSet"); call(set, "add", 1); call(set, "add", 2); eq(true, call(set, "contains", 1));
        eq(false, call(set, "contains", 3)); call(set, "remove", 2); eq(false, call(set, "contains", 2));
    }
    private static void verifyHashMap(Object outer) {
        Object map = nested(outer, "MyHashMap"); call(map, "put", 1, 1); call(map, "put", 2, 2); eq(1, call(map, "get", 1));
        eq(-1, call(map, "get", 3)); call(map, "put", 2, 1); eq(1, call(map, "get", 2)); call(map, "remove", 2); eq(-1, call(map, "get", 2));
    }
    private static void verifyTwitter(Object outer) {
        Object twitter = nested(outer, "Twitter"); call(twitter, "postTweet", 1, 5); eq(List.of(5), call(twitter, "getNewsFeed", 1));
        call(twitter, "follow", 1, 2); call(twitter, "postTweet", 2, 6); eq(List.of(6, 5), call(twitter, "getNewsFeed", 1));
        call(twitter, "unfollow", 1, 2); eq(List.of(5), call(twitter, "getNewsFeed", 1));
    }
    private static void verifyRandomizedSet(Object outer) {
        Object set = nested(outer, "RandomizedSet"); eq(true, call(set, "insert", 1)); eq(false, call(set, "remove", 2));
        eq(true, call(set, "insert", 2)); Object random = call(set, "getRandom"); Assertions.assertTrue(Set.of(1, 2).contains(random));
        eq(true, call(set, "remove", 1)); eq(false, call(set, "insert", 2)); eq(2, call(set, "getRandom"));
    }
    private static void verifyLruCache(Object outer) {
        Object cache = nested(outer, "LRUCache", 2); call(cache, "put", 1, 1); call(cache, "put", 2, 2); eq(1, call(cache, "get", 1));
        call(cache, "put", 3, 3); eq(-1, call(cache, "get", 2)); call(cache, "put", 4, 4); eq(-1, call(cache, "get", 1)); eq(3, call(cache, "get", 3)); eq(4, call(cache, "get", 4));
    }

    private static void verifyRangeSum(Object solver) {
        Object query = construct(solver.getClass(), a(-2, 0, 3, -5, 2, -1));
        eq(1, call(query, "sumRange", 0, 2)); eq(-1, call(query, "sumRange", 2, 5)); eq(-3, call(query, "sumRange", 0, 5));
    }
    private static void verifyRangeSum2d(Object solver) {
        Object query = construct(solver.getClass(), (Object) m(a(3, 0, 1, 4, 2), a(5, 6, 3, 2, 1), a(1, 2, 0, 1, 5), a(4, 1, 0, 1, 7), a(1, 0, 3, 0, 5)));
        eq(8, call(query, "sumRegion", 2, 1, 4, 3)); eq(11, call(query, "sumRegion", 1, 1, 2, 2));
    }
    private static void verifyRead4(Object solver) {
        Object reader = construct(solver.getClass(), "abc");
        char[] first = new char[1]; eq(1, call(reader, "read", first, 1)); eq("a".toCharArray(), first);
        char[] second = new char[2]; eq(2, call(reader, "read", second, 2)); eq("bc".toCharArray(), second);
    }
    private static void verifyFirstBadVersion(Object solver) {
        Object configured = construct(solver.getClass(), 4);
        eq(4, call(configured, "firstBadVersion", 5));
    }
    private static void verifyGuessNumber(Object solver) {
        Object configured = construct(solver.getClass(), 6);
        eq(6, call(configured, "guessNumber", 10));
    }
    private static void verifyRandomListCopy(Object solver) {
        try {
            Method method = Arrays.stream(solver.getClass().getDeclaredMethods())
                    .filter(candidate -> candidate.getName().equals("copyRandomList") && candidate.getParameterCount() == 1)
                    .findFirst().orElseThrow();
            Class<?> nodeType = method.getParameterTypes()[0];
            Constructor<?> constructor = nodeType.getDeclaredConstructor(int.class); constructor.setAccessible(true);
            Object first = constructor.newInstance(7); Object second = constructor.newInstance(13);
            Field next = nodeType.getDeclaredField("next"); Field random = nodeType.getDeclaredField("random"); Field val = nodeType.getDeclaredField("val");
            next.setAccessible(true); random.setAccessible(true); val.setAccessible(true); next.set(first, second); random.set(second, first);
            Object copy = call(solver, "copyRandomList", first); Assertions.assertNotSame(first, copy); eq(7, val.get(copy));
            Object copySecond = next.get(copy); Assertions.assertNotSame(second, copySecond); eq(13, val.get(copySecond)); Assertions.assertSame(copy, random.get(copySecond));
        } catch (ReflectiveOperationException e) { throw new AssertionError(e); }
    }

    private static void verifyTreeCodec(Object solver) {
        TreeNode root = tree(1, 2, 3, null, null, 4, 5);
        Object encoded = call(solver, "serialize", root);
        eq(treeSignature(root), treeSignature(call(solver, "deserialize", encoded)));
    }

    private static void verifyEmployeeImportance(Object solver) {
        topic10_dfs_bfs.practice.Employee first = new topic10_dfs_bfs.practice.Employee(1, 5, List.of(2, 3));
        topic10_dfs_bfs.practice.Employee second = new topic10_dfs_bfs.practice.Employee(2, 3, List.of());
        topic10_dfs_bfs.practice.Employee third = new topic10_dfs_bfs.practice.Employee(3, 3, List.of());
        eq(11, call(solver, "getImportance", List.of(first, second, third), 1));
    }

    private static void verifyCloneGraph(Object solver) {
        topic10_dfs_bfs.practice.Node one = new topic10_dfs_bfs.practice.Node(1);
        topic10_dfs_bfs.practice.Node two = new topic10_dfs_bfs.practice.Node(2);
        one.neighbors.add(two); two.neighbors.add(one);
        topic10_dfs_bfs.practice.Node copy = (topic10_dfs_bfs.practice.Node) call(solver, "cloneGraph", one);
        Assertions.assertNotSame(one, copy); eq(1, copy.val); eq(1, copy.neighbors.size());
        Assertions.assertNotSame(two, copy.neighbors.get(0)); eq(2, copy.neighbors.get(0).val);
        Assertions.assertSame(copy, copy.neighbors.get(0).neighbors.get(0));
    }

    private static void verifySudoku(Object solver) {
        char[][] board = cm("53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79");
        call(solver, "solveSudoku", (Object) board);
        eq(cm("534678912", "672195348", "198342567", "859761423", "426853791", "713924856", "961537284", "287419635", "345286179"), board);
    }

    private static void verifyKthLargest(Object solver) {
        Object stream = construct(solver.getClass(), 3, a(4, 5, 8, 2));
        eq(4, call(stream, "add", 3)); eq(5, call(stream, "add", 5)); eq(5, call(stream, "add", 10)); eq(8, call(stream, "add", 9));
    }

    private static void verifyMedianFinder(Object solver) {
        call(solver, "addNum", 1); call(solver, "addNum", 2); eqDouble(1.5, call(solver, "findMedian"));
        call(solver, "addNum", 3); eqDouble(2.0, call(solver, "findMedian"));
    }

    private static void verifyMutableRangeSum(Object solver) {
        Object query = construct(solver.getClass(), a(1, 3, 5));
        eq(9, call(query, "sumRange", 0, 2)); call(query, "update", 1, 2); eq(8, call(query, "sumRange", 0, 2));
    }

    private static void verifyMutableRangeSum2d(Object solver) {
        Object query = construct(solver.getClass(), (Object) m(a(3, 0, 1, 4, 2), a(5, 6, 3, 2, 1), a(1, 2, 0, 1, 5), a(4, 1, 0, 1, 7), a(1, 0, 3, 0, 5)));
        eq(8, call(query, "sumRegion", 2, 1, 4, 3)); call(query, "update", 3, 2, 2); eq(10, call(query, "sumRegion", 2, 1, 4, 3));
    }

    private static void verifyTrie(Object solver) {
        call(solver, "insert", "apple"); eq(true, call(solver, "search", "apple")); eq(false, call(solver, "search", "app"));
        eq(true, call(solver, "startsWith", "app")); call(solver, "insert", "app"); eq(true, call(solver, "search", "app"));
    }

    private static void verifyWordDictionary(Object solver) {
        call(solver, "addWord", "bad"); call(solver, "addWord", "dad"); call(solver, "addWord", "mad");
        eq(false, call(solver, "search", "pad")); eq(true, call(solver, "search", "bad")); eq(true, call(solver, "search", ".ad")); eq(true, call(solver, "search", "b.."));
    }

    private static void verifyStockSpanner(Object solver) {
        int[] prices = a(100, 80, 60, 70, 60, 75, 85); int[] expected = a(1, 1, 1, 2, 1, 4, 6);
        for (int i = 0; i < prices.length; i++) eq(expected[i], call(solver, "next", prices[i]));
    }
}
