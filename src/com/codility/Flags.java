package com.codility;


public class Flags {

	public static void main(String[] args) {
		//System.out.println(new Flags().solution(new int[]{1,5,3,4,3,4,1,2,3,4,6,2}));
		System.out.println(new Flags().solution(new int[]{1,2,3,4,3,4,1,2,3,4,6,2}));
	}

	public int solution(int[] A) {

        int[] nextPeaks = nextPeaks(A);

        int flagNumebr = 1;
        int result = 0;

        while ((flagNumebr-1)*flagNumebr <= A.length) {
            int flagPos = 0;
            int flagsTaken = 0;
            
            while (flagPos < A.length && flagsTaken < flagNumebr) {
                flagPos = nextPeaks[flagPos];
                if (flagPos == -1) {
                    // we arrived at the end of the peaks;
                    break;
                }

                flagsTaken++;
                flagPos += flagNumebr;
            }
            
            result = Math.max(result, flagsTaken);
            flagNumebr++;

        }

        return  result;



    }

    private boolean[] createPeaks(int[] A) {
        boolean[] peaks = new boolean[A.length];
        for (int i = 1; i < A.length-1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peaks[i] = true;
            }
        }

        return  peaks;
    }

    private int[] nextPeaks (int[] A) {
        boolean[] peaks = createPeaks(A);
        int[] nextPeaks = new int[A.length];
        // the last position is always -1
        nextPeaks[A.length-1] = -1;

        for (int i = A.length-2; i >= 0 ; i--) {
            nextPeaks[i] = peaks[i] ? i : nextPeaks[i+1];
        }

        
       

        
        
        return  nextPeaks;
    }
}
