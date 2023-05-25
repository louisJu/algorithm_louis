/*class day10 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var result = ListNode(0)
        while(list1?.next != null || list2?.next != null) {
            if(list1?.`val`!! > list2?.`val`!!) {
                result.next = list2
                list2 = list2.next
            }else

        }

        if(list1 == null && list2 == null) {
            return null
        }
        if(list1 == null) {
            return list2
        }
        if(list2 == null) {
            return list1
        }
        if(list1.`val` > list2.`val`) {
            mergeTwoLists(list1.next,list2)
        }

    }
}*/


/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.*/


 class ListNode(var `val`: Int) {
         var next: ListNode? = null
    }