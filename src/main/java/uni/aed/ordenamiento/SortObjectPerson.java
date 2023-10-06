    package uni.aed.ordenamiento;

    import uni.aed.model.Persona;

    public class SortObjectPerson {
        //Burbuja
        public Persona[] Burbuja(Persona[] X,int attribute){
            if(!(attribute==Persona.NAME || attribute==Persona.AGE))
                throw new IllegalArgumentException();
            Persona p1,p2,aux;
            int comparisonResult;
            X[0].setCompareAttribute(attribute);
            for(int i=0;i<X.length - 1;i++){
                for(int j=0;j<X.length - 1;j++){
                    p1=X[j];
                    p2=X[j+1];
                    comparisonResult=p1.compareTo(p2);
                    if(comparisonResult>0){
                        aux=X[j];
                        X[j]=X[j+1];
                        X[j+1]=aux;                    
                    }//end if
                }//end for
            }//end for
            return X;
        }//end burbuja
        
        //HeapSort
        public Persona[] HeapSort(Persona[] X,int attribute){
            if(!(attribute==Persona.NAME || attribute==Persona.AGE))
                throw new IllegalArgumentException();
            int n = X.length;
            Persona aux;
            for(int i = n/2 -1;i>=0;i--){
                heapify(X,n,i,attribute);
            }
            for(int i=n-1;i>=0;i--){
                aux = X[i];
                X[i]=X[0];
                X[0]=aux;
                heapify(X,i,0,attribute);
            }
            return X;
        }
        public void heapify(Persona[] X,int len, int idx,int attribute){
            int largest=idx;
        //their sons
            int left=2*idx+1,right=2*idx+2;
            Persona aux;
            X[idx].setCompareAttribute(attribute);
            if(left<len && X[largest].compareTo(X[left])<0) largest=left;
            if(right<len && X[largest].compareTo(X[right])<0) largest=right;
            if(largest!=idx){
                aux=X[idx];
                X[idx]=X[largest];
                X[largest]=aux;
                heapify(X, len, largest,attribute);
            }
        }
        
        //MergeSort
        /*
        public Persona[] MergeSort(Persona[] X,int attribute){
            if(!(attribute==Persona.NAME || attribute==Persona.AGE))
                throw new IllegalArgumentException();
            int n = X.length;
        }
        public Persona[] merge_sort(Persona[] X,int start,int end,int attribute){
            if(start<end){
                int mid = start + (end - start)/2;
                merge_sort(X,start,mid-1,attribute);
                merge_sort(X,mid+1,end,attribute);
                merge(X,start,end,attribute);
            }
        }
    public void merge(Persona[] X, int start, int mid, int end, int attribute) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // Create temporary arrays for the left and right subarrays
        Persona[] leftArray = new Persona[n1];
        Persona[] rightArray = new Persona[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = X[start + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = X[mid + 1 + i];
        }

        // Merge the two subarrays
        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            leftArray[i].setCompareAttribute(attribute);
            rightArray[j].setCompareAttribute(attribute);
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                X[k] = leftArray[i];
                i++;
            } else {
                X[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] and rightArray[], if any
        while (i < n1) {
            X[k] = leftArray[i];
            i++;
            k++;
           }
        while (j < n2) {
            X[k] = rightArray[j];
            j++;
            k++;
            }
        }*/
        //Porongasort?
    }//end clase