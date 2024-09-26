package org.dsa.sorting;

import java.util.Collection;

public interface Sort<K>{
    Collection<K> sort(Collection<K> collection);
}
