package uni.aed.ordenamiento;

import uni.aed.doublelinkedlist.DNodo;

/**
 *
 * @author jared
 */
public class NodeSort {
    //next will represent rigth and prev will represet lef
   public int removeLastElement(DNodo root, DNodo parent) {
        if (root == null) return -1;
        if (root.next == null && root.prev == null) {
            int data = root.data;
            //Eliminia el ultimo nodon root y   
            //y retorna el valor de este al top
            if (parent.next == root) parent.next = null;
            if (parent.prev == root) parent.prev = null;
            return data;
        }
        //log(n)
        if (root.next != null) {
            return removeLastElement(root.next, root)   ;
        } else {
            return removeLastElement(root.prev, root);
        }
    }
    public void heapify(DNodo root) {
        if (root == null) return;

        DNodo largest = root;
        if (root.next != null && root.next.data > largest.data) {
            largest = root.next;
        }

        if (root.prev != null && root.prev.data > largest.data) {
            largest = root.prev;
        }

        if (largest != root) {
            int swap = root.data;
            root.data = largest.data;
            largest.data = swap;
            heapify(largest);
        }
    }

    public void heap_sort(DNodo root) {
        if (root == null) return;
        heap_sort(root.next);
        heap_sort(root.prev);
        heapify(root);
    }

    public Integer[] main_heap(DNodo root, int length) {
        heap_sort(root);

        Integer[] orderedArray = new Integer[length];
        DNodo parent = new DNodo(0); // Dummy node
        parent.next = root;
        
        for (int i = length - 1; i >= 0; i--) {
            orderedArray[i] = root.data;
            root.data = removeLastElement(root, parent);
            heapify(root);
        }
        return orderedArray;
    }
}
