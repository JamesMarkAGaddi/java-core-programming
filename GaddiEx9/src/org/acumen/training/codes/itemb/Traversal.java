package org.acumen.training.codes.itemb;

import java.util.NoSuchElementException;

public class Traversal<E> {
	 
         private int currentIndex = 0; 
         private E[] a;

         public Traversal(E[] a) {
			this.a = a;
		}

		public boolean hasNext() {
         	
             return currentIndex < a.length;
         }

         public E next() {

             if (!hasNext()) {
                 throw new NoSuchElementException();
             }
             return a[currentIndex++];
         }
     
}
