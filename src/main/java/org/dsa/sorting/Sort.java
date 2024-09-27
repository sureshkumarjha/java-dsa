package org.dsa.sorting;

import java.util.Collection;

public interface Sort<K extends Integer>{
    int[] sort(Collection<K> collection);
}
